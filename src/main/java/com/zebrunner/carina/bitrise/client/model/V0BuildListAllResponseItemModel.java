/*
 * Bitrise API
 * Official REST API for Bitrise.io
 *
 * OpenAPI spec version: 0.1
 * Contact: letsconnect@bitrise.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.zebrunner.carina.bitrise.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Objects;

/**
 * V0BuildListAllResponseItemModel
 */

public class V0BuildListAllResponseItemModel {
    @SerializedName("abort_reason")
    private String abortReason = null;

    @SerializedName("branch")
    private String branch = null;

    @SerializedName("build_number")
    private Integer buildNumber = null;

    @SerializedName("commit_hash")
    private String commitHash = null;

    @SerializedName("commit_message")
    private String commitMessage = null;

    @SerializedName("commit_view_url")
    private String commitViewUrl = null;

    @SerializedName("credit_cost")
    private Integer creditCost = null;

    @SerializedName("environment_prepare_finished_at")
    private String environmentPrepareFinishedAt = null;

    @SerializedName("finished_at")
    private String finishedAt = null;

    @SerializedName("is_on_hold")
    private Boolean isOnHold = null;

    @SerializedName("is_processed")
    private Boolean isProcessed = null;

    @SerializedName("machine_type_id")
    private String machineTypeId = null;

    @SerializedName("original_build_params")
    private Object originalBuildParams = null;

    @SerializedName("pull_request_id")
    private Integer pullRequestId = null;

    @SerializedName("pull_request_target_branch")
    private String pullRequestTargetBranch = null;

    @SerializedName("pull_request_view_url")
    private String pullRequestViewUrl = null;

    @SerializedName("repository")
    private V0AppResponseItemModel repository = null;

    @SerializedName("slug")
    private String slug = null;

    @SerializedName("stack_identifier")
    private String stackIdentifier = null;

    @SerializedName("started_on_worker_at")
    private String startedOnWorkerAt = null;

    @SerializedName("status")
    private Integer status = null;

    @SerializedName("status_text")
    private String statusText = null;

    @SerializedName("tag")
    private String tag = null;

    @SerializedName("triggered_at")
    private String triggeredAt = null;

    @SerializedName("triggered_by")
    private String triggeredBy = null;

    @SerializedName("triggered_workflow")
    private String triggeredWorkflow = null;

    public V0BuildListAllResponseItemModel abortReason(String abortReason) {
        this.abortReason = abortReason;
        return this;
    }

    /**
     * Get abortReason
     *
     * @return abortReason
     **/

    public String getAbortReason() {
        return abortReason;
    }

    public void setAbortReason(String abortReason) {
        this.abortReason = abortReason;
    }

    public V0BuildListAllResponseItemModel branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get branch
     *
     * @return branch
     **/

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public V0BuildListAllResponseItemModel buildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }

    /**
     * Get buildNumber
     *
     * @return buildNumber
     **/

    public Integer getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
    }

    public V0BuildListAllResponseItemModel commitHash(String commitHash) {
        this.commitHash = commitHash;
        return this;
    }

    /**
     * Get commitHash
     *
     * @return commitHash
     **/

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    public V0BuildListAllResponseItemModel commitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * Get commitMessage
     *
     * @return commitMessage
     **/

    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public V0BuildListAllResponseItemModel commitViewUrl(String commitViewUrl) {
        this.commitViewUrl = commitViewUrl;
        return this;
    }

    /**
     * Get commitViewUrl
     *
     * @return commitViewUrl
     **/

    public String getCommitViewUrl() {
        return commitViewUrl;
    }

    public void setCommitViewUrl(String commitViewUrl) {
        this.commitViewUrl = commitViewUrl;
    }

    public V0BuildListAllResponseItemModel creditCost(Integer creditCost) {
        this.creditCost = creditCost;
        return this;
    }

    /**
     * Get creditCost
     *
     * @return creditCost
     **/

    public Integer getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(Integer creditCost) {
        this.creditCost = creditCost;
    }

    public V0BuildListAllResponseItemModel environmentPrepareFinishedAt(String environmentPrepareFinishedAt) {
        this.environmentPrepareFinishedAt = environmentPrepareFinishedAt;
        return this;
    }

    /**
     * Get environmentPrepareFinishedAt
     *
     * @return environmentPrepareFinishedAt
     **/

    public String getEnvironmentPrepareFinishedAt() {
        return environmentPrepareFinishedAt;
    }

    public void setEnvironmentPrepareFinishedAt(String environmentPrepareFinishedAt) {
        this.environmentPrepareFinishedAt = environmentPrepareFinishedAt;
    }

    public V0BuildListAllResponseItemModel finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     *
     * @return finishedAt
     **/

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public V0BuildListAllResponseItemModel isOnHold(Boolean isOnHold) {
        this.isOnHold = isOnHold;
        return this;
    }

    /**
     * Get isOnHold
     *
     * @return isOnHold
     **/

    public Boolean isIsOnHold() {
        return isOnHold;
    }

    public void setIsOnHold(Boolean isOnHold) {
        this.isOnHold = isOnHold;
    }

    public V0BuildListAllResponseItemModel isProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
        return this;
    }

    /**
     * Get isProcessed
     *
     * @return isProcessed
     **/

    public Boolean isIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    public V0BuildListAllResponseItemModel machineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
        return this;
    }

    /**
     * Get machineTypeId
     *
     * @return machineTypeId
     **/

    public String getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
    }

    public V0BuildListAllResponseItemModel originalBuildParams(Object originalBuildParams) {
        this.originalBuildParams = originalBuildParams;
        return this;
    }

    public V0BuildListAllResponseItemModel addOriginalBuildParamsItem(Object originalBuildParamsItem) {
        if (this.originalBuildParams == null) {
            this.originalBuildParams = new ArrayList<Object>();
        }
        this.originalBuildParams = originalBuildParamsItem;
        return this;
    }

    /**
     * Get originalBuildParams
     *
     * @return originalBuildParams
     **/

    public Object getOriginalBuildParams() {
        return originalBuildParams;
    }

    public void setOriginalBuildParams(Object originalBuildParams) {
        this.originalBuildParams = originalBuildParams;
    }

    public V0BuildListAllResponseItemModel pullRequestId(Integer pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * Get pullRequestId
     *
     * @return pullRequestId
     **/

    public Integer getPullRequestId() {
        return pullRequestId;
    }

    public void setPullRequestId(Integer pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public V0BuildListAllResponseItemModel pullRequestTargetBranch(String pullRequestTargetBranch) {
        this.pullRequestTargetBranch = pullRequestTargetBranch;
        return this;
    }

    /**
     * Get pullRequestTargetBranch
     *
     * @return pullRequestTargetBranch
     **/

    public String getPullRequestTargetBranch() {
        return pullRequestTargetBranch;
    }

    public void setPullRequestTargetBranch(String pullRequestTargetBranch) {
        this.pullRequestTargetBranch = pullRequestTargetBranch;
    }

    public V0BuildListAllResponseItemModel pullRequestViewUrl(String pullRequestViewUrl) {
        this.pullRequestViewUrl = pullRequestViewUrl;
        return this;
    }

    /**
     * Get pullRequestViewUrl
     *
     * @return pullRequestViewUrl
     **/

    public String getPullRequestViewUrl() {
        return pullRequestViewUrl;
    }

    public void setPullRequestViewUrl(String pullRequestViewUrl) {
        this.pullRequestViewUrl = pullRequestViewUrl;
    }

    public V0BuildListAllResponseItemModel repository(V0AppResponseItemModel repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     *
     * @return repository
     **/

    public V0AppResponseItemModel getRepository() {
        return repository;
    }

    public void setRepository(V0AppResponseItemModel repository) {
        this.repository = repository;
    }

    public V0BuildListAllResponseItemModel slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     *
     * @return slug
     **/

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public V0BuildListAllResponseItemModel stackIdentifier(String stackIdentifier) {
        this.stackIdentifier = stackIdentifier;
        return this;
    }

    /**
     * Get stackIdentifier
     *
     * @return stackIdentifier
     **/

    public String getStackIdentifier() {
        return stackIdentifier;
    }

    public void setStackIdentifier(String stackIdentifier) {
        this.stackIdentifier = stackIdentifier;
    }

    public V0BuildListAllResponseItemModel startedOnWorkerAt(String startedOnWorkerAt) {
        this.startedOnWorkerAt = startedOnWorkerAt;
        return this;
    }

    /**
     * Get startedOnWorkerAt
     *
     * @return startedOnWorkerAt
     **/

    public String getStartedOnWorkerAt() {
        return startedOnWorkerAt;
    }

    public void setStartedOnWorkerAt(String startedOnWorkerAt) {
        this.startedOnWorkerAt = startedOnWorkerAt;
    }

    public V0BuildListAllResponseItemModel status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public V0BuildListAllResponseItemModel statusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    /**
     * Get statusText
     *
     * @return statusText
     **/

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public V0BuildListAllResponseItemModel tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     *
     * @return tag
     **/

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public V0BuildListAllResponseItemModel triggeredAt(String triggeredAt) {
        this.triggeredAt = triggeredAt;
        return this;
    }

    /**
     * Get triggeredAt
     *
     * @return triggeredAt
     **/

    public String getTriggeredAt() {
        return triggeredAt;
    }

    public void setTriggeredAt(String triggeredAt) {
        this.triggeredAt = triggeredAt;
    }

    public V0BuildListAllResponseItemModel triggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
        return this;
    }

    /**
     * Get triggeredBy
     *
     * @return triggeredBy
     **/

    public String getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public V0BuildListAllResponseItemModel triggeredWorkflow(String triggeredWorkflow) {
        this.triggeredWorkflow = triggeredWorkflow;
        return this;
    }

    /**
     * Get triggeredWorkflow
     *
     * @return triggeredWorkflow
     **/

    public String getTriggeredWorkflow() {
        return triggeredWorkflow;
    }

    public void setTriggeredWorkflow(String triggeredWorkflow) {
        this.triggeredWorkflow = triggeredWorkflow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0BuildListAllResponseItemModel v0BuildListAllResponseItemModel = (V0BuildListAllResponseItemModel) o;
        return Objects.equals(this.abortReason, v0BuildListAllResponseItemModel.abortReason) &&
                Objects.equals(this.branch, v0BuildListAllResponseItemModel.branch) &&
                Objects.equals(this.buildNumber, v0BuildListAllResponseItemModel.buildNumber) &&
                Objects.equals(this.commitHash, v0BuildListAllResponseItemModel.commitHash) &&
                Objects.equals(this.commitMessage, v0BuildListAllResponseItemModel.commitMessage) &&
                Objects.equals(this.commitViewUrl, v0BuildListAllResponseItemModel.commitViewUrl) &&
                Objects.equals(this.creditCost, v0BuildListAllResponseItemModel.creditCost) &&
                Objects.equals(this.environmentPrepareFinishedAt, v0BuildListAllResponseItemModel.environmentPrepareFinishedAt) &&
                Objects.equals(this.finishedAt, v0BuildListAllResponseItemModel.finishedAt) &&
                Objects.equals(this.isOnHold, v0BuildListAllResponseItemModel.isOnHold) &&
                Objects.equals(this.isProcessed, v0BuildListAllResponseItemModel.isProcessed) &&
                Objects.equals(this.machineTypeId, v0BuildListAllResponseItemModel.machineTypeId) &&
                Objects.equals(this.originalBuildParams, v0BuildListAllResponseItemModel.originalBuildParams) &&
                Objects.equals(this.pullRequestId, v0BuildListAllResponseItemModel.pullRequestId) &&
                Objects.equals(this.pullRequestTargetBranch, v0BuildListAllResponseItemModel.pullRequestTargetBranch) &&
                Objects.equals(this.pullRequestViewUrl, v0BuildListAllResponseItemModel.pullRequestViewUrl) &&
                Objects.equals(this.repository, v0BuildListAllResponseItemModel.repository) &&
                Objects.equals(this.slug, v0BuildListAllResponseItemModel.slug) &&
                Objects.equals(this.stackIdentifier, v0BuildListAllResponseItemModel.stackIdentifier) &&
                Objects.equals(this.startedOnWorkerAt, v0BuildListAllResponseItemModel.startedOnWorkerAt) &&
                Objects.equals(this.status, v0BuildListAllResponseItemModel.status) &&
                Objects.equals(this.statusText, v0BuildListAllResponseItemModel.statusText) &&
                Objects.equals(this.tag, v0BuildListAllResponseItemModel.tag) &&
                Objects.equals(this.triggeredAt, v0BuildListAllResponseItemModel.triggeredAt) &&
                Objects.equals(this.triggeredBy, v0BuildListAllResponseItemModel.triggeredBy) &&
                Objects.equals(this.triggeredWorkflow, v0BuildListAllResponseItemModel.triggeredWorkflow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abortReason, branch, buildNumber, commitHash, commitMessage, commitViewUrl, creditCost, environmentPrepareFinishedAt,
                finishedAt, isOnHold, isProcessed, machineTypeId, originalBuildParams, pullRequestId, pullRequestTargetBranch, pullRequestViewUrl,
                repository, slug, stackIdentifier, startedOnWorkerAt, status, statusText, tag, triggeredAt, triggeredBy, triggeredWorkflow);
    }

    @Override
    public String toString() {

        String sb = "class V0BuildListAllResponseItemModel {\n"
                + "    abortReason: " + toIndentedString(abortReason) + "\n"
                + "    branch: " + toIndentedString(branch) + "\n"
                + "    buildNumber: " + toIndentedString(buildNumber) + "\n"
                + "    commitHash: " + toIndentedString(commitHash) + "\n"
                + "    commitMessage: " + toIndentedString(commitMessage) + "\n"
                + "    commitViewUrl: " + toIndentedString(commitViewUrl) + "\n"
                + "    creditCost: " + toIndentedString(creditCost) + "\n"
                + "    environmentPrepareFinishedAt: " + toIndentedString(environmentPrepareFinishedAt) + "\n"
                + "    finishedAt: " + toIndentedString(finishedAt) + "\n"
                + "    isOnHold: " + toIndentedString(isOnHold) + "\n"
                + "    isProcessed: " + toIndentedString(isProcessed) + "\n"
                + "    machineTypeId: " + toIndentedString(machineTypeId) + "\n"
                + "    originalBuildParams: " + toIndentedString(originalBuildParams) + "\n"
                + "    pullRequestId: " + toIndentedString(pullRequestId) + "\n"
                + "    pullRequestTargetBranch: " + toIndentedString(pullRequestTargetBranch) + "\n"
                + "    pullRequestViewUrl: " + toIndentedString(pullRequestViewUrl) + "\n"
                + "    repository: " + toIndentedString(repository) + "\n"
                + "    slug: " + toIndentedString(slug) + "\n"
                + "    stackIdentifier: " + toIndentedString(stackIdentifier) + "\n"
                + "    startedOnWorkerAt: " + toIndentedString(startedOnWorkerAt) + "\n"
                + "    status: " + toIndentedString(status) + "\n"
                + "    statusText: " + toIndentedString(statusText) + "\n"
                + "    tag: " + toIndentedString(tag) + "\n"
                + "    triggeredAt: " + toIndentedString(triggeredAt) + "\n"
                + "    triggeredBy: " + toIndentedString(triggeredBy) + "\n"
                + "    triggeredWorkflow: " + toIndentedString(triggeredWorkflow) + "\n"
                + "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}