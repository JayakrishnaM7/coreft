package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuicktransferRqQuicktransfergetAccountdetails
 */


public class QuicktransferRqQuicktransfergetAccountdetails   {
  @JsonProperty("AccountNumber")
  private String accountNumber;

  @JsonProperty("ifsccode")
  private String ifsccode;

  @JsonProperty("AccountType")
  private String accountType;

  @JsonProperty("AccountName")
  private String accountName;

  @JsonProperty("Nickname")
  private String nickname;

  public QuicktransferRqQuicktransfergetAccountdetails accountNumber(String accountNumber) {
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

  public QuicktransferRqQuicktransfergetAccountdetails ifsccode(String ifsccode) {
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

  public QuicktransferRqQuicktransfergetAccountdetails accountType(String accountType) {
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

  public QuicktransferRqQuicktransfergetAccountdetails accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
  */
  @ApiModelProperty(value = "")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public QuicktransferRqQuicktransfergetAccountdetails nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Get nickname
   * @return nickname
  */
  @ApiModelProperty(value = "")


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuicktransferRqQuicktransfergetAccountdetails quicktransferRqQuicktransfergetAccountdetails = (QuicktransferRqQuicktransfergetAccountdetails) o;
    return Objects.equals(this.accountNumber, quicktransferRqQuicktransfergetAccountdetails.accountNumber) &&
        Objects.equals(this.ifsccode, quicktransferRqQuicktransfergetAccountdetails.ifsccode) &&
        Objects.equals(this.accountType, quicktransferRqQuicktransfergetAccountdetails.accountType) &&
        Objects.equals(this.accountName, quicktransferRqQuicktransfergetAccountdetails.accountName) &&
        Objects.equals(this.nickname, quicktransferRqQuicktransfergetAccountdetails.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, ifsccode, accountType, accountName, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuicktransferRqQuicktransfergetAccountdetails {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    ifsccode: ").append(toIndentedString(ifsccode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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

