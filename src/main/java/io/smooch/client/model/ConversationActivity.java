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
 * ConversationActivity
 */

public class ConversationActivity {
  @SerializedName("role")
  private String role = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  public ConversationActivity role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the actor. Must be *appMaker*. See [**RoleEnum**](Enums.md#RoleEnum) for available values.
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role of the actor. Must be *appMaker*. See [**RoleEnum**](Enums.md#RoleEnum) for available values.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public ConversationActivity type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of activity to trigger. Must be either *typing:start* or *typing:stop*. See [**MessageTypeEnum**](Enums.md#MessageTypeEnum) for available values.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of activity to trigger. Must be either *typing:start* or *typing:stop*. See [**MessageTypeEnum**](Enums.md#MessageTypeEnum) for available values.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConversationActivity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the app maker that starts or stops typing a response.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the app maker that starts or stops typing a response.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversationActivity avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The avatar URL of the app maker that starts typing a response.
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The avatar URL of the app maker that starts typing a response.")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationActivity conversationActivity = (ConversationActivity) o;
    return Objects.equals(this.role, conversationActivity.role) &&
        Objects.equals(this.type, conversationActivity.type) &&
        Objects.equals(this.name, conversationActivity.name) &&
        Objects.equals(this.avatarUrl, conversationActivity.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, type, name, avatarUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationActivity {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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

