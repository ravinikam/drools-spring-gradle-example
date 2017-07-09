/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */

package com.feb29.armstrong.impl;

import com.feb29.armstrong.api.Armstrong;
import com.feb29.armstrong.model.ArmstrongResponse;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import static org.hamcrest.Matchers.is;

public class ArmstrongStepDefinitions implements En {


    ArmstrongResponse armstrongResponse;
    Armstrong validator;

    public ArmstrongStepDefinitions() {

        Given("^Armstrong validator$", () -> {
            KieServices kieServices = KieServices.Factory.get();
            KieContainer kContainer = kieServices.getKieClasspathContainer();
            StatelessKieSession statelessKieSession = kContainer.newStatelessKieSession();
            validator = new ArmstrongImpl(statelessKieSession);
        });

        When("^Armstrong validation is invoked with integer (\\d+)$", (Integer arg1) ->
                armstrongResponse = validator.isArmstrong(arg1));

        Then("^Armstrong validation returns (true|false)$", (Boolean expected) ->
                Assert.assertThat(armstrongResponse.getValidationStatus(), is(expected)));
    }
}
