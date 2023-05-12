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
import com.adyen.model.management.ScheduleTerminalActionsRequestActionDetails;
import com.adyen.model.management.TerminalActionScheduleDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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

import com.adyen.model.management.JSON;

/**
 * ScheduleTerminalActionsResponse
 */

public class ScheduleTerminalActionsResponse {
  public static final String SERIALIZED_NAME_ACTION_DETAILS = "actionDetails";
  @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
  private ScheduleTerminalActionsRequestActionDetails actionDetails;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<TerminalActionScheduleDetail> items = null;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduledAt";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private String scheduledAt;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_TERMINAL_IDS = "terminalIds";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_TERMINAL_IDS)
  private List<String> terminalIds = null;

  public static final String SERIALIZED_NAME_TERMINALS_WITH_ERRORS = "terminalsWithErrors";
  @SerializedName(SERIALIZED_NAME_TERMINALS_WITH_ERRORS)
  private Map<String, List<String>> terminalsWithErrors = null;

  public static final String SERIALIZED_NAME_TOTAL_ERRORS = "totalErrors";
  @SerializedName(SERIALIZED_NAME_TOTAL_ERRORS)
  private Integer totalErrors;

  public static final String SERIALIZED_NAME_TOTAL_SCHEDULED = "totalScheduled";
  @SerializedName(SERIALIZED_NAME_TOTAL_SCHEDULED)
  private Integer totalScheduled;

  public ScheduleTerminalActionsResponse() { 
  }

  public ScheduleTerminalActionsResponse actionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
    
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * Get actionDetails
   * @return actionDetails
  **/
  @ApiModelProperty(value = "")

  public ScheduleTerminalActionsRequestActionDetails getActionDetails() {
    return actionDetails;
  }


  public void setActionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
    this.actionDetails = actionDetails;
  }


  public ScheduleTerminalActionsResponse items(List<TerminalActionScheduleDetail> items) {
    
    this.items = items;
    return this;
  }

  public ScheduleTerminalActionsResponse addItemsItem(TerminalActionScheduleDetail itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list containing a terminal ID and an action ID for each terminal that the action was scheduled for.
   * @return items
  **/
  @ApiModelProperty(value = "A list containing a terminal ID and an action ID for each terminal that the action was scheduled for.")

  public List<TerminalActionScheduleDetail> getItems() {
    return items;
  }


  public void setItems(List<TerminalActionScheduleDetail> items) {
    this.items = items;
  }


  public ScheduleTerminalActionsResponse scheduledAt(String scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call.
   * @return scheduledAt
  **/
  @ApiModelProperty(value = "The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call.")

  public String getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ScheduleTerminalActionsResponse storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the &#x60;terminalIds&#x60; list must be assigned to this store.
   * @return storeId
  **/
  @ApiModelProperty(value = "The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the `terminalIds` list must be assigned to this store.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Deprecated
  public ScheduleTerminalActionsResponse terminalIds(List<String> terminalIds) {
    
    this.terminalIds = terminalIds;
    return this;
  }

  public ScheduleTerminalActionsResponse addTerminalIdsItem(String terminalIdsItem) {
    if (this.terminalIds == null) {
      this.terminalIds = new ArrayList<>();
    }
    this.terminalIds.add(terminalIdsItem);
    return this;
  }

   /**
   * A list of unique IDs of the terminals that the action applies to.
   * @return terminalIds
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "A list of unique IDs of the terminals that the action applies to.")

  public List<String> getTerminalIds() {
    return terminalIds;
  }


  @Deprecated
  public void setTerminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
  }


  public ScheduleTerminalActionsResponse terminalsWithErrors(Map<String, List<String>> terminalsWithErrors) {
    
    this.terminalsWithErrors = terminalsWithErrors;
    return this;
  }

  public ScheduleTerminalActionsResponse putTerminalsWithErrorsItem(String key, List<String> terminalsWithErrorsItem) {
    if (this.terminalsWithErrors == null) {
      this.terminalsWithErrors = new HashMap<>();
    }
    this.terminalsWithErrors.put(key, terminalsWithErrorsItem);
    return this;
  }

   /**
   * The validation errors that occurred in the list of terminals, and for each error the IDs of the terminals that the error applies to.
   * @return terminalsWithErrors
  **/
  @ApiModelProperty(value = "The validation errors that occurred in the list of terminals, and for each error the IDs of the terminals that the error applies to.")

  public Map<String, List<String>> getTerminalsWithErrors() {
    return terminalsWithErrors;
  }


  public void setTerminalsWithErrors(Map<String, List<String>> terminalsWithErrors) {
    this.terminalsWithErrors = terminalsWithErrors;
  }


  public ScheduleTerminalActionsResponse totalErrors(Integer totalErrors) {
    
    this.totalErrors = totalErrors;
    return this;
  }

   /**
   * The number of terminals for which scheduling the action failed.
   * @return totalErrors
  **/
  @ApiModelProperty(value = "The number of terminals for which scheduling the action failed.")

  public Integer getTotalErrors() {
    return totalErrors;
  }


  public void setTotalErrors(Integer totalErrors) {
    this.totalErrors = totalErrors;
  }


  public ScheduleTerminalActionsResponse totalScheduled(Integer totalScheduled) {
    
    this.totalScheduled = totalScheduled;
    return this;
  }

   /**
   * The number of terminals for which the action was successfully scheduled. This doesn&#39;t mean the action has happened yet.
   * @return totalScheduled
  **/
  @ApiModelProperty(value = "The number of terminals for which the action was successfully scheduled. This doesn't mean the action has happened yet.")

  public Integer getTotalScheduled() {
    return totalScheduled;
  }


  public void setTotalScheduled(Integer totalScheduled) {
    this.totalScheduled = totalScheduled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleTerminalActionsResponse scheduleTerminalActionsResponse = (ScheduleTerminalActionsResponse) o;
    return Objects.equals(this.actionDetails, scheduleTerminalActionsResponse.actionDetails) &&
        Objects.equals(this.items, scheduleTerminalActionsResponse.items) &&
        Objects.equals(this.scheduledAt, scheduleTerminalActionsResponse.scheduledAt) &&
        Objects.equals(this.storeId, scheduleTerminalActionsResponse.storeId) &&
        Objects.equals(this.terminalIds, scheduleTerminalActionsResponse.terminalIds) &&
        Objects.equals(this.terminalsWithErrors, scheduleTerminalActionsResponse.terminalsWithErrors) &&
        Objects.equals(this.totalErrors, scheduleTerminalActionsResponse.totalErrors) &&
        Objects.equals(this.totalScheduled, scheduleTerminalActionsResponse.totalScheduled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDetails, items, scheduledAt, storeId, terminalIds, terminalsWithErrors, totalErrors, totalScheduled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleTerminalActionsResponse {\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    terminalIds: ").append(toIndentedString(terminalIds)).append("\n");
    sb.append("    terminalsWithErrors: ").append(toIndentedString(terminalsWithErrors)).append("\n");
    sb.append("    totalErrors: ").append(toIndentedString(totalErrors)).append("\n");
    sb.append("    totalScheduled: ").append(toIndentedString(totalScheduled)).append("\n");
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
    openapiFields.add("actionDetails");
    openapiFields.add("items");
    openapiFields.add("scheduledAt");
    openapiFields.add("storeId");
    openapiFields.add("terminalIds");
    openapiFields.add("terminalsWithErrors");
    openapiFields.add("totalErrors");
    openapiFields.add("totalScheduled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScheduleTerminalActionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ScheduleTerminalActionsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduleTerminalActionsResponse is not found in the empty JSON string", ScheduleTerminalActionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScheduleTerminalActionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScheduleTerminalActionsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `actionDetails`
      if (jsonObj.getAsJsonObject("actionDetails") != null) {
        ScheduleTerminalActionsRequestActionDetails.validateJsonObject(jsonObj.getAsJsonObject("actionDetails"));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          TerminalActionScheduleDetail.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        }
      }
      // validate the optional field scheduledAt
      if (jsonObj.get("scheduledAt") != null && !jsonObj.get("scheduledAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduledAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduledAt").toString()));
      }
      // validate the optional field storeId
      if (jsonObj.get("storeId") != null && !jsonObj.get("storeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storeId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("terminalIds") != null && !jsonObj.get("terminalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminalIds` to be an array in the JSON string but got `%s`", jsonObj.get("terminalIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduleTerminalActionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduleTerminalActionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduleTerminalActionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduleTerminalActionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduleTerminalActionsResponse>() {
           @Override
           public void write(JsonWriter out, ScheduleTerminalActionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScheduleTerminalActionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScheduleTerminalActionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduleTerminalActionsResponse
  * @throws IOException if the JSON string is invalid with respect to ScheduleTerminalActionsResponse
  */
  public static ScheduleTerminalActionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduleTerminalActionsResponse.class);
  }

 /**
  * Convert an instance of ScheduleTerminalActionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

