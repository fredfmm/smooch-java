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
import io.smooch.client.model.Action;
import io.smooch.client.model.DisplaySettings;
import io.smooch.client.model.MessageItem;
import io.smooch.client.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Message
 */

public class Message {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("authorId")
  private String authorId = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("source")
  private Source source = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  @SerializedName("received")
  private Float received = null;

  @SerializedName("mediaUrl")
  private String mediaUrl = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("items")
  private List<MessageItem> items = null;

  @SerializedName("actions")
  private List<Action> actions = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("displaySettings")
  private DisplaySettings displaySettings = null;

  public Message id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The message ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The message ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Message authorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

   /**
   * The ID of the message's author.
   * @return authorId
  **/
  @ApiModelProperty(required = true, value = "The ID of the message's author.")
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public Message role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the individual posting the message. Can be either *appUser* or *appMaker*.
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role of the individual posting the message. Can be either *appUser* or *appMaker*.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Message type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The message type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The message type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Message source(Source source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the message.
   * @return source
  **/
  @ApiModelProperty(value = "The source of the message.")
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public Message name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name of the message author.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The display name of the message author.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Message text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The message text. Required for text messages. 
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The message text. Required for text messages. ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Message email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the message author.
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the message author.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Message avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL of the desired message avatar image.
   * @return avatarUrl
  **/
  @ApiModelProperty(required = true, value = "The URL of the desired message avatar image.")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public Message received(Float received) {
    this.received = received;
    return this;
  }

   /**
   * The unix timestamp of the moment the message was received.
   * @return received
  **/
  @ApiModelProperty(required = true, value = "The unix timestamp of the moment the message was received.")
  public Float getReceived() {
    return received;
  }

  public void setReceived(Float received) {
    this.received = received;
  }

  public Message mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The mediaUrl for the message. Required for image/file messages. 
   * @return mediaUrl
  **/
  @ApiModelProperty(value = "The mediaUrl for the message. Required for image/file messages. ")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public Message mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The mediaType for the message. Required for image/file messages. 
   * @return mediaType
  **/
  @ApiModelProperty(value = "The mediaType for the message. Required for image/file messages. ")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public Message metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Flat JSON object containing any custom properties associated with the message.
   * @return metadata
  **/
  @ApiModelProperty(value = "Flat JSON object containing any custom properties associated with the message.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public Message items(List<MessageItem> items) {
    this.items = items;
    return this;
  }

  public Message addItemsItem(MessageItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<MessageItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The items in the message list. Required for carousel and list messages. 
   * @return items
  **/
  @ApiModelProperty(value = "The items in the message list. Required for carousel and list messages. ")
  public List<MessageItem> getItems() {
    return items;
  }

  public void setItems(List<MessageItem> items) {
    this.items = items;
  }

  public Message actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public Message addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<Action>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The actions in the message.
   * @return actions
  **/
  @ApiModelProperty(value = "The actions in the message.")
  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  public Message payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload of a reply action, if applicable.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload of a reply action, if applicable.")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public Message displaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
    return this;
  }

   /**
   * Settings to adjust the carousel layout. See [Display Settings](https://docs.smooch.io/rest/#display-settings).
   * @return displaySettings
  **/
  @ApiModelProperty(value = "Settings to adjust the carousel layout. See [Display Settings](https://docs.smooch.io/rest/#display-settings).")
  public DisplaySettings getDisplaySettings() {
    return displaySettings;
  }

  public void setDisplaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.authorId, message.authorId) &&
        Objects.equals(this.role, message.role) &&
        Objects.equals(this.type, message.type) &&
        Objects.equals(this.source, message.source) &&
        Objects.equals(this.name, message.name) &&
        Objects.equals(this.text, message.text) &&
        Objects.equals(this.email, message.email) &&
        Objects.equals(this.avatarUrl, message.avatarUrl) &&
        Objects.equals(this.received, message.received) &&
        Objects.equals(this.mediaUrl, message.mediaUrl) &&
        Objects.equals(this.mediaType, message.mediaType) &&
        Objects.equals(this.metadata, message.metadata) &&
        Objects.equals(this.items, message.items) &&
        Objects.equals(this.actions, message.actions) &&
        Objects.equals(this.payload, message.payload) &&
        Objects.equals(this.displaySettings, message.displaySettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authorId, role, type, source, name, text, email, avatarUrl, received, mediaUrl, mediaType, metadata, items, actions, payload, displaySettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
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

