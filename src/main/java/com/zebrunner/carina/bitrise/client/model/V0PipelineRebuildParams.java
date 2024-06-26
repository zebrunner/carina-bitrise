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
 * V0PipelineRebuildParams
 */

public class V0PipelineRebuildParams {
    @SerializedName("partial")
    private Boolean partial = null;

    @SerializedName("triggered_by")
    private String triggeredBy = null;

    public V0PipelineRebuildParams partial(Boolean partial) {
        this.partial = partial;
        return this;
    }

    /**
     * Get partial
     *
     * @return partial
     **/

    public Boolean isPartial() {
        return partial;
    }

    public void setPartial(Boolean partial) {
        this.partial = partial;
    }

    public V0PipelineRebuildParams triggeredBy(String triggeredBy) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0PipelineRebuildParams v0PipelineRebuildParams = (V0PipelineRebuildParams) o;
        return Objects.equals(this.partial, v0PipelineRebuildParams.partial) &&
                Objects.equals(this.triggeredBy, v0PipelineRebuildParams.triggeredBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partial, triggeredBy);
    }

    @Override
    public String toString() {

        String sb = "class V0PipelineRebuildParams {\n"
                + "    partial: " + toIndentedString(partial) + "\n"
                + "    triggeredBy: " + toIndentedString(triggeredBy) + "\n"
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
