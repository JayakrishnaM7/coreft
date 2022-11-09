package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepeatRsRepeattransactionListAvailableBalance
 */


public class RepeatRsRepeattransactionListAvailableBalance   {
  @JsonProperty("amountValue")
  private String amountValue;

  @JsonProperty("currencyCode")
  private String currencyCode;

  public RepeatRsRepeattransactionListAvailableBalance amountValue(String amountValue) {
    this.amountValue = amountValue;
    return this;
  }

  /**
   * Get amountValue
   * @return amountValue
  */
  @ApiModelProperty(value = "")


  public String getAmountValue() {
    return amountValue;
  }

  public void setAmountValue(String amountValue) {
    this.amountValue = amountValue;
  }

  public RepeatRsRepeattransactionListAvailableBalance currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  */
  @ApiModelProperty(value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatRsRepeattransactionListAvailableBalance repeatRsRepeattransactionListAvailableBalance = (RepeatRsRepeattransactionListAvailableBalance) o;
    return Objects.equals(this.amountValue, repeatRsRepeattransactionListAvailableBalance.amountValue) &&
        Objects.equals(this.currencyCode, repeatRsRepeattransactionListAvailableBalance.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountValue, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatRsRepeattransactionListAvailableBalance {\n");
    
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

