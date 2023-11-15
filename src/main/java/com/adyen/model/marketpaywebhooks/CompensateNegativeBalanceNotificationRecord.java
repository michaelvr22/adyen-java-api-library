/*
 * Classic Platforms - Notifications
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpaywebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpaywebhooks.Amount;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CompensateNegativeBalanceNotificationRecord
 */
@JsonPropertyOrder({
  CompensateNegativeBalanceNotificationRecord.JSON_PROPERTY_ACCOUNT_CODE,
  CompensateNegativeBalanceNotificationRecord.JSON_PROPERTY_AMOUNT,
  CompensateNegativeBalanceNotificationRecord.JSON_PROPERTY_TRANSFER_DATE
})

public class CompensateNegativeBalanceNotificationRecord {
  public static final String JSON_PROPERTY_ACCOUNT_CODE = "accountCode";
  private String accountCode;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_TRANSFER_DATE = "transferDate";
  private OffsetDateTime transferDate;

  public CompensateNegativeBalanceNotificationRecord() { 
  }

  public CompensateNegativeBalanceNotificationRecord accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * The code of the account whose negative balance has been compensated.
   * @return accountCode
  **/
  @ApiModelProperty(value = "The code of the account whose negative balance has been compensated.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountCode() {
    return accountCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }


  public CompensateNegativeBalanceNotificationRecord amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public CompensateNegativeBalanceNotificationRecord transferDate(OffsetDateTime transferDate) {
    this.transferDate = transferDate;
    return this;
  }

   /**
   * The date on which the compensation took place.
   * @return transferDate
  **/
  @ApiModelProperty(value = "The date on which the compensation took place.")
  @JsonProperty(JSON_PROPERTY_TRANSFER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTransferDate() {
    return transferDate;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferDate(OffsetDateTime transferDate) {
    this.transferDate = transferDate;
  }


  /**
   * Return true if this CompensateNegativeBalanceNotificationRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompensateNegativeBalanceNotificationRecord compensateNegativeBalanceNotificationRecord = (CompensateNegativeBalanceNotificationRecord) o;
    return Objects.equals(this.accountCode, compensateNegativeBalanceNotificationRecord.accountCode) &&
        Objects.equals(this.amount, compensateNegativeBalanceNotificationRecord.amount) &&
        Objects.equals(this.transferDate, compensateNegativeBalanceNotificationRecord.transferDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, amount, transferDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensateNegativeBalanceNotificationRecord {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
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
   * Create an instance of CompensateNegativeBalanceNotificationRecord given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompensateNegativeBalanceNotificationRecord
   * @throws JsonProcessingException if the JSON string is invalid with respect to CompensateNegativeBalanceNotificationRecord
   */
  public static CompensateNegativeBalanceNotificationRecord fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CompensateNegativeBalanceNotificationRecord.class);
  }
/**
  * Convert an instance of CompensateNegativeBalanceNotificationRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
