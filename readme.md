## Developed and Deployed Food Donation Web App in Azure That Helps Restaurants to Donate Excess Food to Charities in the Region of Interest.

### Developed Backend of Food Donation Web App Using Spring Boot, Spring Security as RESTful Service. These Rest API's are Authorized and can be Integrated with any Frond end Framework, In this Project React is used as Front-end and MySQL is used as database. The Entire Application is Deployed in Azure Cloud as Three Independent Services (DB, Web-Server, Front-End)


### Folder Strucuture

<b>pom.xml</b> - contains the dependencies

<b>Backend/Src contains the Main folder:</b>

<b>com.backend.backend</b>   - consists the main Application file from here a spring boot application starts running.<br>
<b>com.backend.backend/config</b> - Security configuration<br>
<b>com.backend.backend/controller</b> - Different Controllers for getting Authentication, Authorization and Serving Rest Api's Based on requests
<b>com.backend.backend/repository</b> - Connection to DB and Queries to DB based on controllers and application requirments.<br>
<b>com.backend.backend/secuirty</b> - Authentication of Users Based on Jwt, Generating Jwt Based on its expiration on user front.<br>
<b>com.backend.backend/Model</b> - Schema's For Data Quering to the DB <br>
<b>com.backend.backend/exception's</b> - Throw's various Error Exception's like Authentication Failure etc..<br>
<b>com.backend.backend/payload</b> - Contains Schema's For Data send through front-end.<br>

main/resources - Contains connection details to DB using Hibernet and Jwt Token properties.<br>  	
		


### Infrastructure
Java 11 <br>
Intellij <br>
Sprint Boot 2.3.1 <br>
jjwt 0.9.1 <br>
MySQL 18.0 <br>
Maven 3.6 <br>

### The Front-End React developemnt Link:
https://github.com/bharath000/frontend-bounty