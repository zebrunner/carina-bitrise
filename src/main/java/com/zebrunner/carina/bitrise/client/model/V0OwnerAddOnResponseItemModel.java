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
 * V0OwnerAddOnResponseItemModel
 */

public class V0OwnerAddOnResponseItemModel {
    @SerializedName("apps")
    private List<V0AddOnAppResponseItemModel> apps = null;

    @SerializedName("documentation_url")
    private String documentationUrl = null;

    @SerializedName("has_ui")
    private Boolean hasUi = null;

    @SerializedName("icon")
    private String icon = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("is_beta")
    private Boolean isBeta = null;

    @SerializedName("summary")
    private String summary = null;

    @SerializedName("title")
    private String title = null;

    public V0OwnerAddOnResponseItemModel apps(List<V0AddOnAppResponseItemModel> apps) {
        this.apps = apps;
        return this;
    }

    public V0OwnerAddOnResponseItemModel addAppsItem(V0AddOnAppResponseItemModel appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<V0AddOnAppResponseItemModel>();
        }
        this.apps.add(appsItem);
        return this;
    }

    /**
     * Get apps
     *
     * @return apps
     **/

    public List<V0AddOnAppResponseItemModel> getApps() {
        return apps;
    }

    public void setApps(List<V0AddOnAppResponseItemModel> apps) {
        this.apps = apps;
    }

    public V0OwnerAddOnResponseItemModel documentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }

    /**
     * Get documentationUrl
     *
     * @return documentationUrl
     **/

    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public V0OwnerAddOnResponseItemModel hasUi(Boolean hasUi) {
        this.hasUi = hasUi;
        return this;
    }

    /**
     * Get hasUi
     *
     * @return hasUi
     **/

    public Boolean isHasUi() {
        return hasUi;
    }

    public void setHasUi(Boolean hasUi) {
        this.hasUi = hasUi;
    }

    public V0OwnerAddOnResponseItemModel icon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get icon
     *
     * @return icon
     **/

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public V0OwnerAddOnResponseItemModel id(String id) {
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

    public V0OwnerAddOnResponseItemModel isBeta(Boolean isBeta) {
        this.isBeta = isBeta;
        return this;
    }

    /**
     * Get isBeta
     *
     * @return isBeta
     **/

    public Boolean isIsBeta() {
        return isBeta;
    }

    public void setIsBeta(Boolean isBeta) {
        this.isBeta = isBeta;
    }

    public V0OwnerAddOnResponseItemModel summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     *
     * @return summary
     **/

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public V0OwnerAddOnResponseItemModel title(String title) {
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
        V0OwnerAddOnResponseItemModel v0OwnerAddOnResponseItemModel = (V0OwnerAddOnResponseItemModel) o;
        return Objects.equals(this.apps, v0OwnerAddOnResponseItemModel.apps) &&
                Objects.equals(this.documentationUrl, v0OwnerAddOnResponseItemModel.documentationUrl) &&
                Objects.equals(this.hasUi, v0OwnerAddOnResponseItemModel.hasUi) &&
                Objects.equals(this.icon, v0OwnerAddOnResponseItemModel.icon) &&
                Objects.equals(this.id, v0OwnerAddOnResponseItemModel.id) &&
                Objects.equals(this.isBeta, v0OwnerAddOnResponseItemModel.isBeta) &&
                Objects.equals(this.summary, v0OwnerAddOnResponseItemModel.summary) &&
                Objects.equals(this.title, v0OwnerAddOnResponseItemModel.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apps, documentationUrl, hasUi, icon, id, isBeta, summary, title);
    }

    @Override
    public String toString() {

        String sb = "class V0OwnerAddOnResponseItemModel {\n"
                + "    apps: " + toIndentedString(apps) + "\n"
                + "    documentationUrl: " + toIndentedString(documentationUrl) + "\n"
                + "    hasUi: " + toIndentedString(hasUi) + "\n"
                + "    icon: " + toIndentedString(icon) + "\n"
                + "    id: " + toIndentedString(id) + "\n"
                + "    isBeta: " + toIndentedString(isBeta) + "\n"
                + "    summary: " + toIndentedString(summary) + "\n"
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
