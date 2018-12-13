/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 4.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateUpdate
 */

public class TemplateUpdate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("message")
  private Message message = null;

  public TemplateUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for the template, used when sending via [shorthand](https://docs.smooch.io/guide/shorthand/#sending-template-message-with-inline-syntax).
   * @return name
  **/
  @ApiModelProperty(value = "The name for the template, used when sending via [shorthand](https://docs.smooch.io/guide/shorthand/#sending-template-message-with-inline-syntax).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemplateUpdate message(Message message) {
    this.message = message;
    return this;
  }

   /**
   * The message sent when referencing the template via syntax.
   * @return message
  **/
  @ApiModelProperty(value = "The message sent when referencing the template via syntax.")
  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateUpdate templateUpdate = (TemplateUpdate) o;
    return Objects.equals(this.name, templateUpdate.name) &&
        Objects.equals(this.message, templateUpdate.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

