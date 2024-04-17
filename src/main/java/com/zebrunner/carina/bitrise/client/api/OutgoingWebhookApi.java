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

package com.zebrunner.carina.bitrise.client.api;

import com.google.gson.reflect.TypeToken;
import com.zebrunner.carina.bitrise.client.ApiCallback;
import com.zebrunner.carina.bitrise.client.ApiClient;
import com.zebrunner.carina.bitrise.client.ApiException;
import com.zebrunner.carina.bitrise.client.ApiResponse;
import com.zebrunner.carina.bitrise.client.Configuration;
import com.zebrunner.carina.bitrise.client.Pair;
import com.zebrunner.carina.bitrise.client.ProgressRequestBody;
import com.zebrunner.carina.bitrise.client.ProgressResponseBody;
import com.zebrunner.carina.bitrise.client.model.V0AppWebhookCreateParams;
import com.zebrunner.carina.bitrise.client.model.V0AppWebhookCreatedResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0AppWebhookDeletedResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0AppWebhookListResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0AppWebhookResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0AppWebhookUpdateParams;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutgoingWebhookApi {
    private ApiClient apiClient;

    public OutgoingWebhookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OutgoingWebhookApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for outgoingWebhookCreate
     *
     * @param body                    App webhook creation params (required)
     * @param appSlug                 App slug (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookCreateCall(V0AppWebhookCreateParams body, String appSlug,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/outgoing-webhooks"
                .replaceAll("\\{" + "app-slug" + "\\}", apiClient.escapeString(appSlug));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AddonAuthToken", "PersonalAccessToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call outgoingWebhookCreateValidateBeforeCall(V0AppWebhookCreateParams body, String appSlug,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling outgoingWebhookCreate(Async)");
        }
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling outgoingWebhookCreate(Async)");
        }

        com.squareup.okhttp.Call call = outgoingWebhookCreateCall(body, appSlug, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create an outgoing webhook for an app
     * Create an outgoing webhook for a specified Bitrise app: this can be used to send build events to a specified URL with custom headers. Currently, only build events can trigger outgoing webhooks.
     *
     * @param body    App webhook creation params (required)
     * @param appSlug App slug (required)
     * @return V0AppWebhookCreatedResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V0AppWebhookCreatedResponseModel outgoingWebhookCreate(V0AppWebhookCreateParams body, String appSlug) throws ApiException {
        ApiResponse<V0AppWebhookCreatedResponseModel> resp = outgoingWebhookCreateWithHttpInfo(body, appSlug);
        return resp.getData();
    }

    /**
     * Create an outgoing webhook for an app
     * Create an outgoing webhook for a specified Bitrise app: this can be used to send build events to a specified URL with custom headers. Currently, only build events can trigger outgoing webhooks.
     *
     * @param body    App webhook creation params (required)
     * @param appSlug App slug (required)
     * @return ApiResponse&lt;V0AppWebhookCreatedResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V0AppWebhookCreatedResponseModel> outgoingWebhookCreateWithHttpInfo(V0AppWebhookCreateParams body, String appSlug)
            throws ApiException {
        com.squareup.okhttp.Call call = outgoingWebhookCreateValidateBeforeCall(body, appSlug, null, null);
        Type localVarReturnType = new TypeToken<V0AppWebhookCreatedResponseModel>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an outgoing webhook for an app (asynchronously)
     * Create an outgoing webhook for a specified Bitrise app: this can be used to send build events to a specified URL with custom headers. Currently, only build events can trigger outgoing webhooks.
     *
     * @param body     App webhook creation params (required)
     * @param appSlug  App slug (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookCreateAsync(V0AppWebhookCreateParams body, String appSlug,
            final ApiCallback<V0AppWebhookCreatedResponseModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = outgoingWebhookCreateValidateBeforeCall(body, appSlug, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V0AppWebhookCreatedResponseModel>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for outgoingWebhookDelete
     *
     * @param appSlug                 App slug (required)
     * @param appWebhookSlug          App webhook slug (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookDeleteCall(String appSlug, String appWebhookSlug,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/outgoing-webhooks/{app-webhook-slug}"
                .replaceAll("\\{" + "app-slug" + "\\}", apiClient.escapeString(appSlug))
                .replaceAll("\\{" + "app-webhook-slug" + "\\}", apiClient.escapeString(appWebhookSlug));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "PersonalAccessToken" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call outgoingWebhookDeleteValidateBeforeCall(String appSlug, String appWebhookSlug,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling outgoingWebhookDelete(Async)");
        }
        // verify the required parameter 'appWebhookSlug' is set
        if (appWebhookSlug == null) {
            throw new ApiException("Missing the required parameter 'appWebhookSlug' when calling outgoingWebhookDelete(Async)");
        }

        com.squareup.okhttp.Call call = outgoingWebhookDeleteCall(appSlug, appWebhookSlug, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete an outgoing webhook of an app
     * Delete an existing outgoing webhook for a specified Bitrise app.
     *
     * @param appSlug        App slug (required)
     * @param appWebhookSlug App webhook slug (required)
     * @return V0AppWebhookDeletedResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V0AppWebhookDeletedResponseModel outgoingWebhookDelete(String appSlug, String appWebhookSlug) throws ApiException {
        ApiResponse<V0AppWebhookDeletedResponseModel> resp = outgoingWebhookDeleteWithHttpInfo(appSlug, appWebhookSlug);
        return resp.getData();
    }

    /**
     * Delete an outgoing webhook of an app
     * Delete an existing outgoing webhook for a specified Bitrise app.
     *
     * @param appSlug        App slug (required)
     * @param appWebhookSlug App webhook slug (required)
     * @return ApiResponse&lt;V0AppWebhookDeletedResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V0AppWebhookDeletedResponseModel> outgoingWebhookDeleteWithHttpInfo(String appSlug, String appWebhookSlug)
            throws ApiException {
        com.squareup.okhttp.Call call = outgoingWebhookDeleteValidateBeforeCall(appSlug, appWebhookSlug, null, null);
        Type localVarReturnType = new TypeToken<V0AppWebhookDeletedResponseModel>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an outgoing webhook of an app (asynchronously)
     * Delete an existing outgoing webhook for a specified Bitrise app.
     *
     * @param appSlug        App slug (required)
     * @param appWebhookSlug App webhook slug (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookDeleteAsync(String appSlug, String appWebhookSlug,
            final ApiCallback<V0AppWebhookDeletedResponseModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = outgoingWebhookDeleteValidateBeforeCall(appSlug, appWebhookSlug, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V0AppWebhookDeletedResponseModel>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for outgoingWebhookList
     *
     * @param appSlug                 App slug (required)
     * @param next                    Slug of the first webhook in the response (optional)
     * @param limit                   Max number of elements per page (default: 50) (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookListCall(String appSlug, String next, Integer limit,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/outgoing-webhooks"
                .replaceAll("\\{" + "app-slug" + "\\}", apiClient.escapeString(appSlug));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (next != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("next", next));
        if (limit != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AddonAuthToken", "PersonalAccessToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call outgoingWebhookListValidateBeforeCall(String appSlug, String next, Integer limit,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling outgoingWebhookList(Async)");
        }

        com.squareup.okhttp.Call call = outgoingWebhookListCall(appSlug, next, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List the outgoing webhooks of an app
     * List all the outgoing webhooks registered for a specified Bitrise app. This returns all the relevant data of the webhook, including the slug of the webhook and its URL.
     *
     * @param appSlug App slug (required)
     * @param next    Slug of the first webhook in the response (optional)
     * @param limit   Max number of elements per page (default: 50) (optional)
     * @return V0AppWebhookListResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V0AppWebhookListResponseModel outgoingWebhookList(String appSlug, String next, Integer limit) throws ApiException {
        ApiResponse<V0AppWebhookListResponseModel> resp = outgoingWebhookListWithHttpInfo(appSlug, next, limit);
        return resp.getData();
    }

    /**
     * List the outgoing webhooks of an app
     * List all the outgoing webhooks registered for a specified Bitrise app. This returns all the relevant data of the webhook, including the slug of the webhook and its URL.
     *
     * @param appSlug App slug (required)
     * @param next    Slug of the first webhook in the response (optional)
     * @param limit   Max number of elements per page (default: 50) (optional)
     * @return ApiResponse&lt;V0AppWebhookListResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V0AppWebhookListResponseModel> outgoingWebhookListWithHttpInfo(String appSlug, String next, Integer limit)
            throws ApiException {
        com.squareup.okhttp.Call call = outgoingWebhookListValidateBeforeCall(appSlug, next, limit, null, null);
        Type localVarReturnType = new TypeToken<V0AppWebhookListResponseModel>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List the outgoing webhooks of an app (asynchronously)
     * List all the outgoing webhooks registered for a specified Bitrise app. This returns all the relevant data of the webhook, including the slug of the webhook and its URL.
     *
     * @param appSlug  App slug (required)
     * @param next     Slug of the first webhook in the response (optional)
     * @param limit    Max number of elements per page (default: 50) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookListAsync(String appSlug, String next, Integer limit,
            final ApiCallback<V0AppWebhookListResponseModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = outgoingWebhookListValidateBeforeCall(appSlug, next, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V0AppWebhookListResponseModel>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for outgoingWebhookUpdate
     *
     * @param body                    App webhook update params (required)
     * @param appSlug                 App slug (required)
     * @param appWebhookSlug          App webhook slug (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookUpdateCall(V0AppWebhookUpdateParams body, String appSlug, String appWebhookSlug,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/outgoing-webhooks/{app-webhook-slug}"
                .replaceAll("\\{" + "app-slug" + "\\}", apiClient.escapeString(appSlug))
                .replaceAll("\\{" + "app-webhook-slug" + "\\}", apiClient.escapeString(appWebhookSlug));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "PersonalAccessToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call outgoingWebhookUpdateValidateBeforeCall(V0AppWebhookUpdateParams body, String appSlug, String appWebhookSlug,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling outgoingWebhookUpdate(Async)");
        }
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling outgoingWebhookUpdate(Async)");
        }
        // verify the required parameter 'appWebhookSlug' is set
        if (appWebhookSlug == null) {
            throw new ApiException("Missing the required parameter 'appWebhookSlug' when calling outgoingWebhookUpdate(Async)");
        }

        com.squareup.okhttp.Call call = outgoingWebhookUpdateCall(body, appSlug, appWebhookSlug, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an outgoing webhook of an app
     * Update an existing outgoing webhook (URL, events, secrets and headers) for a specified Bitrise app. Even if you do not want to change one of the parameters, you still have to provide that parameter as well: simply use its existing value.
     *
     * @param body           App webhook update params (required)
     * @param appSlug        App slug (required)
     * @param appWebhookSlug App webhook slug (required)
     * @return V0AppWebhookResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V0AppWebhookResponseModel outgoingWebhookUpdate(V0AppWebhookUpdateParams body, String appSlug, String appWebhookSlug) throws ApiException {
        ApiResponse<V0AppWebhookResponseModel> resp = outgoingWebhookUpdateWithHttpInfo(body, appSlug, appWebhookSlug);
        return resp.getData();
    }

    /**
     * Update an outgoing webhook of an app
     * Update an existing outgoing webhook (URL, events, secrets and headers) for a specified Bitrise app. Even if you do not want to change one of the parameters, you still have to provide that parameter as well: simply use its existing value.
     *
     * @param body           App webhook update params (required)
     * @param appSlug        App slug (required)
     * @param appWebhookSlug App webhook slug (required)
     * @return ApiResponse&lt;V0AppWebhookResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V0AppWebhookResponseModel> outgoingWebhookUpdateWithHttpInfo(V0AppWebhookUpdateParams body, String appSlug,
            String appWebhookSlug) throws ApiException {
        com.squareup.okhttp.Call call = outgoingWebhookUpdateValidateBeforeCall(body, appSlug, appWebhookSlug, null, null);
        Type localVarReturnType = new TypeToken<V0AppWebhookResponseModel>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an outgoing webhook of an app (asynchronously)
     * Update an existing outgoing webhook (URL, events, secrets and headers) for a specified Bitrise app. Even if you do not want to change one of the parameters, you still have to provide that parameter as well: simply use its existing value.
     *
     * @param body           App webhook update params (required)
     * @param appSlug        App slug (required)
     * @param appWebhookSlug App webhook slug (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call outgoingWebhookUpdateAsync(V0AppWebhookUpdateParams body, String appSlug, String appWebhookSlug,
            final ApiCallback<V0AppWebhookResponseModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = outgoingWebhookUpdateValidateBeforeCall(body, appSlug, appWebhookSlug, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<V0AppWebhookResponseModel>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
