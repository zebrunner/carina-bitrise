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
 * V0OrganizationOwner
 */

public class V0OrganizationOwner {
    @SerializedName("email")
    private String email = null;

    @SerializedName("slug")
    private String slug = null;

    @SerializedName("username")
    private String username = null;

    public V0OrganizationOwner email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public V0OrganizationOwner slug(String slug) {
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

    public V0OrganizationOwner username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     **/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V0OrganizationOwner v0OrganizationOwner = (V0OrganizationOwner) o;
        return Objects.equals(this.email, v0OrganizationOwner.email) &&
                Objects.equals(this.slug, v0OrganizationOwner.slug) &&
                Objects.equals(this.username, v0OrganizationOwner.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, slug, username);
    }

    @Override
    public String toString() {

        String sb = "class V0OrganizationOwner {\n"
                + "    email: " + toIndentedString(email) + "\n"
                + "    slug: " + toIndentedString(slug) + "\n"
                + "    username: " + toIndentedString(username) + "\n"
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