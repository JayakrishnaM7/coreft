package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RqFinTransferReq;
import com.ibm.org.model.RqGetFinBensList;
import com.ibm.org.model.RqPaymentExecution;
import com.ibm.org.model.RqSchedulepayment;
import com.ibm.org.model.RqVerifyFinaccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rq
 */


public class Rq   {
  @JsonProperty("GetFinBensList")
  private RqGetFinBensList getFinBensList = null;

  @JsonProperty("validatepan")
  private RqGetFinBensList validatepan = null;

  @JsonProperty("checkbalance")
  private RqGetFinBensList checkbalance = null;

  @JsonProperty("FinTransferReq")
  private RqFinTransferReq finTransferReq = null;

  @JsonProperty("GetFinaccountDetails")
  private RqGetFinBensList getFinaccountDetails = null;

  @JsonProperty("VerifyFinaccount")
  private RqVerifyFinaccount verifyFinaccount = null;

  @JsonProperty("PaymentExecution")
  private RqPaymentExecution paymentExecution = null;

  @JsonProperty("schedulepayment")
  private RqSchedulepayment schedulepayment = null;

  public Rq getFinBensList(RqGetFinBensList getFinBensList) {
    this.getFinBensList = getFinBensList;
    return this;
  }

  /**
   * Get getFinBensList
   * @return getFinBensList
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getGetFinBensList() {
    return getFinBensList;
  }

  public void setGetFinBensList(RqGetFinBensList getFinBensList) {
    this.getFinBensList = getFinBensList;
  }

  public Rq validatepan(RqGetFinBensList validatepan) {
    this.validatepan = validatepan;
    return this;
  }

  /**
   * Get validatepan
   * @return validatepan
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getValidatepan() {
    return validatepan;
  }

  public void setValidatepan(RqGetFinBensList validatepan) {
    this.validatepan = validatepan;
  }

  public Rq checkbalance(RqGetFinBensList checkbalance) {
    this.checkbalance = checkbalance;
    return this;
  }

  /**
   * Get checkbalance
   * @return checkbalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getCheckbalance() {
    return checkbalance;
  }

  public void setCheckbalance(RqGetFinBensList checkbalance) {
    this.checkbalance = checkbalance;
  }

  public Rq finTransferReq(RqFinTransferReq finTransferReq) {
    this.finTransferReq = finTransferReq;
    return this;
  }

  /**
   * Get finTransferReq
   * @return finTransferReq
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqFinTransferReq getFinTransferReq() {
    return finTransferReq;
  }

  public void setFinTransferReq(RqFinTransferReq finTransferReq) {
    this.finTransferReq = finTransferReq;
  }

  public Rq getFinaccountDetails(RqGetFinBensList getFinaccountDetails) {
    this.getFinaccountDetails = getFinaccountDetails;
    return this;
  }

  /**
   * Get getFinaccountDetails
   * @return getFinaccountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getGetFinaccountDetails() {
    return getFinaccountDetails;
  }

  public void setGetFinaccountDetails(RqGetFinBensList getFinaccountDetails) {
    this.getFinaccountDetails = getFinaccountDetails;
  }

  public Rq verifyFinaccount(RqVerifyFinaccount verifyFinaccount) {
    this.verifyFinaccount = verifyFinaccount;
    return this;
  }

  /**
   * Get verifyFinaccount
   * @return verifyFinaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqVerifyFinaccount getVerifyFinaccount() {
    return verifyFinaccount;
  }

  public void setVerifyFinaccount(RqVerifyFinaccount verifyFinaccount) {
    this.verifyFinaccount = verifyFinaccount;
  }

  public Rq paymentExecution(RqPaymentExecution paymentExecution) {
    this.paymentExecution = paymentExecution;
    return this;
  }

  /**
   * Get paymentExecution
   * @return paymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqPaymentExecution getPaymentExecution() {
    return paymentExecution;
  }

  public void setPaymentExecution(RqPaymentExecution paymentExecution) {
    this.paymentExecution = paymentExecution;
  }

  public Rq schedulepayment(RqSchedulepayment schedulepayment) {
    this.schedulepayment = schedulepayment;
    return this;
  }

  /**
   * Get schedulepayment
   * @return schedulepayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqSchedulepayment getSchedulepayment() {
    return schedulepayment;
  }

  public void setSchedulepayment(RqSchedulepayment schedulepayment) {
    this.schedulepayment = schedulepayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rq rq = (Rq) o;
    return Objects.equals(this.getFinBensList, rq.getFinBensList) &&
        Objects.equals(this.validatepan, rq.validatepan) &&
        Objects.equals(this.checkbalance, rq.checkbalance) &&
        Objects.equals(this.finTransferReq, rq.finTransferReq) &&
        Objects.equals(this.getFinaccountDetails, rq.getFinaccountDetails) &&
        Objects.equals(this.verifyFinaccount, rq.verifyFinaccount) &&
        Objects.equals(this.paymentExecution, rq.paymentExecution) &&
        Objects.equals(this.schedulepayment, rq.schedulepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFinBensList, validatepan, checkbalance, finTransferReq, getFinaccountDetails, verifyFinaccount, paymentExecution, schedulepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rq {\n");
    
    sb.append("    getFinBensList: ").append(toIndentedString(getFinBensList)).append("\n");
    sb.append("    validatepan: ").append(toIndentedString(validatepan)).append("\n");
    sb.append("    checkbalance: ").append(toIndentedString(checkbalance)).append("\n");
    sb.append("    finTransferReq: ").append(toIndentedString(finTransferReq)).append("\n");
    sb.append("    getFinaccountDetails: ").append(toIndentedString(getFinaccountDetails)).append("\n");
    sb.append("    verifyFinaccount: ").append(toIndentedString(verifyFinaccount)).append("\n");
    sb.append("    paymentExecution: ").append(toIndentedString(paymentExecution)).append("\n");
    sb.append("    schedulepayment: ").append(toIndentedString(schedulepayment)).append("\n");
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

