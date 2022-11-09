package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RsGetFinaccountDetailsBankReferenceBalAmt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsGetFinaccountDetailsBankReference
 */


public class RsGetFinaccountDetailsBankReference   {
  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("branchName")
  private String branchName;

  @JsonProperty("branchLocation")
  private String branchLocation;

  @JsonProperty("bankId")
  private String bankId;

  @JsonProperty("branchId")
  private String branchId;

  @JsonProperty("AcctBal")
  private String acctBal;

  @JsonProperty("BalType")
  private String balType;

  @JsonProperty("BalAmt")
  private RsGetFinaccountDetailsBankReferenceBalAmt balAmt = null;

  public RsGetFinaccountDetailsBankReference bankName(String bankName) {
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

  public RsGetFinaccountDetailsBankReference branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Get branchName
   * @return branchName
  */
  @ApiModelProperty(value = "")


  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public RsGetFinaccountDetailsBankReference branchLocation(String branchLocation) {
    this.branchLocation = branchLocation;
    return this;
  }

  /**
   * Get branchLocation
   * @return branchLocation
  */
  @ApiModelProperty(value = "")


  public String getBranchLocation() {
    return branchLocation;
  }

  public void setBranchLocation(String branchLocation) {
    this.branchLocation = branchLocation;
  }

  public RsGetFinaccountDetailsBankReference bankId(String bankId) {
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

  public RsGetFinaccountDetailsBankReference branchId(String branchId) {
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

  public RsGetFinaccountDetailsBankReference acctBal(String acctBal) {
    this.acctBal = acctBal;
    return this;
  }

  /**
   * Get acctBal
   * @return acctBal
  */
  @ApiModelProperty(value = "")


  public String getAcctBal() {
    return acctBal;
  }

  public void setAcctBal(String acctBal) {
    this.acctBal = acctBal;
  }

  public RsGetFinaccountDetailsBankReference balType(String balType) {
    this.balType = balType;
    return this;
  }

  /**
   * Get balType
   * @return balType
  */
  @ApiModelProperty(value = "")


  public String getBalType() {
    return balType;
  }

  public void setBalType(String balType) {
    this.balType = balType;
  }

  public RsGetFinaccountDetailsBankReference balAmt(RsGetFinaccountDetailsBankReferenceBalAmt balAmt) {
    this.balAmt = balAmt;
    return this;
  }

  /**
   * Get balAmt
   * @return balAmt
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsGetFinaccountDetailsBankReferenceBalAmt getBalAmt() {
    return balAmt;
  }

  public void setBalAmt(RsGetFinaccountDetailsBankReferenceBalAmt balAmt) {
    this.balAmt = balAmt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsGetFinaccountDetailsBankReference rsGetFinaccountDetailsBankReference = (RsGetFinaccountDetailsBankReference) o;
    return Objects.equals(this.bankName, rsGetFinaccountDetailsBankReference.bankName) &&
        Objects.equals(this.branchName, rsGetFinaccountDetailsBankReference.branchName) &&
        Objects.equals(this.branchLocation, rsGetFinaccountDetailsBankReference.branchLocation) &&
        Objects.equals(this.bankId, rsGetFinaccountDetailsBankReference.bankId) &&
        Objects.equals(this.branchId, rsGetFinaccountDetailsBankReference.branchId) &&
        Objects.equals(this.acctBal, rsGetFinaccountDetailsBankReference.acctBal) &&
        Objects.equals(this.balType, rsGetFinaccountDetailsBankReference.balType) &&
        Objects.equals(this.balAmt, rsGetFinaccountDetailsBankReference.balAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankName, branchName, branchLocation, bankId, branchId, acctBal, balType, balAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsGetFinaccountDetailsBankReference {\n");
    
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    branchLocation: ").append(toIndentedString(branchLocation)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    acctBal: ").append(toIndentedString(acctBal)).append("\n");
    sb.append("    balType: ").append(toIndentedString(balType)).append("\n");
    sb.append("    balAmt: ").append(toIndentedString(balAmt)).append("\n");
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

