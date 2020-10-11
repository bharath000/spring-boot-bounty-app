


## Developed and Deployed Food Donation Web App in Azure That Helps Restaurants to Donate Excess Food to Charities in the Region of Interest.

###Developed Backend of Food Donation Web App Using Spring Boot, Spring Security as RESTful Service. These Rest API's are Authorized and can be Integrated with any Frond end Framework, In this Project React is used as Front-end and MySQL is used as database. The Entire Application is Deployed in Azure Cloud as Three Independent Services (DB, Web-Server, Front-End)


### Folder Strucuture

pom.xml - contains the dependencies

Backend/Src contains the Main folder
com.backend.backend   - consists the main Application file from here a spring boot application starts running.
com.backend.backend/config - Security configuration
com.backend.backend/controller - Different Controllers for getting Authentication, Authorization and Serving Rest Api's Based on requests
com.backend.backend/repository - Connection to DB and Queries to DB based on controllers and application requirments.
com.backend.backend/secuirty - Authentication of Users Based on Jwt, Generating Jwt Based on its expiration on user front.
com.backend.backend/Model - Schema's For Data Quering to the DB 
com.backend.backend/exception's - Throw's various Error Exception's like Authentication Failure etc..
com.backend.backend/payload - Contains Schema's For Data send through front-end.

main/resources - Contains connection details to DB using Hibernet and Jwt Token properties.  	
		


### Infrastructure
Java 11 <br>
Intellij <br>
Sprint Boot 2.3.1 <br>
jjwt 0.9.1 <br>
MySQL 18.0 <br>
Maven 3.6 <br>

### The Front-End React developemnt Link:
https://github.com/bharath000/frontend-bounty