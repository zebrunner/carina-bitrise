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
 * RolesRolenameBody
 */

public class RolesRolenameBody {
    @SerializedName("groups")
    private List<String> groups = null;

    public RolesRolenameBody groups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public RolesRolenameBody addGroupsItem(String groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<String>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Get groups
     *
     * @return groups
     **/

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolesRolenameBody rolesRolenameBody = (RolesRolenameBody) o;
        return Objects.equals(this.groups, rolesRolenameBody.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups);
    }

    @Override
    public String toString() {

        String sb = "class RolesRolenameBody {\n"
                + "    groups: " + toIndentedString(groups) + "\n"
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
