package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RqSchedulepaymentPayeeBankReference
 */


public class RqSchedulepaymentPayeeBankReference   {
  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("branchName")
  private String branchName;

  @JsonProperty("branchLocation")
  private String branchLocation;

  @JsonProperty("ifscCode")
  private String ifscCode;

  @JsonProperty("bankId")
  private String bankId;

  @JsonProperty("branchId")
  private String branchId;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  public RqSchedulepaymentPayeeBankReference bankName(String bankName) {
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

  public RqSchedulepaymentPayeeBankReference branchName(String branchName) {
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

  public RqSchedulepaymentPayeeBankReference branchLocation(String branchLocation) {
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

  public RqSchedulepaymentPayeeBankReference ifscCode(String ifscCode) {
    this.ifscCode = ifscCode;
    return this;
  }

  /**
   * Get ifscCode
   * @return ifscCode
  */
  @ApiModelProperty(value = "")


  public String getIfscCode() {
    return ifscCode;
  }

  public void setIfscCode(String ifscCode) {
    this.ifscCode = ifscCode;
  }

  public RqSchedulepaymentPayeeBankReference bankId(String bankId) {
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

  public RqSchedulepaymentPayeeBankReference branchId(String branchId) {
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

  public RqSchedulepaymentPayeeBankReference amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public RqSchedulepaymentPayeeBankReference currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RqSchedulepaymentPayeeBankReference rqSchedulepaymentPayeeBankReference = (RqSchedulepaymentPayeeBankReference) o;
    return Objects.equals(this.bankName, rqSchedulepaymentPayeeBankReference.bankName) &&
        Objects.equals(this.branchName, rqSchedulepaymentPayeeBankReference.branchName) &&
        Objects.equals(this.branchLocation, rqSchedulepaymentPayeeBankReference.branchLocation) &&
        Objects.equals(this.ifscCode, rqSchedulepaymentPayeeBankReference.ifscCode) &&
        Objects.equals(this.bankId, rqSchedulepaymentPayeeBankReference.bankId) &&
        Objects.equals(this.branchId, rqSchedulepaymentPayeeBankReference.branchId) &&
        Objects.equals(this.amount, rqSchedulepaymentPayeeBankReference.amount) &&
        Objects.equals(this.currency, rqSchedulepaymentPayeeBankReference.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankName, branchName, branchLocation, ifscCode, bankId, branchId, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RqSchedulepaymentPayeeBankReference {\n");
    
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    branchLocation: ").append(toIndentedString(branchLocation)).append("\n");
    sb.append("    ifscCode: ").append(toIndentedString(ifscCode)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

