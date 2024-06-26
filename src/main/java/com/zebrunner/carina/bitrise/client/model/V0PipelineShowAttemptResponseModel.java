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

import java.util.Objects;

/**
 * V0PipelineShowAttemptResponseModel
 */

public class V0PipelineShowAttemptResponseModel {
    @SerializedName("id")
    private String id = null;

    @SerializedName("number_in_pipeline_build_scope")
    private Integer numberInPipelineBuildScope = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("triggered_at")
    private String triggeredAt = null;

    public V0PipelineShowAttemptResponseModel id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public V0PipelineShowAttemptResponseModel numberInPipelineBuildScope(Integer numberInPipelineBuildScope) {
        this.numberInPipelineBuildScope = numberInPipelineBuildScope;
        return this;
    }

    /**
     * Get numberInPipelineBuildScope
     *
     * @return numberInPipelineBuildScope
     **/

    public Integer getNumberInPipelineBuildScope() {
        return numberInPipelineBuildScope;
    }

    public void setNumberInPipelineBuildScope(Integer numberInPipelineBuildScope) {
        this.numberInPipelineBuildScope = numberInPipelineBuildScope;
    }

    public V0PipelineShowAttemptResponseModel status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public V0PipelineShowAttemptResponseModel triggeredAt(String triggeredAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0PipelineShowAttemptResponseModel v0PipelineShowAttemptResponseModel = (V0PipelineShowAttemptResponseModel) o;
        return Objects.equals(this.id, v0PipelineShowAttemptResponseModel.id) &&
                Objects.equals(this.numberInPipelineBuildScope, v0PipelineShowAttemptResponseModel.numberInPipelineBuildScope) &&
                Objects.equals(this.status, v0PipelineShowAttemptResponseModel.status) &&
                Objects.equals(this.triggeredAt, v0PipelineShowAttemptResponseModel.triggeredAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberInPipelineBuildScope, status, triggeredAt);
    }

    @Override
    public String toString() {

        String sb = "class V0PipelineShowAttemptResponseModel {\n"
                + "    id: " + toIndentedString(id) + "\n"
                + "    numberInPipelineBuildScope: " + toIndentedString(numberInPipelineBuildScope) + "\n"
                + "    status: " + toIndentedString(status) + "\n"
                + "    triggeredAt: " + toIndentedString(triggeredAt) + "\n"
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
