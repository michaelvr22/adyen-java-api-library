/*
 * Adyen BinLookup API
 * The BIN Lookup API provides endpoints for retrieving information, such as cost estimates, and 3D Secure supported version based on a given BIN.  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning The BinLookup API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/BinLookup/v54/get3dsAvailability ```## Going live  To authneticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/BinLookup/v54/get3dsAvailability ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 54
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.binlookup.BinDetail;
import com.adyen.model.binlookup.DSPublicKeyDetail;
import com.adyen.model.binlookup.ThreeDS2CardRangeDetail;
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

import com.adyen.model.binlookup.JSON;

/**
 * ThreeDSAvailabilityResponse
 */

public class ThreeDSAvailabilityResponse {
  public static final String SERIALIZED_NAME_BIN_DETAILS = "binDetails";
  @SerializedName(SERIALIZED_NAME_BIN_DETAILS)
  private BinDetail binDetails;

  public static final String SERIALIZED_NAME_DS_PUBLIC_KEYS = "dsPublicKeys";
  @SerializedName(SERIALIZED_NAME_DS_PUBLIC_KEYS)
  private List<DSPublicKeyDetail> dsPublicKeys = null;

  public static final String SERIALIZED_NAME_THREE_D_S1_SUPPORTED = "threeDS1Supported";
  @SerializedName(SERIALIZED_NAME_THREE_D_S1_SUPPORTED)
  private Boolean threeDS1Supported;

  public static final String SERIALIZED_NAME_THREE_D_S2_CARD_RANGE_DETAILS = "threeDS2CardRangeDetails";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2_CARD_RANGE_DETAILS)
  private List<ThreeDS2CardRangeDetail> threeDS2CardRangeDetails = null;

  public static final String SERIALIZED_NAME_THREE_D_S2SUPPORTED = "threeDS2supported";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2SUPPORTED)
  private Boolean threeDS2supported;

  public ThreeDSAvailabilityResponse() { 
  }

  public ThreeDSAvailabilityResponse binDetails(BinDetail binDetails) {
    
    this.binDetails = binDetails;
    return this;
  }

   /**
   * Get binDetails
   * @return binDetails
  **/
  @ApiModelProperty(value = "")

  public BinDetail getBinDetails() {
    return binDetails;
  }


  public void setBinDetails(BinDetail binDetails) {
    this.binDetails = binDetails;
  }


  public ThreeDSAvailabilityResponse dsPublicKeys(List<DSPublicKeyDetail> dsPublicKeys) {
    
    this.dsPublicKeys = dsPublicKeys;
    return this;
  }

  public ThreeDSAvailabilityResponse addDsPublicKeysItem(DSPublicKeyDetail dsPublicKeysItem) {
    if (this.dsPublicKeys == null) {
      this.dsPublicKeys = new ArrayList<>();
    }
    this.dsPublicKeys.add(dsPublicKeysItem);
    return this;
  }

   /**
   * List of Directory Server (DS) public keys.
   * @return dsPublicKeys
  **/
  @ApiModelProperty(value = "List of Directory Server (DS) public keys.")

  public List<DSPublicKeyDetail> getDsPublicKeys() {
    return dsPublicKeys;
  }


  public void setDsPublicKeys(List<DSPublicKeyDetail> dsPublicKeys) {
    this.dsPublicKeys = dsPublicKeys;
  }


  public ThreeDSAvailabilityResponse threeDS1Supported(Boolean threeDS1Supported) {
    
    this.threeDS1Supported = threeDS1Supported;
    return this;
  }

   /**
   * Indicator if 3D Secure 1 is supported.
   * @return threeDS1Supported
  **/
  @ApiModelProperty(value = "Indicator if 3D Secure 1 is supported.")

  public Boolean getThreeDS1Supported() {
    return threeDS1Supported;
  }


  public void setThreeDS1Supported(Boolean threeDS1Supported) {
    this.threeDS1Supported = threeDS1Supported;
  }


  public ThreeDSAvailabilityResponse threeDS2CardRangeDetails(List<ThreeDS2CardRangeDetail> threeDS2CardRangeDetails) {
    
    this.threeDS2CardRangeDetails = threeDS2CardRangeDetails;
    return this;
  }

  public ThreeDSAvailabilityResponse addThreeDS2CardRangeDetailsItem(ThreeDS2CardRangeDetail threeDS2CardRangeDetailsItem) {
    if (this.threeDS2CardRangeDetails == null) {
      this.threeDS2CardRangeDetails = new ArrayList<>();
    }
    this.threeDS2CardRangeDetails.add(threeDS2CardRangeDetailsItem);
    return this;
  }

   /**
   * List of brand and card range pairs.
   * @return threeDS2CardRangeDetails
  **/
  @ApiModelProperty(value = "List of brand and card range pairs.")

  public List<ThreeDS2CardRangeDetail> getThreeDS2CardRangeDetails() {
    return threeDS2CardRangeDetails;
  }


  public void setThreeDS2CardRangeDetails(List<ThreeDS2CardRangeDetail> threeDS2CardRangeDetails) {
    this.threeDS2CardRangeDetails = threeDS2CardRangeDetails;
  }


  public ThreeDSAvailabilityResponse threeDS2supported(Boolean threeDS2supported) {
    
    this.threeDS2supported = threeDS2supported;
    return this;
  }

   /**
   * Indicator if 3D Secure 2 is supported.
   * @return threeDS2supported
  **/
  @ApiModelProperty(value = "Indicator if 3D Secure 2 is supported.")

  public Boolean getThreeDS2supported() {
    return threeDS2supported;
  }


  public void setThreeDS2supported(Boolean threeDS2supported) {
    this.threeDS2supported = threeDS2supported;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSAvailabilityResponse threeDSAvailabilityResponse = (ThreeDSAvailabilityResponse) o;
    return Objects.equals(this.binDetails, threeDSAvailabilityResponse.binDetails) &&
        Objects.equals(this.dsPublicKeys, threeDSAvailabilityResponse.dsPublicKeys) &&
        Objects.equals(this.threeDS1Supported, threeDSAvailabilityResponse.threeDS1Supported) &&
        Objects.equals(this.threeDS2CardRangeDetails, threeDSAvailabilityResponse.threeDS2CardRangeDetails) &&
        Objects.equals(this.threeDS2supported, threeDSAvailabilityResponse.threeDS2supported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binDetails, dsPublicKeys, threeDS1Supported, threeDS2CardRangeDetails, threeDS2supported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSAvailabilityResponse {\n");
    sb.append("    binDetails: ").append(toIndentedString(binDetails)).append("\n");
    sb.append("    dsPublicKeys: ").append(toIndentedString(dsPublicKeys)).append("\n");
    sb.append("    threeDS1Supported: ").append(toIndentedString(threeDS1Supported)).append("\n");
    sb.append("    threeDS2CardRangeDetails: ").append(toIndentedString(threeDS2CardRangeDetails)).append("\n");
    sb.append("    threeDS2supported: ").append(toIndentedString(threeDS2supported)).append("\n");
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
    openapiFields.add("binDetails");
    openapiFields.add("dsPublicKeys");
    openapiFields.add("threeDS1Supported");
    openapiFields.add("threeDS2CardRangeDetails");
    openapiFields.add("threeDS2supported");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSAvailabilityResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDSAvailabilityResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSAvailabilityResponse is not found in the empty JSON string", ThreeDSAvailabilityResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDSAvailabilityResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDSAvailabilityResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `binDetails`
      if (jsonObj.getAsJsonObject("binDetails") != null) {
        BinDetail.validateJsonObject(jsonObj.getAsJsonObject("binDetails"));
      }
      JsonArray jsonArraydsPublicKeys = jsonObj.getAsJsonArray("dsPublicKeys");
      if (jsonArraydsPublicKeys != null) {
        // ensure the json data is an array
        if (!jsonObj.get("dsPublicKeys").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `dsPublicKeys` to be an array in the JSON string but got `%s`", jsonObj.get("dsPublicKeys").toString()));
        }

        // validate the optional field `dsPublicKeys` (array)
        for (int i = 0; i < jsonArraydsPublicKeys.size(); i++) {
          DSPublicKeyDetail.validateJsonObject(jsonArraydsPublicKeys.get(i).getAsJsonObject());
        }
      }
      JsonArray jsonArraythreeDS2CardRangeDetails = jsonObj.getAsJsonArray("threeDS2CardRangeDetails");
      if (jsonArraythreeDS2CardRangeDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("threeDS2CardRangeDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `threeDS2CardRangeDetails` to be an array in the JSON string but got `%s`", jsonObj.get("threeDS2CardRangeDetails").toString()));
        }

        // validate the optional field `threeDS2CardRangeDetails` (array)
        for (int i = 0; i < jsonArraythreeDS2CardRangeDetails.size(); i++) {
          ThreeDS2CardRangeDetail.validateJsonObject(jsonArraythreeDS2CardRangeDetails.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSAvailabilityResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSAvailabilityResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSAvailabilityResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSAvailabilityResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSAvailabilityResponse>() {
           @Override
           public void write(JsonWriter out, ThreeDSAvailabilityResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSAvailabilityResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDSAvailabilityResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSAvailabilityResponse
  * @throws IOException if the JSON string is invalid with respect to ThreeDSAvailabilityResponse
  */
  public static ThreeDSAvailabilityResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSAvailabilityResponse.class);
  }

 /**
  * Convert an instance of ThreeDSAvailabilityResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

