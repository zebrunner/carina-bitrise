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
 * V0BuildTriggerParamsHookInfo
 */

public class V0BuildTriggerParamsHookInfo {
    @SerializedName("type")
    private String type = null;

    public V0BuildTriggerParamsHookInfo type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Should be \&quot;bitrise\&quot;
     *
     * @return type
     **/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0BuildTriggerParamsHookInfo v0BuildTriggerParamsHookInfo = (V0BuildTriggerParamsHookInfo) o;
        return Objects.equals(this.type, v0BuildTriggerParamsHookInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {

        String sb = "class V0BuildTriggerParamsHookInfo {\n"
                + "    type: " + toIndentedString(type) + "\n"
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