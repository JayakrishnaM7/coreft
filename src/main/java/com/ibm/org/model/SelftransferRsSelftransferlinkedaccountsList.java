package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.SelftransferRsSelftransferlinkedaccountsListAccounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelftransferRsSelftransferlinkedaccountsList
 */


public class SelftransferRsSelftransferlinkedaccountsList   {
  @JsonProperty("accounts")
  private SelftransferRsSelftransferlinkedaccountsListAccounts accounts = null;

  public SelftransferRsSelftransferlinkedaccountsList accounts(SelftransferRsSelftransferlinkedaccountsListAccounts accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelftransferRsSelftransferlinkedaccountsListAccounts getAccounts() {
    return accounts;
  }

  public void setAccounts(SelftransferRsSelftransferlinkedaccountsListAccounts accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelftransferRsSelftransferlinkedaccountsList selftransferRsSelftransferlinkedaccountsList = (SelftransferRsSelftransferlinkedaccountsList) o;
    return Objects.equals(this.accounts, selftransferRsSelftransferlinkedaccountsList.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelftransferRsSelftransferlinkedaccountsList {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

