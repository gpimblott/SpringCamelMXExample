package com.pimblott.samples.ibmmq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Standard Spring Boot starter application shell
 */
@SpringBootApplication
public class ExampleCamelMXApplication {


    public static void main(String[] args) {
        SpringApplication.run(ExampleCamelMXApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            // Do nothing

        };
    }


}
