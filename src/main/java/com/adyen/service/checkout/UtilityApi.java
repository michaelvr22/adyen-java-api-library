/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.checkout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.checkout.ApplePaySessionResponse;
import com.adyen.model.checkout.CheckoutUtilityRequest;
import com.adyen.model.checkout.CheckoutUtilityResponse;
import com.adyen.model.checkout.CreateApplePaySessionRequest;
import com.adyen.model.checkout.ServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UtilityApi extends Service {
    private final String baseURL;

    public UtilityApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://checkout-test.adyen.com/v70");
    }

    /**
    * Get an Apple Pay session
    *
    * @param createApplePaySessionRequest {@link CreateApplePaySessionRequest }  (required)
    * @return {@link ApplePaySessionResponse }
    * @throws ApiException if fails to make API call
    */
    public ApplePaySessionResponse getApplePaySession(CreateApplePaySessionRequest createApplePaySessionRequest) throws ApiException, IOException {
        return getApplePaySession(createApplePaySessionRequest, null);
    }

    /**
    * Get an Apple Pay session
    *
    * @param createApplePaySessionRequest {@link CreateApplePaySessionRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ApplePaySessionResponse }
    * @throws ApiException if fails to make API call
    */
    public ApplePaySessionResponse getApplePaySession(CreateApplePaySessionRequest createApplePaySessionRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = createApplePaySessionRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/applePay/sessions", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return ApplePaySessionResponse.fromJson(jsonResult);
    }

    /**
    * Create originKey values for domains
    *
    * @param checkoutUtilityRequest {@link CheckoutUtilityRequest }  (required)
    * @return {@link CheckoutUtilityResponse }
    * @throws ApiException if fails to make API call
    * @deprecated
    */
    @Deprecated
    public CheckoutUtilityResponse originKeys(CheckoutUtilityRequest checkoutUtilityRequest) throws ApiException, IOException {
        return originKeys(checkoutUtilityRequest, null);
    }

    /**
    * Create originKey values for domains
    *
    * @param checkoutUtilityRequest {@link CheckoutUtilityRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CheckoutUtilityResponse }
    * @throws ApiException if fails to make API call
    * @deprecated
    */
   @Deprecated
    public CheckoutUtilityResponse originKeys(CheckoutUtilityRequest checkoutUtilityRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = checkoutUtilityRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/originKeys", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CheckoutUtilityResponse.fromJson(jsonResult);
    }
}
