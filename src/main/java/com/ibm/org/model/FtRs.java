package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.Rs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FtRs
 */


public class FtRs   {
  @JsonProperty("FundtransferResponse")
  private Rs fundtransferResponse = null;

  public FtRs fundtransferResponse(Rs fundtransferResponse) {
    this.fundtransferResponse = fundtransferResponse;
    return this;
  }

  /**
   * Get fundtransferResponse
   * @return fundtransferResponse
  */
  @ApiModelProperty(value = "")

  @Valid

  public Rs getFundtransferResponse() {
    return fundtransferResponse;
  }

  public void setFundtransferResponse(Rs fundtransferResponse) {
    this.fundtransferResponse = fundtransferResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FtRs ftRs = (FtRs) o;
    return Objects.equals(this.fundtransferResponse, ftRs.fundtransferResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundtransferResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtRs {\n");
    
    sb.append("    fundtransferResponse: ").append(toIndentedString(fundtransferResponse)).append("\n");
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

