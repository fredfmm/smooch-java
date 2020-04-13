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
import io.smooch.client.model.Template;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ListTemplatesResponse
 */

public class ListTemplatesResponse {
  @SerializedName("templates")
  private List<Template> templates = new ArrayList<Template>();

  @SerializedName("hasMore")
  private Boolean hasMore = null;

  @SerializedName("offset")
  private Integer offset = null;

  public ListTemplatesResponse templates(List<Template> templates) {
    this.templates = templates;
    return this;
  }

  public ListTemplatesResponse addTemplatesItem(Template templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * The list of templates.
   * @return templates
  **/
  @ApiModelProperty(required = true, value = "The list of templates.")
  public List<Template> getTemplates() {
    return templates;
  }

  public void setTemplates(List<Template> templates) {
    this.templates = templates;
  }

  public ListTemplatesResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Flag indicating if there are more templates that are not present in the response.
   * @return hasMore
  **/
  @ApiModelProperty(value = "Flag indicating if there are more templates that are not present in the response.")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ListTemplatesResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The number of template records skipped in the returned list.
   * @return offset
  **/
  @ApiModelProperty(value = "The number of template records skipped in the returned list.")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTemplatesResponse listTemplatesResponse = (ListTemplatesResponse) o;
    return Objects.equals(this.templates, listTemplatesResponse.templates) &&
        Objects.equals(this.hasMore, listTemplatesResponse.hasMore) &&
        Objects.equals(this.offset, listTemplatesResponse.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, hasMore, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTemplatesResponse {\n");
    
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

