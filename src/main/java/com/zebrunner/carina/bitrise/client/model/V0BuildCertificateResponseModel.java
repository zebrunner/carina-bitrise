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
 * V0BuildCertificateResponseModel
 */

public class V0BuildCertificateResponseModel {
    @SerializedName("data")
    private V0BuildCertificateResponseItemModel data = null;

    public V0BuildCertificateResponseModel data(V0BuildCertificateResponseItemModel data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public V0BuildCertificateResponseItemModel getData() {
        return data;
    }

    public void setData(V0BuildCertificateResponseItemModel data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0BuildCertificateResponseModel v0BuildCertificateResponseModel = (V0BuildCertificateResponseModel) o;
        return Objects.equals(this.data, v0BuildCertificateResponseModel.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {

        String sb = "class V0BuildCertificateResponseModel {\n"
                + "    data: " + toIndentedString(data) + "\n"
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
