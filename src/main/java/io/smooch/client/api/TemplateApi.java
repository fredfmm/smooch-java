/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.27
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.api;

import io.smooch.client.ApiCallback;
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.ApiResponse;
import io.smooch.client.Configuration;
import io.smooch.client.Pair;
import io.smooch.client.ProgressRequestBody;
import io.smooch.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.smooch.client.model.ListTemplatesResponse;
import io.smooch.client.model.TemplateCreate;
import io.smooch.client.model.TemplateResponse;
import io.smooch.client.model.TemplateUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateApi {
    private ApiClient apiClient;

    public TemplateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createTemplate
     * @param appId Identifies the app. (required)
     * @param templateCreateBody Body for a createTemplate request.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTemplateCall(String appId, TemplateCreate templateCreateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = templateCreateBody;
        
        // create path and map variables
        String localVarPath = "/v1.1/apps/{appId}/templates"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createTemplateValidateBeforeCall(String appId, TemplateCreate templateCreateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling createTemplate(Async)");
        }
        
        // verify the required parameter 'templateCreateBody' is set
        if (templateCreateBody == null) {
            throw new ApiException("Missing the required parameter 'templateCreateBody' when calling createTemplate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createTemplateCall(appId, templateCreateBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create a template for the specified app.
     * @param appId Identifies the app. (required)
     * @param templateCreateBody Body for a createTemplate request.  (required)
     * @return TemplateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateResponse createTemplate(String appId, TemplateCreate templateCreateBody) throws ApiException {
        ApiResponse<TemplateResponse> resp = createTemplateWithHttpInfo(appId, templateCreateBody);
        return resp.getData();
    }

    /**
     * 
     * Create a template for the specified app.
     * @param appId Identifies the app. (required)
     * @param templateCreateBody Body for a createTemplate request.  (required)
     * @return ApiResponse&lt;TemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateResponse> createTemplateWithHttpInfo(String appId, TemplateCreate templateCreateBody) throws ApiException {
        com.squareup.okhttp.Call call = createTemplateValidateBeforeCall(appId, templateCreateBody, null, null);
        Type localVarReturnType = new TypeToken<TemplateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a template for the specified app.
     * @param appId Identifies the app. (required)
     * @param templateCreateBody Body for a createTemplate request.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTemplateAsync(String appId, TemplateCreate templateCreateBody, final ApiCallback<TemplateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTemplateValidateBeforeCall(appId, templateCreateBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTemplate
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTemplateCall(String appId, String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1.1/apps/{appId}/templates/{templateId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "jwt" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTemplateValidateBeforeCall(String appId, String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteTemplate(Async)");
        }
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling deleteTemplate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteTemplateCall(appId, templateId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTemplate(String appId, String templateId) throws ApiException {
        deleteTemplateWithHttpInfo(appId, templateId);
    }

    /**
     * 
     * Delete the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTemplateWithHttpInfo(String appId, String templateId) throws ApiException {
        com.squareup.okhttp.Call call = deleteTemplateValidateBeforeCall(appId, templateId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Delete the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTemplateAsync(String appId, String templateId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTemplateValidateBeforeCall(appId, templateId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getTemplate
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplateCall(String appId, String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1.1/apps/{appId}/templates/{templateId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTemplateValidateBeforeCall(String appId, String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getTemplate(Async)");
        }
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling getTemplate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getTemplateCall(appId, templateId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @return TemplateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateResponse getTemplate(String appId, String templateId) throws ApiException {
        ApiResponse<TemplateResponse> resp = getTemplateWithHttpInfo(appId, templateId);
        return resp.getData();
    }

    /**
     * 
     * Get the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @return ApiResponse&lt;TemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateResponse> getTemplateWithHttpInfo(String appId, String templateId) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateValidateBeforeCall(appId, templateId, null, null);
        Type localVarReturnType = new TypeToken<TemplateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateAsync(String appId, String templateId, final ApiCallback<TemplateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplateValidateBeforeCall(appId, templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listTemplates
     * @param appId Identifies the app. (required)
     * @param limit The number of records to return. (optional, default to 25)
     * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listTemplatesCall(String appId, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1.1/apps/{appId}/templates"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listTemplatesValidateBeforeCall(String appId, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listTemplates(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listTemplatesCall(appId, limit, offset, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List templates for the specified app.
     * @param appId Identifies the app. (required)
     * @param limit The number of records to return. (optional, default to 25)
     * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
     * @return ListTemplatesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListTemplatesResponse listTemplates(String appId, Integer limit, Integer offset) throws ApiException {
        ApiResponse<ListTemplatesResponse> resp = listTemplatesWithHttpInfo(appId, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List templates for the specified app.
     * @param appId Identifies the app. (required)
     * @param limit The number of records to return. (optional, default to 25)
     * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
     * @return ApiResponse&lt;ListTemplatesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListTemplatesResponse> listTemplatesWithHttpInfo(String appId, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = listTemplatesValidateBeforeCall(appId, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<ListTemplatesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List templates for the specified app.
     * @param appId Identifies the app. (required)
     * @param limit The number of records to return. (optional, default to 25)
     * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTemplatesAsync(String appId, Integer limit, Integer offset, final ApiCallback<ListTemplatesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTemplatesValidateBeforeCall(appId, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListTemplatesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTemplate
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param templateUpdateBody Body for an updateTemplate request.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTemplateCall(String appId, String templateId, TemplateUpdate templateUpdateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = templateUpdateBody;
        
        // create path and map variables
        String localVarPath = "/v1.1/apps/{appId}/templates/{templateId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "jwt" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTemplateValidateBeforeCall(String appId, String templateId, TemplateUpdate templateUpdateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updateTemplate(Async)");
        }
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling updateTemplate(Async)");
        }
        
        // verify the required parameter 'templateUpdateBody' is set
        if (templateUpdateBody == null) {
            throw new ApiException("Missing the required parameter 'templateUpdateBody' when calling updateTemplate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateTemplateCall(appId, templateId, templateUpdateBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Update the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param templateUpdateBody Body for an updateTemplate request.  (required)
     * @return TemplateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateResponse updateTemplate(String appId, String templateId, TemplateUpdate templateUpdateBody) throws ApiException {
        ApiResponse<TemplateResponse> resp = updateTemplateWithHttpInfo(appId, templateId, templateUpdateBody);
        return resp.getData();
    }

    /**
     * 
     * Update the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param templateUpdateBody Body for an updateTemplate request.  (required)
     * @return ApiResponse&lt;TemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateResponse> updateTemplateWithHttpInfo(String appId, String templateId, TemplateUpdate templateUpdateBody) throws ApiException {
        com.squareup.okhttp.Call call = updateTemplateValidateBeforeCall(appId, templateId, templateUpdateBody, null, null);
        Type localVarReturnType = new TypeToken<TemplateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update the specified template.
     * @param appId Identifies the app. (required)
     * @param templateId Identifies the template. (required)
     * @param templateUpdateBody Body for an updateTemplate request.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTemplateAsync(String appId, String templateId, TemplateUpdate templateUpdateBody, final ApiCallback<TemplateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTemplateValidateBeforeCall(appId, templateId, templateUpdateBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
