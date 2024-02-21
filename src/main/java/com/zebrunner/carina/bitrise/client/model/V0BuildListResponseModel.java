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
 * V0BuildListResponseModel
 */

public class V0BuildListResponseModel {
    @SerializedName("data")
    private List<V0BuildResponseItemModel> data = null;

    @SerializedName("paging")
    private AllOfv0BuildListResponseModelPaging paging = null;

    public V0BuildListResponseModel data(List<V0BuildResponseItemModel> data) {
        this.data = data;
        return this;
    }

    public V0BuildListResponseModel addDataItem(V0BuildResponseItemModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<V0BuildResponseItemModel>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public List<V0BuildResponseItemModel> getData() {
        return data;
    }

    public void setData(List<V0BuildResponseItemModel> data) {
        this.data = data;
    }

    public V0BuildListResponseModel paging(AllOfv0BuildListResponseModelPaging paging) {
        this.paging = paging;
        return this;
    }

    /**
     * pagination
     *
     * @return paging
     **/

    public AllOfv0BuildListResponseModelPaging getPaging() {
        return paging;
    }

    public void setPaging(AllOfv0BuildListResponseModelPaging paging) {
        this.paging = paging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0BuildListResponseModel v0BuildListResponseModel = (V0BuildListResponseModel) o;
        return Objects.equals(this.data, v0BuildListResponseModel.data) &&
                Objects.equals(this.paging, v0BuildListResponseModel.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, paging);
    }

    @Override
    public String toString() {

        String sb = "class V0BuildListResponseModel {\n"
                + "    data: " + toIndentedString(data) + "\n"
                + "    paging: " + toIndentedString(paging) + "\n"
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
