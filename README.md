# JEE
This repository is from Platzi's course ["Hibernate y Java Spring 2018"](https://platzi.com/clases/jee/)

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info

In this course we learn how to implement Hibernate and Java Spring in a project developed with Java Enterprise Edition, as a final product we obtain a web application and store it in Docker.



### JSPs (JavaServer Page) 
Are server-side components that allow us to develop web pages with support for dynamic content thanks to the inclusion of Java code in html code using Tags (a special syntax that we can use at any time to add dynamic content : <% for (1 = 0; i <10: i ++)%>).

### Spring
#### Spring Boot Features

* Spring Boot is a technology that allows optimizing development times in the creation and deployment of projects, allowing developers to focus on the development of the application. Among the features that Spring Boot has, the following can be mentioned:

| Characteristic | Description |
|-|-|
|Standalone applications|An application in Spring Boot is packaged in a JAR with all the dependencies to be able to run without the need to install a web server. Allowing to function as a standalone application.|
|Embedded Servers|Spring Boot supports Tomcat and Jetty as embedded servers.|
|Simple setup|Spring Boot supports each of the features of Spring modules such as Spring MVC, Spring Data, Spring Rest, Spring Security and it does so in a simple way, through simple dependencies, one for each technology. Additionally, the way to build and configure it is simple and optimal online through the Spring Initializr tool.|
|Production Features Ready||Spring Boot comes with predefined configuration features for production environments. Additionally, you can configure characteristics according to the environment through Spring Profiles.|


#### Spring Framework

* Spring Framework is an Open Source framework created by Rod Jhonson in 2003, it was created due to the need to optimize our Java code and as an alternative to solve the complexity of other heavier technologies at that time (especially EJB).

* Spring Features:

||
|-|
|It is NOT limited to the server side|
|Development based on POJOS|
|Low coupling|
|Declarative programming|
|Boilerplate code reduction|
|Layered architecture|


* Spring is the most used Java framework. It offers us tools that allow us to create more advanced projects, with better practices and in less time. It also has a great community, which gives us a lot of documentation and help.

* Spring has a modular and flexible structure, which makes us use only what we need.

#### Spring Data
* There are several repositories according to the technology to be used, such as CrudRepository, JPARepository and MongoRepository (both based on PageAndSortingRepository).


* Spring Data has support for making custom queries based on the attributes of the base class that are generated automatically at runtime (Query Generation Strategy). It also supports other types of queries based on JPQL (Java Persistence Query Language) such as @Query and @NamedQuery.

#### Spring Security
Spring Security is a framework that allows us to fully manage the security of our Java applications. Among its characteristics we can find the following:

Security management at various levels
Portable security settings
Support for multiple authentication models (HTTP Basic, LDAP, OAuth, HTTP Digest, among others)


#### Spring Rest

Web services are applications built in order to be able to exchange information with other applications using standardized protocols such as SOAP and REST (using XML and JSON formats, respectively) without users knowing that they are navigating between different applications or services. We know this concept as interoperability.

On the other hand, Spring Rest is a way to build web services with Spring using the REST architecture and taking advantage of the Spring MVC experience. To configure the web services we use the @RestCotroller annotation in the base class, which combines the behaviors of the @Controller and @ResponseBody annotations.

### Docker

One of the ways to solve the "" it works in my machine "" is by having homogeneity in all environments. Running code on our local machine should look as close to the test and production environment as possible.

Docker is recommended, it works for all operating systems (WIN10 Pro only) and it is reproducible, we can have an infrastructure that shares everything. The images are reproducible, programmable and the documentation is in the same code.


### Web applications

* Normally, web applications are made up of the following elements: the client (browsers such as Chrome, Firefox and Safari), the web server (where we host the application and requests arrive) and the database (where we persist all the information of the users and the application).

* Web applications are accessed through a URL or web address, composed of the following elements: Communication protocol (http: // and https: //), the domain or IP of the server (in production we find domains such as www.platzi .com and development we see 4 numbers separated by points + the port 192.168.0.11:8080) and the context or section of the application (for example, / appventas or / courses / brand).

#### Advantages of web applications:

 * Ease of installation and updating
 * Saving resources on computers and devices
 * Multiplatform Compatibility (independence of the Operating System)
 * Support for multiple concurrent users
 * Multi-device access (computers, tablets, TV, mobile phone, etc)
 * Support for synchronous and asynchronous requests


#### The Applications are made up of 3 main components: 

|||
|-|-|
|The Company| its Functional Requirements (the processes, characteristics and features that we must develop)|
|The Business Application| (the sum of articulated components that develop the solution).|

*We must also bear in mind that applications are made up of multiple modular components and distributed in layers, that is, although the application is presented to users as a single service, different parts of the application may be built on programming languages and different databases.

There are two types of applications: 

|||
|-|-|
|Custom Applications |(aimed at solving a specific problem) |
|Multi Target Applications |(developed to show multiple services to different users with different needs, as well as social networks).|

We also find special and sensitive characteristics in this type of application: 

|the number of users| concurrent users (a large number of users connected at the same time)| data backups| 24/7 support and 365 days a year|


* Normally, users access web applications through a client or browser that sends all the requirements to the web server which, after analyzing the information, is in charge of making some queries to the database or processing the request in an appropriate way to return to the browser the response that we generate for the user.

* Most programming languages only have web servers, web containers responsible for handling all requests (such as Tomcat, Jetty Server, GlassFish Web Profile, Apache Server in PHP applications or Internet Information Server for .NET applications). 
* But, since version 1.4 of Java EE, we also use application servers, servers where we use an EJB component (Enterprise JavaBeans) that allow us to manage the business layer without neglecting issues such as transactionality and connection pull.


### MVC

The Architecture Patterns work from a series of layers or sections with their respective responsibilities, which communicate with each other but must be very well separated to speed up development. Thanks to architecture patterns we can reduce code duplication and facilitate application maintenance.

#### The MVC Architecture Pattern has the following elements:

|Model Layer: |Organization and structure of all classes or components related to the database.|
|Business Layer:| Rules, analysis and main or secondary functional requirements of the application.|
|View Layer:| Forms and visual components with which users must interact.|

|||
|-|-|
|MVC| Model view controller|
|Model|All the classes that have to do with the database|
|Business|  Classes that represent the business rules|
|View |Class representing the UI|


### ORM & Serverlets

* ORMs allow us to work with relational databases using object-oriented programming. JPA is the standard Java proposal that ORMs must implement to interact with the database through objects. And all these ORMs use JDBC to read and write to the database.
* Servlets are Java components or classes on the web server side that allow processing client requests and responding to them through the generation of dynamic content or redirecting them to other resources. The HttpServlet type Servlets are the most used since they work with the HTTP protocol (we can find it in the javax.servlet.http package) but, we can also use the GenericServlets if we need any other protocol (the package is javax.servlet).

### OWASP

* OWASP is an open source project dedicated to determining and combating the causes that make software insecure (mainly focused on Java and .Net applications). When building web applications we must consider the following security factors:

* Authentication and Authorization Handling Filters (URLs and content that users can access or not depending on their permissions)
Control of Error Pages (configuration of the response that we deliver to errors such as 500, 404, among others)
Sending secure requests


## Technologies

This project was created using:
* Java
* SpringToolSuite4
* Java SE Development Kit 8
* Docker
* Maven
* Tomcat
* OmniDB
* Spring(https://start.spring.io/)
* Lombok(https://projectlombok.org/download)

## Setup

To work in this project, install it locally:
* [Java SE Development Kit 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [SpringToolSuite4](https://spring.io/tools)
* [Docker](https://www.docker.com/products/docker-desktop)
* [Maven](https://maven.apache.org/download.cgi)
* [Tomcat](https://tomcat.apache.org/download-90.cgi)
* [OmniDB](https://www.omnidb.org/en/)


