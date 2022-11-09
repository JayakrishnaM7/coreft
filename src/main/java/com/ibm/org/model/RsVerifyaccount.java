package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RsVerifyaccountCorpCustDtls;
import com.ibm.org.model.RsVerifyaccountRetCustDtlsInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsVerifyaccount
 */


public class RsVerifyaccount   {
  @JsonProperty("CustId")
  private String custId;

  @JsonProperty("CorpCustDtls")
  private RsVerifyaccountCorpCustDtls corpCustDtls = null;

  @JsonProperty("RetCustDtlsInfo")
  private RsVerifyaccountRetCustDtlsInfo retCustDtlsInfo = null;

  public RsVerifyaccount custId(String custId) {
    this.custId = custId;
    return this;
  }

  /**
   * Get custId
   * @return custId
  */
  @ApiModelProperty(value = "")


  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public RsVerifyaccount corpCustDtls(RsVerifyaccountCorpCustDtls corpCustDtls) {
    this.corpCustDtls = corpCustDtls;
    return this;
  }

  /**
   * Get corpCustDtls
   * @return corpCustDtls
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsVerifyaccountCorpCustDtls getCorpCustDtls() {
    return corpCustDtls;
  }

  public void setCorpCustDtls(RsVerifyaccountCorpCustDtls corpCustDtls) {
    this.corpCustDtls = corpCustDtls;
  }

  public RsVerifyaccount retCustDtlsInfo(RsVerifyaccountRetCustDtlsInfo retCustDtlsInfo) {
    this.retCustDtlsInfo = retCustDtlsInfo;
    return this;
  }

  /**
   * Get retCustDtlsInfo
   * @return retCustDtlsInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RsVerifyaccountRetCustDtlsInfo getRetCustDtlsInfo() {
    return retCustDtlsInfo;
  }

  public void setRetCustDtlsInfo(RsVerifyaccountRetCustDtlsInfo retCustDtlsInfo) {
    this.retCustDtlsInfo = retCustDtlsInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsVerifyaccount rsVerifyaccount = (RsVerifyaccount) o;
    return Objects.equals(this.custId, rsVerifyaccount.custId) &&
        Objects.equals(this.corpCustDtls, rsVerifyaccount.corpCustDtls) &&
        Objects.equals(this.retCustDtlsInfo, rsVerifyaccount.retCustDtlsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custId, corpCustDtls, retCustDtlsInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsVerifyaccount {\n");
    
    sb.append("    custId: ").append(toIndentedString(custId)).append("\n");
    sb.append("    corpCustDtls: ").append(toIndentedString(corpCustDtls)).append("\n");
    sb.append("    retCustDtlsInfo: ").append(toIndentedString(retCustDtlsInfo)).append("\n");
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

