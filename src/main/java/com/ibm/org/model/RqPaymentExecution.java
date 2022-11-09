package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RqFinTransferReqPayerBankReference;
import com.ibm.org.model.RqFinTransferReqPayerReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RqPaymentExecution
 */


public class RqPaymentExecution   {
  @JsonProperty("PayerReference")
  private RqFinTransferReqPayerReference payerReference = null;

  @JsonProperty("PayerBankReference")
  private RqFinTransferReqPayerBankReference payerBankReference = null;

  @JsonProperty("PayeeReference")
  private RqFinTransferReqPayerReference payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private RqFinTransferReqPayerBankReference payeeBankReference = null;

  public RqPaymentExecution payerReference(RqFinTransferReqPayerReference payerReference) {
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

  public RqPaymentExecution payerBankReference(RqFinTransferReqPayerBankReference payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqFinTransferReqPayerBankReference getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(RqFinTransferReqPayerBankReference payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public RqPaymentExecution payeeReference(RqFinTransferReqPayerReference payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqFinTransferReqPayerReference getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(RqFinTransferReqPayerReference payeeReference) {
    this.payeeReference = payeeReference;
  }

  public RqPaymentExecution payeeBankReference(RqFinTransferReqPayerBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqFinTransferReqPayerBankReference getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(RqFinTransferReqPayerBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RqPaymentExecution rqPaymentExecution = (RqPaymentExecution) o;
    return Objects.equals(this.payerReference, rqPaymentExecution.payerReference) &&
        Objects.equals(this.payerBankReference, rqPaymentExecution.payerBankReference) &&
        Objects.equals(this.payeeReference, rqPaymentExecution.payeeReference) &&
        Objects.equals(this.payeeBankReference, rqPaymentExecution.payeeBankReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerReference, payerBankReference, payeeReference, payeeBankReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RqPaymentExecution {\n");
    
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
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

