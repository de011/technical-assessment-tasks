Technical Assessment Task
This is a Spring Boot-based project for a technical assessment that handles user authentication (using JWT), WebSocket communication for product price updates, and a basic product purchase system. It also includes JWT-based security.

Prerequisites
Java 17 or later
Maven 3.x or later
IDE (e.g., IntelliJ IDEA, VS Code)
H2 Database
Getting Started
Clone the repository:

bash

git clone https://github.com/de011/technical-assessment-tasks.git
cd technical-assessment-task
Build the project:

bash

mvn clean install
Run the application:

bash

mvn spring-boot:run
The app will run on http://localhost:8080.

Access the application
Authentication
Sign Up:

Endpoint: POST /api/signup
Request Body:
json

{ "email": "user@example.com", "password": "password123" }
Response: User registered successfully (201) or an error message.
Sign In:

Endpoint: POST /api/signin
Request Body:
json

{ "email": "user@example.com", "password": "password123" }
Response: JWT token (access and refresh tokens).
Refresh Token:

Endpoint: POST /api/refresh
Request Body:
json

{ "refreshToken": "your_refresh_token" }
Response: New access token.
WebSocket
The application supports WebSocket communication for product price updates.

Endpoint: /ws/product-price/{productId}
Handler: WebSocket connection provides real-time price updates for products.
API Endpoints
Product API

Create Product:

Endpoint: POST /api/create
Request Body:
json

{ "name": "Product1", "price": 100.0 }
Response: Created product object (201).
List Products:

Endpoint: GET /api/get/products
Response: List of all products.
Purchase API

Buy Product:
Endpoint: POST /api/buy/{productId}
Request Body:
json

{ "productId": 1, "userId": 1 }
Response: "Purchase successful" (201) or error message (400).
Database Configuration
By default, the app uses H2 for the database. To switch to another database (e.g., PostgreSQL), update application.properties:

Security Configuration
JWT Authentication: The app uses JWT for user authentication.
Security Configuration: CSRF is disabled, and only authenticated users can access most endpoints.
Role-based Access: Admin users and authenticated users can perform different actions.
Testing
To run tests:

bash

mvn test
Dependencies 
Spring Boot: Framework for building the application.
Spring Security: For handling authentication and JWT-based security.
Spring WebSocket: For real-time communication.
Spring Data JPA: For database interactions.
H2 Database: For in-memory storage in development (or PostgreSQL for production).
Lombok: For simplifying Java code.
