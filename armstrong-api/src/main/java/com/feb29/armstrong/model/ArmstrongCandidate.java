/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */
package com.feb29.armstrong.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A data model to hold result and number.
 *
 * Auto generated model, do not modify. If required update specification(armstrong.yaml) instead.
 */
@ApiModel(description = "A data model to hold result and number.")

@javax.annotation.Generated(value = "com.feb29.MrSpringGenerator", date = "2017-07-09T11:55:25.768-05:00")
public class ArmstrongCandidate   {
  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("isArmstrong")
  private Boolean isArmstrong = null;

  @JsonProperty("summation")
  private Integer summation = null;

  public ArmstrongCandidate number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * candidate to perform Armstrong validation on.
   * @return number
  **/
  @ApiModelProperty(value = "candidate to perform Armstrong validation on.")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public ArmstrongCandidate isArmstrong(Boolean isArmstrong) {
    this.isArmstrong = isArmstrong;
    return this;
  }

   /**
   * holds result
   * @return isArmstrong
  **/
  @ApiModelProperty(value = "holds result")


  public Boolean getIsArmstrong() {
    return isArmstrong;
  }

  public void setIsArmstrong(Boolean isArmstrong) {
    this.isArmstrong = isArmstrong;
  }

  public ArmstrongCandidate summation(Integer summation) {
    this.summation = summation;
    return this;
  }

   /**
   * sum of n'th power of digits
   * @return summation
  **/
  @ApiModelProperty(value = "sum of n'th power of digits")


  public Integer getSummation() {
    return summation;
  }

  public void setSummation(Integer summation) {
    this.summation = summation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArmstrongCandidate armstrongCandidate = (ArmstrongCandidate) o;
    return Objects.equals(this.number, armstrongCandidate.number) &&
        Objects.equals(this.isArmstrong, armstrongCandidate.isArmstrong) &&
        Objects.equals(this.summation, armstrongCandidate.summation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, isArmstrong, summation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArmstrongCandidate {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    isArmstrong: ").append(toIndentedString(isArmstrong)).append("\n");
    sb.append("    summation: ").append(toIndentedString(summation)).append("\n");
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

