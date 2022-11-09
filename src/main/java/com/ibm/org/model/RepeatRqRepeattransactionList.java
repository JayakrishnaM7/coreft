package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepeatRqRepeattransactionList
 */


public class RepeatRqRepeattransactionList   {
  @JsonProperty("accid")
  private String accid;

  @JsonProperty("branchId")
  private String branchId;

  @JsonProperty("lastNTransactions")
  private String lastNTransactions;

  public RepeatRqRepeattransactionList accid(String accid) {
    this.accid = accid;
    return this;
  }

  /**
   * Get accid
   * @return accid
  */
  @ApiModelProperty(value = "")


  public String getAccid() {
    return accid;
  }

  public void setAccid(String accid) {
    this.accid = accid;
  }

  public RepeatRqRepeattransactionList branchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  /**
   * Get branchId
   * @return branchId
  */
  @ApiModelProperty(value = "")


  public String getBranchId() {
    return branchId;
  }

  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  public RepeatRqRepeattransactionList lastNTransactions(String lastNTransactions) {
    this.lastNTransactions = lastNTransactions;
    return this;
  }

  /**
   * Get lastNTransactions
   * @return lastNTransactions
  */
  @ApiModelProperty(value = "")


  public String getLastNTransactions() {
    return lastNTransactions;
  }

  public void setLastNTransactions(String lastNTransactions) {
    this.lastNTransactions = lastNTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatRqRepeattransactionList repeatRqRepeattransactionList = (RepeatRqRepeattransactionList) o;
    return Objects.equals(this.accid, repeatRqRepeattransactionList.accid) &&
        Objects.equals(this.branchId, repeatRqRepeattransactionList.branchId) &&
        Objects.equals(this.lastNTransactions, repeatRqRepeattransactionList.lastNTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accid, branchId, lastNTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatRqRepeattransactionList {\n");
    
    sb.append("    accid: ").append(toIndentedString(accid)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    lastNTransactions: ").append(toIndentedString(lastNTransactions)).append("\n");
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

