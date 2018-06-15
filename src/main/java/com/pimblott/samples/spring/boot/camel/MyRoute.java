package com.pimblott.samples.spring.boot.camel;

import io.hawt.web.auth.AuthenticationFilter;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by gordonp on 09/07/2016.
 */
@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {


        from("timer:foo").to("log:bar");

        from("netty-http:http://0.0.0.0:8085").
                setBody().simple("ref:helloWorld");
    }

    @Bean
    String helloWorld() {
        return "helloWorld";
    }

}
