package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.SelftransferRq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FtselftransferRq
 */


public class FtselftransferRq   {
  @JsonProperty("FundtransferRequest")
  private SelftransferRq fundtransferRequest = null;

  public FtselftransferRq fundtransferRequest(SelftransferRq fundtransferRequest) {
    this.fundtransferRequest = fundtransferRequest;
    return this;
  }

  /**
   * Get fundtransferRequest
   * @return fundtransferRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRq getFundtransferRequest() {
    return fundtransferRequest;
  }

  public void setFundtransferRequest(SelftransferRq fundtransferRequest) {
    this.fundtransferRequest = fundtransferRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FtselftransferRq ftselftransferRq = (FtselftransferRq) o;
    return Objects.equals(this.fundtransferRequest, ftselftransferRq.fundtransferRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundtransferRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtselftransferRq {\n");
    
    sb.append("    fundtransferRequest: ").append(toIndentedString(fundtransferRequest)).append("\n");
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

