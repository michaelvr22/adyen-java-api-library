/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payout.Amount;
import com.adyen.model.payout.Name;
import com.adyen.model.payout.Recurring;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.payout.JSON;

/**
 * SubmitRequest
 */

public class SubmitRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  /**
   * The type of the entity the payout is processed for.  Allowed values: * NaturalPerson * Company &gt; This field is required to update the existing &#x60;entityType&#x60; that is associated with this recurring contract.
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    NATURALPERSON("NaturalPerson"),
    
    COMPANY("Company");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityTypeEnum entityType;

  public static final String SERIALIZED_NAME_FRAUD_OFFSET = "fraudOffset";
  @SerializedName(SERIALIZED_NAME_FRAUD_OFFSET)
  private Integer fraudOffset;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Recurring recurring;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SELECTED_RECURRING_DETAIL_REFERENCE = "selectedRecurringDetailReference";
  @SerializedName(SERIALIZED_NAME_SELECTED_RECURRING_DETAIL_REFERENCE)
  private String selectedRecurringDetailReference;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  public static final String SERIALIZED_NAME_SHOPPER_NAME = "shopperName";
  @SerializedName(SERIALIZED_NAME_SHOPPER_NAME)
  private Name shopperName;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public static final String SERIALIZED_NAME_SHOPPER_STATEMENT = "shopperStatement";
  @SerializedName(SERIALIZED_NAME_SHOPPER_STATEMENT)
  private String shopperStatement;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER)
  private String socialSecurityNumber;

  public SubmitRequest() { 
  }

  public SubmitRequest additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public SubmitRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular request.
   * @return additionalData
  **/
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular request.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public SubmitRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public SubmitRequest dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth. Format: ISO-8601; example: YYYY-MM-DD  For Paysafecard it must be the same as used when registering the Paysafecard account.  &gt; This field is mandatory for natural persons.  &gt; This field is required to update the existing &#x60;dateOfBirth&#x60; that is associated with this recurring contract.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "The date of birth. Format: ISO-8601; example: YYYY-MM-DD  For Paysafecard it must be the same as used when registering the Paysafecard account.  > This field is mandatory for natural persons.  > This field is required to update the existing `dateOfBirth` that is associated with this recurring contract.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public SubmitRequest entityType(EntityTypeEnum entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The type of the entity the payout is processed for.  Allowed values: * NaturalPerson * Company &gt; This field is required to update the existing &#x60;entityType&#x60; that is associated with this recurring contract.
   * @return entityType
  **/
  @ApiModelProperty(value = "The type of the entity the payout is processed for.  Allowed values: * NaturalPerson * Company > This field is required to update the existing `entityType` that is associated with this recurring contract.")

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public SubmitRequest fraudOffset(Integer fraudOffset) {
    
    this.fraudOffset = fraudOffset;
    return this;
  }

   /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
  **/
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")

  public Integer getFraudOffset() {
    return fraudOffset;
  }


  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }


  public SubmitRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier you want to process the transaction request with.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier you want to process the transaction request with.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public SubmitRequest nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).  &gt; This field is required to update the existing nationality that is associated with this recurring contract.
   * @return nationality
  **/
  @ApiModelProperty(value = "The shopper's nationality.  A valid value is an ISO 2-character country code (e.g. 'NL').  > This field is required to update the existing nationality that is associated with this recurring contract.")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public SubmitRequest recurring(Recurring recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @ApiModelProperty(required = true, value = "")

  public Recurring getRecurring() {
    return recurring;
  }


  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }


  public SubmitRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The merchant reference for this payout. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "The merchant reference for this payout. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public SubmitRequest selectedRecurringDetailReference(String selectedRecurringDetailReference) {
    
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; you want to use for this payout.  You can use the value LATEST to select the most recently used recurring detail.
   * @return selectedRecurringDetailReference
  **/
  @ApiModelProperty(required = true, value = "This is the `recurringDetailReference` you want to use for this payout.  You can use the value LATEST to select the most recently used recurring detail.")

  public String getSelectedRecurringDetailReference() {
    return selectedRecurringDetailReference;
  }


  public void setSelectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
  }


  public SubmitRequest shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper&#39;s email address.
   * @return shopperEmail
  **/
  @ApiModelProperty(required = true, value = "The shopper's email address.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public SubmitRequest shopperName(Name shopperName) {
    
    this.shopperName = shopperName;
    return this;
  }

   /**
   * Get shopperName
   * @return shopperName
  **/
  @ApiModelProperty(value = "")

  public Name getShopperName() {
    return shopperName;
  }


  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }


  public SubmitRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The shopper&#39;s reference for the payout transaction.
   * @return shopperReference
  **/
  @ApiModelProperty(required = true, value = "The shopper's reference for the payout transaction.")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  public SubmitRequest shopperStatement(String shopperStatement) {
    
    this.shopperStatement = shopperStatement;
    return this;
  }

   /**
   * The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).
   * @return shopperStatement
  **/
  @ApiModelProperty(value = "The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).")

  public String getShopperStatement() {
    return shopperStatement;
  }


  public void setShopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
  }


  public SubmitRequest socialSecurityNumber(String socialSecurityNumber) {
    
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * The shopper&#39;s social security number.
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "The shopper's social security number.")

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }


  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitRequest submitRequest = (SubmitRequest) o;
    return Objects.equals(this.additionalData, submitRequest.additionalData) &&
        Objects.equals(this.amount, submitRequest.amount) &&
        Objects.equals(this.dateOfBirth, submitRequest.dateOfBirth) &&
        Objects.equals(this.entityType, submitRequest.entityType) &&
        Objects.equals(this.fraudOffset, submitRequest.fraudOffset) &&
        Objects.equals(this.merchantAccount, submitRequest.merchantAccount) &&
        Objects.equals(this.nationality, submitRequest.nationality) &&
        Objects.equals(this.recurring, submitRequest.recurring) &&
        Objects.equals(this.reference, submitRequest.reference) &&
        Objects.equals(this.selectedRecurringDetailReference, submitRequest.selectedRecurringDetailReference) &&
        Objects.equals(this.shopperEmail, submitRequest.shopperEmail) &&
        Objects.equals(this.shopperName, submitRequest.shopperName) &&
        Objects.equals(this.shopperReference, submitRequest.shopperReference) &&
        Objects.equals(this.shopperStatement, submitRequest.shopperStatement) &&
        Objects.equals(this.socialSecurityNumber, submitRequest.socialSecurityNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, amount, dateOfBirth, entityType, fraudOffset, merchantAccount, nationality, recurring, reference, selectedRecurringDetailReference, shopperEmail, shopperName, shopperReference, shopperStatement, socialSecurityNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    shopperStatement: ").append(toIndentedString(shopperStatement)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("additionalData");
    openapiFields.add("amount");
    openapiFields.add("dateOfBirth");
    openapiFields.add("entityType");
    openapiFields.add("fraudOffset");
    openapiFields.add("merchantAccount");
    openapiFields.add("nationality");
    openapiFields.add("recurring");
    openapiFields.add("reference");
    openapiFields.add("selectedRecurringDetailReference");
    openapiFields.add("shopperEmail");
    openapiFields.add("shopperName");
    openapiFields.add("shopperReference");
    openapiFields.add("shopperStatement");
    openapiFields.add("socialSecurityNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("recurring");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("selectedRecurringDetailReference");
    openapiRequiredFields.add("shopperEmail");
    openapiRequiredFields.add("shopperReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubmitRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitRequest is not found in the empty JSON string", SubmitRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmitRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // ensure the field entityType can be parsed to an enum value
      if (jsonObj.get("entityType") != null) {
        if(!jsonObj.get("entityType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
        }
        EntityTypeEnum.fromValue(jsonObj.get("entityType").getAsString());
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field nationality
      if (jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      // validate the optional field `recurring`
      if (jsonObj.getAsJsonObject("recurring") != null) {
        Recurring.validateJsonObject(jsonObj.getAsJsonObject("recurring"));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field selectedRecurringDetailReference
      if (jsonObj.get("selectedRecurringDetailReference") != null && !jsonObj.get("selectedRecurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedRecurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedRecurringDetailReference").toString()));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
      }
      // validate the optional field `shopperName`
      if (jsonObj.getAsJsonObject("shopperName") != null) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("shopperName"));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
      // validate the optional field shopperStatement
      if (jsonObj.get("shopperStatement") != null && !jsonObj.get("shopperStatement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperStatement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperStatement").toString()));
      }
      // validate the optional field socialSecurityNumber
      if (jsonObj.get("socialSecurityNumber") != null && !jsonObj.get("socialSecurityNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socialSecurityNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialSecurityNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitRequest>() {
           @Override
           public void write(JsonWriter out, SubmitRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitRequest
  * @throws IOException if the JSON string is invalid with respect to SubmitRequest
  */
  public static SubmitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitRequest.class);
  }

 /**
  * Convert an instance of SubmitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

