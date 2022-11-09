package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.QuicktransferRqQuicktransferFinTransferReq;
import com.ibm.org.model.QuicktransferRqQuicktransfergetAccountdetails;
import com.ibm.org.model.RepeatRqRepeatPaymentExecution;
import com.ibm.org.model.RqGetFinBensList;
import com.ibm.org.model.RqVerifyFinaccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuicktransferRq
 */


public class QuicktransferRq   {
  @JsonProperty("quicktransfergetAccountdetails")
  private QuicktransferRqQuicktransfergetAccountdetails quicktransfergetAccountdetails = null;

  @JsonProperty("quicktransfervalidatepan")
  private RqGetFinBensList quicktransfervalidatepan = null;

  @JsonProperty("quicktransfercheckbalance")
  private RqGetFinBensList quicktransfercheckbalance = null;

  @JsonProperty("quicktransferFinTransferReq")
  private QuicktransferRqQuicktransferFinTransferReq quicktransferFinTransferReq = null;

  @JsonProperty("quicktransferVerifyFinaccount")
  private RqVerifyFinaccount quicktransferVerifyFinaccount = null;

  @JsonProperty("quicktransferPaymentExecution")
  private RepeatRqRepeatPaymentExecution quicktransferPaymentExecution = null;

  public QuicktransferRq quicktransfergetAccountdetails(QuicktransferRqQuicktransfergetAccountdetails quicktransfergetAccountdetails) {
    this.quicktransfergetAccountdetails = quicktransfergetAccountdetails;
    return this;
  }

  /**
   * Get quicktransfergetAccountdetails
   * @return quicktransfergetAccountdetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuicktransferRqQuicktransfergetAccountdetails getQuicktransfergetAccountdetails() {
    return quicktransfergetAccountdetails;
  }

  public void setQuicktransfergetAccountdetails(QuicktransferRqQuicktransfergetAccountdetails quicktransfergetAccountdetails) {
    this.quicktransfergetAccountdetails = quicktransfergetAccountdetails;
  }

  public QuicktransferRq quicktransfervalidatepan(RqGetFinBensList quicktransfervalidatepan) {
    this.quicktransfervalidatepan = quicktransfervalidatepan;
    return this;
  }

  /**
   * Get quicktransfervalidatepan
   * @return quicktransfervalidatepan
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getQuicktransfervalidatepan() {
    return quicktransfervalidatepan;
  }

  public void setQuicktransfervalidatepan(RqGetFinBensList quicktransfervalidatepan) {
    this.quicktransfervalidatepan = quicktransfervalidatepan;
  }

  public QuicktransferRq quicktransfercheckbalance(RqGetFinBensList quicktransfercheckbalance) {
    this.quicktransfercheckbalance = quicktransfercheckbalance;
    return this;
  }

  /**
   * Get quicktransfercheckbalance
   * @return quicktransfercheckbalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getQuicktransfercheckbalance() {
    return quicktransfercheckbalance;
  }

  public void setQuicktransfercheckbalance(RqGetFinBensList quicktransfercheckbalance) {
    this.quicktransfercheckbalance = quicktransfercheckbalance;
  }

  public QuicktransferRq quicktransferFinTransferReq(QuicktransferRqQuicktransferFinTransferReq quicktransferFinTransferReq) {
    this.quicktransferFinTransferReq = quicktransferFinTransferReq;
    return this;
  }

  /**
   * Get quicktransferFinTransferReq
   * @return quicktransferFinTransferReq
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuicktransferRqQuicktransferFinTransferReq getQuicktransferFinTransferReq() {
    return quicktransferFinTransferReq;
  }

  public void setQuicktransferFinTransferReq(QuicktransferRqQuicktransferFinTransferReq quicktransferFinTransferReq) {
    this.quicktransferFinTransferReq = quicktransferFinTransferReq;
  }

  public QuicktransferRq quicktransferVerifyFinaccount(RqVerifyFinaccount quicktransferVerifyFinaccount) {
    this.quicktransferVerifyFinaccount = quicktransferVerifyFinaccount;
    return this;
  }

  /**
   * Get quicktransferVerifyFinaccount
   * @return quicktransferVerifyFinaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqVerifyFinaccount getQuicktransferVerifyFinaccount() {
    return quicktransferVerifyFinaccount;
  }

  public void setQuicktransferVerifyFinaccount(RqVerifyFinaccount quicktransferVerifyFinaccount) {
    this.quicktransferVerifyFinaccount = quicktransferVerifyFinaccount;
  }

  public QuicktransferRq quicktransferPaymentExecution(RepeatRqRepeatPaymentExecution quicktransferPaymentExecution) {
    this.quicktransferPaymentExecution = quicktransferPaymentExecution;
    return this;
  }

  /**
   * Get quicktransferPaymentExecution
   * @return quicktransferPaymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatPaymentExecution getQuicktransferPaymentExecution() {
    return quicktransferPaymentExecution;
  }

  public void setQuicktransferPaymentExecution(RepeatRqRepeatPaymentExecution quicktransferPaymentExecution) {
    this.quicktransferPaymentExecution = quicktransferPaymentExecution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuicktransferRq quicktransferRq = (QuicktransferRq) o;
    return Objects.equals(this.quicktransfergetAccountdetails, quicktransferRq.quicktransfergetAccountdetails) &&
        Objects.equals(this.quicktransfervalidatepan, quicktransferRq.quicktransfervalidatepan) &&
        Objects.equals(this.quicktransfercheckbalance, quicktransferRq.quicktransfercheckbalance) &&
        Objects.equals(this.quicktransferFinTransferReq, quicktransferRq.quicktransferFinTransferReq) &&
        Objects.equals(this.quicktransferVerifyFinaccount, quicktransferRq.quicktransferVerifyFinaccount) &&
        Objects.equals(this.quicktransferPaymentExecution, quicktransferRq.quicktransferPaymentExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quicktransfergetAccountdetails, quicktransfervalidatepan, quicktransfercheckbalance, quicktransferFinTransferReq, quicktransferVerifyFinaccount, quicktransferPaymentExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuicktransferRq {\n");
    
    sb.append("    quicktransfergetAccountdetails: ").append(toIndentedString(quicktransfergetAccountdetails)).append("\n");
    sb.append("    quicktransfervalidatepan: ").append(toIndentedString(quicktransfervalidatepan)).append("\n");
    sb.append("    quicktransfercheckbalance: ").append(toIndentedString(quicktransfercheckbalance)).append("\n");
    sb.append("    quicktransferFinTransferReq: ").append(toIndentedString(quicktransferFinTransferReq)).append("\n");
    sb.append("    quicktransferVerifyFinaccount: ").append(toIndentedString(quicktransferVerifyFinaccount)).append("\n");
    sb.append("    quicktransferPaymentExecution: ").append(toIndentedString(quicktransferPaymentExecution)).append("\n");
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

