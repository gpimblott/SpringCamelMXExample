# SpringBootCamelStarter

My starter project for a Spring Boot application using Apache Camel.

This contains a number of 'funky' features that are useful for development and demonstrations.  They can easily be disabled for production if required.

The project is pre-configured with the following items:
* Spring Boot
* Spring Boot Camel
* Jetty
* Spring Boot Actuator
* Jolokia
* Hawt.io

This gives you the following capabilities:
* Apache Camel, Enterprise Integration Patterns, embedded in a Spring Boot project
* HTTP Servlet container - for actuator and your own HTTP routes
* Metrics
* Monitoring

The following endpoints are available when you run the application:

# Endpoints available

## http://{host}:8091/hawtio

Access to the Hawt.io monitoring console.  Authentication has been turned off so you will be redirected to the configuration screen.  To connect to your application use the jolokia endpoint as follows
```
* schema=http
* host=your host
* port=8095
* path=jolokia
```
## http://{host}:8095/jolokia

This is required for the hawt.io console

## Actuator endpoints

These are the standard Spring Boot Actuator endpoints for 'Production ready' code.  These are exposed on a different port to the main application to enable their protection using standard firewall port protection.  For further protection authentication could be enabled.

```
 http://{host}:8095/metrics
 http://{host}:8095/env
 http://{host}:8095/health
 http://{host}:8095/mappings
 http://{host}:8095/configprops
 http://{host}:8095/trace
 http://{host}:8095/info
 http://{host}:8095/dump
```

# Camel Routes

Two camel routes are  defined using differant mechanisms:

 1. A timer that logs a message every second defined using 'RouteBuilder'
 2. A route that exposes a HTTP endpoint and returns 'Hello world', http://{host}:18080, defined in the configuration bean.

