/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.balanceplatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.BalanceAccount;
import com.adyen.model.balanceplatform.BalanceAccountInfo;
import com.adyen.model.balanceplatform.BalanceAccountUpdateRequest;
import com.adyen.model.balanceplatform.BalanceSweepConfigurationsResponse;
import com.adyen.model.balanceplatform.PaginatedPaymentInstrumentsResponse;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.balanceplatform.SweepConfigurationV2;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BalanceAccountsApi extends Service {
    private final String baseURL;

    public BalanceAccountsApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Delete a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepId {@link String } The unique identifier of the sweep. (required)
    * @throws ApiException if fails to make API call
    */
    public void deleteSweep(String balanceAccountId, String sweepId) throws ApiException, IOException {
        deleteSweep(balanceAccountId, sweepId, null);
    }

    /**
    * Delete a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepId {@link String } The unique identifier of the sweep. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void deleteSweep(String balanceAccountId, String sweepId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (balanceAccountId == null) {
            throw new IllegalArgumentException("Please provide the balanceAccountId path parameter");
        }
        pathParams.put("balanceAccountId", balanceAccountId);
        if (sweepId == null) {
            throw new IllegalArgumentException("Please provide the sweepId path parameter");
        }
        pathParams.put("sweepId", sweepId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{balanceAccountId}/sweeps/{sweepId}", null);
        resource.request(requestBody, null, ApiConstants.HttpMethod.DELETE, pathParams);
    }

    /**
    * Get all sweeps for a balance account
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @return {@link BalanceSweepConfigurationsResponse }
    * @throws ApiException if fails to make API call
    */
    public BalanceSweepConfigurationsResponse getAllSweepsForBalanceAccount(String balanceAccountId) throws ApiException, IOException {
        return getAllSweepsForBalanceAccount(balanceAccountId, null,  null,  null);
    }

    /**
    * Get all sweeps for a balance account
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param offset {@link Integer } Query: The number of items that you want to skip. (optional)
    * @param limit {@link Integer } Query: The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BalanceSweepConfigurationsResponse }
    * @throws ApiException if fails to make API call
    */
    public BalanceSweepConfigurationsResponse getAllSweepsForBalanceAccount(String balanceAccountId, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (balanceAccountId == null) {
            throw new IllegalArgumentException("Please provide the balanceAccountId path parameter");
        }
        pathParams.put("balanceAccountId", balanceAccountId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{balanceAccountId}/sweeps", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return BalanceSweepConfigurationsResponse.fromJson(jsonResult);
    }

    /**
    * Get a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepId {@link String } The unique identifier of the sweep. (required)
    * @return {@link SweepConfigurationV2 }
    * @throws ApiException if fails to make API call
    */
    public SweepConfigurationV2 getSweep(String balanceAccountId, String sweepId) throws ApiException, IOException {
        return getSweep(balanceAccountId, sweepId, null);
    }

    /**
    * Get a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepId {@link String } The unique identifier of the sweep. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link SweepConfigurationV2 }
    * @throws ApiException if fails to make API call
    */
    public SweepConfigurationV2 getSweep(String balanceAccountId, String sweepId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (balanceAccountId == null) {
            throw new IllegalArgumentException("Please provide the balanceAccountId path parameter");
        }
        pathParams.put("balanceAccountId", balanceAccountId);
        if (sweepId == null) {
            throw new IllegalArgumentException("Please provide the sweepId path parameter");
        }
        pathParams.put("sweepId", sweepId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{balanceAccountId}/sweeps/{sweepId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return SweepConfigurationV2.fromJson(jsonResult);
    }

    /**
    * Get a balance account
    *
    * @param id {@link String } The unique identifier of the balance account. (required)
    * @return {@link BalanceAccount }
    * @throws ApiException if fails to make API call
    */
    public BalanceAccount getBalanceAccount(String id) throws ApiException, IOException {
        return getBalanceAccount(id, null);
    }

    /**
    * Get a balance account
    *
    * @param id {@link String } The unique identifier of the balance account. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BalanceAccount }
    * @throws ApiException if fails to make API call
    */
    public BalanceAccount getBalanceAccount(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return BalanceAccount.fromJson(jsonResult);
    }

    /**
    * Get all payment instruments for a balance account
    *
    * @param id {@link String } The unique identifier of the balance account. (required)
    * @return {@link PaginatedPaymentInstrumentsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedPaymentInstrumentsResponse getAllPaymentInstrumentsForBalanceAccount(String id) throws ApiException, IOException {
        return getAllPaymentInstrumentsForBalanceAccount(id, null,  null,  null);
    }

    /**
    * Get all payment instruments for a balance account
    *
    * @param id {@link String } The unique identifier of the balance account. (required)
    * @param offset {@link Integer } Query: The number of items that you want to skip. (optional)
    * @param limit {@link Integer } Query: The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaginatedPaymentInstrumentsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedPaymentInstrumentsResponse getAllPaymentInstrumentsForBalanceAccount(String id, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{id}/paymentInstruments", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return PaginatedPaymentInstrumentsResponse.fromJson(jsonResult);
    }

    /**
    * Update a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepId {@link String } The unique identifier of the sweep. (required)
    * @param sweepConfigurationV2 {@link SweepConfigurationV2 }  (required)
    * @return {@link SweepConfigurationV2 }
    * @throws ApiException if fails to make API call
    */
    public SweepConfigurationV2 updateSweep(String balanceAccountId, String sweepId, SweepConfigurationV2 sweepConfigurationV2) throws ApiException, IOException {
        return updateSweep(balanceAccountId, sweepId, sweepConfigurationV2, null);
    }

    /**
    * Update a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepId {@link String } The unique identifier of the sweep. (required)
    * @param sweepConfigurationV2 {@link SweepConfigurationV2 }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link SweepConfigurationV2 }
    * @throws ApiException if fails to make API call
    */
    public SweepConfigurationV2 updateSweep(String balanceAccountId, String sweepId, SweepConfigurationV2 sweepConfigurationV2, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (balanceAccountId == null) {
            throw new IllegalArgumentException("Please provide the balanceAccountId path parameter");
        }
        pathParams.put("balanceAccountId", balanceAccountId);
        if (sweepId == null) {
            throw new IllegalArgumentException("Please provide the sweepId path parameter");
        }
        pathParams.put("sweepId", sweepId);

        String requestBody = sweepConfigurationV2.toJson();
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{balanceAccountId}/sweeps/{sweepId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return SweepConfigurationV2.fromJson(jsonResult);
    }

    /**
    * Update a balance account
    *
    * @param id {@link String } The unique identifier of the balance account. (required)
    * @param balanceAccountUpdateRequest {@link BalanceAccountUpdateRequest }  (required)
    * @return {@link BalanceAccount }
    * @throws ApiException if fails to make API call
    */
    public BalanceAccount updateBalanceAccount(String id, BalanceAccountUpdateRequest balanceAccountUpdateRequest) throws ApiException, IOException {
        return updateBalanceAccount(id, balanceAccountUpdateRequest, null);
    }

    /**
    * Update a balance account
    *
    * @param id {@link String } The unique identifier of the balance account. (required)
    * @param balanceAccountUpdateRequest {@link BalanceAccountUpdateRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BalanceAccount }
    * @throws ApiException if fails to make API call
    */
    public BalanceAccount updateBalanceAccount(String id, BalanceAccountUpdateRequest balanceAccountUpdateRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = balanceAccountUpdateRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return BalanceAccount.fromJson(jsonResult);
    }

    /**
    * Create a balance account
    *
    * @param balanceAccountInfo {@link BalanceAccountInfo }  (required)
    * @return {@link BalanceAccount }
    * @throws ApiException if fails to make API call
    */
    public BalanceAccount createBalanceAccount(BalanceAccountInfo balanceAccountInfo) throws ApiException, IOException {
        return createBalanceAccount(balanceAccountInfo, null);
    }

    /**
    * Create a balance account
    *
    * @param balanceAccountInfo {@link BalanceAccountInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BalanceAccount }
    * @throws ApiException if fails to make API call
    */
    public BalanceAccount createBalanceAccount(BalanceAccountInfo balanceAccountInfo, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = balanceAccountInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return BalanceAccount.fromJson(jsonResult);
    }

    /**
    * Create a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepConfigurationV2 {@link SweepConfigurationV2 }  (required)
    * @return {@link SweepConfigurationV2 }
    * @throws ApiException if fails to make API call
    */
    public SweepConfigurationV2 createSweep(String balanceAccountId, SweepConfigurationV2 sweepConfigurationV2) throws ApiException, IOException {
        return createSweep(balanceAccountId, sweepConfigurationV2, null);
    }

    /**
    * Create a sweep
    *
    * @param balanceAccountId {@link String } The unique identifier of the balance account. (required)
    * @param sweepConfigurationV2 {@link SweepConfigurationV2 }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link SweepConfigurationV2 }
    * @throws ApiException if fails to make API call
    */
    public SweepConfigurationV2 createSweep(String balanceAccountId, SweepConfigurationV2 sweepConfigurationV2, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (balanceAccountId == null) {
            throw new IllegalArgumentException("Please provide the balanceAccountId path parameter");
        }
        pathParams.put("balanceAccountId", balanceAccountId);

        String requestBody = sweepConfigurationV2.toJson();
        Resource resource = new Resource(this, this.baseURL + "/balanceAccounts/{balanceAccountId}/sweeps", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return SweepConfigurationV2.fromJson(jsonResult);
    }
}
