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
 * AddonsPlan
 */

public class AddonsPlan {
    @SerializedName("features")
    private List<AddonsFeature> features = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("price")
    private Integer price = null;

    public AddonsPlan features(List<AddonsFeature> features) {
        this.features = features;
        return this;
    }

    public AddonsPlan addFeaturesItem(AddonsFeature featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<AddonsFeature>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Get features
     *
     * @return features
     **/

    public List<AddonsFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<AddonsFeature> features) {
        this.features = features;
    }

    public AddonsPlan id(String id) {
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

    public AddonsPlan name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddonsPlan price(Integer price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddonsPlan addonsPlan = (AddonsPlan) o;
        return Objects.equals(this.features, addonsPlan.features) &&
                Objects.equals(this.id, addonsPlan.id) &&
                Objects.equals(this.name, addonsPlan.name) &&
                Objects.equals(this.price, addonsPlan.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features, id, name, price);
    }

    @Override
    public String toString() {

        String sb = "class AddonsPlan {\n"
                + "    features: " + toIndentedString(features) + "\n"
                + "    id: " + toIndentedString(id) + "\n"
                + "    name: " + toIndentedString(name) + "\n"
                + "    price: " + toIndentedString(price) + "\n"
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
