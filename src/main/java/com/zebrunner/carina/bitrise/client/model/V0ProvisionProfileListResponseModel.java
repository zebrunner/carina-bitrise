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
 * V0ProvisionProfileListResponseModel
 */

public class V0ProvisionProfileListResponseModel {
    @SerializedName("data")
    private List<V0ProvisionProfileResponseItemModel> data = null;

    @SerializedName("paging")
    private AllOfv0ProvisionProfileListResponseModelPaging paging = null;

    public V0ProvisionProfileListResponseModel data(List<V0ProvisionProfileResponseItemModel> data) {
        this.data = data;
        return this;
    }

    public V0ProvisionProfileListResponseModel addDataItem(V0ProvisionProfileResponseItemModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<V0ProvisionProfileResponseItemModel>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public List<V0ProvisionProfileResponseItemModel> getData() {
        return data;
    }

    public void setData(List<V0ProvisionProfileResponseItemModel> data) {
        this.data = data;
    }

    public V0ProvisionProfileListResponseModel paging(AllOfv0ProvisionProfileListResponseModelPaging paging) {
        this.paging = paging;
        return this;
    }

    /**
     * pagination
     *
     * @return paging
     **/

    public AllOfv0ProvisionProfileListResponseModelPaging getPaging() {
        return paging;
    }

    public void setPaging(AllOfv0ProvisionProfileListResponseModelPaging paging) {
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
        V0ProvisionProfileListResponseModel v0ProvisionProfileListResponseModel = (V0ProvisionProfileListResponseModel) o;
        return Objects.equals(this.data, v0ProvisionProfileListResponseModel.data) &&
                Objects.equals(this.paging, v0ProvisionProfileListResponseModel.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, paging);
    }

    @Override
    public String toString() {

        String sb = "class V0ProvisionProfileListResponseModel {\n"
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