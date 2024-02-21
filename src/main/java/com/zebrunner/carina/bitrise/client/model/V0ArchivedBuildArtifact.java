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
 * V0ArchivedBuildArtifact
 */

public class V0ArchivedBuildArtifact {
    @SerializedName("artifact_meta")
    private Object artifactMeta = null;

    @SerializedName("artifact_type")
    private String artifactType = null;

    @SerializedName("created_at")
    private String createdAt = null;

    @SerializedName("file_size_bytes")
    private Integer fileSizeBytes = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("is_public_page_enabled")
    private Boolean isPublicPageEnabled = null;

    @SerializedName("public_page_token")
    private String publicPageToken = null;

    @SerializedName("title")
    private String title = null;

    public V0ArchivedBuildArtifact artifactMeta(Object o) {
        this.artifactMeta = o;
        return this;
    }

    public V0ArchivedBuildArtifact putArtifactMetaItem(Object o) {
        if (this.artifactMeta == null) {
            this.artifactMeta = new Object();
        }
        this.artifactMeta = o;
        return this;
    }

    /**
     * Get artifactMeta
     *
     * @return artifactMeta
     **/

    public Object getArtifactMeta() {
        return artifactMeta;
    }

    public void setArtifactMeta(Object artifactMeta) {
        this.artifactMeta = artifactMeta;
    }

    public V0ArchivedBuildArtifact artifactType(String artifactType) {
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

    public V0ArchivedBuildArtifact createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     **/

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public V0ArchivedBuildArtifact fileSizeBytes(Integer fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
        return this;
    }

    /**
     * Get fileSizeBytes
     *
     * @return fileSizeBytes
     **/

    public Integer getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(Integer fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public V0ArchivedBuildArtifact id(String id) {
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

    public V0ArchivedBuildArtifact isPublicPageEnabled(Boolean isPublicPageEnabled) {
        this.isPublicPageEnabled = isPublicPageEnabled;
        return this;
    }

    /**
     * Get isPublicPageEnabled
     *
     * @return isPublicPageEnabled
     **/

    public Boolean isIsPublicPageEnabled() {
        return isPublicPageEnabled;
    }

    public void setIsPublicPageEnabled(Boolean isPublicPageEnabled) {
        this.isPublicPageEnabled = isPublicPageEnabled;
    }

    public V0ArchivedBuildArtifact publicPageToken(String publicPageToken) {
        this.publicPageToken = publicPageToken;
        return this;
    }

    /**
     * Get publicPageToken
     *
     * @return publicPageToken
     **/

    public String getPublicPageToken() {
        return publicPageToken;
    }

    public void setPublicPageToken(String publicPageToken) {
        this.publicPageToken = publicPageToken;
    }

    public V0ArchivedBuildArtifact title(String title) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0ArchivedBuildArtifact v0ArchivedBuildArtifact = (V0ArchivedBuildArtifact) o;
        return Objects.equals(this.artifactMeta, v0ArchivedBuildArtifact.artifactMeta) &&
                Objects.equals(this.artifactType, v0ArchivedBuildArtifact.artifactType) &&
                Objects.equals(this.createdAt, v0ArchivedBuildArtifact.createdAt) &&
                Objects.equals(this.fileSizeBytes, v0ArchivedBuildArtifact.fileSizeBytes) &&
                Objects.equals(this.id, v0ArchivedBuildArtifact.id) &&
                Objects.equals(this.isPublicPageEnabled, v0ArchivedBuildArtifact.isPublicPageEnabled) &&
                Objects.equals(this.publicPageToken, v0ArchivedBuildArtifact.publicPageToken) &&
                Objects.equals(this.title, v0ArchivedBuildArtifact.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactMeta, artifactType, createdAt, fileSizeBytes, id, isPublicPageEnabled, publicPageToken, title);
    }

    @Override
    public String toString() {

        String sb = "class V0ArchivedBuildArtifact {\n"
                + "    artifactMeta: " + toIndentedString(artifactMeta) + "\n"
                + "    artifactType: " + toIndentedString(artifactType) + "\n"
                + "    createdAt: " + toIndentedString(createdAt) + "\n"
                + "    fileSizeBytes: " + toIndentedString(fileSizeBytes) + "\n"
                + "    id: " + toIndentedString(id) + "\n"
                + "    isPublicPageEnabled: " + toIndentedString(isPublicPageEnabled) + "\n"
                + "    publicPageToken: " + toIndentedString(publicPageToken) + "\n"
                + "    title: " + toIndentedString(title) + "\n"
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
