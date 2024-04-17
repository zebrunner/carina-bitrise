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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * V0AppleAPICredentialsListResponse
 */

public class V0AppleAPICredentialsListResponse {
    @SerializedName("data")
    private List<V0AppleAPICredentialResponseItem> data = null;

    public V0AppleAPICredentialsListResponse data(List<V0AppleAPICredentialResponseItem> data) {
        this.data = data;
        return this;
    }

    public V0AppleAPICredentialsListResponse addDataItem(V0AppleAPICredentialResponseItem dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<V0AppleAPICredentialResponseItem>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public List<V0AppleAPICredentialResponseItem> getData() {
        return data;
    }

    public void setData(List<V0AppleAPICredentialResponseItem> data) {
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
        V0AppleAPICredentialsListResponse v0AppleAPICredentialsListResponse = (V0AppleAPICredentialsListResponse) o;
        return Objects.equals(this.data, v0AppleAPICredentialsListResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {

        String sb = "class V0AppleAPICredentialsListResponse {\n"
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
