package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails
 */


public class SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails   {
  @JsonProperty("bankId")
  private String bankId;

  @JsonProperty("branchId")
  private String branchId;

  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("ifsccode")
  private String ifsccode;

  @JsonProperty("bankLogo")
  private String bankLogo;

  public SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Get bankId
   * @return bankId
  */
  @ApiModelProperty(value = "")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails branchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  /**
   * Get branchId
   * @return branchId
  */
  @ApiModelProperty(value = "")


  public String getBranchId() {
    return branchId;
  }

  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  public SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
  */
  @ApiModelProperty(value = "")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails ifsccode(String ifsccode) {
    this.ifsccode = ifsccode;
    return this;
  }

  /**
   * Get ifsccode
   * @return ifsccode
  */
  @ApiModelProperty(value = "")


  public String getIfsccode() {
    return ifsccode;
  }

  public void setIfsccode(String ifsccode) {
    this.ifsccode = ifsccode;
  }

  public SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails bankLogo(String bankLogo) {
    this.bankLogo = bankLogo;
    return this;
  }

  /**
   * Get bankLogo
   * @return bankLogo
  */
  @ApiModelProperty(value = "")


  public String getBankLogo() {
    return bankLogo;
  }

  public void setBankLogo(String bankLogo) {
    this.bankLogo = bankLogo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails selftransferRsSelftransferlinkedaccountsListAccountsBankDetails = (SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails) o;
    return Objects.equals(this.bankId, selftransferRsSelftransferlinkedaccountsListAccountsBankDetails.bankId) &&
        Objects.equals(this.branchId, selftransferRsSelftransferlinkedaccountsListAccountsBankDetails.branchId) &&
        Objects.equals(this.bankName, selftransferRsSelftransferlinkedaccountsListAccountsBankDetails.bankName) &&
        Objects.equals(this.ifsccode, selftransferRsSelftransferlinkedaccountsListAccountsBankDetails.ifsccode) &&
        Objects.equals(this.bankLogo, selftransferRsSelftransferlinkedaccountsListAccountsBankDetails.bankLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankId, branchId, bankName, ifsccode, bankLogo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails {\n");
    
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    ifsccode: ").append(toIndentedString(ifsccode)).append("\n");
    sb.append("    bankLogo: ").append(toIndentedString(bankLogo)).append("\n");
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

