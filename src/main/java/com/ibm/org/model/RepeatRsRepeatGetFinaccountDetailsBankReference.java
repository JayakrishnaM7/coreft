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
 * RepeatRsRepeatGetFinaccountDetailsBankReference
 */


public class RepeatRsRepeatGetFinaccountDetailsBankReference   {
  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("branchName")
  private String branchName;

  @JsonProperty("branchLocation")
  private String branchLocation;

  @JsonProperty("AcctBal")
  private String acctBal;

  @JsonProperty("BalType")
  private String balType;

  @JsonProperty("BalAmt")
  private RsGetFinaccountDetailsBankReferenceBalAmt balAmt = null;

  public RepeatRsRepeatGetFinaccountDetailsBankReference bankName(String bankName) {
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

  public RepeatRsRepeatGetFinaccountDetailsBankReference branchName(String branchName) {
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

  public RepeatRsRepeatGetFinaccountDetailsBankReference branchLocation(String branchLocation) {
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

  public RepeatRsRepeatGetFinaccountDetailsBankReference acctBal(String acctBal) {
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

  public RepeatRsRepeatGetFinaccountDetailsBankReference balType(String balType) {
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

  public RepeatRsRepeatGetFinaccountDetailsBankReference balAmt(RsGetFinaccountDetailsBankReferenceBalAmt balAmt) {
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
    RepeatRsRepeatGetFinaccountDetailsBankReference repeatRsRepeatGetFinaccountDetailsBankReference = (RepeatRsRepeatGetFinaccountDetailsBankReference) o;
    return Objects.equals(this.bankName, repeatRsRepeatGetFinaccountDetailsBankReference.bankName) &&
        Objects.equals(this.branchName, repeatRsRepeatGetFinaccountDetailsBankReference.branchName) &&
        Objects.equals(this.branchLocation, repeatRsRepeatGetFinaccountDetailsBankReference.branchLocation) &&
        Objects.equals(this.acctBal, repeatRsRepeatGetFinaccountDetailsBankReference.acctBal) &&
        Objects.equals(this.balType, repeatRsRepeatGetFinaccountDetailsBankReference.balType) &&
        Objects.equals(this.balAmt, repeatRsRepeatGetFinaccountDetailsBankReference.balAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankName, branchName, branchLocation, acctBal, balType, balAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatRsRepeatGetFinaccountDetailsBankReference {\n");
    
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    branchLocation: ").append(toIndentedString(branchLocation)).append("\n");
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

