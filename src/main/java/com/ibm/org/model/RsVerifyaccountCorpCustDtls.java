package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsVerifyaccountCorpCustDtls
 */


public class RsVerifyaccountCorpCustDtls   {
  @JsonProperty("BusinessGroup")
  private String businessGroup;

  @JsonProperty("BusinessType")
  private String businessType;

  @JsonProperty("ChargeLevelCode")
  private String chargeLevelCode;

  public RsVerifyaccountCorpCustDtls businessGroup(String businessGroup) {
    this.businessGroup = businessGroup;
    return this;
  }

  /**
   * Get businessGroup
   * @return businessGroup
  */
  @ApiModelProperty(value = "")


  public String getBusinessGroup() {
    return businessGroup;
  }

  public void setBusinessGroup(String businessGroup) {
    this.businessGroup = businessGroup;
  }

  public RsVerifyaccountCorpCustDtls businessType(String businessType) {
    this.businessType = businessType;
    return this;
  }

  /**
   * Get businessType
   * @return businessType
  */
  @ApiModelProperty(value = "")


  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  public RsVerifyaccountCorpCustDtls chargeLevelCode(String chargeLevelCode) {
    this.chargeLevelCode = chargeLevelCode;
    return this;
  }

  /**
   * Get chargeLevelCode
   * @return chargeLevelCode
  */
  @ApiModelProperty(value = "")


  public String getChargeLevelCode() {
    return chargeLevelCode;
  }

  public void setChargeLevelCode(String chargeLevelCode) {
    this.chargeLevelCode = chargeLevelCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsVerifyaccountCorpCustDtls rsVerifyaccountCorpCustDtls = (RsVerifyaccountCorpCustDtls) o;
    return Objects.equals(this.businessGroup, rsVerifyaccountCorpCustDtls.businessGroup) &&
        Objects.equals(this.businessType, rsVerifyaccountCorpCustDtls.businessType) &&
        Objects.equals(this.chargeLevelCode, rsVerifyaccountCorpCustDtls.chargeLevelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessGroup, businessType, chargeLevelCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsVerifyaccountCorpCustDtls {\n");
    
    sb.append("    businessGroup: ").append(toIndentedString(businessGroup)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    chargeLevelCode: ").append(toIndentedString(chargeLevelCode)).append("\n");
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

