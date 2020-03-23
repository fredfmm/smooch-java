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
import io.smooch.client.model.ServiceAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ListServiceAccountsResponse
 */

public class ListServiceAccountsResponse {
  @SerializedName("serviceAccounts")
  private List<ServiceAccount> serviceAccounts = null;

  @SerializedName("hasMore")
  private Boolean hasMore = null;

  @SerializedName("offset")
  private Integer offset = null;

  public ListServiceAccountsResponse serviceAccounts(List<ServiceAccount> serviceAccounts) {
    this.serviceAccounts = serviceAccounts;
    return this;
  }

  public ListServiceAccountsResponse addServiceAccountsItem(ServiceAccount serviceAccountsItem) {
    if (this.serviceAccounts == null) {
      this.serviceAccounts = new ArrayList<ServiceAccount>();
    }
    this.serviceAccounts.add(serviceAccountsItem);
    return this;
  }

   /**
   * The list of service accounts.
   * @return serviceAccounts
  **/
  @ApiModelProperty(value = "The list of service accounts.")
  public List<ServiceAccount> getServiceAccounts() {
    return serviceAccounts;
  }

  public void setServiceAccounts(List<ServiceAccount> serviceAccounts) {
    this.serviceAccounts = serviceAccounts;
  }

  public ListServiceAccountsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Flag indicating if there are more service accounts that are not present in the response.
   * @return hasMore
  **/
  @ApiModelProperty(value = "Flag indicating if there are more service accounts that are not present in the response.")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ListServiceAccountsResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The number of service account records skipped in the returned list.
   * @return offset
  **/
  @ApiModelProperty(value = "The number of service account records skipped in the returned list.")
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
    ListServiceAccountsResponse listServiceAccountsResponse = (ListServiceAccountsResponse) o;
    return Objects.equals(this.serviceAccounts, listServiceAccountsResponse.serviceAccounts) &&
        Objects.equals(this.hasMore, listServiceAccountsResponse.hasMore) &&
        Objects.equals(this.offset, listServiceAccountsResponse.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccounts, hasMore, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListServiceAccountsResponse {\n");
    
    sb.append("    serviceAccounts: ").append(toIndentedString(serviceAccounts)).append("\n");
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

