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
 * V0AppFinishRespModel
 */

public class V0AppFinishRespModel {
    @SerializedName("branch_name")
    private String branchName = null;

    @SerializedName("build_trigger_token")
    private String buildTriggerToken = null;

    @SerializedName("is_webhook_auto_reg_supported")
    private Boolean isWebhookAutoRegSupported = null;

    @SerializedName("status")
    private String status = null;

    public V0AppFinishRespModel branchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * Get branchName
     *
     * @return branchName
     **/

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public V0AppFinishRespModel buildTriggerToken(String buildTriggerToken) {
        this.buildTriggerToken = buildTriggerToken;
        return this;
    }

    /**
     * Get buildTriggerToken
     *
     * @return buildTriggerToken
     **/

    public String getBuildTriggerToken() {
        return buildTriggerToken;
    }

    public void setBuildTriggerToken(String buildTriggerToken) {
        this.buildTriggerToken = buildTriggerToken;
    }

    public V0AppFinishRespModel isWebhookAutoRegSupported(Boolean isWebhookAutoRegSupported) {
        this.isWebhookAutoRegSupported = isWebhookAutoRegSupported;
        return this;
    }

    /**
     * Get isWebhookAutoRegSupported
     *
     * @return isWebhookAutoRegSupported
     **/

    public Boolean isIsWebhookAutoRegSupported() {
        return isWebhookAutoRegSupported;
    }

    public void setIsWebhookAutoRegSupported(Boolean isWebhookAutoRegSupported) {
        this.isWebhookAutoRegSupported = isWebhookAutoRegSupported;
    }

    public V0AppFinishRespModel status(String status) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0AppFinishRespModel v0AppFinishRespModel = (V0AppFinishRespModel) o;
        return Objects.equals(this.branchName, v0AppFinishRespModel.branchName) &&
                Objects.equals(this.buildTriggerToken, v0AppFinishRespModel.buildTriggerToken) &&
                Objects.equals(this.isWebhookAutoRegSupported, v0AppFinishRespModel.isWebhookAutoRegSupported) &&
                Objects.equals(this.status, v0AppFinishRespModel.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName, buildTriggerToken, isWebhookAutoRegSupported, status);
    }

    @Override
    public String toString() {

        String sb = "class V0AppFinishRespModel {\n"
                + "    branchName: " + toIndentedString(branchName) + "\n"
                + "    buildTriggerToken: " + toIndentedString(buildTriggerToken) + "\n"
                + "    isWebhookAutoRegSupported: " + toIndentedString(isWebhookAutoRegSupported) + "\n"
                + "    status: " + toIndentedString(status) + "\n"
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
