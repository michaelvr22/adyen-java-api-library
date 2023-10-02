/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.PaginationLinks;
import com.adyen.model.management.Store;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * ListStoresResponse
 */
@JsonPropertyOrder({
  ListStoresResponse.JSON_PROPERTY_LINKS,
  ListStoresResponse.JSON_PROPERTY_DATA,
  ListStoresResponse.JSON_PROPERTY_ITEMS_TOTAL,
  ListStoresResponse.JSON_PROPERTY_PAGES_TOTAL
})

public class ListStoresResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationLinks links;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<Store> data = null;

  public static final String JSON_PROPERTY_ITEMS_TOTAL = "itemsTotal";
  private Integer itemsTotal;

  public static final String JSON_PROPERTY_PAGES_TOTAL = "pagesTotal";
  private Integer pagesTotal;

  public ListStoresResponse() { 
  }

  public ListStoresResponse links(PaginationLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaginationLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  public ListStoresResponse data(List<Store> data) {
    this.data = data;
    return this;
  }

  public ListStoresResponse addDataItem(Store dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of stores
   * @return data
  **/
  @ApiModelProperty(value = "List of stores")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Store> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<Store> data) {
    this.data = data;
  }


  public ListStoresResponse itemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

   /**
   * Total number of items.
   * @return itemsTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of items.")
  @JsonProperty(JSON_PROPERTY_ITEMS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getItemsTotal() {
    return itemsTotal;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
  }


  public ListStoresResponse pagesTotal(Integer pagesTotal) {
    this.pagesTotal = pagesTotal;
    return this;
  }

   /**
   * Total number of pages.
   * @return pagesTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of pages.")
  @JsonProperty(JSON_PROPERTY_PAGES_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPagesTotal() {
    return pagesTotal;
  }


  @JsonProperty(JSON_PROPERTY_PAGES_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagesTotal(Integer pagesTotal) {
    this.pagesTotal = pagesTotal;
  }


  /**
   * Return true if this ListStoresResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStoresResponse listStoresResponse = (ListStoresResponse) o;
    return Objects.equals(this.links, listStoresResponse.links) &&
        Objects.equals(this.data, listStoresResponse.data) &&
        Objects.equals(this.itemsTotal, listStoresResponse.itemsTotal) &&
        Objects.equals(this.pagesTotal, listStoresResponse.pagesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data, itemsTotal, pagesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStoresResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
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
   * Create an instance of ListStoresResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListStoresResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to ListStoresResponse
   */
  public static ListStoresResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ListStoresResponse.class);
  }
/**
  * Convert an instance of ListStoresResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
