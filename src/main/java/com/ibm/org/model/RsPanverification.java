package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsPanverification
 */


public class RsPanverification   {
  @JsonProperty("panNumber")
  private String panNumber;

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("entityDocumentID")
  private String entityDocumentID;

  @JsonProperty("placeOfIssue")
  private String placeOfIssue;

  public RsPanverification panNumber(String panNumber) {
    this.panNumber = panNumber;
    return this;
  }

  /**
   * Get panNumber
   * @return panNumber
  */
  @ApiModelProperty(value = "")


  public String getPanNumber() {
    return panNumber;
  }

  public void setPanNumber(String panNumber) {
    this.panNumber = panNumber;
  }

  public RsPanverification customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public RsPanverification entityDocumentID(String entityDocumentID) {
    this.entityDocumentID = entityDocumentID;
    return this;
  }

  /**
   * Get entityDocumentID
   * @return entityDocumentID
  */
  @ApiModelProperty(value = "")


  public String getEntityDocumentID() {
    return entityDocumentID;
  }

  public void setEntityDocumentID(String entityDocumentID) {
    this.entityDocumentID = entityDocumentID;
  }

  public RsPanverification placeOfIssue(String placeOfIssue) {
    this.placeOfIssue = placeOfIssue;
    return this;
  }

  /**
   * Get placeOfIssue
   * @return placeOfIssue
  */
  @ApiModelProperty(value = "")


  public String getPlaceOfIssue() {
    return placeOfIssue;
  }

  public void setPlaceOfIssue(String placeOfIssue) {
    this.placeOfIssue = placeOfIssue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsPanverification rsPanverification = (RsPanverification) o;
    return Objects.equals(this.panNumber, rsPanverification.panNumber) &&
        Objects.equals(this.customerId, rsPanverification.customerId) &&
        Objects.equals(this.entityDocumentID, rsPanverification.entityDocumentID) &&
        Objects.equals(this.placeOfIssue, rsPanverification.placeOfIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(panNumber, customerId, entityDocumentID, placeOfIssue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsPanverification {\n");
    
    sb.append("    panNumber: ").append(toIndentedString(panNumber)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    entityDocumentID: ").append(toIndentedString(entityDocumentID)).append("\n");
    sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
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

