/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * GeneratePciDescriptionResponse
 */

public class GeneratePciDescriptionResponse {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private byte[] content;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_PCI_TEMPLATE_REFERENCES = "pciTemplateReferences";
  @SerializedName(SERIALIZED_NAME_PCI_TEMPLATE_REFERENCES)
  private List<String> pciTemplateReferences = null;

  public GeneratePciDescriptionResponse() { 
  }

  public GeneratePciDescriptionResponse content(byte[] content) {
    
    this.content = content;
    return this;
  }

   /**
   * The generated questionnaires in a base64 encoded format.
   * @return content
  **/
  @ApiModelProperty(value = "The generated questionnaires in a base64 encoded format.")

  public byte[] getContent() {
    return content;
  }


  public void setContent(byte[] content) {
    this.content = content;
  }


  public GeneratePciDescriptionResponse language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code for the questionnaire. For example, **en**.
   * @return language
  **/
  @ApiModelProperty(value = "The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code for the questionnaire. For example, **en**.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public GeneratePciDescriptionResponse pciTemplateReferences(List<String> pciTemplateReferences) {
    
    this.pciTemplateReferences = pciTemplateReferences;
    return this;
  }

  public GeneratePciDescriptionResponse addPciTemplateReferencesItem(String pciTemplateReferencesItem) {
    if (this.pciTemplateReferences == null) {
      this.pciTemplateReferences = new ArrayList<>();
    }
    this.pciTemplateReferences.add(pciTemplateReferencesItem);
    return this;
  }

   /**
   * The array of Adyen-generated unique identifiers for the questionnaires.
   * @return pciTemplateReferences
  **/
  @ApiModelProperty(value = "The array of Adyen-generated unique identifiers for the questionnaires.")

  public List<String> getPciTemplateReferences() {
    return pciTemplateReferences;
  }


  public void setPciTemplateReferences(List<String> pciTemplateReferences) {
    this.pciTemplateReferences = pciTemplateReferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratePciDescriptionResponse generatePciDescriptionResponse = (GeneratePciDescriptionResponse) o;
    return Arrays.equals(this.content, generatePciDescriptionResponse.content) &&
        Objects.equals(this.language, generatePciDescriptionResponse.language) &&
        Objects.equals(this.pciTemplateReferences, generatePciDescriptionResponse.pciTemplateReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(content), language, pciTemplateReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratePciDescriptionResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    pciTemplateReferences: ").append(toIndentedString(pciTemplateReferences)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("language");
    openapiFields.add("pciTemplateReferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GeneratePciDescriptionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GeneratePciDescriptionResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneratePciDescriptionResponse is not found in the empty JSON string", GeneratePciDescriptionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GeneratePciDescriptionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GeneratePciDescriptionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field language
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("pciTemplateReferences") != null && !jsonObj.get("pciTemplateReferences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pciTemplateReferences` to be an array in the JSON string but got `%s`", jsonObj.get("pciTemplateReferences").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneratePciDescriptionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneratePciDescriptionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneratePciDescriptionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneratePciDescriptionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneratePciDescriptionResponse>() {
           @Override
           public void write(JsonWriter out, GeneratePciDescriptionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GeneratePciDescriptionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GeneratePciDescriptionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneratePciDescriptionResponse
  * @throws IOException if the JSON string is invalid with respect to GeneratePciDescriptionResponse
  */
  public static GeneratePciDescriptionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneratePciDescriptionResponse.class);
  }

 /**
  * Convert an instance of GeneratePciDescriptionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

