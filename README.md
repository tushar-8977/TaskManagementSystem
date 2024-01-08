# Task Management System

This is a simple Task Management System implemented using Java (Spring Boot) for the backend and thymeleaf for the frontend.

## Features

- CRUD operations for tasks
- Database integration with MySQL
- Basic authentication and authorization
- User-friendly frontend interface

## Setup Instructions

### Prerequisites

- Java Development Kit (JDK)
- MySQL Database
- thymeleaf

1. Set up MySQL database:
   - Create a new MySQL database for the Task Management System.
   - Update the `src/main/resources/application.properties` file with your database configuration:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=root
     spring.datasource.password=Tushar@1234
     ```

2. Run the Spring Boot application:
   - Open a terminal in the root directory of the project.
   - Run the following command:

     ```bash
     ./mvnw spring-boot:run
     ```

   - The backend server will start at [http://localhost:8080/tasks](http://localhost:8080/tasks).
