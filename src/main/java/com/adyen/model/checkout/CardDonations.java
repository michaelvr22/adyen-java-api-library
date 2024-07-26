/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
 * CardDonations
 */
@JsonPropertyOrder({
  CardDonations.JSON_PROPERTY_BRAND,
  CardDonations.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  CardDonations.JSON_PROPERTY_CUPSECUREPLUS_SMSCODE,
  CardDonations.JSON_PROPERTY_CVC,
  CardDonations.JSON_PROPERTY_ENCRYPTED_CARD_NUMBER,
  CardDonations.JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH,
  CardDonations.JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR,
  CardDonations.JSON_PROPERTY_ENCRYPTED_SECURITY_CODE,
  CardDonations.JSON_PROPERTY_EXPIRY_MONTH,
  CardDonations.JSON_PROPERTY_EXPIRY_YEAR,
  CardDonations.JSON_PROPERTY_FUNDING_SOURCE,
  CardDonations.JSON_PROPERTY_HOLDER_NAME,
  CardDonations.JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE,
  CardDonations.JSON_PROPERTY_NUMBER,
  CardDonations.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  CardDonations.JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE,
  CardDonations.JSON_PROPERTY_SRC_CORRELATION_ID,
  CardDonations.JSON_PROPERTY_SRC_DIGITAL_CARD_ID,
  CardDonations.JSON_PROPERTY_SRC_SCHEME,
  CardDonations.JSON_PROPERTY_SRC_TOKEN_REFERENCE,
  CardDonations.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  CardDonations.JSON_PROPERTY_THREE_D_S2_SDK_VERSION,
  CardDonations.JSON_PROPERTY_TYPE
})

public class CardDonations {
  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_CUPSECUREPLUS_SMSCODE = "cupsecureplus.smscode";
  @Deprecated
  private String cupsecureplusSmscode;

  public static final String JSON_PROPERTY_CVC = "cvc";
  private String cvc;

  public static final String JSON_PROPERTY_ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
  private String encryptedCardNumber;

  public static final String JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";
  private String encryptedExpiryMonth;

  public static final String JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";
  private String encryptedExpiryYear;

  public static final String JSON_PROPERTY_ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
  private String encryptedSecurityCode;

  public static final String JSON_PROPERTY_EXPIRY_MONTH = "expiryMonth";
  private String expiryMonth;

  public static final String JSON_PROPERTY_EXPIRY_YEAR = "expiryYear";
  private String expiryYear;

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   */
  public enum FundingSourceEnum {
    CREDIT("credit"),
    
    DEBIT("debit");

    private String value;

    FundingSourceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FUNDING_SOURCE = "fundingSource";
  private FundingSourceEnum fundingSource;

  public static final String JSON_PROPERTY_HOLDER_NAME = "holderName";
  private String holderName;

  public static final String JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE = "networkPaymentReference";
  private String networkPaymentReference;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @Deprecated
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE = "shopperNotificationReference";
  private String shopperNotificationReference;

  public static final String JSON_PROPERTY_SRC_CORRELATION_ID = "srcCorrelationId";
  private String srcCorrelationId;

  public static final String JSON_PROPERTY_SRC_DIGITAL_CARD_ID = "srcDigitalCardId";
  private String srcDigitalCardId;

  public static final String JSON_PROPERTY_SRC_SCHEME = "srcScheme";
  private String srcScheme;

  public static final String JSON_PROPERTY_SRC_TOKEN_REFERENCE = "srcTokenReference";
  private String srcTokenReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  public static final String JSON_PROPERTY_THREE_D_S2_SDK_VERSION = "threeDS2SdkVersion";
  private String threeDS2SdkVersion;

  /**
   * Default payment method details. Common for scheme payment methods, and for simple payment method details.
   */
  public enum TypeEnum {
    BCMC("bcmc"),
    
    SCHEME("scheme"),
    
    NETWORKTOKEN("networkToken"),
    
    GIFTCARD("giftcard"),
    
    CARD("card");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public CardDonations() { 
  }

  public CardDonations brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Secondary brand of the card. For example: **plastix**, **hmclub**.
   * @return brand
  **/
  @ApiModelProperty(value = "Secondary brand of the card. For example: **plastix**, **hmclub**.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


 /**
  * Secondary brand of the card. For example: **plastix**, **hmclub**.
  *
  * @param brand
  */ 
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CardDonations checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


 /**
  * The checkout attempt identifier.
  *
  * @param checkoutAttemptId
  */ 
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  @Deprecated
  public CardDonations cupsecureplusSmscode(String cupsecureplusSmscode) {
    this.cupsecureplusSmscode = cupsecureplusSmscode;
    return this;
  }

   /**
   * Get cupsecureplusSmscode
   * @return cupsecureplusSmscode
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUPSECUREPLUS_SMSCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCupsecureplusSmscode() {
    return cupsecureplusSmscode;
  }


 /**
  * cupsecureplusSmscode
  *
  * @param cupsecureplusSmscode
  */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_CUPSECUREPLUS_SMSCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCupsecureplusSmscode(String cupsecureplusSmscode) {
    this.cupsecureplusSmscode = cupsecureplusSmscode;
  }


  public CardDonations cvc(String cvc) {
    this.cvc = cvc;
    return this;
  }

   /**
   * The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return cvc
  **/
  @ApiModelProperty(value = "The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCvc() {
    return cvc;
  }


 /**
  * The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
  *
  * @param cvc
  */ 
  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public CardDonations encryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
    return this;
  }

   /**
   * The encrypted card number.
   * @return encryptedCardNumber
  **/
  @ApiModelProperty(value = "The encrypted card number.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedCardNumber() {
    return encryptedCardNumber;
  }


 /**
  * The encrypted card number.
  *
  * @param encryptedCardNumber
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
  }


  public CardDonations encryptedExpiryMonth(String encryptedExpiryMonth) {
    this.encryptedExpiryMonth = encryptedExpiryMonth;
    return this;
  }

   /**
   * The encrypted card expiry month.
   * @return encryptedExpiryMonth
  **/
  @ApiModelProperty(value = "The encrypted card expiry month.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedExpiryMonth() {
    return encryptedExpiryMonth;
  }


 /**
  * The encrypted card expiry month.
  *
  * @param encryptedExpiryMonth
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedExpiryMonth(String encryptedExpiryMonth) {
    this.encryptedExpiryMonth = encryptedExpiryMonth;
  }


  public CardDonations encryptedExpiryYear(String encryptedExpiryYear) {
    this.encryptedExpiryYear = encryptedExpiryYear;
    return this;
  }

   /**
   * The encrypted card expiry year.
   * @return encryptedExpiryYear
  **/
  @ApiModelProperty(value = "The encrypted card expiry year.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedExpiryYear() {
    return encryptedExpiryYear;
  }


 /**
  * The encrypted card expiry year.
  *
  * @param encryptedExpiryYear
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedExpiryYear(String encryptedExpiryYear) {
    this.encryptedExpiryYear = encryptedExpiryYear;
  }


  public CardDonations encryptedSecurityCode(String encryptedSecurityCode) {
    this.encryptedSecurityCode = encryptedSecurityCode;
    return this;
  }

   /**
   * The encrypted card verification code.
   * @return encryptedSecurityCode
  **/
  @ApiModelProperty(value = "The encrypted card verification code.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_SECURITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedSecurityCode() {
    return encryptedSecurityCode;
  }


 /**
  * The encrypted card verification code.
  *
  * @param encryptedSecurityCode
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_SECURITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedSecurityCode(String encryptedSecurityCode) {
    this.encryptedSecurityCode = encryptedSecurityCode;
  }


  public CardDonations expiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return expiryMonth
  **/
  @ApiModelProperty(value = "The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryMonth() {
    return expiryMonth;
  }


 /**
  * The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
  *
  * @param expiryMonth
  */ 
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public CardDonations expiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return expiryYear
  **/
  @ApiModelProperty(value = "The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryYear() {
    return expiryYear;
  }


 /**
  * The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
  *
  * @param expiryYear
  */ 
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public CardDonations fundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.")
  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundingSourceEnum getFundingSource() {
    return fundingSource;
  }


 /**
  * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
  *
  * @param fundingSource
  */ 
  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
  }


  public CardDonations holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * The name of the card holder.
   * @return holderName
  **/
  @ApiModelProperty(value = "The name of the card holder.")
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderName() {
    return holderName;
  }


 /**
  * The name of the card holder.
  *
  * @param holderName
  */ 
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public CardDonations networkPaymentReference(String networkPaymentReference) {
    this.networkPaymentReference = networkPaymentReference;
    return this;
  }

   /**
   * The network token reference. This is the [&#x60;networkTxReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.
   * @return networkPaymentReference
  **/
  @ApiModelProperty(value = "The network token reference. This is the [`networkTxReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.")
  @JsonProperty(JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkPaymentReference() {
    return networkPaymentReference;
  }


 /**
  * The network token reference. This is the [&#x60;networkTxReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.
  *
  * @param networkPaymentReference
  */ 
  @JsonProperty(JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkPaymentReference(String networkPaymentReference) {
    this.networkPaymentReference = networkPaymentReference;
  }


  public CardDonations number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return number
  **/
  @ApiModelProperty(value = "The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


 /**
  * The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
  *
  * @param number
  */ 
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  @Deprecated
  public CardDonations recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


 /**
  * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
  *
  * @param recurringDetailReference
  */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public CardDonations shopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
    return this;
  }

   /**
   * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used only for recurring payments in India.
   * @return shopperNotificationReference
  **/
  @ApiModelProperty(value = "The `shopperNotificationReference` returned in the response when you requested to notify the shopper. Used only for recurring payments in India.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperNotificationReference() {
    return shopperNotificationReference;
  }


 /**
  * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used only for recurring payments in India.
  *
  * @param shopperNotificationReference
  */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
  }


  public CardDonations srcCorrelationId(String srcCorrelationId) {
    this.srcCorrelationId = srcCorrelationId;
    return this;
  }

   /**
   * An identifier used for the Click to Pay transaction.
   * @return srcCorrelationId
  **/
  @ApiModelProperty(value = "An identifier used for the Click to Pay transaction.")
  @JsonProperty(JSON_PROPERTY_SRC_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrcCorrelationId() {
    return srcCorrelationId;
  }


 /**
  * An identifier used for the Click to Pay transaction.
  *
  * @param srcCorrelationId
  */ 
  @JsonProperty(JSON_PROPERTY_SRC_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcCorrelationId(String srcCorrelationId) {
    this.srcCorrelationId = srcCorrelationId;
  }


  public CardDonations srcDigitalCardId(String srcDigitalCardId) {
    this.srcDigitalCardId = srcDigitalCardId;
    return this;
  }

   /**
   * The SRC reference for the Click to Pay token.
   * @return srcDigitalCardId
  **/
  @ApiModelProperty(value = "The SRC reference for the Click to Pay token.")
  @JsonProperty(JSON_PROPERTY_SRC_DIGITAL_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrcDigitalCardId() {
    return srcDigitalCardId;
  }


 /**
  * The SRC reference for the Click to Pay token.
  *
  * @param srcDigitalCardId
  */ 
  @JsonProperty(JSON_PROPERTY_SRC_DIGITAL_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcDigitalCardId(String srcDigitalCardId) {
    this.srcDigitalCardId = srcDigitalCardId;
  }


  public CardDonations srcScheme(String srcScheme) {
    this.srcScheme = srcScheme;
    return this;
  }

   /**
   * The scheme that is being used for Click to Pay.
   * @return srcScheme
  **/
  @ApiModelProperty(value = "The scheme that is being used for Click to Pay.")
  @JsonProperty(JSON_PROPERTY_SRC_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrcScheme() {
    return srcScheme;
  }


 /**
  * The scheme that is being used for Click to Pay.
  *
  * @param srcScheme
  */ 
  @JsonProperty(JSON_PROPERTY_SRC_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcScheme(String srcScheme) {
    this.srcScheme = srcScheme;
  }


  public CardDonations srcTokenReference(String srcTokenReference) {
    this.srcTokenReference = srcTokenReference;
    return this;
  }

   /**
   * The reference for the Click to Pay token.
   * @return srcTokenReference
  **/
  @ApiModelProperty(value = "The reference for the Click to Pay token.")
  @JsonProperty(JSON_PROPERTY_SRC_TOKEN_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrcTokenReference() {
    return srcTokenReference;
  }


 /**
  * The reference for the Click to Pay token.
  *
  * @param srcTokenReference
  */ 
  @JsonProperty(JSON_PROPERTY_SRC_TOKEN_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcTokenReference(String srcTokenReference) {
    this.srcTokenReference = srcTokenReference;
  }


  public CardDonations storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


 /**
  * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
  *
  * @param storedPaymentMethodId
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public CardDonations threeDS2SdkVersion(String threeDS2SdkVersion) {
    this.threeDS2SdkVersion = threeDS2SdkVersion;
    return this;
  }

   /**
   * Required for mobile integrations. Version of the 3D Secure 2 mobile SDK.
   * @return threeDS2SdkVersion
  **/
  @ApiModelProperty(value = "Required for mobile integrations. Version of the 3D Secure 2 mobile SDK.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S2_SDK_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDS2SdkVersion() {
    return threeDS2SdkVersion;
  }


 /**
  * Required for mobile integrations. Version of the 3D Secure 2 mobile SDK.
  *
  * @param threeDS2SdkVersion
  */ 
  @JsonProperty(JSON_PROPERTY_THREE_D_S2_SDK_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDS2SdkVersion(String threeDS2SdkVersion) {
    this.threeDS2SdkVersion = threeDS2SdkVersion;
  }


  public CardDonations type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Default payment method details. Common for scheme payment methods, and for simple payment method details.
   * @return type
  **/
  @ApiModelProperty(value = "Default payment method details. Common for scheme payment methods, and for simple payment method details.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * Default payment method details. Common for scheme payment methods, and for simple payment method details.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this CardDonations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDonations cardDonations = (CardDonations) o;
    return Objects.equals(this.brand, cardDonations.brand) &&
        Objects.equals(this.checkoutAttemptId, cardDonations.checkoutAttemptId) &&
        Objects.equals(this.cupsecureplusSmscode, cardDonations.cupsecureplusSmscode) &&
        Objects.equals(this.cvc, cardDonations.cvc) &&
        Objects.equals(this.encryptedCardNumber, cardDonations.encryptedCardNumber) &&
        Objects.equals(this.encryptedExpiryMonth, cardDonations.encryptedExpiryMonth) &&
        Objects.equals(this.encryptedExpiryYear, cardDonations.encryptedExpiryYear) &&
        Objects.equals(this.encryptedSecurityCode, cardDonations.encryptedSecurityCode) &&
        Objects.equals(this.expiryMonth, cardDonations.expiryMonth) &&
        Objects.equals(this.expiryYear, cardDonations.expiryYear) &&
        Objects.equals(this.fundingSource, cardDonations.fundingSource) &&
        Objects.equals(this.holderName, cardDonations.holderName) &&
        Objects.equals(this.networkPaymentReference, cardDonations.networkPaymentReference) &&
        Objects.equals(this.number, cardDonations.number) &&
        Objects.equals(this.recurringDetailReference, cardDonations.recurringDetailReference) &&
        Objects.equals(this.shopperNotificationReference, cardDonations.shopperNotificationReference) &&
        Objects.equals(this.srcCorrelationId, cardDonations.srcCorrelationId) &&
        Objects.equals(this.srcDigitalCardId, cardDonations.srcDigitalCardId) &&
        Objects.equals(this.srcScheme, cardDonations.srcScheme) &&
        Objects.equals(this.srcTokenReference, cardDonations.srcTokenReference) &&
        Objects.equals(this.storedPaymentMethodId, cardDonations.storedPaymentMethodId) &&
        Objects.equals(this.threeDS2SdkVersion, cardDonations.threeDS2SdkVersion) &&
        Objects.equals(this.type, cardDonations.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, checkoutAttemptId, cupsecureplusSmscode, cvc, encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode, expiryMonth, expiryYear, fundingSource, holderName, networkPaymentReference, number, recurringDetailReference, shopperNotificationReference, srcCorrelationId, srcDigitalCardId, srcScheme, srcTokenReference, storedPaymentMethodId, threeDS2SdkVersion, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDonations {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    cupsecureplusSmscode: ").append(toIndentedString(cupsecureplusSmscode)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    encryptedCardNumber: ").append(toIndentedString(encryptedCardNumber)).append("\n");
    sb.append("    encryptedExpiryMonth: ").append(toIndentedString(encryptedExpiryMonth)).append("\n");
    sb.append("    encryptedExpiryYear: ").append(toIndentedString(encryptedExpiryYear)).append("\n");
    sb.append("    encryptedSecurityCode: ").append(toIndentedString(encryptedSecurityCode)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    networkPaymentReference: ").append(toIndentedString(networkPaymentReference)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperNotificationReference: ").append(toIndentedString(shopperNotificationReference)).append("\n");
    sb.append("    srcCorrelationId: ").append(toIndentedString(srcCorrelationId)).append("\n");
    sb.append("    srcDigitalCardId: ").append(toIndentedString(srcDigitalCardId)).append("\n");
    sb.append("    srcScheme: ").append(toIndentedString(srcScheme)).append("\n");
    sb.append("    srcTokenReference: ").append(toIndentedString(srcTokenReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    threeDS2SdkVersion: ").append(toIndentedString(threeDS2SdkVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of CardDonations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardDonations
   * @throws JsonProcessingException if the JSON string is invalid with respect to CardDonations
   */
  public static CardDonations fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CardDonations.class);
  }
/**
  * Convert an instance of CardDonations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

