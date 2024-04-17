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
 * V0OrganizationListRespModel
 */

public class V0OrganizationListRespModel {
    @SerializedName("data")
    private List<V0OrganizationDataModel> data = null;

    public V0OrganizationListRespModel data(List<V0OrganizationDataModel> data) {
        this.data = data;
        return this;
    }

    public V0OrganizationListRespModel addDataItem(V0OrganizationDataModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<V0OrganizationDataModel>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public List<V0OrganizationDataModel> getData() {
        return data;
    }

    public void setData(List<V0OrganizationDataModel> data) {
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
        V0OrganizationListRespModel v0OrganizationListRespModel = (V0OrganizationListRespModel) o;
        return Objects.equals(this.data, v0OrganizationListRespModel.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {

        String sb = "class V0OrganizationListRespModel {\n"
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
