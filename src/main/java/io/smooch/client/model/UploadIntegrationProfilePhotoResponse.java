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
 * UploadIntegrationProfilePhotoResponse
 */

public class UploadIntegrationProfilePhotoResponse {
  @SerializedName("photoUrl")
  private String photoUrl = null;

  public UploadIntegrationProfilePhotoResponse photoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

   /**
   * The photo URL after uploading.
   * @return photoUrl
  **/
  @ApiModelProperty(required = true, value = "The photo URL after uploading.")
  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadIntegrationProfilePhotoResponse uploadIntegrationProfilePhotoResponse = (UploadIntegrationProfilePhotoResponse) o;
    return Objects.equals(this.photoUrl, uploadIntegrationProfilePhotoResponse.photoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photoUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadIntegrationProfilePhotoResponse {\n");
    
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
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

