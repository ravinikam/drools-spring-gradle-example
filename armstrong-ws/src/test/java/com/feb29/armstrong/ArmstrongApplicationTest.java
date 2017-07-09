/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */

package com.feb29.armstrong;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Unit test for {@link ArmstrongApplication}
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({SpringApplication.class})
public class ArmstrongApplicationTest
{

    private ArmstrongApplication armstrongApplication;
    private ConfigurableApplicationContext context;


    @Before
    public final void setup()
    {
        mockStatic(SpringApplication.class);
        context = mock(ConfigurableApplicationContext.class);
        armstrongApplication = new ArmstrongApplication();
    }


    @Test
    public final void testApplicationMain() throws Exception
    {
        // given
        assertNotNull(context); //assertion on precondition before actual call
        when(SpringApplication.run(any(ArmstrongApplication.class), any(String[].class)))
                .thenReturn(context);

        // when
        ArmstrongApplication.main(new String[] {"test"});

        // then
        // Starts verify behavior and verifies how many times following static method call is made
        verifyStatic(times(1));
        // Static method to verify
        SpringApplication.run(any(ArmstrongApplication.class), any(String[].class));
    }


}
