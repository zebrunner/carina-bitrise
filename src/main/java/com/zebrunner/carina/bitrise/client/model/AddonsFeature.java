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
 * AddonsFeature
 */

public class AddonsFeature {
    @SerializedName("available")
    private Boolean available = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("quantity")
    private String quantity = null;

    public AddonsFeature available(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get available
     *
     * @return available
     **/

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public AddonsFeature description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddonsFeature quantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     **/

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddonsFeature addonsFeature = (AddonsFeature) o;
        return Objects.equals(this.available, addonsFeature.available) &&
                Objects.equals(this.description, addonsFeature.description) &&
                Objects.equals(this.quantity, addonsFeature.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, description, quantity);
    }

    @Override
    public String toString() {

        String sb = "class AddonsFeature {\n"
                + "    available: " + toIndentedString(available) + "\n"
                + "    description: " + toIndentedString(description) + "\n"
                + "    quantity: " + toIndentedString(quantity) + "\n"
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
