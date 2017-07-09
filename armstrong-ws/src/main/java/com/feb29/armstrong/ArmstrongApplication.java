/*
 * Copyright 2017 Feb29 Company. All rights reserved.
 */


package com.feb29.armstrong;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This is the SpringBoot wrapper for the Armstrong Validation micro service.
 */
@SpringBootApplication
@EnableSwagger2
public class ArmstrongApplication {

    /**
     * Run the SpringApplication from specified source, using default settings.
     *
     * @param args the application arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ArmstrongApplication.class, args);
    }


    @Bean
    StatelessKieSession statelessKieSession() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();
        return kContainer.newStatelessKieSession();
    }


}
