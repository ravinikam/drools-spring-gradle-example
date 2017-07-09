/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */

package com.feb29.armstrong.impl;

import com.feb29.armstrong.api.Armstrong;
import com.feb29.armstrong.model.ArmstrongCandidate;
import com.feb29.armstrong.model.ArmstrongResponse;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class will verify if a candidate integer is an Armstrong number.  An Armstrong number is a 3-digit number
 * for which the sum of the cube of its digits is equal to the number.
 * <p>
 * Example:  370 = 3^3 + 7^3 + 0^3
 */
@Component
public class ArmstrongImpl implements Armstrong {
    private static final int DECIMAL_BASE = 10;

    private StatelessKieSession statelessKieSession;

    @Autowired
    public ArmstrongImpl(StatelessKieSession statelessKieSession) {
        this.statelessKieSession = statelessKieSession;
    }


    private void validateNumber(ArmstrongCandidate armstrongCandidate) {
        int remainder = armstrongCandidate.getNumber();
        int sum = 0;

        while (remainder > 0) {
            int digit = remainder % DECIMAL_BASE;
            remainder /= DECIMAL_BASE;
            sum += (digit * digit * digit);
        }

        armstrongCandidate.setSummation(sum);
    }

    @Override
    public ArmstrongResponse isArmstrong(Integer armstrongCandidate) {
        // create data model
        ArmstrongCandidate candidate = new ArmstrongCandidate().number(armstrongCandidate).isArmstrong(false);
        // analyze candidate for armstrong criteria
        validateNumber(candidate);
        // execute rule
        statelessKieSession.execute(candidate);
        // finally get result from rule execution
        ArmstrongResponse response = new ArmstrongResponse().validationStatus(candidate.getIsArmstrong());
        return response;
    }

}