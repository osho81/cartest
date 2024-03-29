### Cartest - a test project for cloud deployment

#### Description

A Java SpringBoot and MySQL test project to deploy in Google Cloud, more precisely in Google App Engine. 

#### Cloud App Engine

The App was uploaded to Google Cloud Platform, using the App Engine cloud service. This was done for practise purposes. 
The java17 and standard environment configurations can be seen in the yaml-file. 
Needed pom changes are due to jar packaging and determining a start class for the app engine. 

Note that uploaded json-key is invalid, and kept here in the code of pedagogic reasons.

#### Cloud MySQL

MySQL is adjusted and configured to be applied within the context of cloud deployment. 
Cloud MySQL is primarily configured in application.properties.

#### Techs & languages used

- Java, Spring/Springboot, Rest-api
- MySQl/cloud MySQL

#### Purpose/Motivation

To test and improve skills in cloud deployment and yaml-configuration.