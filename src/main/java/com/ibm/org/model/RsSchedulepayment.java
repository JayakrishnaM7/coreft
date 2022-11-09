package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RqFinTransferReqPayerBankReference;
import com.ibm.org.model.RqFinTransferReqPayerReference;
import com.ibm.org.model.RsSchedulepaymentPayeeBankReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsSchedulepayment
 */


public class RsSchedulepayment   {
  @JsonProperty("PayerReference")
  private RqFinTransferReqPayerReference payerReference = null;

  @JsonProperty("PayerBankReference")
  private RqFinTransferReqPayerBankReference payerBankReference = null;

  @JsonProperty("PayeeReference")
  private RqFinTransferReqPayerReference payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private RsSchedulepaymentPayeeBankReference payeeBankReference = null;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Time")
  private String time;

  public RsSchedulepayment payerReference(RqFinTransferReqPayerReference payerReference) {
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

  public RsSchedulepayment payerBankReference(RqFinTransferReqPayerBankReference payerBankReference) {
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

  public RsSchedulepayment payeeReference(RqFinTransferReqPayerReference payeeReference) {
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

  public RsSchedulepayment payeeBankReference(RsSchedulepaymentPayeeBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsSchedulepaymentPayeeBankReference getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(RsSchedulepaymentPayeeBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public RsSchedulepayment dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public RsSchedulepayment time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsSchedulepayment rsSchedulepayment = (RsSchedulepayment) o;
    return Objects.equals(this.payerReference, rsSchedulepayment.payerReference) &&
        Objects.equals(this.payerBankReference, rsSchedulepayment.payerBankReference) &&
        Objects.equals(this.payeeReference, rsSchedulepayment.payeeReference) &&
        Objects.equals(this.payeeBankReference, rsSchedulepayment.payeeBankReference) &&
        Objects.equals(this.dateType, rsSchedulepayment.dateType) &&
        Objects.equals(this.time, rsSchedulepayment.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerReference, payerBankReference, payeeReference, payeeBankReference, dateType, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsSchedulepayment {\n");
    
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

