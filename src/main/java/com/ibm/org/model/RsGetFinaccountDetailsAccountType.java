package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsGetFinaccountDetailsAccountType
 */


public class RsGetFinaccountDetailsAccountType   {
  @JsonProperty("SchmCode")
  private String schmCode;

  @JsonProperty("Schm Type")
  private String schmType;

  public RsGetFinaccountDetailsAccountType schmCode(String schmCode) {
    this.schmCode = schmCode;
    return this;
  }

  /**
   * Get schmCode
   * @return schmCode
  */
  @ApiModelProperty(value = "")


  public String getSchmCode() {
    return schmCode;
  }

  public void setSchmCode(String schmCode) {
    this.schmCode = schmCode;
  }

  public RsGetFinaccountDetailsAccountType schmType(String schmType) {
    this.schmType = schmType;
    return this;
  }

  /**
   * Get schmType
   * @return schmType
  */
  @ApiModelProperty(value = "")


  public String getSchmType() {
    return schmType;
  }

  public void setSchmType(String schmType) {
    this.schmType = schmType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsGetFinaccountDetailsAccountType rsGetFinaccountDetailsAccountType = (RsGetFinaccountDetailsAccountType) o;
    return Objects.equals(this.schmCode, rsGetFinaccountDetailsAccountType.schmCode) &&
        Objects.equals(this.schmType, rsGetFinaccountDetailsAccountType.schmType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schmCode, schmType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsGetFinaccountDetailsAccountType {\n");
    
    sb.append("    schmCode: ").append(toIndentedString(schmCode)).append("\n");
    sb.append("    schmType: ").append(toIndentedString(schmType)).append("\n");
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

