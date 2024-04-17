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
 * V0PipelineListAllResponseModel
 */

public class V0PipelineListAllResponseModel {
    @SerializedName("data")
    private List<V0PipelineListAllResponseItemModel> data = null;

    @SerializedName("paging")
    private V0PagingResponseModel paging = null;

    public V0PipelineListAllResponseModel data(List<V0PipelineListAllResponseItemModel> data) {
        this.data = data;
        return this;
    }

    public V0PipelineListAllResponseModel addDataItem(V0PipelineListAllResponseItemModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<V0PipelineListAllResponseItemModel>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public List<V0PipelineListAllResponseItemModel> getData() {
        return data;
    }

    public void setData(List<V0PipelineListAllResponseItemModel> data) {
        this.data = data;
    }

    public V0PipelineListAllResponseModel paging(V0PagingResponseModel paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Get paging
     *
     * @return paging
     **/

    public V0PagingResponseModel getPaging() {
        return paging;
    }

    public void setPaging(V0PagingResponseModel paging) {
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
        V0PipelineListAllResponseModel v0PipelineListAllResponseModel = (V0PipelineListAllResponseModel) o;
        return Objects.equals(this.data, v0PipelineListAllResponseModel.data) &&
                Objects.equals(this.paging, v0PipelineListAllResponseModel.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, paging);
    }

    @Override
    public String toString() {

        String sb = "class V0PipelineListAllResponseModel {\n"
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
