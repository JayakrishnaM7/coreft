package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RepeatRqRepeatPaymentExecution;
import com.ibm.org.model.RsPanverification;
import com.ibm.org.model.RsVerifyaccount;
import com.ibm.org.model.SelftransferRsSelftransferlinkedaccountsList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuicktransferRs
 */


public class QuicktransferRs   {
  @JsonProperty("quicktransferaccountdetails")
  private SelftransferRsSelftransferlinkedaccountsList quicktransferaccountdetails = null;

  @JsonProperty("quicktransferpanverification")
  private RsPanverification quicktransferpanverification = null;

  @JsonProperty("quicktransferverifyaccount")
  private RsVerifyaccount quicktransferverifyaccount = null;

  @JsonProperty("quicktransferPaymentExecution")
  private RepeatRqRepeatPaymentExecution quicktransferPaymentExecution = null;

  public QuicktransferRs quicktransferaccountdetails(SelftransferRsSelftransferlinkedaccountsList quicktransferaccountdetails) {
    this.quicktransferaccountdetails = quicktransferaccountdetails;
    return this;
  }

  /**
   * Get quicktransferaccountdetails
   * @return quicktransferaccountdetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRsSelftransferlinkedaccountsList getQuicktransferaccountdetails() {
    return quicktransferaccountdetails;
  }

  public void setQuicktransferaccountdetails(SelftransferRsSelftransferlinkedaccountsList quicktransferaccountdetails) {
    this.quicktransferaccountdetails = quicktransferaccountdetails;
  }

  public QuicktransferRs quicktransferpanverification(RsPanverification quicktransferpanverification) {
    this.quicktransferpanverification = quicktransferpanverification;
    return this;
  }

  /**
   * Get quicktransferpanverification
   * @return quicktransferpanverification
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsPanverification getQuicktransferpanverification() {
    return quicktransferpanverification;
  }

  public void setQuicktransferpanverification(RsPanverification quicktransferpanverification) {
    this.quicktransferpanverification = quicktransferpanverification;
  }

  public QuicktransferRs quicktransferverifyaccount(RsVerifyaccount quicktransferverifyaccount) {
    this.quicktransferverifyaccount = quicktransferverifyaccount;
    return this;
  }

  /**
   * Get quicktransferverifyaccount
   * @return quicktransferverifyaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsVerifyaccount getQuicktransferverifyaccount() {
    return quicktransferverifyaccount;
  }

  public void setQuicktransferverifyaccount(RsVerifyaccount quicktransferverifyaccount) {
    this.quicktransferverifyaccount = quicktransferverifyaccount;
  }

  public QuicktransferRs quicktransferPaymentExecution(RepeatRqRepeatPaymentExecution quicktransferPaymentExecution) {
    this.quicktransferPaymentExecution = quicktransferPaymentExecution;
    return this;
  }

  /**
   * Get quicktransferPaymentExecution
   * @return quicktransferPaymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatPaymentExecution getQuicktransferPaymentExecution() {
    return quicktransferPaymentExecution;
  }

  public void setQuicktransferPaymentExecution(RepeatRqRepeatPaymentExecution quicktransferPaymentExecution) {
    this.quicktransferPaymentExecution = quicktransferPaymentExecution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuicktransferRs quicktransferRs = (QuicktransferRs) o;
    return Objects.equals(this.quicktransferaccountdetails, quicktransferRs.quicktransferaccountdetails) &&
        Objects.equals(this.quicktransferpanverification, quicktransferRs.quicktransferpanverification) &&
        Objects.equals(this.quicktransferverifyaccount, quicktransferRs.quicktransferverifyaccount) &&
        Objects.equals(this.quicktransferPaymentExecution, quicktransferRs.quicktransferPaymentExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quicktransferaccountdetails, quicktransferpanverification, quicktransferverifyaccount, quicktransferPaymentExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuicktransferRs {\n");
    
    sb.append("    quicktransferaccountdetails: ").append(toIndentedString(quicktransferaccountdetails)).append("\n");
    sb.append("    quicktransferpanverification: ").append(toIndentedString(quicktransferpanverification)).append("\n");
    sb.append("    quicktransferverifyaccount: ").append(toIndentedString(quicktransferverifyaccount)).append("\n");
    sb.append("    quicktransferPaymentExecution: ").append(toIndentedString(quicktransferPaymentExecution)).append("\n");
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

