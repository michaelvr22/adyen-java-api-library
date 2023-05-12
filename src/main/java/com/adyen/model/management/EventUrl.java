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
import com.adyen.model.management.Url;
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
 * EventUrl
 */

public class EventUrl {
  public static final String SERIALIZED_NAME_EVENT_LOCAL_URLS = "eventLocalUrls";
  @SerializedName(SERIALIZED_NAME_EVENT_LOCAL_URLS)
  private List<Url> eventLocalUrls = null;

  public static final String SERIALIZED_NAME_EVENT_PUBLIC_URLS = "eventPublicUrls";
  @SerializedName(SERIALIZED_NAME_EVENT_PUBLIC_URLS)
  private List<Url> eventPublicUrls = null;

  public EventUrl() { 
  }

  public EventUrl eventLocalUrls(List<Url> eventLocalUrls) {
    
    this.eventLocalUrls = eventLocalUrls;
    return this;
  }

  public EventUrl addEventLocalUrlsItem(Url eventLocalUrlsItem) {
    if (this.eventLocalUrls == null) {
      this.eventLocalUrls = new ArrayList<>();
    }
    this.eventLocalUrls.add(eventLocalUrlsItem);
    return this;
  }

   /**
   * One or more local URLs to send event notifications to when using Terminal API.
   * @return eventLocalUrls
  **/
  @ApiModelProperty(value = "One or more local URLs to send event notifications to when using Terminal API.")

  public List<Url> getEventLocalUrls() {
    return eventLocalUrls;
  }


  public void setEventLocalUrls(List<Url> eventLocalUrls) {
    this.eventLocalUrls = eventLocalUrls;
  }


  public EventUrl eventPublicUrls(List<Url> eventPublicUrls) {
    
    this.eventPublicUrls = eventPublicUrls;
    return this;
  }

  public EventUrl addEventPublicUrlsItem(Url eventPublicUrlsItem) {
    if (this.eventPublicUrls == null) {
      this.eventPublicUrls = new ArrayList<>();
    }
    this.eventPublicUrls.add(eventPublicUrlsItem);
    return this;
  }

   /**
   * One or more public URLs to send event notifications to when using Terminal API.
   * @return eventPublicUrls
  **/
  @ApiModelProperty(value = "One or more public URLs to send event notifications to when using Terminal API.")

  public List<Url> getEventPublicUrls() {
    return eventPublicUrls;
  }


  public void setEventPublicUrls(List<Url> eventPublicUrls) {
    this.eventPublicUrls = eventPublicUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventUrl eventUrl = (EventUrl) o;
    return Objects.equals(this.eventLocalUrls, eventUrl.eventLocalUrls) &&
        Objects.equals(this.eventPublicUrls, eventUrl.eventPublicUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventLocalUrls, eventPublicUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventUrl {\n");
    sb.append("    eventLocalUrls: ").append(toIndentedString(eventLocalUrls)).append("\n");
    sb.append("    eventPublicUrls: ").append(toIndentedString(eventPublicUrls)).append("\n");
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
    openapiFields.add("eventLocalUrls");
    openapiFields.add("eventPublicUrls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventUrl
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EventUrl.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventUrl is not found in the empty JSON string", EventUrl.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventUrl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventUrl` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayeventLocalUrls = jsonObj.getAsJsonArray("eventLocalUrls");
      if (jsonArrayeventLocalUrls != null) {
        // ensure the json data is an array
        if (!jsonObj.get("eventLocalUrls").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `eventLocalUrls` to be an array in the JSON string but got `%s`", jsonObj.get("eventLocalUrls").toString()));
        }

        // validate the optional field `eventLocalUrls` (array)
        for (int i = 0; i < jsonArrayeventLocalUrls.size(); i++) {
          Url.validateJsonObject(jsonArrayeventLocalUrls.get(i).getAsJsonObject());
        }
      }
      JsonArray jsonArrayeventPublicUrls = jsonObj.getAsJsonArray("eventPublicUrls");
      if (jsonArrayeventPublicUrls != null) {
        // ensure the json data is an array
        if (!jsonObj.get("eventPublicUrls").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `eventPublicUrls` to be an array in the JSON string but got `%s`", jsonObj.get("eventPublicUrls").toString()));
        }

        // validate the optional field `eventPublicUrls` (array)
        for (int i = 0; i < jsonArrayeventPublicUrls.size(); i++) {
          Url.validateJsonObject(jsonArrayeventPublicUrls.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<EventUrl>() {
           @Override
           public void write(JsonWriter out, EventUrl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventUrl read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventUrl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventUrl
  * @throws IOException if the JSON string is invalid with respect to EventUrl
  */
  public static EventUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventUrl.class);
  }

 /**
  * Convert an instance of EventUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

