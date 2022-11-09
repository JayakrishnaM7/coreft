package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RepeatRqRepeatPaymentExecution;
import com.ibm.org.model.RsPanverification;
import com.ibm.org.model.RsVerifyaccount;
import com.ibm.org.model.SelftransferRsSelftransferGetFinaccountDetails;
import com.ibm.org.model.SelftransferRsSelftransferlinkedaccountsList;
import com.ibm.org.model.SelftransferRsSelftransferschedulepayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRs
 */


public class SelftransferRs   {
  @JsonProperty("selftransferlinkedaccountsList")
  private SelftransferRsSelftransferlinkedaccountsList selftransferlinkedaccountsList = null;

  @JsonProperty("selftransferpanverification")
  private RsPanverification selftransferpanverification = null;

  @JsonProperty("selftransferGetFinaccountDetails")
  private SelftransferRsSelftransferGetFinaccountDetails selftransferGetFinaccountDetails = null;

  @JsonProperty("selftransferverifyaccount")
  private RsVerifyaccount selftransferverifyaccount = null;

  @JsonProperty("selftransferPaymentExecution")
  private RepeatRqRepeatPaymentExecution selftransferPaymentExecution = null;

  @JsonProperty("selftransferschedulepayment")
  private SelftransferRsSelftransferschedulepayment selftransferschedulepayment = null;

  public SelftransferRs selftransferlinkedaccountsList(SelftransferRsSelftransferlinkedaccountsList selftransferlinkedaccountsList) {
    this.selftransferlinkedaccountsList = selftransferlinkedaccountsList;
    return this;
  }

  /**
   * Get selftransferlinkedaccountsList
   * @return selftransferlinkedaccountsList
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRsSelftransferlinkedaccountsList getSelftransferlinkedaccountsList() {
    return selftransferlinkedaccountsList;
  }

  public void setSelftransferlinkedaccountsList(SelftransferRsSelftransferlinkedaccountsList selftransferlinkedaccountsList) {
    this.selftransferlinkedaccountsList = selftransferlinkedaccountsList;
  }

  public SelftransferRs selftransferpanverification(RsPanverification selftransferpanverification) {
    this.selftransferpanverification = selftransferpanverification;
    return this;
  }

  /**
   * Get selftransferpanverification
   * @return selftransferpanverification
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsPanverification getSelftransferpanverification() {
    return selftransferpanverification;
  }

  public void setSelftransferpanverification(RsPanverification selftransferpanverification) {
    this.selftransferpanverification = selftransferpanverification;
  }

  public SelftransferRs selftransferGetFinaccountDetails(SelftransferRsSelftransferGetFinaccountDetails selftransferGetFinaccountDetails) {
    this.selftransferGetFinaccountDetails = selftransferGetFinaccountDetails;
    return this;
  }

  /**
   * Get selftransferGetFinaccountDetails
   * @return selftransferGetFinaccountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRsSelftransferGetFinaccountDetails getSelftransferGetFinaccountDetails() {
    return selftransferGetFinaccountDetails;
  }

  public void setSelftransferGetFinaccountDetails(SelftransferRsSelftransferGetFinaccountDetails selftransferGetFinaccountDetails) {
    this.selftransferGetFinaccountDetails = selftransferGetFinaccountDetails;
  }

  public SelftransferRs selftransferverifyaccount(RsVerifyaccount selftransferverifyaccount) {
    this.selftransferverifyaccount = selftransferverifyaccount;
    return this;
  }

  /**
   * Get selftransferverifyaccount
   * @return selftransferverifyaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsVerifyaccount getSelftransferverifyaccount() {
    return selftransferverifyaccount;
  }

  public void setSelftransferverifyaccount(RsVerifyaccount selftransferverifyaccount) {
    this.selftransferverifyaccount = selftransferverifyaccount;
  }

  public SelftransferRs selftransferPaymentExecution(RepeatRqRepeatPaymentExecution selftransferPaymentExecution) {
    this.selftransferPaymentExecution = selftransferPaymentExecution;
    return this;
  }

  /**
   * Get selftransferPaymentExecution
   * @return selftransferPaymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatPaymentExecution getSelftransferPaymentExecution() {
    return selftransferPaymentExecution;
  }

  public void setSelftransferPaymentExecution(RepeatRqRepeatPaymentExecution selftransferPaymentExecution) {
    this.selftransferPaymentExecution = selftransferPaymentExecution;
  }

  public SelftransferRs selftransferschedulepayment(SelftransferRsSelftransferschedulepayment selftransferschedulepayment) {
    this.selftransferschedulepayment = selftransferschedulepayment;
    return this;
  }

  /**
   * Get selftransferschedulepayment
   * @return selftransferschedulepayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRsSelftransferschedulepayment getSelftransferschedulepayment() {
    return selftransferschedulepayment;
  }

  public void setSelftransferschedulepayment(SelftransferRsSelftransferschedulepayment selftransferschedulepayment) {
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
    SelftransferRs selftransferRs = (SelftransferRs) o;
    return Objects.equals(this.selftransferlinkedaccountsList, selftransferRs.selftransferlinkedaccountsList) &&
        Objects.equals(this.selftransferpanverification, selftransferRs.selftransferpanverification) &&
        Objects.equals(this.selftransferGetFinaccountDetails, selftransferRs.selftransferGetFinaccountDetails) &&
        Objects.equals(this.selftransferverifyaccount, selftransferRs.selftransferverifyaccount) &&
        Objects.equals(this.selftransferPaymentExecution, selftransferRs.selftransferPaymentExecution) &&
        Objects.equals(this.selftransferschedulepayment, selftransferRs.selftransferschedulepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selftransferlinkedaccountsList, selftransferpanverification, selftransferGetFinaccountDetails, selftransferverifyaccount, selftransferPaymentExecution, selftransferschedulepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRs {\n");
    
    sb.append("    selftransferlinkedaccountsList: ").append(toIndentedString(selftransferlinkedaccountsList)).append("\n");
    sb.append("    selftransferpanverification: ").append(toIndentedString(selftransferpanverification)).append("\n");
    sb.append("    selftransferGetFinaccountDetails: ").append(toIndentedString(selftransferGetFinaccountDetails)).append("\n");
    sb.append("    selftransferverifyaccount: ").append(toIndentedString(selftransferverifyaccount)).append("\n");
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

