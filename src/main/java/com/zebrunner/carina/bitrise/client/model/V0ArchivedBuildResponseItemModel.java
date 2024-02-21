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
import java.util.List;
import java.util.Objects;

/**
 * V0ArchivedBuildResponseItemModel
 */

public class V0ArchivedBuildResponseItemModel {
    @SerializedName("abort_reason")
    private String abortReason = null;

    @SerializedName("branch")
    private String branch = null;

    @SerializedName("build_artifacts")
    private List<V0ArchivedBuildArtifact> buildArtifacts = null;

    @SerializedName("build_number")
    private Integer buildNumber = null;

    @SerializedName("commit_hash")
    private String commitHash = null;

    @SerializedName("commit_message")
    private String commitMessage = null;

    @SerializedName("credit_cost")
    private Integer creditCost = null;

    @SerializedName("finished_at")
    private String finishedAt = null;

    @SerializedName("machine_type_id")
    private String machineTypeId = null;

    @SerializedName("original_build_params")
    private Object originalBuildParams = null;

    @SerializedName("pipeline_workflow_id")
    private String pipelineWorkflowId = null;

    @SerializedName("pull_request_id")
    private Integer pullRequestId = null;

    @SerializedName("pull_request_target_branch")
    private String pullRequestTargetBranch = null;

    @SerializedName("pull_request_view_url")
    private String pullRequestViewUrl = null;

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

    @SerializedName("triggered_by")
    private String triggeredBy = null;

    @SerializedName("triggered_workflow")
    private String triggeredWorkflow = null;

    public V0ArchivedBuildResponseItemModel abortReason(String abortReason) {
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

    public V0ArchivedBuildResponseItemModel branch(String branch) {
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

    public V0ArchivedBuildResponseItemModel buildArtifacts(List<V0ArchivedBuildArtifact> buildArtifacts) {
        this.buildArtifacts = buildArtifacts;
        return this;
    }

    public V0ArchivedBuildResponseItemModel addBuildArtifactsItem(V0ArchivedBuildArtifact buildArtifactsItem) {
        if (this.buildArtifacts == null) {
            this.buildArtifacts = new ArrayList<V0ArchivedBuildArtifact>();
        }
        this.buildArtifacts.add(buildArtifactsItem);
        return this;
    }

    /**
     * Get buildArtifacts
     *
     * @return buildArtifacts
     **/

    public List<V0ArchivedBuildArtifact> getBuildArtifacts() {
        return buildArtifacts;
    }

    public void setBuildArtifacts(List<V0ArchivedBuildArtifact> buildArtifacts) {
        this.buildArtifacts = buildArtifacts;
    }

    public V0ArchivedBuildResponseItemModel buildNumber(Integer buildNumber) {
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

    public V0ArchivedBuildResponseItemModel commitHash(String commitHash) {
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

    public V0ArchivedBuildResponseItemModel commitMessage(String commitMessage) {
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

    public V0ArchivedBuildResponseItemModel creditCost(Integer creditCost) {
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

    public V0ArchivedBuildResponseItemModel finishedAt(String finishedAt) {
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

    public V0ArchivedBuildResponseItemModel machineTypeId(String machineTypeId) {
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

    public V0ArchivedBuildResponseItemModel originalBuildParams(Object originalBuildParams) {
        this.originalBuildParams = originalBuildParams;
        return this;
    }

    public V0ArchivedBuildResponseItemModel addOriginalBuildParamsItem(Object originalBuildParamsItem) {
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

    public V0ArchivedBuildResponseItemModel pipelineWorkflowId(String pipelineWorkflowId) {
        this.pipelineWorkflowId = pipelineWorkflowId;
        return this;
    }

    /**
     * Get pipelineWorkflowId
     *
     * @return pipelineWorkflowId
     **/

    public String getPipelineWorkflowId() {
        return pipelineWorkflowId;
    }

    public void setPipelineWorkflowId(String pipelineWorkflowId) {
        this.pipelineWorkflowId = pipelineWorkflowId;
    }

    public V0ArchivedBuildResponseItemModel pullRequestId(Integer pullRequestId) {
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

    public V0ArchivedBuildResponseItemModel pullRequestTargetBranch(String pullRequestTargetBranch) {
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

    public V0ArchivedBuildResponseItemModel pullRequestViewUrl(String pullRequestViewUrl) {
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

    public V0ArchivedBuildResponseItemModel slug(String slug) {
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

    public V0ArchivedBuildResponseItemModel stackIdentifier(String stackIdentifier) {
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

    public V0ArchivedBuildResponseItemModel startedOnWorkerAt(String startedOnWorkerAt) {
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

    public V0ArchivedBuildResponseItemModel status(Integer status) {
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

    public V0ArchivedBuildResponseItemModel statusText(String statusText) {
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

    public V0ArchivedBuildResponseItemModel tag(String tag) {
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

    public V0ArchivedBuildResponseItemModel triggeredBy(String triggeredBy) {
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

    public V0ArchivedBuildResponseItemModel triggeredWorkflow(String triggeredWorkflow) {
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
        V0ArchivedBuildResponseItemModel v0ArchivedBuildResponseItemModel = (V0ArchivedBuildResponseItemModel) o;
        return Objects.equals(this.abortReason, v0ArchivedBuildResponseItemModel.abortReason) &&
                Objects.equals(this.branch, v0ArchivedBuildResponseItemModel.branch) &&
                Objects.equals(this.buildArtifacts, v0ArchivedBuildResponseItemModel.buildArtifacts) &&
                Objects.equals(this.buildNumber, v0ArchivedBuildResponseItemModel.buildNumber) &&
                Objects.equals(this.commitHash, v0ArchivedBuildResponseItemModel.commitHash) &&
                Objects.equals(this.commitMessage, v0ArchivedBuildResponseItemModel.commitMessage) &&
                Objects.equals(this.creditCost, v0ArchivedBuildResponseItemModel.creditCost) &&
                Objects.equals(this.finishedAt, v0ArchivedBuildResponseItemModel.finishedAt) &&
                Objects.equals(this.machineTypeId, v0ArchivedBuildResponseItemModel.machineTypeId) &&
                Objects.equals(this.originalBuildParams, v0ArchivedBuildResponseItemModel.originalBuildParams) &&
                Objects.equals(this.pipelineWorkflowId, v0ArchivedBuildResponseItemModel.pipelineWorkflowId) &&
                Objects.equals(this.pullRequestId, v0ArchivedBuildResponseItemModel.pullRequestId) &&
                Objects.equals(this.pullRequestTargetBranch, v0ArchivedBuildResponseItemModel.pullRequestTargetBranch) &&
                Objects.equals(this.pullRequestViewUrl, v0ArchivedBuildResponseItemModel.pullRequestViewUrl) &&
                Objects.equals(this.slug, v0ArchivedBuildResponseItemModel.slug) &&
                Objects.equals(this.stackIdentifier, v0ArchivedBuildResponseItemModel.stackIdentifier) &&
                Objects.equals(this.startedOnWorkerAt, v0ArchivedBuildResponseItemModel.startedOnWorkerAt) &&
                Objects.equals(this.status, v0ArchivedBuildResponseItemModel.status) &&
                Objects.equals(this.statusText, v0ArchivedBuildResponseItemModel.statusText) &&
                Objects.equals(this.tag, v0ArchivedBuildResponseItemModel.tag) &&
                Objects.equals(this.triggeredBy, v0ArchivedBuildResponseItemModel.triggeredBy) &&
                Objects.equals(this.triggeredWorkflow, v0ArchivedBuildResponseItemModel.triggeredWorkflow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abortReason, branch, buildArtifacts, buildNumber, commitHash, commitMessage, creditCost, finishedAt, machineTypeId,
                originalBuildParams, pipelineWorkflowId, pullRequestId, pullRequestTargetBranch, pullRequestViewUrl, slug, stackIdentifier,
                startedOnWorkerAt, status, statusText, tag, triggeredBy, triggeredWorkflow);
    }

    @Override
    public String toString() {

        String sb = "class V0ArchivedBuildResponseItemModel {\n"
                + "    abortReason: " + toIndentedString(abortReason) + "\n"
                + "    branch: " + toIndentedString(branch) + "\n"
                + "    buildArtifacts: " + toIndentedString(buildArtifacts) + "\n"
                + "    buildNumber: " + toIndentedString(buildNumber) + "\n"
                + "    commitHash: " + toIndentedString(commitHash) + "\n"
                + "    commitMessage: " + toIndentedString(commitMessage) + "\n"
                + "    creditCost: " + toIndentedString(creditCost) + "\n"
                + "    finishedAt: " + toIndentedString(finishedAt) + "\n"
                + "    machineTypeId: " + toIndentedString(machineTypeId) + "\n"
                + "    originalBuildParams: " + toIndentedString(originalBuildParams) + "\n"
                + "    pipelineWorkflowId: " + toIndentedString(pipelineWorkflowId) + "\n"
                + "    pullRequestId: " + toIndentedString(pullRequestId) + "\n"
                + "    pullRequestTargetBranch: " + toIndentedString(pullRequestTargetBranch) + "\n"
                + "    pullRequestViewUrl: " + toIndentedString(pullRequestViewUrl) + "\n"
                + "    slug: " + toIndentedString(slug) + "\n"
                + "    stackIdentifier: " + toIndentedString(stackIdentifier) + "\n"
                + "    startedOnWorkerAt: " + toIndentedString(startedOnWorkerAt) + "\n"
                + "    status: " + toIndentedString(status) + "\n"
                + "    statusText: " + toIndentedString(statusText) + "\n"
                + "    tag: " + toIndentedString(tag) + "\n"
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
