# User-Department-MS

Created two Microservices - **User** and **Department**
with features:
              - Eureka Server : _holds the information about all client-service applications_
              - Cloud Config : _storing and serving distributed configurations across multiple applications and environments_
              - API Gateway : Re-Routing through a separate gateway
              

**Department Microservice**
  - Operations: POST, Get: Department.class 
  - POST: Department Details --> DepartmentId gets generated
  - GET: /departments/{departmentId} --> To fetch department details from departmentId

**User Microservice**
  - Operations: POST, GET: User.class
  - POST: User Details (Contains departmentId) --> UserId auto generated
  - GET: User+Department Details from userId --> /users/{userId}
