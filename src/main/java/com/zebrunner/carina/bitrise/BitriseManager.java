package com.zebrunner.carina.bitrise;

import com.zebrunner.carina.bitrise.client.ApiClient;
import com.zebrunner.carina.bitrise.client.ApiException;
import com.zebrunner.carina.bitrise.client.ApiResponse;
import com.zebrunner.carina.bitrise.client.api.ApplicationApi;
import com.zebrunner.carina.bitrise.client.api.BuildArtifactApi;
import com.zebrunner.carina.bitrise.client.api.BuildsApi;
import com.zebrunner.carina.bitrise.client.model.V0ArtifactListElementResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0ArtifactListResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0ArtifactResponseItemModel;
import com.zebrunner.carina.bitrise.client.model.V0ArtifactShowResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0BranchListResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0BuildListResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0BuildResponseItemModel;
import com.zebrunner.carina.bitrise.client.model.V0BuildWorkflowListResponseModel;
import com.zebrunner.carina.bitrise.config.BitriseConfiguration;
import com.zebrunner.carina.commons.artifact.IArtifactManager;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.utils.config.StandardConfigurationOption;
import com.zebrunner.carina.utils.exception.InvalidConfigurationException;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BitriseManager implements IArtifactManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private static final String INVALID_LINK_MESSAGE = "Bitrise url is not correct: %s%n It should be like: %s.";
    private static final String COULD_NOT_BE_BLANK_EXCEPTION = "[BITRISE] '%s' (%s) could not be blank or empty. URL: %s";
    private static final String VALID_LINK = "bitrise://appId/workflow/branch/buildNumber/artifactNamePattern";
    private static final String APP_ID = "appId";
    private static final String WORKFLOW = "workflow";
    private static final String BRANCH = "branch";
    private static final String BUILD_NUMBER = "buildNumber"; // could be 'latest'
    private static final String ARTIFACT_NAME_PATTERN = "artifactNamePattern";

    static final Pattern BITRISE_ENDPOINT_PATTERN = Pattern.compile(
            "bitrise:\\/\\/(?<" + APP_ID + ">[a-zA-Z-0-9][^\\/]*)\\/"
                    + "(?<" + WORKFLOW + ">[a-zA-Z-0-9][^\\/]*)\\/"
                    + "(?<" + BRANCH + ">.+)\\/"
                    + "(?<" + BUILD_NUMBER + ">[a-zA-Z-0-9][^\\/]*)\\/"
                    + "(?<" + ARTIFACT_NAME_PATTERN + ">.+)");
    private static final Map<String, BitriseApp> APP_INFO_MAP = new ConcurrentHashMap<>();
    private static final Map<String, Duration> EXCEPTION_TIMEOUTS = new ConcurrentHashMap<>();

    private final ApplicationApi applicationApi;
    private final BuildsApi buildsApi;
    private final BuildArtifactApi buildArtifactApi;

    private BitriseManager() {
        ApiClient apiClient = new ApiClient().addDefaultHeader("Authorization",
                Configuration.getRequired(BitriseConfiguration.Parameter.BITRISE_ACCESS_KEY_TOKEN,
                        StandardConfigurationOption.DECRYPT));
        applicationApi = new ApplicationApi(apiClient);
        buildsApi = new BuildsApi(apiClient);
        buildArtifactApi = new BuildArtifactApi(apiClient);
    }

    public static synchronized BitriseManager getInstance() {
        return new BitriseManager();
    }

    @Override
    public boolean download(String from, Path to) {
        throw new NotImplementedException();
    }

    @Override
    public boolean put(Path from, String to) throws FileNotFoundException {
        throw new NotImplementedException();
    }

    @Override
    public boolean delete(String url) {
        throw new NotImplementedException();
    }

    @Override
    public String getDirectLink(String u) {
        return getAppInfo(u).getDirectLink();
    }

    public BitriseApp getAppInfo(String u) {
        return APP_INFO_MAP.compute(u, (url, value) -> {
            LOGGER.info("Starting generate bitrise url.");
            Duration currentTime = Duration.ofMillis(System.currentTimeMillis());
            if (EXCEPTION_TIMEOUTS.get(url) != null && EXCEPTION_TIMEOUTS.get(url).compareTo(currentTime) > 0) {
                return value;
            }

            Matcher matcher = BITRISE_ENDPOINT_PATTERN.matcher(Objects.requireNonNull(url));
            if (!matcher.find()) {
                throw new IllegalArgumentException(String.format(INVALID_LINK_MESSAGE, url, VALID_LINK));
            }
            String appId = matcher.group(APP_ID);
            if (StringUtils.isBlank(appId)) {
                throw new InvalidConfigurationException(
                        String.format(COULD_NOT_BE_BLANK_EXCEPTION, APP_ID, VALID_LINK, url));
            }

            String branch = matcher.group(BRANCH);
            if (StringUtils.isBlank(branch)) {
                throw new InvalidConfigurationException(String.format(COULD_NOT_BE_BLANK_EXCEPTION, BRANCH, VALID_LINK, url));
            }
            String workflow = matcher.group(WORKFLOW);
            if (StringUtils.isBlank(workflow)) {
                throw new InvalidConfigurationException(String.format(COULD_NOT_BE_BLANK_EXCEPTION, WORKFLOW, VALID_LINK, url));
            }
            String buildNumber = matcher.group(BUILD_NUMBER);
            if (StringUtils.isBlank(buildNumber)) {
                throw new InvalidConfigurationException(String.format(COULD_NOT_BE_BLANK_EXCEPTION, BUILD_NUMBER, VALID_LINK, url));
            }
            String artifactNamePatternString = matcher.group(ARTIFACT_NAME_PATTERN);
            if (StringUtils.isBlank(artifactNamePatternString)) {
                throw new InvalidConfigurationException(String.format(COULD_NOT_BE_BLANK_EXCEPTION, ARTIFACT_NAME_PATTERN, VALID_LINK, url));
            }
            Pattern artifactNamePattern = Pattern.compile(artifactNamePatternString);

            try {
                ////// BRANCH
                ApiResponse<V0BranchListResponseModel> branchListResponse = applicationApi.branchListWithHttpInfo(appId);
                if (branchListResponse.getStatusCode() != 200) {
                    throw new BitriseException(String.format("Could not get list of branches for '%s' app. Response code: %s%n.Response body: %s",
                            appId, branchListResponse.getStatusCode(), branchListResponse.getData()));
                }

                // check that such branch exists
                if (branchListResponse.getData()
                        .getData()
                        .stream()
                        .noneMatch(b -> StringUtils.equals(b, branch))) {
                    throw new BitriseException(String.format("Could not find branch '%s' for the '%s' app. Available branches: %s",
                            branch, appId, branchListResponse.getData().getData()));
                }

                ////// WORKFLOW
                ApiResponse<V0BuildWorkflowListResponseModel> workflowListResponse = buildsApi.buildWorkflowListWithHttpInfo(appId);
                if (workflowListResponse.getStatusCode() != 200) {
                    throw new BitriseException(String.format("Could not get list of workflows for '%s' app. Response code: %s%n.Response body: %s",
                            appId, workflowListResponse.getStatusCode(), workflowListResponse.getData()));
                }

                // check that such branch exists
                if (workflowListResponse.getData()
                        .getData()
                        .stream()
                        .noneMatch(w -> StringUtils.equals(w, workflow))) {
                    throw new BitriseException(String.format("Could not find workflow '%s' for the '%s' app.  Available workflows: %s",
                            branch, appId, workflowListResponse.getData().getData()));
                }

                ApiResponse<V0BuildListResponseModel> buildListResponse = buildsApi.buildListWithHttpInfo(appId, "created_at", branch, workflow,
                        null, null, null, null, null, null, null, null, null, null);
                if (buildListResponse.getStatusCode() != 200) {
                    throw new BitriseException(
                            String.format(
                                    "Could not get list of builds for '%s' app, '%s' branch, '%s' workflow. Response code: %s%n.Response body: %s",
                                    appId, workflow, branch, buildListResponse.getStatusCode(), buildListResponse.getData()));
                }

                List<V0BuildResponseItemModel> builds = buildListResponse.getData()
                        .getData()
                        .stream()
                        .filter(data -> data.getStatus() == 1)
                        .collect(Collectors.toList());

                V0BuildResponseItemModel build = null;

                if (StringUtils.equalsIgnoreCase(buildNumber, "latest")) {
                    if (builds.isEmpty()) {
                        throw new BitriseException(
                                String.format("Could not get latest build for '%s' app, '%s' branch, '%s' workflow with success status.", appId,
                                        workflow,
                                        branch));
                    }
                    build = builds.get(0);
                } else {
                    build = builds.stream().filter(b -> StringUtils.equals(b.getBuildNumber().toString(), buildNumber))
                            .findAny()
                            .orElseThrow(() -> new BitriseException(
                                    String.format("Could not get '%s' build for '%s' app, '%s' branch, '%s' workflow with success status.",
                                            buildNumber, appId, workflow, branch)));
                }

                ApiResponse<V0ArtifactListResponseModel> artifactListResponse = buildArtifactApi.artifactListWithHttpInfo(appId, build.getSlug(),
                        null,
                        null);
                if (artifactListResponse.getStatusCode() != 200) {
                    throw new BitriseException(
                            String.format("Could not get list of artifacts for '%s' app, '%s' build. Response code: %s%n.Response body: %s",
                                    appId, build.getBuildNumber(), artifactListResponse.getStatusCode(), artifactListResponse.getData()));
                }

                List<V0ArtifactListElementResponseModel> artifacts = artifactListResponse.getData().getData();

                V0ArtifactListElementResponseModel artifact = artifacts.stream()
                        .filter(a -> artifactNamePattern.matcher(a.getTitle()).find())
                        .findAny()
                        .orElseThrow(() -> new BitriseException(
                                String.format("Could not find artifact in build '%s' which title matches '%s' pattern. Available artifacts: %s",
                                        buildNumber, artifactNamePatternString,
                                        artifacts.stream()
                                                .map(V0ArtifactListElementResponseModel::getTitle)
                                                .collect(Collectors.toList()))));

                ApiResponse<V0ArtifactShowResponseModel> artifactResponse = buildArtifactApi.artifactShowWithHttpInfo(appId, build.getSlug(),
                        artifact.getSlug(), null);
                if (artifactResponse.getStatusCode() != 200) {
                    throw new BitriseException(
                            String.format(
                                    "Could not get artifact info for '%s' app, '%s' build, '%s' artifact. Response code: %s%n.Response body: %s",
                                    appId, buildNumber, artifact.getSlug(), artifactResponse.getStatusCode(), artifactResponse.getData()));
                }
                EXCEPTION_TIMEOUTS.put(url, Duration.ofMillis(System.currentTimeMillis()).plus(Duration.ofMinutes(5)));

                V0ArtifactResponseItemModel artifactInfo = artifactResponse.getData()
                        .getData();
                BitriseApp bitriseApp = new BitriseApp();
                bitriseApp.setBuild(String.valueOf(build.getBuildNumber()));
                bitriseApp.setDirectLink(artifactInfo.getExpiringDownloadUrl());
                LOGGER.info("Bitrise URL: {}", artifactInfo.getExpiringDownloadUrl());
                return bitriseApp;
            } catch (ApiException e) {
                LOGGER.error("Could not get bitrise download url. Code: {}, Message: {}", e.getCode(), e.getMessage(), e);
                return ExceptionUtils.rethrow(e);
            }
        });
    }
}
