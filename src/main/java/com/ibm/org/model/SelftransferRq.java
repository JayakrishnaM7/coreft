package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RqFinTransferReq;
import com.ibm.org.model.RqGetFinBensList;
import com.ibm.org.model.RqVerifyFinaccount;
import com.ibm.org.model.SelftransferRqSelftransferGetlinkedaccounts;
import com.ibm.org.model.SelftransferRqSelftransferPaymentExecution;
import com.ibm.org.model.SelftransferRqSelftransferschedulepayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRq
 */


public class SelftransferRq   {
  @JsonProperty("selftransferGetlinkedaccounts")
  private SelftransferRqSelftransferGetlinkedaccounts selftransferGetlinkedaccounts = null;

  @JsonProperty("selftransferGetFinBensList")
  private RqGetFinBensList selftransferGetFinBensList = null;

  @JsonProperty("selftransfervalidatepan")
  private RqGetFinBensList selftransfervalidatepan = null;

  @JsonProperty("selftransfercheckbalance")
  private RqGetFinBensList selftransfercheckbalance = null;

  @JsonProperty("selftransferFinTransferReq")
  private RqFinTransferReq selftransferFinTransferReq = null;

  @JsonProperty("selftransferGetFinaccountDetails")
  private RqGetFinBensList selftransferGetFinaccountDetails = null;

  @JsonProperty("selftransferVerifyFinaccount")
  private RqVerifyFinaccount selftransferVerifyFinaccount = null;

  @JsonProperty("selftransferPaymentExecution")
  private SelftransferRqSelftransferPaymentExecution selftransferPaymentExecution = null;

  @JsonProperty("selftransferschedulepayment")
  private SelftransferRqSelftransferschedulepayment selftransferschedulepayment = null;

  public SelftransferRq selftransferGetlinkedaccounts(SelftransferRqSelftransferGetlinkedaccounts selftransferGetlinkedaccounts) {
    this.selftransferGetlinkedaccounts = selftransferGetlinkedaccounts;
    return this;
  }

  /**
   * Get selftransferGetlinkedaccounts
   * @return selftransferGetlinkedaccounts
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRqSelftransferGetlinkedaccounts getSelftransferGetlinkedaccounts() {
    return selftransferGetlinkedaccounts;
  }

  public void setSelftransferGetlinkedaccounts(SelftransferRqSelftransferGetlinkedaccounts selftransferGetlinkedaccounts) {
    this.selftransferGetlinkedaccounts = selftransferGetlinkedaccounts;
  }

  public SelftransferRq selftransferGetFinBensList(RqGetFinBensList selftransferGetFinBensList) {
    this.selftransferGetFinBensList = selftransferGetFinBensList;
    return this;
  }

  /**
   * Get selftransferGetFinBensList
   * @return selftransferGetFinBensList
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getSelftransferGetFinBensList() {
    return selftransferGetFinBensList;
  }

  public void setSelftransferGetFinBensList(RqGetFinBensList selftransferGetFinBensList) {
    this.selftransferGetFinBensList = selftransferGetFinBensList;
  }

  public SelftransferRq selftransfervalidatepan(RqGetFinBensList selftransfervalidatepan) {
    this.selftransfervalidatepan = selftransfervalidatepan;
    return this;
  }

  /**
   * Get selftransfervalidatepan
   * @return selftransfervalidatepan
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getSelftransfervalidatepan() {
    return selftransfervalidatepan;
  }

  public void setSelftransfervalidatepan(RqGetFinBensList selftransfervalidatepan) {
    this.selftransfervalidatepan = selftransfervalidatepan;
  }

  public SelftransferRq selftransfercheckbalance(RqGetFinBensList selftransfercheckbalance) {
    this.selftransfercheckbalance = selftransfercheckbalance;
    return this;
  }

  /**
   * Get selftransfercheckbalance
   * @return selftransfercheckbalance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getSelftransfercheckbalance() {
    return selftransfercheckbalance;
  }

  public void setSelftransfercheckbalance(RqGetFinBensList selftransfercheckbalance) {
    this.selftransfercheckbalance = selftransfercheckbalance;
  }

  public SelftransferRq selftransferFinTransferReq(RqFinTransferReq selftransferFinTransferReq) {
    this.selftransferFinTransferReq = selftransferFinTransferReq;
    return this;
  }

  /**
   * Get selftransferFinTransferReq
   * @return selftransferFinTransferReq
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqFinTransferReq getSelftransferFinTransferReq() {
    return selftransferFinTransferReq;
  }

  public void setSelftransferFinTransferReq(RqFinTransferReq selftransferFinTransferReq) {
    this.selftransferFinTransferReq = selftransferFinTransferReq;
  }

  public SelftransferRq selftransferGetFinaccountDetails(RqGetFinBensList selftransferGetFinaccountDetails) {
    this.selftransferGetFinaccountDetails = selftransferGetFinaccountDetails;
    return this;
  }

  /**
   * Get selftransferGetFinaccountDetails
   * @return selftransferGetFinaccountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqGetFinBensList getSelftransferGetFinaccountDetails() {
    return selftransferGetFinaccountDetails;
  }

  public void setSelftransferGetFinaccountDetails(RqGetFinBensList selftransferGetFinaccountDetails) {
    this.selftransferGetFinaccountDetails = selftransferGetFinaccountDetails;
  }

  public SelftransferRq selftransferVerifyFinaccount(RqVerifyFinaccount selftransferVerifyFinaccount) {
    this.selftransferVerifyFinaccount = selftransferVerifyFinaccount;
    return this;
  }

  /**
   * Get selftransferVerifyFinaccount
   * @return selftransferVerifyFinaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqVerifyFinaccount getSelftransferVerifyFinaccount() {
    return selftransferVerifyFinaccount;
  }

  public void setSelftransferVerifyFinaccount(RqVerifyFinaccount selftransferVerifyFinaccount) {
    this.selftransferVerifyFinaccount = selftransferVerifyFinaccount;
  }

  public SelftransferRq selftransferPaymentExecution(SelftransferRqSelftransferPaymentExecution selftransferPaymentExecution) {
    this.selftransferPaymentExecution = selftransferPaymentExecution;
    return this;
  }

  /**
   * Get selftransferPaymentExecution
   * @return selftransferPaymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRqSelftransferPaymentExecution getSelftransferPaymentExecution() {
    return selftransferPaymentExecution;
  }

  public void setSelftransferPaymentExecution(SelftransferRqSelftransferPaymentExecution selftransferPaymentExecution) {
    this.selftransferPaymentExecution = selftransferPaymentExecution;
  }

  public SelftransferRq selftransferschedulepayment(SelftransferRqSelftransferschedulepayment selftransferschedulepayment) {
    this.selftransferschedulepayment = selftransferschedulepayment;
    return this;
  }

  /**
   * Get selftransferschedulepayment
   * @return selftransferschedulepayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRqSelftransferschedulepayment getSelftransferschedulepayment() {
    return selftransferschedulepayment;
  }

  public void setSelftransferschedulepayment(SelftransferRqSelftransferschedulepayment selftransferschedulepayment) {
    this.selftransferschedulepayment = selftransferschedulepayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelftransferRq selftransferRq = (SelftransferRq) o;
    return Objects.equals(this.selftransferGetlinkedaccounts, selftransferRq.selftransferGetlinkedaccounts) &&
        Objects.equals(this.selftransferGetFinBensList, selftransferRq.selftransferGetFinBensList) &&
        Objects.equals(this.selftransfervalidatepan, selftransferRq.selftransfervalidatepan) &&
        Objects.equals(this.selftransfercheckbalance, selftransferRq.selftransfercheckbalance) &&
        Objects.equals(this.selftransferFinTransferReq, selftransferRq.selftransferFinTransferReq) &&
        Objects.equals(this.selftransferGetFinaccountDetails, selftransferRq.selftransferGetFinaccountDetails) &&
        Objects.equals(this.selftransferVerifyFinaccount, selftransferRq.selftransferVerifyFinaccount) &&
        Objects.equals(this.selftransferPaymentExecution, selftransferRq.selftransferPaymentExecution) &&
        Objects.equals(this.selftransferschedulepayment, selftransferRq.selftransferschedulepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selftransferGetlinkedaccounts, selftransferGetFinBensList, selftransfervalidatepan, selftransfercheckbalance, selftransferFinTransferReq, selftransferGetFinaccountDetails, selftransferVerifyFinaccount, selftransferPaymentExecution, selftransferschedulepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRq {\n");
    
    sb.append("    selftransferGetlinkedaccounts: ").append(toIndentedString(selftransferGetlinkedaccounts)).append("\n");
    sb.append("    selftransferGetFinBensList: ").append(toIndentedString(selftransferGetFinBensList)).append("\n");
    sb.append("    selftransfervalidatepan: ").append(toIndentedString(selftransfervalidatepan)).append("\n");
    sb.append("    selftransfercheckbalance: ").append(toIndentedString(selftransfercheckbalance)).append("\n");
    sb.append("    selftransferFinTransferReq: ").append(toIndentedString(selftransferFinTransferReq)).append("\n");
    sb.append("    selftransferGetFinaccountDetails: ").append(toIndentedString(selftransferGetFinaccountDetails)).append("\n");
    sb.append("    selftransferVerifyFinaccount: ").append(toIndentedString(selftransferVerifyFinaccount)).append("\n");
    sb.append("    selftransferPaymentExecution: ").append(toIndentedString(selftransferPaymentExecution)).append("\n");
    sb.append("    selftransferschedulepayment: ").append(toIndentedString(selftransferschedulepayment)).append("\n");
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

