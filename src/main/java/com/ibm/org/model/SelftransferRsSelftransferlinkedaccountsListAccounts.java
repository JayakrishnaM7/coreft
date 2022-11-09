package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRsSelftransferlinkedaccountsListAccounts
 */


public class SelftransferRsSelftransferlinkedaccountsListAccounts   {
  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("bankDetails")
  private SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails bankDetails = null;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("accountHolderName")
  private String accountHolderName;

  @JsonProperty("availableBalance")
  private String availableBalance;

  @JsonProperty("modeOfOperation")
  private String modeOfOperation;

  public SelftransferRsSelftransferlinkedaccountsListAccounts accountType(String accountType) {
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

  public SelftransferRsSelftransferlinkedaccountsListAccounts bankDetails(SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails bankDetails) {
    this.bankDetails = bankDetails;
    return this;
  }

  /**
   * Get bankDetails
   * @return bankDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails getBankDetails() {
    return bankDetails;
  }

  public void setBankDetails(SelftransferRsSelftransferlinkedaccountsListAccountsBankDetails bankDetails) {
    this.bankDetails = bankDetails;
  }

  public SelftransferRsSelftransferlinkedaccountsListAccounts accountNumber(String accountNumber) {
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

  public SelftransferRsSelftransferlinkedaccountsListAccounts accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

  /**
   * Get accountHolderName
   * @return accountHolderName
  */
  @ApiModelProperty(value = "")


  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public SelftransferRsSelftransferlinkedaccountsListAccounts availableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
  */
  @ApiModelProperty(value = "")


  public String getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
  }

  public SelftransferRsSelftransferlinkedaccountsListAccounts modeOfOperation(String modeOfOperation) {
    this.modeOfOperation = modeOfOperation;
    return this;
  }

  /**
   * Get modeOfOperation
   * @return modeOfOperation
  */
  @ApiModelProperty(value = "")


  public String getModeOfOperation() {
    return modeOfOperation;
  }

  public void setModeOfOperation(String modeOfOperation) {
    this.modeOfOperation = modeOfOperation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelftransferRsSelftransferlinkedaccountsListAccounts selftransferRsSelftransferlinkedaccountsListAccounts = (SelftransferRsSelftransferlinkedaccountsListAccounts) o;
    return Objects.equals(this.accountType, selftransferRsSelftransferlinkedaccountsListAccounts.accountType) &&
        Objects.equals(this.bankDetails, selftransferRsSelftransferlinkedaccountsListAccounts.bankDetails) &&
        Objects.equals(this.accountNumber, selftransferRsSelftransferlinkedaccountsListAccounts.accountNumber) &&
        Objects.equals(this.accountHolderName, selftransferRsSelftransferlinkedaccountsListAccounts.accountHolderName) &&
        Objects.equals(this.availableBalance, selftransferRsSelftransferlinkedaccountsListAccounts.availableBalance) &&
        Objects.equals(this.modeOfOperation, selftransferRsSelftransferlinkedaccountsListAccounts.modeOfOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, bankDetails, accountNumber, accountHolderName, availableBalance, modeOfOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRsSelftransferlinkedaccountsListAccounts {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankDetails: ").append(toIndentedString(bankDetails)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    modeOfOperation: ").append(toIndentedString(modeOfOperation)).append("\n");
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

