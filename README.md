# Spring_SpringBoot_Gradle_01 

### Usage
\- Import build.gradle file in IDE;  
\- Run com/chris/giflib/AppConfig.java;   
\- Open browser to localhost:8080.   

### Gradle run commands:

gradle clean  
gradle build  
gradle run  

### Gradle Wrapper run commands:

./gradlew clean  
./gradlew build  
./gradlew run  

### Description   
  
Basic exercise with Spring, Spring Boot, MVC, Gradle - ex01

Basic website where a list of "uploaded" images are shown as list or by category.

- Create java gif objects;
- Create controllers;
- Create templates.


01 - Add a Spring Configuration File
	Spring_SpringBoot_Gradle_01/src/main/java/com/chris/giflib/AppConfig.java
	
02 - Add Controller and Thymeleaf

03 - POJO (gif object), Dependency Injection (@Autowired), @PathVariable

04 - Add Category list;   

MVC Architecture:   
- Model = gif object;    
- View = thymeleaf templates;     
- Controller = gif controller.   

Used Annotations list:
- @Autowired
- @Component
- @Controller
- @PathVariable
- @RequestMapping
- @SpringBootApplication
