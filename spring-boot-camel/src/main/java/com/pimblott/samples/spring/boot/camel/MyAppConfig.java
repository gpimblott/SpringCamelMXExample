package com.pimblott.samples.spring.boot.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Gordon on 19/05/2015.
 */
@Configuration
public class MyAppConfig {

    @Autowired
    CamelContext camelContext;

//    @Bean
//    MyService myService() {
//        return new DefaultMyService(camelContext);
//    }

//    @Bean
//    CamelContextConfiguration contextConfiguration() {
//        return new CamelContextConfiguration() {
//            @Override
//            void beforeApplicationStart(CamelContext context) {
//                System.out.println("Doing Custom Camel config here");
//            }
//        };
//    }
}
