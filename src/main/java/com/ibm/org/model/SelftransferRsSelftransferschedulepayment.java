package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RqFinTransferReqPayerReference;
import com.ibm.org.model.RqSchedulepaymentPayerBankReference;
import com.ibm.org.model.SelftransferRsSelftransferschedulepaymentPayeeBankReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRsSelftransferschedulepayment
 */


public class SelftransferRsSelftransferschedulepayment   {
  @JsonProperty("PayerReference")
  private RqFinTransferReqPayerReference payerReference = null;

  @JsonProperty("PayerBankReference")
  private RqSchedulepaymentPayerBankReference payerBankReference = null;

  @JsonProperty("PayeeReference")
  private RqFinTransferReqPayerReference payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private SelftransferRsSelftransferschedulepaymentPayeeBankReference payeeBankReference = null;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Time")
  private String time;

  public SelftransferRsSelftransferschedulepayment payerReference(RqFinTransferReqPayerReference payerReference) {
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

  public SelftransferRsSelftransferschedulepayment payerBankReference(RqSchedulepaymentPayerBankReference payerBankReference) {
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

  public SelftransferRsSelftransferschedulepayment payeeReference(RqFinTransferReqPayerReference payeeReference) {
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

  public SelftransferRsSelftransferschedulepayment payeeBankReference(SelftransferRsSelftransferschedulepaymentPayeeBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRsSelftransferschedulepaymentPayeeBankReference getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(SelftransferRsSelftransferschedulepaymentPayeeBankReference payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public SelftransferRsSelftransferschedulepayment dateType(String dateType) {
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

  public SelftransferRsSelftransferschedulepayment time(String time) {
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
    SelftransferRsSelftransferschedulepayment selftransferRsSelftransferschedulepayment = (SelftransferRsSelftransferschedulepayment) o;
    return Objects.equals(this.payerReference, selftransferRsSelftransferschedulepayment.payerReference) &&
        Objects.equals(this.payerBankReference, selftransferRsSelftransferschedulepayment.payerBankReference) &&
        Objects.equals(this.payeeReference, selftransferRsSelftransferschedulepayment.payeeReference) &&
        Objects.equals(this.payeeBankReference, selftransferRsSelftransferschedulepayment.payeeBankReference) &&
        Objects.equals(this.dateType, selftransferRsSelftransferschedulepayment.dateType) &&
        Objects.equals(this.time, selftransferRsSelftransferschedulepayment.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerReference, payerBankReference, payeeReference, payeeBankReference, dateType, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRsSelftransferschedulepayment {\n");
    
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

