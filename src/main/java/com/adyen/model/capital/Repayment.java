/*
 * Capital API
 * Adyen Capital allows you to build an embedded financing offering for your users to serve their operational needs. Learn more about [Adyen Capital](https://docs.adyen.com/marketplaces-and-platforms/capital).  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Roles and permissions To use the Capital API, you need an additional role for your API credential. Your Adyen contact will set up the roles and permissions for you. ## Versioning The Capital API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/btl/v3/grants ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the username and password to send requests to `https://balanceplatform-api-live.adyen.com/btl/v3`.  
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.capital;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.capital.RepaymentTerm;
import com.adyen.model.capital.ThresholdRepayment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import com.adyen.model.capital.JSON;

/**
 * Repayment
 */

public class Repayment {
  public static final String SERIALIZED_NAME_BASIS_POINTS = "basisPoints";
  @SerializedName(SERIALIZED_NAME_BASIS_POINTS)
  private Integer basisPoints;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private RepaymentTerm term;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private ThresholdRepayment threshold;

  public Repayment() { 
  }

  public Repayment basisPoints(Integer basisPoints) {
    
    this.basisPoints = basisPoints;
    return this;
  }

   /**
   * The repayment that is deducted daily from incoming net volume, in [basis points](https://www.investopedia.com/terms/b/basispoint.asp).
   * @return basisPoints
  **/
  @ApiModelProperty(required = true, value = "The repayment that is deducted daily from incoming net volume, in [basis points](https://www.investopedia.com/terms/b/basispoint.asp).")

  public Integer getBasisPoints() {
    return basisPoints;
  }


  public void setBasisPoints(Integer basisPoints) {
    this.basisPoints = basisPoints;
  }


  public Repayment term(RepaymentTerm term) {
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")

  public RepaymentTerm getTerm() {
    return term;
  }


  public void setTerm(RepaymentTerm term) {
    this.term = term;
  }


  public Repayment threshold(ThresholdRepayment threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(value = "")

  public ThresholdRepayment getThreshold() {
    return threshold;
  }


  public void setThreshold(ThresholdRepayment threshold) {
    this.threshold = threshold;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repayment repayment = (Repayment) o;
    return Objects.equals(this.basisPoints, repayment.basisPoints) &&
        Objects.equals(this.term, repayment.term) &&
        Objects.equals(this.threshold, repayment.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basisPoints, term, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repayment {\n");
    sb.append("    basisPoints: ").append(toIndentedString(basisPoints)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
    openapiFields.add("basisPoints");
    openapiFields.add("term");
    openapiFields.add("threshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("basisPoints");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Repayment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Repayment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Repayment is not found in the empty JSON string", Repayment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Repayment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Repayment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Repayment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `term`
      if (jsonObj.getAsJsonObject("term") != null) {
        RepaymentTerm.validateJsonObject(jsonObj.getAsJsonObject("term"));
      }
      // validate the optional field `threshold`
      if (jsonObj.getAsJsonObject("threshold") != null) {
        ThresholdRepayment.validateJsonObject(jsonObj.getAsJsonObject("threshold"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Repayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Repayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Repayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Repayment.class));

       return (TypeAdapter<T>) new TypeAdapter<Repayment>() {
           @Override
           public void write(JsonWriter out, Repayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Repayment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Repayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Repayment
  * @throws IOException if the JSON string is invalid with respect to Repayment
  */
  public static Repayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Repayment.class);
  }

 /**
  * Convert an instance of Repayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

