package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RqVerifyFinaccount
 */


public class RqVerifyFinaccount   {
  @JsonProperty("custid")
  private String custid;

  @JsonProperty("custtype")
  private String custtype;

  public RqVerifyFinaccount custid(String custid) {
    this.custid = custid;
    return this;
  }

  /**
   * Get custid
   * @return custid
  */
  @ApiModelProperty(value = "")


  public String getCustid() {
    return custid;
  }

  public void setCustid(String custid) {
    this.custid = custid;
  }

  public RqVerifyFinaccount custtype(String custtype) {
    this.custtype = custtype;
    return this;
  }

  /**
   * Get custtype
   * @return custtype
  */
  @ApiModelProperty(value = "")


  public String getCusttype() {
    return custtype;
  }

  public void setCusttype(String custtype) {
    this.custtype = custtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RqVerifyFinaccount rqVerifyFinaccount = (RqVerifyFinaccount) o;
    return Objects.equals(this.custid, rqVerifyFinaccount.custid) &&
        Objects.equals(this.custtype, rqVerifyFinaccount.custtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custid, custtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RqVerifyFinaccount {\n");
    
    sb.append("    custid: ").append(toIndentedString(custid)).append("\n");
    sb.append("    custtype: ").append(toIndentedString(custtype)).append("\n");
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

