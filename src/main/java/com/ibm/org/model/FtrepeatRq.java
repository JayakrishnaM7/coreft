package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.RepeatRq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FtrepeatRq
 */


public class FtrepeatRq   {
  @JsonProperty("FundtransferRequest")
  private RepeatRq fundtransferRequest = null;

  public FtrepeatRq fundtransferRequest(RepeatRq fundtransferRequest) {
    this.fundtransferRequest = fundtransferRequest;
    return this;
  }

  /**
   * Get fundtransferRequest
   * @return fundtransferRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepeatRq getFundtransferRequest() {
    return fundtransferRequest;
  }

  public void setFundtransferRequest(RepeatRq fundtransferRequest) {
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
    FtrepeatRq ftrepeatRq = (FtrepeatRq) o;
    return Objects.equals(this.fundtransferRequest, ftrepeatRq.fundtransferRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundtransferRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtrepeatRq {\n");
    
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

