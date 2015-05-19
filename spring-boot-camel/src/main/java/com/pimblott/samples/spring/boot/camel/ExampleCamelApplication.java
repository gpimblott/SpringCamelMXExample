package com.pimblott.samples.spring.boot.camel;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by Gordon on 19/05/2015.
 */
@SpringBootApplication
public class ExampleCamelApplication {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplication(ExampleCamelApplication.class).run(args);
        CamelSpringBootApplicationController applicationController =
                applicationContext.getBean(CamelSpringBootApplicationController.class);
        applicationController.blockMainThread();

    }

}
