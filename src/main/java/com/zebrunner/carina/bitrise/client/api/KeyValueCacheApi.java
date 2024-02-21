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
import com.zebrunner.carina.bitrise.client.model.V0CacheItemDownloadResponseModel;
import com.zebrunner.carina.bitrise.client.model.V0CacheItemListResponseModel;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyValueCacheApi {
    private ApiClient apiClient;

    public KeyValueCacheApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeyValueCacheApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cacheItemDelete
     *
     * @param appSlug                 App slug (required)
     * @param cacheItemId             The ID of the cache item to be deleted (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cacheItemDeleteCall(String appSlug, String cacheItemId,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/cache-items/{cache-item-id}"
                .replaceAll("\\{" + "app-slug" + "\\}", apiClient.escapeString(appSlug))
                .replaceAll("\\{" + "cache-item-id" + "\\}", apiClient.escapeString(cacheItemId));

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
    private com.squareup.okhttp.Call cacheItemDeleteValidateBeforeCall(String appSlug, String cacheItemId,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling cacheItemDelete(Async)");
        }
        // verify the required parameter 'cacheItemId' is set
        if (cacheItemId == null) {
            throw new ApiException("Missing the required parameter 'cacheItemId' when calling cacheItemDelete(Async)");
        }

        com.squareup.okhttp.Call call = cacheItemDeleteCall(appSlug, cacheItemId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a key-value cache item
     * Deletes a key-value cache item. Deleted cache items are no longer accessible and cannot be restored.
     *
     * @param appSlug     App slug (required)
     * @param cacheItemId The ID of the cache item to be deleted (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void cacheItemDelete(String appSlug, String cacheItemId) throws ApiException {
        cacheItemDeleteWithHttpInfo(appSlug, cacheItemId);
    }

    /**
     * Deletes a key-value cache item
     * Deletes a key-value cache item. Deleted cache items are no longer accessible and cannot be restored.
     *
     * @param appSlug     App slug (required)
     * @param cacheItemId The ID of the cache item to be deleted (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> cacheItemDeleteWithHttpInfo(String appSlug, String cacheItemId) throws ApiException {
        com.squareup.okhttp.Call call = cacheItemDeleteValidateBeforeCall(appSlug, cacheItemId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a key-value cache item (asynchronously)
     * Deletes a key-value cache item. Deleted cache items are no longer accessible and cannot be restored.
     *
     * @param appSlug     App slug (required)
     * @param cacheItemId The ID of the cache item to be deleted (required)
     * @param callback    The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cacheItemDeleteAsync(String appSlug, String cacheItemId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cacheItemDeleteValidateBeforeCall(appSlug, cacheItemId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /**
     * Build call for cacheItemDeleteAll
     *
     * @param appSlug                 App slug (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cacheItemDeleteAllCall(String appSlug, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/cache-items"
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
    private com.squareup.okhttp.Call cacheItemDeleteAllValidateBeforeCall(String appSlug,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling cacheItemDeleteAll(Async)");
        }

        com.squareup.okhttp.Call call = cacheItemDeleteAllCall(appSlug, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes all key-value cache items belonging to an app
     * Deletes all key-value cache items created by the builds of an app. Deleted cache items are no longer accessible and cannot be restored.
     *
     * @param appSlug App slug (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void cacheItemDeleteAll(String appSlug) throws ApiException {
        cacheItemDeleteAllWithHttpInfo(appSlug);
    }

    /**
     * Deletes all key-value cache items belonging to an app
     * Deletes all key-value cache items created by the builds of an app. Deleted cache items are no longer accessible and cannot be restored.
     *
     * @param appSlug App slug (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> cacheItemDeleteAllWithHttpInfo(String appSlug) throws ApiException {
        com.squareup.okhttp.Call call = cacheItemDeleteAllValidateBeforeCall(appSlug, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes all key-value cache items belonging to an app (asynchronously)
     * Deletes all key-value cache items created by the builds of an app. Deleted cache items are no longer accessible and cannot be restored.
     *
     * @param appSlug  App slug (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cacheItemDeleteAllAsync(String appSlug, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cacheItemDeleteAllValidateBeforeCall(appSlug, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /**
     * Build call for cacheItemDownload
     *
     * @param appSlug                 App slug (required)
     * @param cacheItemId             The ID of the cache item to be downloaded (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cacheItemDownloadCall(String appSlug, String cacheItemId,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/cache-items/{cache-item-id}/download"
                .replaceAll("\\{" + "app-slug" + "\\}", apiClient.escapeString(appSlug))
                .replaceAll("\\{" + "cache-item-id" + "\\}", apiClient.escapeString(cacheItemId));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cacheItemDownloadValidateBeforeCall(String appSlug, String cacheItemId,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling cacheItemDownload(Async)");
        }
        // verify the required parameter 'cacheItemId' is set
        if (cacheItemId == null) {
            throw new ApiException("Missing the required parameter 'cacheItemId' when calling cacheItemDownload(Async)");
        }

        com.squareup.okhttp.Call call = cacheItemDownloadCall(appSlug, cacheItemId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the download URL of a key-value cache item
     * Gets a download URL of a cache item.
     *
     * @param appSlug     App slug (required)
     * @param cacheItemId The ID of the cache item to be downloaded (required)
     * @return V0CacheItemDownloadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V0CacheItemDownloadResponseModel cacheItemDownload(String appSlug, String cacheItemId) throws ApiException {
        ApiResponse<V0CacheItemDownloadResponseModel> resp = cacheItemDownloadWithHttpInfo(appSlug, cacheItemId);
        return resp.getData();
    }

    /**
     * Gets the download URL of a key-value cache item
     * Gets a download URL of a cache item.
     *
     * @param appSlug     App slug (required)
     * @param cacheItemId The ID of the cache item to be downloaded (required)
     * @return ApiResponse&lt;V0CacheItemDownloadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V0CacheItemDownloadResponseModel> cacheItemDownloadWithHttpInfo(String appSlug, String cacheItemId) throws ApiException {
        com.squareup.okhttp.Call call = cacheItemDownloadValidateBeforeCall(appSlug, cacheItemId, null, null);
        Type localVarReturnType = new TypeToken<V0CacheItemDownloadResponseModel>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the download URL of a key-value cache item (asynchronously)
     * Gets a download URL of a cache item.
     *
     * @param appSlug     App slug (required)
     * @param cacheItemId The ID of the cache item to be downloaded (required)
     * @param callback    The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cacheItemDownloadAsync(String appSlug, String cacheItemId,
            final ApiCallback<V0CacheItemDownloadResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cacheItemDownloadValidateBeforeCall(appSlug, cacheItemId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V0CacheItemDownloadResponseModel>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cacheList
     *
     * @param appSlug                 App slug (required)
     * @param next                    Getting cache items created before the given parameter (RFC3339 time format, default: now) (optional)
     * @param limit                   Max number of elements per page (default: 100) (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cacheListCall(String appSlug, String next, Integer limit,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/{app-slug}/cache-items"
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

        String[] localVarAuthNames = new String[] { "PersonalAccessToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cacheListValidateBeforeCall(String appSlug, String next, Integer limit,
            final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        // verify the required parameter 'appSlug' is set
        if (appSlug == null) {
            throw new ApiException("Missing the required parameter 'appSlug' when calling cacheList(Async)");
        }

        com.squareup.okhttp.Call call = cacheListCall(appSlug, next, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List the key-value cache items belonging to an app
     * List all the available cache items that the builds of the app created via the save-cache step.
     *
     * @param appSlug App slug (required)
     * @param next    Getting cache items created before the given parameter (RFC3339 time format, default: now) (optional)
     * @param limit   Max number of elements per page (default: 100) (optional)
     * @return V0CacheItemListResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V0CacheItemListResponseModel cacheList(String appSlug, String next, Integer limit) throws ApiException {
        ApiResponse<V0CacheItemListResponseModel> resp = cacheListWithHttpInfo(appSlug, next, limit);
        return resp.getData();
    }

    /**
     * List the key-value cache items belonging to an app
     * List all the available cache items that the builds of the app created via the save-cache step.
     *
     * @param appSlug App slug (required)
     * @param next    Getting cache items created before the given parameter (RFC3339 time format, default: now) (optional)
     * @param limit   Max number of elements per page (default: 100) (optional)
     * @return ApiResponse&lt;V0CacheItemListResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V0CacheItemListResponseModel> cacheListWithHttpInfo(String appSlug, String next, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = cacheListValidateBeforeCall(appSlug, next, limit, null, null);
        Type localVarReturnType = new TypeToken<V0CacheItemListResponseModel>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List the key-value cache items belonging to an app (asynchronously)
     * List all the available cache items that the builds of the app created via the save-cache step.
     *
     * @param appSlug  App slug (required)
     * @param next     Getting cache items created before the given parameter (RFC3339 time format, default: now) (optional)
     * @param limit    Max number of elements per page (default: 100) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cacheListAsync(String appSlug, String next, Integer limit,
            final ApiCallback<V0CacheItemListResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cacheListValidateBeforeCall(appSlug, next, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V0CacheItemListResponseModel>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}