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
 * V0BuildCertificateResponseItemModel
 */

public class V0BuildCertificateResponseItemModel {
    @SerializedName("certificate_password")
    private String certificatePassword = null;

    @SerializedName("download_url")
    private String downloadUrl = null;

    @SerializedName("is_expose")
    private Boolean isExpose = null;

    @SerializedName("is_protected")
    private Boolean isProtected = null;

    @SerializedName("processed")
    private Boolean processed = null;

    @SerializedName("slug")
    private String slug = null;

    @SerializedName("upload_file_name")
    private String uploadFileName = null;

    @SerializedName("upload_file_size")
    private Integer uploadFileSize = null;

    @SerializedName("upload_url")
    private String uploadUrl = null;

    public V0BuildCertificateResponseItemModel certificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
        return this;
    }

    /**
     * Get certificatePassword
     *
     * @return certificatePassword
     **/

    public String getCertificatePassword() {
        return certificatePassword;
    }

    public void setCertificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
    }

    public V0BuildCertificateResponseItemModel downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get downloadUrl
     *
     * @return downloadUrl
     **/

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public V0BuildCertificateResponseItemModel isExpose(Boolean isExpose) {
        this.isExpose = isExpose;
        return this;
    }

    /**
     * Get isExpose
     *
     * @return isExpose
     **/

    public Boolean isIsExpose() {
        return isExpose;
    }

    public void setIsExpose(Boolean isExpose) {
        this.isExpose = isExpose;
    }

    public V0BuildCertificateResponseItemModel isProtected(Boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    /**
     * Get isProtected
     *
     * @return isProtected
     **/

    public Boolean isIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    public V0BuildCertificateResponseItemModel processed(Boolean processed) {
        this.processed = processed;
        return this;
    }

    /**
     * Get processed
     *
     * @return processed
     **/

    public Boolean isProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public V0BuildCertificateResponseItemModel slug(String slug) {
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

    public V0BuildCertificateResponseItemModel uploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
        return this;
    }

    /**
     * Get uploadFileName
     *
     * @return uploadFileName
     **/

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public V0BuildCertificateResponseItemModel uploadFileSize(Integer uploadFileSize) {
        this.uploadFileSize = uploadFileSize;
        return this;
    }

    /**
     * Get uploadFileSize
     *
     * @return uploadFileSize
     **/

    public Integer getUploadFileSize() {
        return uploadFileSize;
    }

    public void setUploadFileSize(Integer uploadFileSize) {
        this.uploadFileSize = uploadFileSize;
    }

    public V0BuildCertificateResponseItemModel uploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * Get uploadUrl
     *
     * @return uploadUrl
     **/

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0BuildCertificateResponseItemModel v0BuildCertificateResponseItemModel = (V0BuildCertificateResponseItemModel) o;
        return Objects.equals(this.certificatePassword, v0BuildCertificateResponseItemModel.certificatePassword) &&
                Objects.equals(this.downloadUrl, v0BuildCertificateResponseItemModel.downloadUrl) &&
                Objects.equals(this.isExpose, v0BuildCertificateResponseItemModel.isExpose) &&
                Objects.equals(this.isProtected, v0BuildCertificateResponseItemModel.isProtected) &&
                Objects.equals(this.processed, v0BuildCertificateResponseItemModel.processed) &&
                Objects.equals(this.slug, v0BuildCertificateResponseItemModel.slug) &&
                Objects.equals(this.uploadFileName, v0BuildCertificateResponseItemModel.uploadFileName) &&
                Objects.equals(this.uploadFileSize, v0BuildCertificateResponseItemModel.uploadFileSize) &&
                Objects.equals(this.uploadUrl, v0BuildCertificateResponseItemModel.uploadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificatePassword, downloadUrl, isExpose, isProtected, processed, slug, uploadFileName, uploadFileSize, uploadUrl);
    }

    @Override
    public String toString() {

        String sb = "class V0BuildCertificateResponseItemModel {\n"
                + "    certificatePassword: " + toIndentedString(certificatePassword) + "\n"
                + "    downloadUrl: " + toIndentedString(downloadUrl) + "\n"
                + "    isExpose: " + toIndentedString(isExpose) + "\n"
                + "    isProtected: " + toIndentedString(isProtected) + "\n"
                + "    processed: " + toIndentedString(processed) + "\n"
                + "    slug: " + toIndentedString(slug) + "\n"
                + "    uploadFileName: " + toIndentedString(uploadFileName) + "\n"
                + "    uploadFileSize: " + toIndentedString(uploadFileSize) + "\n"
                + "    uploadUrl: " + toIndentedString(uploadUrl) + "\n"
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
