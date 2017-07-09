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
 * Armstrong service response
 *
 * Auto generated model, do not modify. If required update specification(armstrong.yaml) instead.
 */
@ApiModel(description = "Armstrong service response")

@javax.annotation.Generated(value = "com.feb29.MrSpringGenerator", date = "2017-07-09T11:55:25.768-05:00")
public class ArmstrongResponse   {
  @JsonProperty("validationStatus")
  private Boolean validationStatus = null;

  public ArmstrongResponse validationStatus(Boolean validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * True if a number is an Armstrong number, false if not.
   * @return validationStatus
  **/
  @ApiModelProperty(value = "True if a number is an Armstrong number, false if not.")


  public Boolean getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(Boolean validationStatus) {
    this.validationStatus = validationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArmstrongResponse armstrongResponse = (ArmstrongResponse) o;
    return Objects.equals(this.validationStatus, armstrongResponse.validationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArmstrongResponse {\n");
    
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
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

