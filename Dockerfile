FROM openjdk:12.0.1-jdk

MAINTAINER William Custodio

ARG JAR_FILE

ENV CUSTOMER_AUTH_CHECK_TOKEN_URL=''
ENV CUSTOMER_AUTH_CLIENT_ID=''
ENV CUSTOMER_AUTH_CLIENT_SECRET=''

COPY $JAR_FILE rest-house-customer-api.jar

ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar rest-house-customer-api.jar