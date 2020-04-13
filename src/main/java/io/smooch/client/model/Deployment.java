/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.27
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
 * Deployment
 */

public class Deployment {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("hosting")
  private String hosting = null;

  @SerializedName("baseUrl")
  private String baseUrl = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  @SerializedName("callbackSecret")
  private String callbackSecret = null;

  @SerializedName("integrationId")
  private String integrationId = null;

  @SerializedName("appId")
  private String appId = null;

  public Deployment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The deployment ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The deployment ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Deployment status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The deployment status. See [**DeploymentStatusEnum**](Enums.md#DeploymentStatusEnum) for available values.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The deployment status. See [**DeploymentStatusEnum**](Enums.md#DeploymentStatusEnum) for available values.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Deployment hosting(String hosting) {
    this.hosting = hosting;
    return this;
  }

   /**
   * The deployment hosting. See [**DeploymentHostingEnum**](Enums.md#DeploymentHostingEnum) for available values.
   * @return hosting
  **/
  @ApiModelProperty(required = true, value = "The deployment hosting. See [**DeploymentHostingEnum**](Enums.md#DeploymentHostingEnum) for available values.")
  public String getHosting() {
    return hosting;
  }

  public void setHosting(String hosting) {
    this.hosting = hosting;
  }

  public Deployment baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * The baseUrl of the deployment. Only present for `self` hosted deployments.
   * @return baseUrl
  **/
  @ApiModelProperty(value = "The baseUrl of the deployment. Only present for `self` hosted deployments.")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public Deployment username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the deployment. Only present for `self` hosted deployments.
   * @return username
  **/
  @ApiModelProperty(value = "The username of the deployment. Only present for `self` hosted deployments.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Deployment phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phoneNumber of the deployment. Only present once the deployment has been registered.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phoneNumber of the deployment. Only present once the deployment has been registered.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Deployment callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The URL to be called by Smooch when the status of the deployment changes.
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "The URL to be called by Smooch when the status of the deployment changes.")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public Deployment callbackSecret(String callbackSecret) {
    this.callbackSecret = callbackSecret;
    return this;
  }

   /**
   * The secret used to secure the callback.
   * @return callbackSecret
  **/
  @ApiModelProperty(value = "The secret used to secure the callback.")
  public String getCallbackSecret() {
    return callbackSecret;
  }

  public void setCallbackSecret(String callbackSecret) {
    this.callbackSecret = callbackSecret;
  }

  public Deployment integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The integrationId of the integration using this deployment.
   * @return integrationId
  **/
  @ApiModelProperty(value = "The integrationId of the integration using this deployment.")
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public Deployment appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The appId of the integration using this deployment.
   * @return appId
  **/
  @ApiModelProperty(value = "The appId of the integration using this deployment.")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    return Objects.equals(this.id, deployment.id) &&
        Objects.equals(this.status, deployment.status) &&
        Objects.equals(this.hosting, deployment.hosting) &&
        Objects.equals(this.baseUrl, deployment.baseUrl) &&
        Objects.equals(this.username, deployment.username) &&
        Objects.equals(this.phoneNumber, deployment.phoneNumber) &&
        Objects.equals(this.callbackUrl, deployment.callbackUrl) &&
        Objects.equals(this.callbackSecret, deployment.callbackSecret) &&
        Objects.equals(this.integrationId, deployment.integrationId) &&
        Objects.equals(this.appId, deployment.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, hosting, baseUrl, username, phoneNumber, callbackUrl, callbackSecret, integrationId, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hosting: ").append(toIndentedString(hosting)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    callbackSecret: ").append(toIndentedString(callbackSecret)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

