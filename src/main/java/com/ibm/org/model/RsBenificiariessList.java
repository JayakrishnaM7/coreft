package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsBenificiariessList
 */


public class RsBenificiariessList   {
  @JsonProperty("beneficiaryId")
  private String beneficiaryId;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("name")
  private String name;

  @JsonProperty("bank")
  private String bank;

  @JsonProperty("branch")
  private String branch;

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("status")
  private String status;

  @JsonProperty("ifscCode")
  private String ifscCode;

  @JsonProperty("bankId")
  private String bankId;

  @JsonProperty("branchId")
  private String branchId;

  @JsonProperty("limit")
  private String limit;

  @JsonProperty("favourite")
  private String favourite;

  @JsonProperty("confirmationCode")
  private String confirmationCode;

  @JsonProperty("upiId")
  private String upiId;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("transferType")
  private String transferType;

  @JsonProperty("upiNumber")
  private String upiNumber;

  public RsBenificiariessList beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * Get beneficiaryId
   * @return beneficiaryId
  */
  @ApiModelProperty(value = "")


  public String getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  public RsBenificiariessList accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public RsBenificiariessList name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RsBenificiariessList bank(String bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Get bank
   * @return bank
  */
  @ApiModelProperty(value = "")


  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public RsBenificiariessList branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  */
  @ApiModelProperty(value = "")


  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public RsBenificiariessList accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public RsBenificiariessList status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RsBenificiariessList ifscCode(String ifscCode) {
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

  public RsBenificiariessList bankId(String bankId) {
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

  public RsBenificiariessList branchId(String branchId) {
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

  public RsBenificiariessList limit(String limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  @ApiModelProperty(value = "")


  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }

  public RsBenificiariessList favourite(String favourite) {
    this.favourite = favourite;
    return this;
  }

  /**
   * Get favourite
   * @return favourite
  */
  @ApiModelProperty(value = "")


  public String getFavourite() {
    return favourite;
  }

  public void setFavourite(String favourite) {
    this.favourite = favourite;
  }

  public RsBenificiariessList confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }

  /**
   * Get confirmationCode
   * @return confirmationCode
  */
  @ApiModelProperty(value = "")


  public String getConfirmationCode() {
    return confirmationCode;
  }

  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }

  public RsBenificiariessList upiId(String upiId) {
    this.upiId = upiId;
    return this;
  }

  /**
   * Get upiId
   * @return upiId
  */
  @ApiModelProperty(value = "")


  public String getUpiId() {
    return upiId;
  }

  public void setUpiId(String upiId) {
    this.upiId = upiId;
  }

  public RsBenificiariessList phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public RsBenificiariessList currency(String currency) {
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

  public RsBenificiariessList customerId(String customerId) {
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

  public RsBenificiariessList transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

  /**
   * Get transferType
   * @return transferType
  */
  @ApiModelProperty(value = "")


  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public RsBenificiariessList upiNumber(String upiNumber) {
    this.upiNumber = upiNumber;
    return this;
  }

  /**
   * Get upiNumber
   * @return upiNumber
  */
  @ApiModelProperty(value = "")


  public String getUpiNumber() {
    return upiNumber;
  }

  public void setUpiNumber(String upiNumber) {
    this.upiNumber = upiNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsBenificiariessList rsBenificiariessList = (RsBenificiariessList) o;
    return Objects.equals(this.beneficiaryId, rsBenificiariessList.beneficiaryId) &&
        Objects.equals(this.accountNumber, rsBenificiariessList.accountNumber) &&
        Objects.equals(this.name, rsBenificiariessList.name) &&
        Objects.equals(this.bank, rsBenificiariessList.bank) &&
        Objects.equals(this.branch, rsBenificiariessList.branch) &&
        Objects.equals(this.accountType, rsBenificiariessList.accountType) &&
        Objects.equals(this.status, rsBenificiariessList.status) &&
        Objects.equals(this.ifscCode, rsBenificiariessList.ifscCode) &&
        Objects.equals(this.bankId, rsBenificiariessList.bankId) &&
        Objects.equals(this.branchId, rsBenificiariessList.branchId) &&
        Objects.equals(this.limit, rsBenificiariessList.limit) &&
        Objects.equals(this.favourite, rsBenificiariessList.favourite) &&
        Objects.equals(this.confirmationCode, rsBenificiariessList.confirmationCode) &&
        Objects.equals(this.upiId, rsBenificiariessList.upiId) &&
        Objects.equals(this.phoneNumber, rsBenificiariessList.phoneNumber) &&
        Objects.equals(this.currency, rsBenificiariessList.currency) &&
        Objects.equals(this.customerId, rsBenificiariessList.customerId) &&
        Objects.equals(this.transferType, rsBenificiariessList.transferType) &&
        Objects.equals(this.upiNumber, rsBenificiariessList.upiNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryId, accountNumber, name, bank, branch, accountType, status, ifscCode, bankId, branchId, limit, favourite, confirmationCode, upiId, phoneNumber, currency, customerId, transferType, upiNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsBenificiariessList {\n");
    
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ifscCode: ").append(toIndentedString(ifscCode)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
    sb.append("    upiId: ").append(toIndentedString(upiId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    upiNumber: ").append(toIndentedString(upiNumber)).append("\n");
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

