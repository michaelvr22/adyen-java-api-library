/*
 * Management API
 *
 * The version of the OpenAPI document: 3
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
 * TerminalConnectivityWifi
 */
@JsonPropertyOrder({
  TerminalConnectivityWifi.JSON_PROPERTY_IP_ADDRESS,
  TerminalConnectivityWifi.JSON_PROPERTY_MAC_ADDRESS,
  TerminalConnectivityWifi.JSON_PROPERTY_SSID
})

public class TerminalConnectivityWifi {
  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "macAddress";
  private String macAddress;

  public static final String JSON_PROPERTY_SSID = "ssid";
  private String ssid;

  public TerminalConnectivityWifi() { 
  }

  public TerminalConnectivityWifi ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The terminal&#39;s IP address in the Wi-Fi network.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "The terminal's IP address in the Wi-Fi network.")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public TerminalConnectivityWifi macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The terminal&#39;s MAC address in the Wi-Fi network.
   * @return macAddress
  **/
  @ApiModelProperty(value = "The terminal's MAC address in the Wi-Fi network.")
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMacAddress() {
    return macAddress;
  }


  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public TerminalConnectivityWifi ssid(String ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * The SSID of the Wi-Fi network that the terminal is connected to.
   * @return ssid
  **/
  @ApiModelProperty(value = "The SSID of the Wi-Fi network that the terminal is connected to.")
  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSsid() {
    return ssid;
  }


  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  /**
   * Return true if this TerminalConnectivityWifi object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalConnectivityWifi terminalConnectivityWifi = (TerminalConnectivityWifi) o;
    return Objects.equals(this.ipAddress, terminalConnectivityWifi.ipAddress) &&
        Objects.equals(this.macAddress, terminalConnectivityWifi.macAddress) &&
        Objects.equals(this.ssid, terminalConnectivityWifi.ssid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, macAddress, ssid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalConnectivityWifi {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
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
   * Create an instance of TerminalConnectivityWifi given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalConnectivityWifi
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalConnectivityWifi
   */
  public static TerminalConnectivityWifi fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalConnectivityWifi.class);
  }
/**
  * Convert an instance of TerminalConnectivityWifi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
