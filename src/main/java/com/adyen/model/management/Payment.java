/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.management.JSON;

/**
 * Payment
 */

public class Payment {
  public static final String SERIALIZED_NAME_HIDE_MINOR_UNITS_IN_CURRENCIES = "hideMinorUnitsInCurrencies";
  @SerializedName(SERIALIZED_NAME_HIDE_MINOR_UNITS_IN_CURRENCIES)
  private List<String> hideMinorUnitsInCurrencies = null;

  public Payment() { 
  }

  public Payment hideMinorUnitsInCurrencies(List<String> hideMinorUnitsInCurrencies) {
    
    this.hideMinorUnitsInCurrencies = hideMinorUnitsInCurrencies;
    return this;
  }

  public Payment addHideMinorUnitsInCurrenciesItem(String hideMinorUnitsInCurrenciesItem) {
    if (this.hideMinorUnitsInCurrencies == null) {
      this.hideMinorUnitsInCurrencies = new ArrayList<>();
    }
    this.hideMinorUnitsInCurrencies.add(hideMinorUnitsInCurrenciesItem);
    return this;
  }

   /**
   * Hides the minor units for the listed [ISO currency codes](https://en.wikipedia.org/wiki/ISO_4217).
   * @return hideMinorUnitsInCurrencies
  **/
  @ApiModelProperty(value = "Hides the minor units for the listed [ISO currency codes](https://en.wikipedia.org/wiki/ISO_4217).")

  public List<String> getHideMinorUnitsInCurrencies() {
    return hideMinorUnitsInCurrencies;
  }


  public void setHideMinorUnitsInCurrencies(List<String> hideMinorUnitsInCurrencies) {
    this.hideMinorUnitsInCurrencies = hideMinorUnitsInCurrencies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.hideMinorUnitsInCurrencies, payment.hideMinorUnitsInCurrencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideMinorUnitsInCurrencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    hideMinorUnitsInCurrencies: ").append(toIndentedString(hideMinorUnitsInCurrencies)).append("\n");
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
    openapiFields.add("hideMinorUnitsInCurrencies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Payment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Payment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Payment is not found in the empty JSON string", Payment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Payment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Payment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("hideMinorUnitsInCurrencies") != null && !jsonObj.get("hideMinorUnitsInCurrencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hideMinorUnitsInCurrencies` to be an array in the JSON string but got `%s`", jsonObj.get("hideMinorUnitsInCurrencies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Payment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Payment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Payment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Payment.class));

       return (TypeAdapter<T>) new TypeAdapter<Payment>() {
           @Override
           public void write(JsonWriter out, Payment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Payment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Payment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Payment
  * @throws IOException if the JSON string is invalid with respect to Payment
  */
  public static Payment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Payment.class);
  }

 /**
  * Convert an instance of Payment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

