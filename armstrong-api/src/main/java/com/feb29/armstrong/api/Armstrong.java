/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */
package com.feb29.armstrong.api;

import com.feb29.armstrong.model.ArmstrongResponse;

import java.util.List;

/**
 * API for armstrong service.
 *
 * Auto generated class, do not modify. If required update specification(armstrong.yaml) instead.
 */
@javax.annotation.Generated(value = "com.feb29.MrSpringGenerator", date = "2017-07-09T11:55:25.768-05:00")
public interface Armstrong
{

    /**
     * Checks if a number is an Armstrong number.
     *
     * @param armstrongCandidate Integer to perform Armstrong validation on.
     * @return {@link ArmstrongResponse } 
     */
   ArmstrongResponse isArmstrong(Integer armstrongCandidate);


}
