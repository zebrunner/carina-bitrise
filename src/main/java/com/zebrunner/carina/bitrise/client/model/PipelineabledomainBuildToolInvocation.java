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
 * PipelineabledomainBuildToolInvocation
 */

public class PipelineabledomainBuildToolInvocation {
    @SerializedName("invocation_id")
    private String invocationId = null;

    @SerializedName("tool")
    private String tool = null;

    @SerializedName("tool_version")
    private String toolVersion = null;

    public PipelineabledomainBuildToolInvocation invocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }

    /**
     * Get invocationId
     *
     * @return invocationId
     **/

    public String getInvocationId() {
        return invocationId;
    }

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    public PipelineabledomainBuildToolInvocation tool(String tool) {
        this.tool = tool;
        return this;
    }

    /**
     * Get tool
     *
     * @return tool
     **/

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public PipelineabledomainBuildToolInvocation toolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
        return this;
    }

    /**
     * Get toolVersion
     *
     * @return toolVersion
     **/

    public String getToolVersion() {
        return toolVersion;
    }

    public void setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineabledomainBuildToolInvocation pipelineabledomainBuildToolInvocation = (PipelineabledomainBuildToolInvocation) o;
        return Objects.equals(this.invocationId, pipelineabledomainBuildToolInvocation.invocationId) &&
                Objects.equals(this.tool, pipelineabledomainBuildToolInvocation.tool) &&
                Objects.equals(this.toolVersion, pipelineabledomainBuildToolInvocation.toolVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocationId, tool, toolVersion);
    }

    @Override
    public String toString() {

        String sb = "class PipelineabledomainBuildToolInvocation {\n"
                + "    invocationId: " + toIndentedString(invocationId) + "\n"
                + "    tool: " + toIndentedString(tool) + "\n"
                + "    toolVersion: " + toIndentedString(toolVersion) + "\n"
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
