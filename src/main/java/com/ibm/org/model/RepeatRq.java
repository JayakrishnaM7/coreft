package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RepeatRqRepeatFinTransferReq;
import com.ibm.org.model.RepeatRqRepeatPaymentExecution;
import com.ibm.org.model.RepeatRqRepeatschedulepayment;
import com.ibm.org.model.RepeatRqRepeattransactionList;
import com.ibm.org.model.RqGetFinBensList;
import com.ibm.org.model.RqVerifyFinaccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepeatRq
 */


public class RepeatRq   {
  @JsonProperty("repeattransactionList")
  private RepeatRqRepeattransactionList repeattransactionList = null;

  @JsonProperty("repeatvalidatepan")
  private RqGetFinBensList repeatvalidatepan = null;

  @JsonProperty("repeatcheckbalance")
  private RqGetFinBensList repeatcheckbalance = null;

  @JsonProperty("repeatFinTransferReq")
  private RepeatRqRepeatFinTransferReq repeatFinTransferReq = null;

  @JsonProperty("repeatGetFinaccountDetails")
  private RqGetFinBensList repeatGetFinaccountDetails = null;

  @JsonProperty("repeatVerifyFinaccount")
  private RqVerifyFinaccount repeatVerifyFinaccount = null;

  @JsonProperty("repeatPaymentExecution")
  private RepeatRqRepeatPaymentExecution repeatPaymentExecution = null;

  @JsonProperty("repeatschedulepayment")
  private RepeatRqRepeatschedulepayment repeatschedulepayment = null;

  public RepeatRq repeattransactionList(RepeatRqRepeattransactionList repeattransactionList) {
    this.repeattransactionList = repeattransactionList;
    return this;
  }

  /**
   * Get repeattransactionList
   * @return repeattransactionList
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeattransactionList getRepeattransactionList() {
    return repeattransactionList;
  }

  public void setRepeattransactionList(RepeatRqRepeattransactionList repeattransactionList) {
    this.repeattransactionList = repeattransactionList;
  }

  public RepeatRq repeatvalidatepan(RqGetFinBensList repeatvalidatepan) {
    this.repeatvalidatepan = repeatvalidatepan;
    return this;
  }

  /**
   * Get repeatvalidatepan
   * @return repeatvalidatepan
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getRepeatvalidatepan() {
    return repeatvalidatepan;
  }

  public void setRepeatvalidatepan(RqGetFinBensList repeatvalidatepan) {
    this.repeatvalidatepan = repeatvalidatepan;
  }

  public RepeatRq repeatcheckbalance(RqGetFinBensList repeatcheckbalance) {
    this.repeatcheckbalance = repeatcheckbalance;
    return this;
  }

  /**
   * Get repeatcheckbalance
   * @return repeatcheckbalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getRepeatcheckbalance() {
    return repeatcheckbalance;
  }

  public void setRepeatcheckbalance(RqGetFinBensList repeatcheckbalance) {
    this.repeatcheckbalance = repeatcheckbalance;
  }

  public RepeatRq repeatFinTransferReq(RepeatRqRepeatFinTransferReq repeatFinTransferReq) {
    this.repeatFinTransferReq = repeatFinTransferReq;
    return this;
  }

  /**
   * Get repeatFinTransferReq
   * @return repeatFinTransferReq
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatFinTransferReq getRepeatFinTransferReq() {
    return repeatFinTransferReq;
  }

  public void setRepeatFinTransferReq(RepeatRqRepeatFinTransferReq repeatFinTransferReq) {
    this.repeatFinTransferReq = repeatFinTransferReq;
  }

  public RepeatRq repeatGetFinaccountDetails(RqGetFinBensList repeatGetFinaccountDetails) {
    this.repeatGetFinaccountDetails = repeatGetFinaccountDetails;
    return this;
  }

  /**
   * Get repeatGetFinaccountDetails
   * @return repeatGetFinaccountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getRepeatGetFinaccountDetails() {
    return repeatGetFinaccountDetails;
  }

  public void setRepeatGetFinaccountDetails(RqGetFinBensList repeatGetFinaccountDetails) {
    this.repeatGetFinaccountDetails = repeatGetFinaccountDetails;
  }

  public RepeatRq repeatVerifyFinaccount(RqVerifyFinaccount repeatVerifyFinaccount) {
    this.repeatVerifyFinaccount = repeatVerifyFinaccount;
    return this;
  }

  /**
   * Get repeatVerifyFinaccount
   * @return repeatVerifyFinaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqVerifyFinaccount getRepeatVerifyFinaccount() {
    return repeatVerifyFinaccount;
  }

  public void setRepeatVerifyFinaccount(RqVerifyFinaccount repeatVerifyFinaccount) {
    this.repeatVerifyFinaccount = repeatVerifyFinaccount;
  }

  public RepeatRq repeatPaymentExecution(RepeatRqRepeatPaymentExecution repeatPaymentExecution) {
    this.repeatPaymentExecution = repeatPaymentExecution;
    return this;
  }

  /**
   * Get repeatPaymentExecution
   * @return repeatPaymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatPaymentExecution getRepeatPaymentExecution() {
    return repeatPaymentExecution;
  }

  public void setRepeatPaymentExecution(RepeatRqRepeatPaymentExecution repeatPaymentExecution) {
    this.repeatPaymentExecution = repeatPaymentExecution;
  }

  public RepeatRq repeatschedulepayment(RepeatRqRepeatschedulepayment repeatschedulepayment) {
    this.repeatschedulepayment = repeatschedulepayment;
    return this;
  }

  /**
   * Get repeatschedulepayment
   * @return repeatschedulepayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatschedulepayment getRepeatschedulepayment() {
    return repeatschedulepayment;
  }

  public void setRepeatschedulepayment(RepeatRqRepeatschedulepayment repeatschedulepayment) {
    this.repeatschedulepayment = repeatschedulepayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatRq repeatRq = (RepeatRq) o;
    return Objects.equals(this.repeattransactionList, repeatRq.repeattransactionList) &&
        Objects.equals(this.repeatvalidatepan, repeatRq.repeatvalidatepan) &&
        Objects.equals(this.repeatcheckbalance, repeatRq.repeatcheckbalance) &&
        Objects.equals(this.repeatFinTransferReq, repeatRq.repeatFinTransferReq) &&
        Objects.equals(this.repeatGetFinaccountDetails, repeatRq.repeatGetFinaccountDetails) &&
        Objects.equals(this.repeatVerifyFinaccount, repeatRq.repeatVerifyFinaccount) &&
        Objects.equals(this.repeatPaymentExecution, repeatRq.repeatPaymentExecution) &&
        Objects.equals(this.repeatschedulepayment, repeatRq.repeatschedulepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repeattransactionList, repeatvalidatepan, repeatcheckbalance, repeatFinTransferReq, repeatGetFinaccountDetails, repeatVerifyFinaccount, repeatPaymentExecution, repeatschedulepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatRq {\n");
    
    sb.append("    repeattransactionList: ").append(toIndentedString(repeattransactionList)).append("\n");
    sb.append("    repeatvalidatepan: ").append(toIndentedString(repeatvalidatepan)).append("\n");
    sb.append("    repeatcheckbalance: ").append(toIndentedString(repeatcheckbalance)).append("\n");
    sb.append("    repeatFinTransferReq: ").append(toIndentedString(repeatFinTransferReq)).append("\n");
    sb.append("    repeatGetFinaccountDetails: ").append(toIndentedString(repeatGetFinaccountDetails)).append("\n");
    sb.append("    repeatVerifyFinaccount: ").append(toIndentedString(repeatVerifyFinaccount)).append("\n");
    sb.append("    repeatPaymentExecution: ").append(toIndentedString(repeatPaymentExecution)).append("\n");
    sb.append("    repeatschedulepayment: ").append(toIndentedString(repeatschedulepayment)).append("\n");
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

