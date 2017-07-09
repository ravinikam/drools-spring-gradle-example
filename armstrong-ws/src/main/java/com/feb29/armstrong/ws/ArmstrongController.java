/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */
package com.feb29.armstrong.ws;

import com.feb29.armstrong.api.Armstrong;
import com.feb29.armstrong.model.ArmstrongResponse;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Service entry point over network for armstrong.
 *
 * Auto generated class, do not modify. If required update specification(armstrong.yaml) instead.
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "armstrong", description = "the armstrong API")
@javax.annotation.Generated(value = "com.feb29.MrSpringGenerator", date = "2017-07-09T11:55:25.768-05:00")
public class ArmstrongController implements Armstrong
{

    private final Armstrong armstrongImpl;

    @Autowired
    public ArmstrongController(Armstrong armstrongImpl)
    {
        this.armstrongImpl = armstrongImpl;
    }

    @Override
    @ApiOperation(value = "Checks if a number is an Armstrong number.", notes = "Returns true if the candidate is an Armstrong number, false if not.", response = ArmstrongResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response returns true or false.", response = ArmstrongResponse.class),
        @ApiResponse(code = 400, message = "Something other than an integer was sent for Armstrong validation.", response = ArmstrongResponse.class) })
    
    @RequestMapping(value = "/isArmstrong/{armstrongCandidate}",
        method = RequestMethod.GET)
    public ArmstrongResponse isArmstrong(@ApiParam(value = "Integer to perform Armstrong validation on.",required=true ) @PathVariable("armstrongCandidate") Integer armstrongCandidate)
    {
        return armstrongImpl.isArmstrong(armstrongCandidate);
        
    }

}
