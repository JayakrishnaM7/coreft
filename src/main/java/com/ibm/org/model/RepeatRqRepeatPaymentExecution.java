package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RqFinTransferReqPayerReference;
import com.ibm.org.model.RqSchedulepaymentPayerBankReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepeatRqRepeatPaymentExecution
 */


public class RepeatRqRepeatPaymentExecution   {
  @JsonProperty("PayerReference")
  private RqFinTransferReqPayerReference payerReference = null;

  @JsonProperty("PayerBankReference")
  private RqSchedulepaymentPayerBankReference payerBankReference = null;

  @JsonProperty("PayeeReference")
  private RqFinTransferReqPayerReference payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private RqSchedulepaymentPayerBankReference payeeBankReference = null;

  public RepeatRqRepeatPaymentExecution payerReference(RqFinTransferReqPayerReference payerReference) {
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

  public RepeatRqRepeatPaymentExecution payerBankReference(RqSchedulepaymentPayerBankReference payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqSchedulepaymentPayerBankReference getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(RqSchedulepaymentPayerBankReference payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public RepeatRqRepeatPaymentExecution payeeReference(RqFinTransferReqPayerReference payeeReference) {
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

  public RepeatRqRepeatPaymentExecution payeeBankReference(RqSchedulepaymentPayerBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RqSchedulepaymentPayerBankReference getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(RqSchedulepaymentPayerBankReference payeeBankReference) {
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
    RepeatRqRepeatPaymentExecution repeatRqRepeatPaymentExecution = (RepeatRqRepeatPaymentExecution) o;
    return Objects.equals(this.payerReference, repeatRqRepeatPaymentExecution.payerReference) &&
        Objects.equals(this.payerBankReference, repeatRqRepeatPaymentExecution.payerBankReference) &&
        Objects.equals(this.payeeReference, repeatRqRepeatPaymentExecution.payeeReference) &&
        Objects.equals(this.payeeBankReference, repeatRqRepeatPaymentExecution.payeeBankReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerReference, payerBankReference, payeeReference, payeeBankReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatRqRepeatPaymentExecution {\n");
    
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

