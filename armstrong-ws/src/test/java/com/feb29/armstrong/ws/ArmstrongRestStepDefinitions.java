/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */


package com.feb29.armstrong.ws;

import com.feb29.armstrong.ArmstrongApplication;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@ContextConfiguration
@SpringBootTest(classes = ArmstrongApplication.class)
public class ArmstrongRestStepDefinitions implements En {
    @Autowired
    private MockMvc mockMvc;
    private ResultActions result;

    private String swaggerPage;

    public ArmstrongRestStepDefinitions() {
        MockitoAnnotations.initMocks(this);

        When("^(\\w+) is invoked with integer (\\d+) via REST$", (String basePath, Integer input) ->
        {
            try {
                result = mockMvc.perform(get('/' + basePath + '/' + input));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Then("^the HTTP response contains (true|false)$", (Boolean expected) ->
        {
            Assert.assertNotNull(result);
            try {
                result.andExpect(status().isOk())
                        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                        .andExpect(jsonPath("validationStatus", is(expected)));

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


        Given("^Swagger API ui is available at ([\\w|\\-|\\.]+)$", (String page) -> swaggerPage = page);

        When("^user invokes api context via HTTP GET$", () ->
        {
            try {
                result = mockMvc.perform(get("/api"));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Then("^client is redirected to swagger ui$", () ->
        {
            try {
                result.andExpect(status().is3xxRedirection())
                        .andExpect(status().is(HttpStatus.FOUND.value()))
                        .andExpect(redirectedUrl(swaggerPage));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
