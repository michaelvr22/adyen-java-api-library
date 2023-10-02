/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.payout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.payout.ModifyRequest;
import com.adyen.model.payout.ModifyResponse;
import com.adyen.model.payout.ServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReviewingApi extends Service {

    public static final String API_VERSION = "68";

    protected String baseURL;

    /**
    * Reviewing constructor in {@link com.adyen.service.payout package}.
    * @param client {@link Client } (required)
    */
    public ReviewingApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://pal-test.adyen.com/pal/servlet/Payout/v68");
    }

    /**
    * Reviewing constructor in {@link com.adyen.service.payout package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public ReviewingApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Confirm a payout
    *
    * @param modifyRequest {@link ModifyRequest }  (required)
    * @return {@link ModifyResponse }
    * @throws ApiException if fails to make API call
    */
    public ModifyResponse confirmThirdParty(ModifyRequest modifyRequest) throws ApiException, IOException {
        return confirmThirdParty(modifyRequest, null);
    }

    /**
    * Confirm a payout
    *
    * @param modifyRequest {@link ModifyRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ModifyResponse }
    * @throws ApiException if fails to make API call
    */
    public ModifyResponse confirmThirdParty(ModifyRequest modifyRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = modifyRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/confirmThirdParty", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return ModifyResponse.fromJson(jsonResult);
    }

    /**
    * Cancel a payout
    *
    * @param modifyRequest {@link ModifyRequest }  (required)
    * @return {@link ModifyResponse }
    * @throws ApiException if fails to make API call
    */
    public ModifyResponse declineThirdParty(ModifyRequest modifyRequest) throws ApiException, IOException {
        return declineThirdParty(modifyRequest, null);
    }

    /**
    * Cancel a payout
    *
    * @param modifyRequest {@link ModifyRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ModifyResponse }
    * @throws ApiException if fails to make API call
    */
    public ModifyResponse declineThirdParty(ModifyRequest modifyRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = modifyRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/declineThirdParty", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return ModifyResponse.fromJson(jsonResult);
    }
}