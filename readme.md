## Developed and Deployed Food Donation Web App in Azure That Helps Restaurants to Donate Excess Food to Charities in the Region of Interest.

### Developed Backend of Food Donation Web App Using Spring Boot, Spring Security as RESTful Service. These Rest API's are Authorized and can be Integrated with any Frond end Framework, In this Project React is used as Front-end and MySQL is used as database. The Entire Application is Deployed in Azure Cloud as Three Independent Services (DB, Web-Server, Front-End)


### Folder Strucuture

<b>pom.xml</b> - contains the dependencies

<b>Backend/Src contains the Main folder:</b>

<br>com.backend.backend</br>   - consists the main Application file from here a spring boot application starts running.<br>
<br>com.backend.backend/config</br> - Security configuration<br>
<br>com.backend.backend/controller</br> - Different Controllers for getting Authentication, Authorization and Serving Rest Api's Based on requests
<br>com.backend.backend/repository</br> - Connection to DB and Queries to DB based on controllers and application requirments.<br>
<br>com.backend.backend/secuirty</br> - Authentication of Users Based on Jwt, Generating Jwt Based on its expiration on user front.<br>
<br>com.backend.backend/Model</br> - Schema's For Data Quering to the DB <br>
<br>com.backend.backend/exception's</br> - Throw's various Error Exception's like Authentication Failure etc..<br>
<br>com.backend.backend/payload</br> - Contains Schema's For Data send through front-end.<br>

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