package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsVerifyaccountRetCustDtlsInfo
 */


public class RsVerifyaccountRetCustDtlsInfo   {
  @JsonProperty("FirstName")
  private String firstName;

  @JsonProperty("LastName")
  private String lastName;

  @JsonProperty("CustTypeCode")
  private String custTypeCode;

  public RsVerifyaccountRetCustDtlsInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public RsVerifyaccountRetCustDtlsInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public RsVerifyaccountRetCustDtlsInfo custTypeCode(String custTypeCode) {
    this.custTypeCode = custTypeCode;
    return this;
  }

  /**
   * Get custTypeCode
   * @return custTypeCode
  */
  @ApiModelProperty(value = "")


  public String getCustTypeCode() {
    return custTypeCode;
  }

  public void setCustTypeCode(String custTypeCode) {
    this.custTypeCode = custTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsVerifyaccountRetCustDtlsInfo rsVerifyaccountRetCustDtlsInfo = (RsVerifyaccountRetCustDtlsInfo) o;
    return Objects.equals(this.firstName, rsVerifyaccountRetCustDtlsInfo.firstName) &&
        Objects.equals(this.lastName, rsVerifyaccountRetCustDtlsInfo.lastName) &&
        Objects.equals(this.custTypeCode, rsVerifyaccountRetCustDtlsInfo.custTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, custTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsVerifyaccountRetCustDtlsInfo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    custTypeCode: ").append(toIndentedString(custTypeCode)).append("\n");
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

