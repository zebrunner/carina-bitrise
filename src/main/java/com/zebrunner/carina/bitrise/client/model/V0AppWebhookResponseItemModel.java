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
 * V0AppWebhookResponseItemModel
 */

public class V0AppWebhookResponseItemModel {
    @SerializedName("created_at")
    private String createdAt = null;

    @SerializedName("events")
    private List<String> events = null;

    @SerializedName("headers")
    private List<Integer> headers = null;

    @SerializedName("registered_by_addon")
    private Boolean registeredByAddon = null;

    @SerializedName("slug")
    private String slug = null;

    @SerializedName("updated_at")
    private String updatedAt = null;

    @SerializedName("url")
    private String url = null;

    public V0AppWebhookResponseItemModel createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     **/

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public V0AppWebhookResponseItemModel events(List<String> events) {
        this.events = events;
        return this;
    }

    public V0AppWebhookResponseItemModel addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<String>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Get events
     *
     * @return events
     **/

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public V0AppWebhookResponseItemModel headers(List<Integer> headers) {
        this.headers = headers;
        return this;
    }

    public V0AppWebhookResponseItemModel addHeadersItem(Integer headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<Integer>();
        }
        this.headers.add(headersItem);
        return this;
    }

    /**
     * Get headers
     *
     * @return headers
     **/

    public List<Integer> getHeaders() {
        return headers;
    }

    public void setHeaders(List<Integer> headers) {
        this.headers = headers;
    }

    public V0AppWebhookResponseItemModel registeredByAddon(Boolean registeredByAddon) {
        this.registeredByAddon = registeredByAddon;
        return this;
    }

    /**
     * Get registeredByAddon
     *
     * @return registeredByAddon
     **/

    public Boolean isRegisteredByAddon() {
        return registeredByAddon;
    }

    public void setRegisteredByAddon(Boolean registeredByAddon) {
        this.registeredByAddon = registeredByAddon;
    }

    public V0AppWebhookResponseItemModel slug(String slug) {
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

    public V0AppWebhookResponseItemModel updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     **/

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public V0AppWebhookResponseItemModel url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0AppWebhookResponseItemModel v0AppWebhookResponseItemModel = (V0AppWebhookResponseItemModel) o;
        return Objects.equals(this.createdAt, v0AppWebhookResponseItemModel.createdAt) &&
                Objects.equals(this.events, v0AppWebhookResponseItemModel.events) &&
                Objects.equals(this.headers, v0AppWebhookResponseItemModel.headers) &&
                Objects.equals(this.registeredByAddon, v0AppWebhookResponseItemModel.registeredByAddon) &&
                Objects.equals(this.slug, v0AppWebhookResponseItemModel.slug) &&
                Objects.equals(this.updatedAt, v0AppWebhookResponseItemModel.updatedAt) &&
                Objects.equals(this.url, v0AppWebhookResponseItemModel.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, events, headers, registeredByAddon, slug, updatedAt, url);
    }

    @Override
    public String toString() {

        String sb = "class V0AppWebhookResponseItemModel {\n"
                + "    createdAt: " + toIndentedString(createdAt) + "\n"
                + "    events: " + toIndentedString(events) + "\n"
                + "    headers: " + toIndentedString(headers) + "\n"
                + "    registeredByAddon: " + toIndentedString(registeredByAddon) + "\n"
                + "    slug: " + toIndentedString(slug) + "\n"
                + "    updatedAt: " + toIndentedString(updatedAt) + "\n"
                + "    url: " + toIndentedString(url) + "\n"
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
