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
 * V0AppSecretUpsertParams
 */

public class V0AppSecretUpsertParams {
    @SerializedName("expand_in_step_inputs")
    private Boolean expandInStepInputs = null;

    @SerializedName("is_exposed_for_pull_requests")
    private Boolean isExposedForPullRequests = null;

    @SerializedName("is_protected")
    private Boolean isProtected = null;

    @SerializedName("value")
    private String value = null;

    public V0AppSecretUpsertParams expandInStepInputs(Boolean expandInStepInputs) {
        this.expandInStepInputs = expandInStepInputs;
        return this;
    }

    /**
     * Replace variable in inputs? https://devcenter.bitrise.io/en/references/steps-reference/step-inputs-reference.html#step-input-properties
     *
     * @return expandInStepInputs
     **/

    public Boolean isExpandInStepInputs() {
        return expandInStepInputs;
    }

    public void setExpandInStepInputs(Boolean expandInStepInputs) {
        this.expandInStepInputs = expandInStepInputs;
    }

    public V0AppSecretUpsertParams isExposedForPullRequests(Boolean isExposedForPullRequests) {
        this.isExposedForPullRequests = isExposedForPullRequests;
        return this;
    }

    /**
     * Expose for Pull Requests?
     *
     * @return isExposedForPullRequests
     **/

    public Boolean isIsExposedForPullRequests() {
        return isExposedForPullRequests;
    }

    public void setIsExposedForPullRequests(Boolean isExposedForPullRequests) {
        this.isExposedForPullRequests = isExposedForPullRequests;
    }

    public V0AppSecretUpsertParams isProtected(Boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    /**
     * Secret marked as protected?
     *
     * @return isProtected
     **/

    public Boolean isIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    public V0AppSecretUpsertParams value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Value of the secret
     *
     * @return value
     **/

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0AppSecretUpsertParams v0AppSecretUpsertParams = (V0AppSecretUpsertParams) o;
        return Objects.equals(this.expandInStepInputs, v0AppSecretUpsertParams.expandInStepInputs) &&
                Objects.equals(this.isExposedForPullRequests, v0AppSecretUpsertParams.isExposedForPullRequests) &&
                Objects.equals(this.isProtected, v0AppSecretUpsertParams.isProtected) &&
                Objects.equals(this.value, v0AppSecretUpsertParams.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expandInStepInputs, isExposedForPullRequests, isProtected, value);
    }

    @Override
    public String toString() {

        String sb = "class V0AppSecretUpsertParams {\n"
                + "    expandInStepInputs: " + toIndentedString(expandInStepInputs) + "\n"
                + "    isExposedForPullRequests: " + toIndentedString(isExposedForPullRequests) + "\n"
                + "    isProtected: " + toIndentedString(isProtected) + "\n"
                + "    value: " + toIndentedString(value) + "\n"
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
