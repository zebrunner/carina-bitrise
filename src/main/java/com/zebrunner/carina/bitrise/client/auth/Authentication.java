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

package com.zebrunner.carina.bitrise.client.auth;

import com.zebrunner.carina.bitrise.client.Pair;

import java.util.List;
import java.util.Map;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams  List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
