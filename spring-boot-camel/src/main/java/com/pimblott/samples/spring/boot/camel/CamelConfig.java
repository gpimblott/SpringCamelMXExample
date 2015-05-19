package com.pimblott.samples.spring.boot.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Gordon on 19/05/2015.
 */
@Configuration
public class CamelConfig {

    @Bean
    RoutesBuilder myRouter() {
        return new RouteBuilder() {

            @Override
            public void configure() throws Exception {
                from("file://target/input?preMove=staging&move=.completed")
                        .split(body().tokenize("\n"))
                        .streaming()
                        .process(new Processor() {
                            public void process(Exchange msg) {
                                String line = msg.getIn().getBody(String.class);
                                System.out.println("Processing line: " + line);
                            }
                        });
            }

        };
    }


}
