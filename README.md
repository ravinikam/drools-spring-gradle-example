# Armstrong Service 
[build status](https://travis-ci.org/ravinikam/drools-spring-gradle-example.svg?branch=master)
This is a simple Drools rule example using Spring boot REST API's. 
Dependency details can be found in build.gradle file. 
Cucumber BDD is used for unit and rest level testing.


### Overview
Analyzes a given integer and determines whether or not it is an Armstrong
number. Final decision is made using simple Drools rule.  
*An Armstrong number is an n-digit number that is equal to the sum
of the n'th powers of its digits. E.g. 153 = 1^3 + 5^3 + 3^3*

### How to build
   From service root directory where we have ```build.gradle``` and run: ```./gradlew clean build```. It uses cucumber 
   BDD tests to verify.

### How to run
- Start your service as simple java application using
    - ```java -jar armstrong-ws/build/libs/armstrong.1.0.0.SNAPSHOT-boot.jar``` *options*
    - You can right click ```ArmstrongApplication.java``` class from armstrong-ws module and hit
```Run ArmstrongApplication``` in IDE.
- You can view the api documentation on swagger-ui by pointing to ```http://localhost:8080/<context-root>/api```

### How to publish to Artifactory
- To publish API specification to **libs-release-local**
    - Run ```./gradlew interfacePublication artifactoryPublish```
- To publish service executable to **libs-snapshot-local**
    - Run ``` ./gradlew servicePublication artifactoryPublish```
