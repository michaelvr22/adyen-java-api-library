/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * KYCCheckSummary
 */
@JsonPropertyOrder({
  KYCCheckSummary.JSON_PROPERTY_KYC_CHECK_CODE,
  KYCCheckSummary.JSON_PROPERTY_KYC_CHECK_DESCRIPTION
})

public class KYCCheckSummary {
  public static final String JSON_PROPERTY_KYC_CHECK_CODE = "kycCheckCode";
  private Integer kycCheckCode;

  public static final String JSON_PROPERTY_KYC_CHECK_DESCRIPTION = "kycCheckDescription";
  private String kycCheckDescription;

  public KYCCheckSummary() { 
  }

  public KYCCheckSummary kycCheckCode(Integer kycCheckCode) {
    this.kycCheckCode = kycCheckCode;
    return this;
  }

   /**
   * The code of the check. For possible values, refer to [Verification codes](https://docs.adyen.com/marketplaces-and-platforms/classic/verification-process/verification-codes).
   * @return kycCheckCode
  **/
  @ApiModelProperty(value = "The code of the check. For possible values, refer to [Verification codes](https://docs.adyen.com/marketplaces-and-platforms/classic/verification-process/verification-codes).")
  @JsonProperty(JSON_PROPERTY_KYC_CHECK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKycCheckCode() {
    return kycCheckCode;
  }


  @JsonProperty(JSON_PROPERTY_KYC_CHECK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKycCheckCode(Integer kycCheckCode) {
    this.kycCheckCode = kycCheckCode;
  }


  public KYCCheckSummary kycCheckDescription(String kycCheckDescription) {
    this.kycCheckDescription = kycCheckDescription;
    return this;
  }

   /**
   * A description of the check.
   * @return kycCheckDescription
  **/
  @ApiModelProperty(value = "A description of the check.")
  @JsonProperty(JSON_PROPERTY_KYC_CHECK_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKycCheckDescription() {
    return kycCheckDescription;
  }


  @JsonProperty(JSON_PROPERTY_KYC_CHECK_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKycCheckDescription(String kycCheckDescription) {
    this.kycCheckDescription = kycCheckDescription;
  }


  /**
   * Return true if this KYCCheckSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCCheckSummary kyCCheckSummary = (KYCCheckSummary) o;
    return Objects.equals(this.kycCheckCode, kyCCheckSummary.kycCheckCode) &&
        Objects.equals(this.kycCheckDescription, kyCCheckSummary.kycCheckDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kycCheckCode, kycCheckDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCCheckSummary {\n");
    sb.append("    kycCheckCode: ").append(toIndentedString(kycCheckCode)).append("\n");
    sb.append("    kycCheckDescription: ").append(toIndentedString(kycCheckDescription)).append("\n");
    sb.append("}");
    return sb.toString();
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

/**
   * Create an instance of KYCCheckSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KYCCheckSummary
   * @throws JsonProcessingException if the JSON string is invalid with respect to KYCCheckSummary
   */
  public static KYCCheckSummary fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, KYCCheckSummary.class);
  }
/**
  * Convert an instance of KYCCheckSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
