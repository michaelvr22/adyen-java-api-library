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
import com.adyen.model.management.BillingEntity;
import com.adyen.model.management.OrderItem;
import com.adyen.model.management.ShippingLocation;
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
 * TerminalOrder
 */

public class TerminalOrder {
  public static final String SERIALIZED_NAME_BILLING_ENTITY = "billingEntity";
  @SerializedName(SERIALIZED_NAME_BILLING_ENTITY)
  private BillingEntity billingEntity;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_REFERENCE = "customerOrderReference";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_REFERENCE)
  private String customerOrderReference;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderItem> items = null;

  public static final String SERIALIZED_NAME_ORDER_DATE = "orderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private String orderDate;

  public static final String SERIALIZED_NAME_SHIPPING_LOCATION = "shippingLocation";
  @SerializedName(SERIALIZED_NAME_SHIPPING_LOCATION)
  private ShippingLocation shippingLocation;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRACKING_URL = "trackingUrl";
  @SerializedName(SERIALIZED_NAME_TRACKING_URL)
  private String trackingUrl;

  public TerminalOrder() { 
  }

  public TerminalOrder billingEntity(BillingEntity billingEntity) {
    
    this.billingEntity = billingEntity;
    return this;
  }

   /**
   * Get billingEntity
   * @return billingEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingEntity getBillingEntity() {
    return billingEntity;
  }


  public void setBillingEntity(BillingEntity billingEntity) {
    this.billingEntity = billingEntity;
  }


  public TerminalOrder customerOrderReference(String customerOrderReference) {
    
    this.customerOrderReference = customerOrderReference;
    return this;
  }

   /**
   * The merchant-defined purchase order number. This will be printed on the packing list.
   * @return customerOrderReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant-defined purchase order number. This will be printed on the packing list.")

  public String getCustomerOrderReference() {
    return customerOrderReference;
  }


  public void setCustomerOrderReference(String customerOrderReference) {
    this.customerOrderReference = customerOrderReference;
  }


  public TerminalOrder id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the order.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the order.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TerminalOrder items(List<OrderItem> items) {
    
    this.items = items;
    return this;
  }

  public TerminalOrder addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The products included in the order.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The products included in the order.")

  public List<OrderItem> getItems() {
    return items;
  }


  public void setItems(List<OrderItem> items) {
    this.items = items;
  }


  public TerminalOrder orderDate(String orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date and time that the order was placed, in UTC ISO 8601 format. For example, \&quot;2011-12-03T10:15:30Z\&quot;.
   * @return orderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the order was placed, in UTC ISO 8601 format. For example, \"2011-12-03T10:15:30Z\".")

  public String getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public TerminalOrder shippingLocation(ShippingLocation shippingLocation) {
    
    this.shippingLocation = shippingLocation;
    return this;
  }

   /**
   * Get shippingLocation
   * @return shippingLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingLocation getShippingLocation() {
    return shippingLocation;
  }


  public void setShippingLocation(ShippingLocation shippingLocation) {
    this.shippingLocation = shippingLocation;
  }


  public TerminalOrder status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The processing status of the order.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing status of the order.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TerminalOrder trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * The URL, provided by the carrier company, where the shipment can be tracked.
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL, provided by the carrier company, where the shipment can be tracked.")

  public String getTrackingUrl() {
    return trackingUrl;
  }


  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalOrder terminalOrder = (TerminalOrder) o;
    return Objects.equals(this.billingEntity, terminalOrder.billingEntity) &&
        Objects.equals(this.customerOrderReference, terminalOrder.customerOrderReference) &&
        Objects.equals(this.id, terminalOrder.id) &&
        Objects.equals(this.items, terminalOrder.items) &&
        Objects.equals(this.orderDate, terminalOrder.orderDate) &&
        Objects.equals(this.shippingLocation, terminalOrder.shippingLocation) &&
        Objects.equals(this.status, terminalOrder.status) &&
        Objects.equals(this.trackingUrl, terminalOrder.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingEntity, customerOrderReference, id, items, orderDate, shippingLocation, status, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalOrder {\n");
    sb.append("    billingEntity: ").append(toIndentedString(billingEntity)).append("\n");
    sb.append("    customerOrderReference: ").append(toIndentedString(customerOrderReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    shippingLocation: ").append(toIndentedString(shippingLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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
    openapiFields.add("billingEntity");
    openapiFields.add("customerOrderReference");
    openapiFields.add("id");
    openapiFields.add("items");
    openapiFields.add("orderDate");
    openapiFields.add("shippingLocation");
    openapiFields.add("status");
    openapiFields.add("trackingUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TerminalOrder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TerminalOrder.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminalOrder is not found in the empty JSON string", TerminalOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TerminalOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerminalOrder` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `billingEntity`
      if (jsonObj.getAsJsonObject("billingEntity") != null) {
        BillingEntity.validateJsonObject(jsonObj.getAsJsonObject("billingEntity"));
      }
      // validate the optional field customerOrderReference
      if (jsonObj.get("customerOrderReference") != null && !jsonObj.get("customerOrderReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderReference").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          OrderItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
      // validate the optional field orderDate
      if (jsonObj.get("orderDate") != null && !jsonObj.get("orderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderDate").toString()));
      }
      // validate the optional field `shippingLocation`
      if (jsonObj.getAsJsonObject("shippingLocation") != null) {
        ShippingLocation.validateJsonObject(jsonObj.getAsJsonObject("shippingLocation"));
      }
      // validate the optional field status
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field trackingUrl
      if (jsonObj.get("trackingUrl") != null && !jsonObj.get("trackingUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalOrder>() {
           @Override
           public void write(JsonWriter out, TerminalOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalOrder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalOrder
  * @throws IOException if the JSON string is invalid with respect to TerminalOrder
  */
  public static TerminalOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalOrder.class);
  }

 /**
  * Convert an instance of TerminalOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

