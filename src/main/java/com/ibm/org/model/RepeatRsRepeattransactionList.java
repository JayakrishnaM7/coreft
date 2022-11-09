package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RepeatRsRepeattransactionListAvailableBalance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepeatRsRepeattransactionList
 */


public class RepeatRsRepeattransactionList   {
  @JsonProperty("acid")
  private String acid;

  @JsonProperty("branchId")
  private String branchId;

  @JsonProperty("availableBalance")
  private RepeatRsRepeattransactionListAvailableBalance availableBalance = null;

  @JsonProperty("floatingBalance")
  private RepeatRsRepeattransactionListAvailableBalance floatingBalance = null;

  @JsonProperty("ledgerBalance")
  private RepeatRsRepeattransactionListAvailableBalance ledgerBalance = null;

  @JsonProperty("userDefinedBalance")
  private RepeatRsRepeattransactionListAvailableBalance userDefinedBalance = null;

  @JsonProperty("pstdDate")
  private String pstdDate;

  @JsonProperty("instrumentId")
  private String instrumentId;

  @JsonProperty("txnAmt")
  private RepeatRsRepeattransactionListAvailableBalance txnAmt = null;

  @JsonProperty("txnDate")
  private String txnDate;

  @JsonProperty("txnType")
  private String txnType;

  @JsonProperty("txnDesc")
  private String txnDesc;

  @JsonProperty("txnBalance")
  private RepeatRsRepeattransactionListAvailableBalance txnBalance = null;

  @JsonProperty("txnCat")
  private String txnCat;

  @JsonProperty("txnId")
  private String txnId;

  @JsonProperty("txnSrlNo")
  private String txnSrlNo;

  @JsonProperty("valueDate")
  private String valueDate;

  public RepeatRsRepeattransactionList acid(String acid) {
    this.acid = acid;
    return this;
  }

  /**
   * Get acid
   * @return acid
  */
  @ApiModelProperty(value = "")


  public String getAcid() {
    return acid;
  }

  public void setAcid(String acid) {
    this.acid = acid;
  }

  public RepeatRsRepeattransactionList branchId(String branchId) {
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

  public RepeatRsRepeattransactionList availableBalance(RepeatRsRepeattransactionListAvailableBalance availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeattransactionListAvailableBalance getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(RepeatRsRepeattransactionListAvailableBalance availableBalance) {
    this.availableBalance = availableBalance;
  }

  public RepeatRsRepeattransactionList floatingBalance(RepeatRsRepeattransactionListAvailableBalance floatingBalance) {
    this.floatingBalance = floatingBalance;
    return this;
  }

  /**
   * Get floatingBalance
   * @return floatingBalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeattransactionListAvailableBalance getFloatingBalance() {
    return floatingBalance;
  }

  public void setFloatingBalance(RepeatRsRepeattransactionListAvailableBalance floatingBalance) {
    this.floatingBalance = floatingBalance;
  }

  public RepeatRsRepeattransactionList ledgerBalance(RepeatRsRepeattransactionListAvailableBalance ledgerBalance) {
    this.ledgerBalance = ledgerBalance;
    return this;
  }

  /**
   * Get ledgerBalance
   * @return ledgerBalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeattransactionListAvailableBalance getLedgerBalance() {
    return ledgerBalance;
  }

  public void setLedgerBalance(RepeatRsRepeattransactionListAvailableBalance ledgerBalance) {
    this.ledgerBalance = ledgerBalance;
  }

  public RepeatRsRepeattransactionList userDefinedBalance(RepeatRsRepeattransactionListAvailableBalance userDefinedBalance) {
    this.userDefinedBalance = userDefinedBalance;
    return this;
  }

  /**
   * Get userDefinedBalance
   * @return userDefinedBalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeattransactionListAvailableBalance getUserDefinedBalance() {
    return userDefinedBalance;
  }

  public void setUserDefinedBalance(RepeatRsRepeattransactionListAvailableBalance userDefinedBalance) {
    this.userDefinedBalance = userDefinedBalance;
  }

  public RepeatRsRepeattransactionList pstdDate(String pstdDate) {
    this.pstdDate = pstdDate;
    return this;
  }

  /**
   * Get pstdDate
   * @return pstdDate
  */
  @ApiModelProperty(value = "")


  public String getPstdDate() {
    return pstdDate;
  }

  public void setPstdDate(String pstdDate) {
    this.pstdDate = pstdDate;
  }

  public RepeatRsRepeattransactionList instrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
    return this;
  }

  /**
   * Get instrumentId
   * @return instrumentId
  */
  @ApiModelProperty(value = "")


  public String getInstrumentId() {
    return instrumentId;
  }

  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }

  public RepeatRsRepeattransactionList txnAmt(RepeatRsRepeattransactionListAvailableBalance txnAmt) {
    this.txnAmt = txnAmt;
    return this;
  }

  /**
   * Get txnAmt
   * @return txnAmt
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeattransactionListAvailableBalance getTxnAmt() {
    return txnAmt;
  }

  public void setTxnAmt(RepeatRsRepeattransactionListAvailableBalance txnAmt) {
    this.txnAmt = txnAmt;
  }

  public RepeatRsRepeattransactionList txnDate(String txnDate) {
    this.txnDate = txnDate;
    return this;
  }

  /**
   * Get txnDate
   * @return txnDate
  */
  @ApiModelProperty(value = "")


  public String getTxnDate() {
    return txnDate;
  }

  public void setTxnDate(String txnDate) {
    this.txnDate = txnDate;
  }

  public RepeatRsRepeattransactionList txnType(String txnType) {
    this.txnType = txnType;
    return this;
  }

  /**
   * Get txnType
   * @return txnType
  */
  @ApiModelProperty(value = "")


  public String getTxnType() {
    return txnType;
  }

  public void setTxnType(String txnType) {
    this.txnType = txnType;
  }

  public RepeatRsRepeattransactionList txnDesc(String txnDesc) {
    this.txnDesc = txnDesc;
    return this;
  }

  /**
   * Get txnDesc
   * @return txnDesc
  */
  @ApiModelProperty(value = "")


  public String getTxnDesc() {
    return txnDesc;
  }

  public void setTxnDesc(String txnDesc) {
    this.txnDesc = txnDesc;
  }

  public RepeatRsRepeattransactionList txnBalance(RepeatRsRepeattransactionListAvailableBalance txnBalance) {
    this.txnBalance = txnBalance;
    return this;
  }

  /**
   * Get txnBalance
   * @return txnBalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeattransactionListAvailableBalance getTxnBalance() {
    return txnBalance;
  }

  public void setTxnBalance(RepeatRsRepeattransactionListAvailableBalance txnBalance) {
    this.txnBalance = txnBalance;
  }

  public RepeatRsRepeattransactionList txnCat(String txnCat) {
    this.txnCat = txnCat;
    return this;
  }

  /**
   * Get txnCat
   * @return txnCat
  */
  @ApiModelProperty(value = "")


  public String getTxnCat() {
    return txnCat;
  }

  public void setTxnCat(String txnCat) {
    this.txnCat = txnCat;
  }

  public RepeatRsRepeattransactionList txnId(String txnId) {
    this.txnId = txnId;
    return this;
  }

  /**
   * Get txnId
   * @return txnId
  */
  @ApiModelProperty(value = "")


  public String getTxnId() {
    return txnId;
  }

  public void setTxnId(String txnId) {
    this.txnId = txnId;
  }

  public RepeatRsRepeattransactionList txnSrlNo(String txnSrlNo) {
    this.txnSrlNo = txnSrlNo;
    return this;
  }

  /**
   * Get txnSrlNo
   * @return txnSrlNo
  */
  @ApiModelProperty(value = "")


  public String getTxnSrlNo() {
    return txnSrlNo;
  }

  public void setTxnSrlNo(String txnSrlNo) {
    this.txnSrlNo = txnSrlNo;
  }

  public RepeatRsRepeattransactionList valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * Get valueDate
   * @return valueDate
  */
  @ApiModelProperty(value = "")


  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatRsRepeattransactionList repeatRsRepeattransactionList = (RepeatRsRepeattransactionList) o;
    return Objects.equals(this.acid, repeatRsRepeattransactionList.acid) &&
        Objects.equals(this.branchId, repeatRsRepeattransactionList.branchId) &&
        Objects.equals(this.availableBalance, repeatRsRepeattransactionList.availableBalance) &&
        Objects.equals(this.floatingBalance, repeatRsRepeattransactionList.floatingBalance) &&
        Objects.equals(this.ledgerBalance, repeatRsRepeattransactionList.ledgerBalance) &&
        Objects.equals(this.userDefinedBalance, repeatRsRepeattransactionList.userDefinedBalance) &&
        Objects.equals(this.pstdDate, repeatRsRepeattransactionList.pstdDate) &&
        Objects.equals(this.instrumentId, repeatRsRepeattransactionList.instrumentId) &&
        Objects.equals(this.txnAmt, repeatRsRepeattransactionList.txnAmt) &&
        Objects.equals(this.txnDate, repeatRsRepeattransactionList.txnDate) &&
        Objects.equals(this.txnType, repeatRsRepeattransactionList.txnType) &&
        Objects.equals(this.txnDesc, repeatRsRepeattransactionList.txnDesc) &&
        Objects.equals(this.txnBalance, repeatRsRepeattransactionList.txnBalance) &&
        Objects.equals(this.txnCat, repeatRsRepeattransactionList.txnCat) &&
        Objects.equals(this.txnId, repeatRsRepeattransactionList.txnId) &&
        Objects.equals(this.txnSrlNo, repeatRsRepeattransactionList.txnSrlNo) &&
        Objects.equals(this.valueDate, repeatRsRepeattransactionList.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acid, branchId, availableBalance, floatingBalance, ledgerBalance, userDefinedBalance, pstdDate, instrumentId, txnAmt, txnDate, txnType, txnDesc, txnBalance, txnCat, txnId, txnSrlNo, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatRsRepeattransactionList {\n");
    
    sb.append("    acid: ").append(toIndentedString(acid)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    floatingBalance: ").append(toIndentedString(floatingBalance)).append("\n");
    sb.append("    ledgerBalance: ").append(toIndentedString(ledgerBalance)).append("\n");
    sb.append("    userDefinedBalance: ").append(toIndentedString(userDefinedBalance)).append("\n");
    sb.append("    pstdDate: ").append(toIndentedString(pstdDate)).append("\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    txnAmt: ").append(toIndentedString(txnAmt)).append("\n");
    sb.append("    txnDate: ").append(toIndentedString(txnDate)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    txnDesc: ").append(toIndentedString(txnDesc)).append("\n");
    sb.append("    txnBalance: ").append(toIndentedString(txnBalance)).append("\n");
    sb.append("    txnCat: ").append(toIndentedString(txnCat)).append("\n");
    sb.append("    txnId: ").append(toIndentedString(txnId)).append("\n");
    sb.append("    txnSrlNo: ").append(toIndentedString(txnSrlNo)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

