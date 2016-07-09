package com.pimblott.samples.spring.boot.camel;


import io.hawt.springboot.EnableHawtio;
import io.hawt.web.AuthenticationFilter;
import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Gordon on 19/05/2015.
 */
@SpringBootApplication
@EnableHawtio
public class ExampleCamelApplication extends FatJarRouter {


    @Override
    public void configure() throws Exception {

        System.setProperty(AuthenticationFilter.HAWTIO_AUTHENTICATION_ENABLED, "false");
        System.setProperty( "port" , "8092");

        from("netty-http:http://0.0.0.0:18080").
                setBody().simple("ref:helloWorld");
    }

    @Bean
    String helloWorld() {
        return "helloWorld";
    }

}
