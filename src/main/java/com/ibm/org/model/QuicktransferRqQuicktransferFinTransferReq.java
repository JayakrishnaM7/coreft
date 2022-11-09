package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.QuicktransferRqQuicktransferFinTransferReqPayerBankReference;
import com.ibm.org.model.RqFinTransferReqPayerReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuicktransferRqQuicktransferFinTransferReq
 */


public class QuicktransferRqQuicktransferFinTransferReq   {
  @JsonProperty("PayerReference")
  private RqFinTransferReqPayerReference payerReference = null;

  @JsonProperty("PayerBankReference")
  private QuicktransferRqQuicktransferFinTransferReqPayerBankReference payerBankReference = null;

  public QuicktransferRqQuicktransferFinTransferReq payerReference(RqFinTransferReqPayerReference payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqFinTransferReqPayerReference getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(RqFinTransferReqPayerReference payerReference) {
    this.payerReference = payerReference;
  }

  public QuicktransferRqQuicktransferFinTransferReq payerBankReference(QuicktransferRqQuicktransferFinTransferReqPayerBankReference payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuicktransferRqQuicktransferFinTransferReqPayerBankReference getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(QuicktransferRqQuicktransferFinTransferReqPayerBankReference payerBankReference) {
    this.payerBankReference = payerBankReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuicktransferRqQuicktransferFinTransferReq quicktransferRqQuicktransferFinTransferReq = (QuicktransferRqQuicktransferFinTransferReq) o;
    return Objects.equals(this.payerReference, quicktransferRqQuicktransferFinTransferReq.payerReference) &&
        Objects.equals(this.payerBankReference, quicktransferRqQuicktransferFinTransferReq.payerBankReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerReference, payerBankReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuicktransferRqQuicktransferFinTransferReq {\n");
    
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
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

