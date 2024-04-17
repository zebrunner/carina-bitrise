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
 * V0ArtifactListResponseModel
 */

public class V0ArtifactListResponseModel {
    @SerializedName("data")
    private List<V0ArtifactListElementResponseModel> data = null;

    @SerializedName("paging")
    private AllOfv0ArtifactListResponseModelPaging paging = null;

    public V0ArtifactListResponseModel data(List<V0ArtifactListElementResponseModel> data) {
        this.data = data;
        return this;
    }

    public V0ArtifactListResponseModel addDataItem(V0ArtifactListElementResponseModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<V0ArtifactListElementResponseModel>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public List<V0ArtifactListElementResponseModel> getData() {
        return data;
    }

    public void setData(List<V0ArtifactListElementResponseModel> data) {
        this.data = data;
    }

    public V0ArtifactListResponseModel paging(AllOfv0ArtifactListResponseModelPaging paging) {
        this.paging = paging;
        return this;
    }

    /**
     * pagination
     *
     * @return paging
     **/

    public AllOfv0ArtifactListResponseModelPaging getPaging() {
        return paging;
    }

    public void setPaging(AllOfv0ArtifactListResponseModelPaging paging) {
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
        V0ArtifactListResponseModel v0ArtifactListResponseModel = (V0ArtifactListResponseModel) o;
        return Objects.equals(this.data, v0ArtifactListResponseModel.data) &&
                Objects.equals(this.paging, v0ArtifactListResponseModel.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, paging);
    }

    @Override
    public String toString() {

        String sb = "class V0ArtifactListResponseModel {\n"
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
