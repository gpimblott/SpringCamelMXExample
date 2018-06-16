package com.pimblott.samples.ibmmq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Create two Camel routes
 *
 * 1) Listen to queue DEV.QUEUE.1 and log received messages
 * 2) Start a timer that emits a message every second to DEV.QUEUE.1 continaing a random number
 */
@Component
public class ExampleMxRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("wmq:queue:DEV.QUEUE.1")
                .to("log:JMSReceiver?level=INFO");


        from("timer:foo")
                .transform(simple("Random number ${random(0,100)}"))
                .to("wmq:DEV.QUEUE.1");

    }

}
