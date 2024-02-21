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
 * V0BuildCertificateUpdateParams
 */

public class V0BuildCertificateUpdateParams {
    @SerializedName("certificate_password")
    private String certificatePassword = null;

    @SerializedName("is_expose")
    private Boolean isExpose = null;

    @SerializedName("is_protected")
    private Boolean isProtected = null;

    @SerializedName("processed")
    private Boolean processed = null;

    public V0BuildCertificateUpdateParams certificatePassword(String certificatePassword) {
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

    public V0BuildCertificateUpdateParams isExpose(Boolean isExpose) {
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

    public V0BuildCertificateUpdateParams isProtected(Boolean isProtected) {
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

    public V0BuildCertificateUpdateParams processed(Boolean processed) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0BuildCertificateUpdateParams v0BuildCertificateUpdateParams = (V0BuildCertificateUpdateParams) o;
        return Objects.equals(this.certificatePassword, v0BuildCertificateUpdateParams.certificatePassword) &&
                Objects.equals(this.isExpose, v0BuildCertificateUpdateParams.isExpose) &&
                Objects.equals(this.isProtected, v0BuildCertificateUpdateParams.isProtected) &&
                Objects.equals(this.processed, v0BuildCertificateUpdateParams.processed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificatePassword, isExpose, isProtected, processed);
    }

    @Override
    public String toString() {

        String sb = "class V0BuildCertificateUpdateParams {\n"
                + "    certificatePassword: " + toIndentedString(certificatePassword) + "\n"
                + "    isExpose: " + toIndentedString(isExpose) + "\n"
                + "    isProtected: " + toIndentedString(isProtected) + "\n"
                + "    processed: " + toIndentedString(processed) + "\n"
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