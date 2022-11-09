package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RepeatRqRepeatPaymentExecution;
import com.ibm.org.model.RepeatRqRepeatschedulepayment;
import com.ibm.org.model.RepeatRsRepeatGetFinaccountDetails;
import com.ibm.org.model.RepeatRsRepeattransactionList;
import com.ibm.org.model.RsPanverification;
import com.ibm.org.model.RsVerifyaccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepeatRs
 */


public class RepeatRs   {
  @JsonProperty("repeattransactionList")
  private RepeatRsRepeattransactionList repeattransactionList = null;

  @JsonProperty("repeatpanverification")
  private RsPanverification repeatpanverification = null;

  @JsonProperty("repeatGetFinaccountDetails")
  private RepeatRsRepeatGetFinaccountDetails repeatGetFinaccountDetails = null;

  @JsonProperty("repeatverifyaccount")
  private RsVerifyaccount repeatverifyaccount = null;

  @JsonProperty("repeatPaymentExecution")
  private RepeatRqRepeatPaymentExecution repeatPaymentExecution = null;

  @JsonProperty("repeatschedulepayment")
  private RepeatRqRepeatschedulepayment repeatschedulepayment = null;

  public RepeatRs repeattransactionList(RepeatRsRepeattransactionList repeattransactionList) {
    this.repeattransactionList = repeattransactionList;
    return this;
  }

  /**
   * Get repeattransactionList
   * @return repeattransactionList
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeattransactionList getRepeattransactionList() {
    return repeattransactionList;
  }

  public void setRepeattransactionList(RepeatRsRepeattransactionList repeattransactionList) {
    this.repeattransactionList = repeattransactionList;
  }

  public RepeatRs repeatpanverification(RsPanverification repeatpanverification) {
    this.repeatpanverification = repeatpanverification;
    return this;
  }

  /**
   * Get repeatpanverification
   * @return repeatpanverification
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsPanverification getRepeatpanverification() {
    return repeatpanverification;
  }

  public void setRepeatpanverification(RsPanverification repeatpanverification) {
    this.repeatpanverification = repeatpanverification;
  }

  public RepeatRs repeatGetFinaccountDetails(RepeatRsRepeatGetFinaccountDetails repeatGetFinaccountDetails) {
    this.repeatGetFinaccountDetails = repeatGetFinaccountDetails;
    return this;
  }

  /**
   * Get repeatGetFinaccountDetails
   * @return repeatGetFinaccountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRsRepeatGetFinaccountDetails getRepeatGetFinaccountDetails() {
    return repeatGetFinaccountDetails;
  }

  public void setRepeatGetFinaccountDetails(RepeatRsRepeatGetFinaccountDetails repeatGetFinaccountDetails) {
    this.repeatGetFinaccountDetails = repeatGetFinaccountDetails;
  }

  public RepeatRs repeatverifyaccount(RsVerifyaccount repeatverifyaccount) {
    this.repeatverifyaccount = repeatverifyaccount;
    return this;
  }

  /**
   * Get repeatverifyaccount
   * @return repeatverifyaccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsVerifyaccount getRepeatverifyaccount() {
    return repeatverifyaccount;
  }

  public void setRepeatverifyaccount(RsVerifyaccount repeatverifyaccount) {
    this.repeatverifyaccount = repeatverifyaccount;
  }

  public RepeatRs repeatPaymentExecution(RepeatRqRepeatPaymentExecution repeatPaymentExecution) {
    this.repeatPaymentExecution = repeatPaymentExecution;
    return this;
  }

  /**
   * Get repeatPaymentExecution
   * @return repeatPaymentExecution
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatPaymentExecution getRepeatPaymentExecution() {
    return repeatPaymentExecution;
  }

  public void setRepeatPaymentExecution(RepeatRqRepeatPaymentExecution repeatPaymentExecution) {
    this.repeatPaymentExecution = repeatPaymentExecution;
  }

  public RepeatRs repeatschedulepayment(RepeatRqRepeatschedulepayment repeatschedulepayment) {
    this.repeatschedulepayment = repeatschedulepayment;
    return this;
  }

  /**
   * Get repeatschedulepayment
   * @return repeatschedulepayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRqRepeatschedulepayment getRepeatschedulepayment() {
    return repeatschedulepayment;
  }

  public void setRepeatschedulepayment(RepeatRqRepeatschedulepayment repeatschedulepayment) {
    this.repeatschedulepayment = repeatschedulepayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatRs repeatRs = (RepeatRs) o;
    return Objects.equals(this.repeattransactionList, repeatRs.repeattransactionList) &&
        Objects.equals(this.repeatpanverification, repeatRs.repeatpanverification) &&
        Objects.equals(this.repeatGetFinaccountDetails, repeatRs.repeatGetFinaccountDetails) &&
        Objects.equals(this.repeatverifyaccount, repeatRs.repeatverifyaccount) &&
        Objects.equals(this.repeatPaymentExecution, repeatRs.repeatPaymentExecution) &&
        Objects.equals(this.repeatschedulepayment, repeatRs.repeatschedulepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repeattransactionList, repeatpanverification, repeatGetFinaccountDetails, repeatverifyaccount, repeatPaymentExecution, repeatschedulepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatRs {\n");
    
    sb.append("    repeattransactionList: ").append(toIndentedString(repeattransactionList)).append("\n");
    sb.append("    repeatpanverification: ").append(toIndentedString(repeatpanverification)).append("\n");
    sb.append("    repeatGetFinaccountDetails: ").append(toIndentedString(repeatGetFinaccountDetails)).append("\n");
    sb.append("    repeatverifyaccount: ").append(toIndentedString(repeatverifyaccount)).append("\n");
    sb.append("    repeatPaymentExecution: ").append(toIndentedString(repeatPaymentExecution)).append("\n");
    sb.append("    repeatschedulepayment: ").append(toIndentedString(repeatschedulepayment)).append("\n");
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

