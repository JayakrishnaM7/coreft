package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RqFinTransferReqPayerBankReference;
import com.ibm.org.model.RqFinTransferReqPayerReference;
import com.ibm.org.model.SelftransferRqSelftransferPaymentExecutionPayeeBankReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRqSelftransferPaymentExecution
 */


public class SelftransferRqSelftransferPaymentExecution   {
  @JsonProperty("PayerReference")
  private RqFinTransferReqPayerReference payerReference = null;

  @JsonProperty("PayerBankReference")
  private RqFinTransferReqPayerBankReference payerBankReference = null;

  @JsonProperty("PayeeReference")
  private RqFinTransferReqPayerReference payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private SelftransferRqSelftransferPaymentExecutionPayeeBankReference payeeBankReference = null;

  public SelftransferRqSelftransferPaymentExecution payerReference(RqFinTransferReqPayerReference payerReference) {
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

  public SelftransferRqSelftransferPaymentExecution payerBankReference(RqFinTransferReqPayerBankReference payerBankReference) {
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

  public SelftransferRqSelftransferPaymentExecution payeeReference(RqFinTransferReqPayerReference payeeReference) {
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

  public SelftransferRqSelftransferPaymentExecution payeeBankReference(SelftransferRqSelftransferPaymentExecutionPayeeBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRqSelftransferPaymentExecutionPayeeBankReference getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(SelftransferRqSelftransferPaymentExecutionPayeeBankReference payeeBankReference) {
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
    SelftransferRqSelftransferPaymentExecution selftransferRqSelftransferPaymentExecution = (SelftransferRqSelftransferPaymentExecution) o;
    return Objects.equals(this.payerReference, selftransferRqSelftransferPaymentExecution.payerReference) &&
        Objects.equals(this.payerBankReference, selftransferRqSelftransferPaymentExecution.payerBankReference) &&
        Objects.equals(this.payeeReference, selftransferRqSelftransferPaymentExecution.payeeReference) &&
        Objects.equals(this.payeeBankReference, selftransferRqSelftransferPaymentExecution.payeeBankReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerReference, payerBankReference, payeeReference, payeeBankReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRqSelftransferPaymentExecution {\n");
    
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

