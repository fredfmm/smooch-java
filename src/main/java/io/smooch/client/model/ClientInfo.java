/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClientInfo
 */

public class ClientInfo {
  @SerializedName("appName")
  private String appName = null;

  @SerializedName("deviceModel")
  private String deviceModel = null;

  @SerializedName("os")
  private String os = null;

  @SerializedName("osVersion")
  private String osVersion = null;

  @SerializedName("radioAccessTechnology")
  private String radioAccessTechnology = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("devicePlatform")
  private String devicePlatform = null;

  @SerializedName("wifi")
  private String wifi = null;

  public ClientInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Name of the app associated with the client.
   * @return appName
  **/
  @ApiModelProperty(value = "Name of the app associated with the client.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ClientInfo deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * The client's device model.
   * @return deviceModel
  **/
  @ApiModelProperty(value = "The client's device model.")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ClientInfo os(String os) {
    this.os = os;
    return this;
  }

   /**
   * The client's OS.
   * @return os
  **/
  @ApiModelProperty(value = "The client's OS.")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public ClientInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * The client's OS version.
   * @return osVersion
  **/
  @ApiModelProperty(value = "The client's OS version.")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public ClientInfo radioAccessTechnology(String radioAccessTechnology) {
    this.radioAccessTechnology = radioAccessTechnology;
    return this;
  }

   /**
   * The client's radioAccessTechnology (Ex. HSDPA).
   * @return radioAccessTechnology
  **/
  @ApiModelProperty(value = "The client's radioAccessTechnology (Ex. HSDPA).")
  public String getRadioAccessTechnology() {
    return radioAccessTechnology;
  }

  public void setRadioAccessTechnology(String radioAccessTechnology) {
    this.radioAccessTechnology = radioAccessTechnology;
  }

  public ClientInfo carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The client's carrier.
   * @return carrier
  **/
  @ApiModelProperty(value = "The client's carrier.")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ClientInfo devicePlatform(String devicePlatform) {
    this.devicePlatform = devicePlatform;
    return this;
  }

   /**
   * The client's device platform.
   * @return devicePlatform
  **/
  @ApiModelProperty(value = "The client's device platform.")
  public String getDevicePlatform() {
    return devicePlatform;
  }

  public void setDevicePlatform(String devicePlatform) {
    this.devicePlatform = devicePlatform;
  }

  public ClientInfo wifi(String wifi) {
    this.wifi = wifi;
    return this;
  }

   /**
   * Whether or not the client has wifi.
   * @return wifi
  **/
  @ApiModelProperty(value = "Whether or not the client has wifi.")
  public String getWifi() {
    return wifi;
  }

  public void setWifi(String wifi) {
    this.wifi = wifi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfo clientInfo = (ClientInfo) o;
    return Objects.equals(this.appName, clientInfo.appName) &&
        Objects.equals(this.deviceModel, clientInfo.deviceModel) &&
        Objects.equals(this.os, clientInfo.os) &&
        Objects.equals(this.osVersion, clientInfo.osVersion) &&
        Objects.equals(this.radioAccessTechnology, clientInfo.radioAccessTechnology) &&
        Objects.equals(this.carrier, clientInfo.carrier) &&
        Objects.equals(this.devicePlatform, clientInfo.devicePlatform) &&
        Objects.equals(this.wifi, clientInfo.wifi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, deviceModel, os, osVersion, radioAccessTechnology, carrier, devicePlatform, wifi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfo {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    radioAccessTechnology: ").append(toIndentedString(radioAccessTechnology)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    devicePlatform: ").append(toIndentedString(devicePlatform)).append("\n");
    sb.append("    wifi: ").append(toIndentedString(wifi)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

