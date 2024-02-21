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
 * AddonsSetupInstruction
 */

public class AddonsSetupInstruction {
    @SerializedName("card_content")
    private String cardContent = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("type")
    private String type = null;

    public AddonsSetupInstruction cardContent(String cardContent) {
        this.cardContent = cardContent;
        return this;
    }

    /**
     * Get cardContent
     *
     * @return cardContent
     **/

    public String getCardContent() {
        return cardContent;
    }

    public void setCardContent(String cardContent) {
        this.cardContent = cardContent;
    }

    public AddonsSetupInstruction description(String description) {
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

    public AddonsSetupInstruction type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddonsSetupInstruction addonsSetupInstruction = (AddonsSetupInstruction) o;
        return Objects.equals(this.cardContent, addonsSetupInstruction.cardContent) &&
                Objects.equals(this.description, addonsSetupInstruction.description) &&
                Objects.equals(this.type, addonsSetupInstruction.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardContent, description, type);
    }

    @Override
    public String toString() {

        String sb = "class AddonsSetupInstruction {\n"
                + "    cardContent: " + toIndentedString(cardContent) + "\n"
                + "    description: " + toIndentedString(description) + "\n"
                + "    type: " + toIndentedString(type) + "\n"
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
