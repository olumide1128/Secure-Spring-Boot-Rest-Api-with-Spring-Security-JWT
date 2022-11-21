# Secure-Spring-Boot-Rest-Api-with-Spring-Security-JWT

In this Java project, i secured rest api endpoints created with Spring boot framework using Spring Security and JWT.

Demo Link - > https://youtu.be/2syYEqEz57A

# Instructions
- Clone Project
- After Cloning, in the root directory, run the following command -> *java -jar spring-security-jwt-example-0.0.1-SNAPSHOT.jar*
- The Spring boot application should start running and you can use a client to test the endpoints.


## Endpoints

### Register a new User (POST)
This endpoint takes in user details in this json form\
Endpoint - localhost:9192/account/register

{
  "userName":"------",
  "password":"------",
  "email":"--------"
}


### Authenticate a User (POST)
This endpoint takes in username and password of registered User and returns a Json Web Token\
Endpoint - localhost:9192/account/authenticate

{
  "userName":"------",
  "password":"------",
}

### Access Resource at Endpoint 1 and 2 by passing Token in Header (GET)\
Endpoint 1 - localhost:9192/api/endpoint1\
Endpoint 2 - localhost:9192/api/endpoint2

Add Bearer Token in Header of Request


## Thanks for using!
