# IBM MQ / Spring Boot  / Apache Camel

Example project using IBM MQ, Spring Boot and Apache camel.  It demonstrates both reading and writing to an 
MX queue by emitting a message every second and reading the message back.  The receiving camel route outputs
the body of the received message to the log.

To run the application it needs an instance of IBM MQ running locally. 
I used the IBM provided docker image - https://hub.docker.com/r/ibmcom/mq/.

## Running the Docker image

To download the docker image...

```
docker pull ibmcom/mq
```

Full details for using the docker image can be found here->https://github.com/ibm-messaging/mq-docker

**TL;DR**

Run a default queue with all the defaults

```
docker run \
  --env LICENSE=accept \
  --env MQ_QMGR_NAME=QM1 \
  --publish 1414:1414 \
  --publish 9443:9443 \
  --detach \
  ibmcom/mq
```

Once started MQ Dev edition will be running with the following configuration
* http://localhost:9443 - MQ Management console
 
  Username : admin password: passw0rd
  
* Port 1414 - MQ listener

All of the default settings are used for the demonstration application

## Monitoring

Both Spring Actuator and Hawtio are configured on this example app using port 8095.


**Actuator Endpoints**

```$xslt
Some endpoints require authentication

Username : admin
Password : admin

http://localhost:8095/health
http://localhost:8095/info
http://localhost:8095/metrics
```

**HAWTIO**

Hawtio is available on port 8095: /hawtio as well.  It provides realtime visualisation of
the process, including the camel messages exchanges.

```$xslt
http://localhost:8095/hawtio
```

