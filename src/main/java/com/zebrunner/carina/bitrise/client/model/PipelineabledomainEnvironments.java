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
 * PipelineabledomainEnvironments
 */

public class PipelineabledomainEnvironments {
    @SerializedName("is_expand")
    private Object isExpand = null;

    @SerializedName("key")
    private String key = null;

    @SerializedName("value")
    private Object value = null;

    public PipelineabledomainEnvironments isExpand(Object isExpand) {
        this.isExpand = isExpand;
        return this;
    }

    /**
     * Get isExpand
     *
     * @return isExpand
     **/

    public Object getIsExpand() {
        return isExpand;
    }

    public void setIsExpand(Object isExpand) {
        this.isExpand = isExpand;
    }

    public PipelineabledomainEnvironments key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PipelineabledomainEnvironments value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        PipelineabledomainEnvironments pipelineabledomainEnvironments = (PipelineabledomainEnvironments) o;
        return Objects.equals(this.isExpand, pipelineabledomainEnvironments.isExpand) &&
                Objects.equals(this.key, pipelineabledomainEnvironments.key) &&
                Objects.equals(this.value, pipelineabledomainEnvironments.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExpand, key, value);
    }

    @Override
    public String toString() {

        String sb = "class PipelineabledomainEnvironments {\n"
                + "    isExpand: " + toIndentedString(isExpand) + "\n"
                + "    key: " + toIndentedString(key) + "\n"
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
