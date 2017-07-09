/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */

package com.feb29.armstrong.ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This controller maps URLs for the Armstrong Validation service, such as "localhost:<ArmstrongPort>/" to web pages
 * providing more information.
 */
@Controller
public class SwaggerController
{
    public static final String SWAGGER_UI = "redirect:swagger-ui.html";

    /**
     * Generates a default web page based on the YAML annotations (which are describing the API for this service) that
     * are defined in isArmstrongController.
     *
     * @return HTML page with the APIs for the Armstrong Validation service.
     */
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String index()
    {
        return SWAGGER_UI;
    }
}
