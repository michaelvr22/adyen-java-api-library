/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
 * Balance
 */
@JsonPropertyOrder({
  Balance.JSON_PROPERTY_AVAILABLE,
  Balance.JSON_PROPERTY_BALANCE,
  Balance.JSON_PROPERTY_CURRENCY,
  Balance.JSON_PROPERTY_PENDING,
  Balance.JSON_PROPERTY_RESERVED
})

public class Balance {
  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Long available;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Long balance;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private Long pending;

  public static final String JSON_PROPERTY_RESERVED = "reserved";
  private Long reserved;

  public Balance() { 
  }

  /**
   * The current balance minus any reserved balance.
   *
   * @param available
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance available(Long available) {
    this.available = available;
    return this;
  }

  /**
   * The current balance minus any reserved balance.
   * @return available
   */
  @ApiModelProperty(required = true, value = "The current balance minus any reserved balance.")
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvailable() {
    return available;
  }

  /**
   * The current balance minus any reserved balance.
   *
   * @param available
   */ 
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailable(Long available) {
    this.available = available;
  }

  /**
   * The current balance of funds in the balance account. These are the funds from all transactions with a value date in the past that have not yet been paid out.
   *
   * @param balance
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The current balance of funds in the balance account. These are the funds from all transactions with a value date in the past that have not yet been paid out.
   * @return balance
   */
  @ApiModelProperty(required = true, value = "The current balance of funds in the balance account. These are the funds from all transactions with a value date in the past that have not yet been paid out.")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBalance() {
    return balance;
  }

  /**
   * The current balance of funds in the balance account. These are the funds from all transactions with a value date in the past that have not yet been paid out.
   *
   * @param balance
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalance(Long balance) {
    this.balance = balance;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.
   *
   * @param currency
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.
   * @return currency
   */
  @ApiModelProperty(required = true, value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.
   *
   * @param currency
   */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The amount of funds that Adyen has processed for this account, but will be settled in a future date.  For more information, see how to settle funds for users in your [platform](https://docs.adyen.com/platforms/settle-funds) and [marketplace](https://docs.adyen.com/marketplaces/settle-funds).
   *
   * @param pending
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance pending(Long pending) {
    this.pending = pending;
    return this;
  }

  /**
   * The amount of funds that Adyen has processed for this account, but will be settled in a future date.  For more information, see how to settle funds for users in your [platform](https://docs.adyen.com/platforms/settle-funds) and [marketplace](https://docs.adyen.com/marketplaces/settle-funds).
   * @return pending
   */
  @ApiModelProperty(value = "The amount of funds that Adyen has processed for this account, but will be settled in a future date.  For more information, see how to settle funds for users in your [platform](https://docs.adyen.com/platforms/settle-funds) and [marketplace](https://docs.adyen.com/marketplaces/settle-funds).")
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPending() {
    return pending;
  }

  /**
   * The amount of funds that Adyen has processed for this account, but will be settled in a future date.  For more information, see how to settle funds for users in your [platform](https://docs.adyen.com/platforms/settle-funds) and [marketplace](https://docs.adyen.com/marketplaces/settle-funds).
   *
   * @param pending
   */ 
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPending(Long pending) {
    this.pending = pending;
  }

  /**
   * The amount reserved for payments that have been [authorised](https://docs.adyen.com/issuing/payment-stages/#authorised), but not yet [captured](https://docs.adyen.com/issuing/payment-stages/#captured) by the merchant.  Applies only to [Adyen-issued cards](https://docs.adyen.com/issuing).
   *
   * @param reserved
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance reserved(Long reserved) {
    this.reserved = reserved;
    return this;
  }

  /**
   * The amount reserved for payments that have been [authorised](https://docs.adyen.com/issuing/payment-stages/#authorised), but not yet [captured](https://docs.adyen.com/issuing/payment-stages/#captured) by the merchant.  Applies only to [Adyen-issued cards](https://docs.adyen.com/issuing).
   * @return reserved
   */
  @ApiModelProperty(required = true, value = "The amount reserved for payments that have been [authorised](https://docs.adyen.com/issuing/payment-stages/#authorised), but not yet [captured](https://docs.adyen.com/issuing/payment-stages/#captured) by the merchant.  Applies only to [Adyen-issued cards](https://docs.adyen.com/issuing).")
  @JsonProperty(JSON_PROPERTY_RESERVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReserved() {
    return reserved;
  }

  /**
   * The amount reserved for payments that have been [authorised](https://docs.adyen.com/issuing/payment-stages/#authorised), but not yet [captured](https://docs.adyen.com/issuing/payment-stages/#captured) by the merchant.  Applies only to [Adyen-issued cards](https://docs.adyen.com/issuing).
   *
   * @param reserved
   */ 
  @JsonProperty(JSON_PROPERTY_RESERVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReserved(Long reserved) {
    this.reserved = reserved;
  }

  /**
   * Return true if this Balance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.available, balance.available) &&
        Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.currency, balance.currency) &&
        Objects.equals(this.pending, balance.pending) &&
        Objects.equals(this.reserved, balance.reserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, balance, currency, pending, reserved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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
   * Create an instance of Balance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Balance
   * @throws JsonProcessingException if the JSON string is invalid with respect to Balance
   */
  public static Balance fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Balance.class);
  }
/**
  * Convert an instance of Balance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
