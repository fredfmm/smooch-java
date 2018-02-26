/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 2.11
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
 * Customizable app settings.
 */
@ApiModel(description = "Customizable app settings.")

public class AppSettings {
  @SerializedName("maskCreditCardNumbers")
  private Boolean maskCreditCardNumbers = null;

  public AppSettings maskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    this.maskCreditCardNumbers = maskCreditCardNumbers;
    return this;
  }

   /**
   * Flag specifying whether credit card numbers will be automatically masked if sent through Smooch.
   * @return maskCreditCardNumbers
  **/
  @ApiModelProperty(value = "Flag specifying whether credit card numbers will be automatically masked if sent through Smooch.")
  public Boolean getMaskCreditCardNumbers() {
    return maskCreditCardNumbers;
  }

  public void setMaskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    this.maskCreditCardNumbers = maskCreditCardNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppSettings appSettings = (AppSettings) o;
    return Objects.equals(this.maskCreditCardNumbers, appSettings.maskCreditCardNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskCreditCardNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppSettings {\n");
    
    sb.append("    maskCreditCardNumbers: ").append(toIndentedString(maskCreditCardNumbers)).append("\n");
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

