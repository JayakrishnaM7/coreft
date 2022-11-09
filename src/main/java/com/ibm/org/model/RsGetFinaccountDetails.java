package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RsGetFinaccountDetailsAccountType;
import com.ibm.org.model.RsGetFinaccountDetailsBankReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsGetFinaccountDetails
 */


public class RsGetFinaccountDetails   {
  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("accountType")
  private RsGetFinaccountDetailsAccountType accountType = null;

  @JsonProperty("BankReference")
  private RsGetFinaccountDetailsBankReference bankReference = null;

  public RsGetFinaccountDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @ApiModelProperty(value = "")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public RsGetFinaccountDetails accountType(RsGetFinaccountDetailsAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsGetFinaccountDetailsAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(RsGetFinaccountDetailsAccountType accountType) {
    this.accountType = accountType;
  }

  public RsGetFinaccountDetails bankReference(RsGetFinaccountDetailsBankReference bankReference) {
    this.bankReference = bankReference;
    return this;
  }

  /**
   * Get bankReference
   * @return bankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsGetFinaccountDetailsBankReference getBankReference() {
    return bankReference;
  }

  public void setBankReference(RsGetFinaccountDetailsBankReference bankReference) {
    this.bankReference = bankReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsGetFinaccountDetails rsGetFinaccountDetails = (RsGetFinaccountDetails) o;
    return Objects.equals(this.accountId, rsGetFinaccountDetails.accountId) &&
        Objects.equals(this.accountType, rsGetFinaccountDetails.accountType) &&
        Objects.equals(this.bankReference, rsGetFinaccountDetails.bankReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, bankReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsGetFinaccountDetails {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankReference: ").append(toIndentedString(bankReference)).append("\n");
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

