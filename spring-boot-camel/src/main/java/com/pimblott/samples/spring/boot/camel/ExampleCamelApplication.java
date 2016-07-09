package com.pimblott.samples.spring.boot.camel;


import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Gordon on 19/05/2015.
 */
@SpringBootApplication
public class ExampleCamelApplication extends FatJarRouter {


    @Override
    public void configure() throws Exception {
        from("netty-http:http://0.0.0.0:18080").
                setBody().simple("ref:helloWorld");
    }

    @Bean
    String helloWorld() {
        return "helloWorld";
    }

}
