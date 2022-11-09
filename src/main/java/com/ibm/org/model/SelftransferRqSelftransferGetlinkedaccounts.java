package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRqSelftransferGetlinkedaccounts
 */


public class SelftransferRqSelftransferGetlinkedaccounts   {
  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("mode")
  private String mode;

  public SelftransferRqSelftransferGetlinkedaccounts customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public SelftransferRqSelftransferGetlinkedaccounts mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @ApiModelProperty(value = "")


  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelftransferRqSelftransferGetlinkedaccounts selftransferRqSelftransferGetlinkedaccounts = (SelftransferRqSelftransferGetlinkedaccounts) o;
    return Objects.equals(this.customerId, selftransferRqSelftransferGetlinkedaccounts.customerId) &&
        Objects.equals(this.mode, selftransferRqSelftransferGetlinkedaccounts.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRqSelftransferGetlinkedaccounts {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

