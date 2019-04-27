package com.raythos.cyberia.spingdata.rest;


import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;

@Configuration
public class SpringfoxConfiguration {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .tags(new Tag("Employee Location", "Directory of Employee Locations"))
                .apiInfo(new ApiInfo("Employee Location API", "REST API of the  Employee Location Service", "v42", null, null, null, null, Lists.newArrayList()));
    }
}
