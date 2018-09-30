# ServerSideTest
ServerSideTest

*******************************
INTRODUCTION

This is a server side Java console application to return the details of products on a retail stores website in JSON format.

The URI to access this resource on server:
http://localhost:8080/products

This application holds a service oriented architecture having
	1. A RestController class having endpoint for GET request.
	2. ProductService.java acts as service layer for all the business logic implementation and interaction with DAO layer.
	3. ProductDetailsDAO.java is the data layer with interacts with products.csv and fetches the data in comma separated format.
	4. products.csv holds the details about each product in a comma separated format. Each new line denotes new poducts.We can add or remove the products as per the need.
	5. ProductServiceImplTest.java is the unit test case for the service layer.


*******************************
Tools,Libraries,Frameworks used:

Java 8
Springboot starter 1.5.15
Restful webservice
Maven4.0.0
Junit,PowerMockito,EasyMock for writing the test case
Git repository

*******************************
Building the Application:

This application uses Maven as the build tool

*******************************
Run the Application:

This is a standalone Java application having  spring-boot-starter-web added as its parent project thus to run the application and set the Tomcat server running

 1. Open SpringburysApiStarter.java class
 2. Run as Java application
 3 	Open the browser/postman tool and hit the URL -
 	http://localhost:8080/products
 

*******************************
TODO

Can have more test cases added gradually.
Possibility to integrate with a database and implement SQL CRUD operations instead of using a CSV





