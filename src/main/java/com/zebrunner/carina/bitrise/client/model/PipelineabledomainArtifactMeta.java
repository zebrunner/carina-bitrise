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
 * PipelineabledomainArtifactMeta
 */

public class PipelineabledomainArtifactMeta {
    @SerializedName("artifact_type")
    private String artifactType = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("version_code")
    private String versionCode = null;

    @SerializedName("version_name")
    private String versionName = null;

    public PipelineabledomainArtifactMeta artifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * Get artifactType
     *
     * @return artifactType
     **/

    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public PipelineabledomainArtifactMeta id(String id) {
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

    public PipelineabledomainArtifactMeta title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PipelineabledomainArtifactMeta versionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    /**
     * Get versionCode
     *
     * @return versionCode
     **/

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public PipelineabledomainArtifactMeta versionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * Get versionName
     *
     * @return versionName
     **/

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineabledomainArtifactMeta pipelineabledomainArtifactMeta = (PipelineabledomainArtifactMeta) o;
        return Objects.equals(this.artifactType, pipelineabledomainArtifactMeta.artifactType) &&
                Objects.equals(this.id, pipelineabledomainArtifactMeta.id) &&
                Objects.equals(this.title, pipelineabledomainArtifactMeta.title) &&
                Objects.equals(this.versionCode, pipelineabledomainArtifactMeta.versionCode) &&
                Objects.equals(this.versionName, pipelineabledomainArtifactMeta.versionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactType, id, title, versionCode, versionName);
    }

    @Override
    public String toString() {

        String sb = "class PipelineabledomainArtifactMeta {\n"
                + "    artifactType: " + toIndentedString(artifactType) + "\n"
                + "    id: " + toIndentedString(id) + "\n"
                + "    title: " + toIndentedString(title) + "\n"
                + "    versionCode: " + toIndentedString(versionCode) + "\n"
                + "    versionName: " + toIndentedString(versionName) + "\n"
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
