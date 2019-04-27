package com.raythos.cyberia.spingdata.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@SpringBootApplication
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
public class VulnerableApplication {

    public static void main(String[] args) {
        SpringApplication.run(VulnerableApplication.class, args);
    }

}
