package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RsBenificiariessList;
import com.ibm.org.model.RsGetFinaccountDetails;
import com.ibm.org.model.RsPanverification;
import com.ibm.org.model.RsPaymentExecution;
import com.ibm.org.model.RsSchedulepayment;
import com.ibm.org.model.RsVerifyaccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rs
 */


public class Rs   {
  @JsonProperty("benificiariessList")
  private RsBenificiariessList benificiariessList = null;

  @JsonProperty("panverification")
  private RsPanverification panverification = null;

  @JsonProperty("GetFinaccountDetails")
  private RsGetFinaccountDetails getFinaccountDetails = null;

  @JsonProperty("verifyaccount")
  private RsVerifyaccount verifyaccount = null;

  @JsonProperty("PaymentExecution")
  private RsPaymentExecution paymentExecution = null;

  @JsonProperty("schedulepayment")
  private RsSchedulepayment schedulepayment = null;

  public Rs benificiariessList(RsBenificiariessList benificiariessList) {
    this.benificiariessList = benificiariessList;
    return this;
  }

  /**
   * Get benificiariessList
   * @return benificiariessList
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsBenificiariessList getBenificiariessList() {
    return benificiariessList;
  }

  public void setBenificiariessList(RsBenificiariessList benificiariessList) {
    this.benificiariessList = benificiariessList;
  }

  public Rs panverification(RsPanverification panverification) {
    this.panverification = panverification;
    return this;
  }

  /**
   * Get panverification
   * @return panverification
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsPanverification getPanverification() {
    return panverification;
  }

  public void setPanverification(RsPanverification panverification) {
    this.panverification = panverification;
  }

  public Rs getFinaccountDetails(RsGetFinaccountDetails getFinaccountDetails) {
    this.getFinaccountDetails = getFinaccountDetails;
    return this;
  }

  /**
   * Get getFinaccountDetails
   * @return getFinaccountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsGetFinaccountDetails getGetFinaccountDetails() {
    return getFinaccountDetails;
  }

  public void setGetFinaccountDetails(RsGetFinaccountDetails getFinaccountDetails) {
    this.getFinaccountDetails = getFinaccountDetails;
  }

  public Rs verifyaccount(RsVerifyaccount verifyaccount) {
    this.verifyaccount = verifyaccount;
    return this;
  }

  /**
   * Get verifyaccount
   * @return verifyaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsVerifyaccount getVerifyaccount() {
    return verifyaccount;
  }

  public void setVerifyaccount(RsVerifyaccount verifyaccount) {
    this.verifyaccount = verifyaccount;
  }

  public Rs paymentExecution(RsPaymentExecution paymentExecution) {
    this.paymentExecution = paymentExecution;
    return this;
  }

  /**
   * Get paymentExecution
   * @return paymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsPaymentExecution getPaymentExecution() {
    return paymentExecution;
  }

  public void setPaymentExecution(RsPaymentExecution paymentExecution) {
    this.paymentExecution = paymentExecution;
  }

  public Rs schedulepayment(RsSchedulepayment schedulepayment) {
    this.schedulepayment = schedulepayment;
    return this;
  }

  /**
   * Get schedulepayment
   * @return schedulepayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsSchedulepayment getSchedulepayment() {
    return schedulepayment;
  }

  public void setSchedulepayment(RsSchedulepayment schedulepayment) {
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
    Rs rs = (Rs) o;
    return Objects.equals(this.benificiariessList, rs.benificiariessList) &&
        Objects.equals(this.panverification, rs.panverification) &&
        Objects.equals(this.getFinaccountDetails, rs.getFinaccountDetails) &&
        Objects.equals(this.verifyaccount, rs.verifyaccount) &&
        Objects.equals(this.paymentExecution, rs.paymentExecution) &&
        Objects.equals(this.schedulepayment, rs.schedulepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benificiariessList, panverification, getFinaccountDetails, verifyaccount, paymentExecution, schedulepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rs {\n");
    
    sb.append("    benificiariessList: ").append(toIndentedString(benificiariessList)).append("\n");
    sb.append("    panverification: ").append(toIndentedString(panverification)).append("\n");
    sb.append("    getFinaccountDetails: ").append(toIndentedString(getFinaccountDetails)).append("\n");
    sb.append("    verifyaccount: ").append(toIndentedString(verifyaccount)).append("\n");
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

