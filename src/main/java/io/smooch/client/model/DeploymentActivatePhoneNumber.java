/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.25
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
 * DeploymentActivatePhoneNumber
 */

public class DeploymentActivatePhoneNumber {
  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("verifiedNameCertificate")
  private String verifiedNameCertificate = null;

  @SerializedName("method")
  private String method = null;

  public DeploymentActivatePhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number to send the activation code to.
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "The phone number to send the activation code to.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public DeploymentActivatePhoneNumber verifiedNameCertificate(String verifiedNameCertificate) {
    this.verifiedNameCertificate = verifiedNameCertificate;
    return this;
  }

   /**
   * The verified name certificate for the phone number.
   * @return verifiedNameCertificate
  **/
  @ApiModelProperty(required = true, value = "The verified name certificate for the phone number.")
  public String getVerifiedNameCertificate() {
    return verifiedNameCertificate;
  }

  public void setVerifiedNameCertificate(String verifiedNameCertificate) {
    this.verifiedNameCertificate = verifiedNameCertificate;
  }

  public DeploymentActivatePhoneNumber method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The method desired to receive the activation code. See [**DeploymentActivationMethodEnum**](Enums.md#DeploymentActivationMethodEnum) for available values.
   * @return method
  **/
  @ApiModelProperty(required = true, value = "The method desired to receive the activation code. See [**DeploymentActivationMethodEnum**](Enums.md#DeploymentActivationMethodEnum) for available values.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentActivatePhoneNumber deploymentActivatePhoneNumber = (DeploymentActivatePhoneNumber) o;
    return Objects.equals(this.phoneNumber, deploymentActivatePhoneNumber.phoneNumber) &&
        Objects.equals(this.verifiedNameCertificate, deploymentActivatePhoneNumber.verifiedNameCertificate) &&
        Objects.equals(this.method, deploymentActivatePhoneNumber.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, verifiedNameCertificate, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentActivatePhoneNumber {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verifiedNameCertificate: ").append(toIndentedString(verifiedNameCertificate)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

