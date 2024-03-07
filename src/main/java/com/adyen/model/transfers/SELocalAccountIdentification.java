/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * SELocalAccountIdentification
 */
@JsonPropertyOrder({
  SELocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  SELocalAccountIdentification.JSON_PROPERTY_CLEARING_NUMBER,
  SELocalAccountIdentification.JSON_PROPERTY_FORM_FACTOR,
  SELocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class SELocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_CLEARING_NUMBER = "clearingNumber";
  private String clearingNumber;

  public static final String JSON_PROPERTY_FORM_FACTOR = "formFactor";
  private String formFactor = "physical";

  /**
   * **seLocal**
   */
  public enum TypeEnum {
    SELOCAL("seLocal");

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
  private TypeEnum type = TypeEnum.SELOCAL;

  public SELocalAccountIdentification() { 
  }

  public SELocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The 7- to 10-digit bank account number ([Bankkontonummer](https://sv.wikipedia.org/wiki/Bankkonto)), without the clearing number, separators, or whitespace.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The 7- to 10-digit bank account number ([Bankkontonummer](https://sv.wikipedia.org/wiki/Bankkonto)), without the clearing number, separators, or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


 /**
  * The 7- to 10-digit bank account number ([Bankkontonummer](https://sv.wikipedia.org/wiki/Bankkonto)), without the clearing number, separators, or whitespace.
  *
  * @param accountNumber
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public SELocalAccountIdentification clearingNumber(String clearingNumber) {
    this.clearingNumber = clearingNumber;
    return this;
  }

   /**
   * The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace.
   * @return clearingNumber
  **/
  @ApiModelProperty(required = true, value = "The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_CLEARING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClearingNumber() {
    return clearingNumber;
  }


 /**
  * The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace.
  *
  * @param clearingNumber
  */ 
  @JsonProperty(JSON_PROPERTY_CLEARING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClearingNumber(String clearingNumber) {
    this.clearingNumber = clearingNumber;
  }


  public SELocalAccountIdentification formFactor(String formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * The form factor of the account.  Possible values: **physical**, **virtual**. Default value: **physical**.
   * @return formFactor
  **/
  @ApiModelProperty(value = "The form factor of the account.  Possible values: **physical**, **virtual**. Default value: **physical**.")
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormFactor() {
    return formFactor;
  }


 /**
  * The form factor of the account.  Possible values: **physical**, **virtual**. Default value: **physical**.
  *
  * @param formFactor
  */ 
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFactor(String formFactor) {
    this.formFactor = formFactor;
  }


  public SELocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **seLocal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**seLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **seLocal**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this SELocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SELocalAccountIdentification seLocalAccountIdentification = (SELocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, seLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.clearingNumber, seLocalAccountIdentification.clearingNumber) &&
        Objects.equals(this.formFactor, seLocalAccountIdentification.formFactor) &&
        Objects.equals(this.type, seLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, clearingNumber, formFactor, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SELocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    clearingNumber: ").append(toIndentedString(clearingNumber)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
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
   * Create an instance of SELocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SELocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to SELocalAccountIdentification
   */
  public static SELocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SELocalAccountIdentification.class);
  }
/**
  * Convert an instance of SELocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

