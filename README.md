![Screenshot1](https://github.com/user-attachments/assets/ac611fa3-a23e-4049-adcd-2efde9e9ee45)
![Screenshot2](https://github.com/user-attachments/assets/f10ddd3f-b2bf-4378-9526-3bbdefcd71ee)
![Screenshot3](https://github.com/user-attachments/assets/7db66433-9693-4335-93d7-29222616d620)
![Screenshot4](https://github.com/user-attachments/assets/8a3eae6e-9fd3-4ed3-b517-5e742a51597e)
![Screenshot5](https://github.com/user-attachments/assets/bad2a0b7-9035-4229-9358-de10eeb0f5e0)
![Screenshot6](https://github.com/user-attachments/assets/8a80606e-7051-4dc5-b78e-7e39e6077516)
![Screenshot7](https://github.com/user-attachments/assets/4f29b491-e74a-49fc-b50e-aaabe1635437)
![Screenshot8](https://github.com/user-attachments/assets/7bacba1b-67d6-4d82-be63-187f3968b6b4)
[scmProject.webm](https://github.com/user-attachments/assets/d3e9e52a-b116-4abf-881a-950f573244df)

# Smart Contact Manager Web-Application

The Smart Contact Manager is a web-based application designed to manage contacts efficiently. It serves as a centralized platform for users to store, organize, and manage their personal and professional contacts. The application leverages the power of Spring Boot for the backend, Thymeleaf as a server-side templating engine, and modern front-end technologies for styling and responsiveness.

## Key Features

### 1. User Authentication and Authorization :
- **Secure Access :** Implemented robust login and registration workflows to protect user data.
- Users can log in using their **Google** or **GitHub** accounts for seamless and secure authentication.

### 2. Advanced Contact Management :
- **Full CRUD Functionality :** Users can easily add, update, view, and delete contacts..
- **Enhanced User Experience :** Integrated search and filter functionalities for streamlined data management.

### 3. Responsive Design :
- **Modern UI/UX :** Designed with Tailwind CSS for responsiveness and adaptability across devices.
- Ensures seamless usability on desktops, tablets, and mobile devices.

### 4. Scalable Backend Framework :
- **Dependency Injection** for clean and modular code.
- **RESTful APIs** for flexible frontend-backend integration.
- **MySQL Database** for efficient database management and scalability.

### 5. Dynamic Frontend Integration :
- Thymeleaf Templates for dynamic, server-side rendered pages.
Node.js-based tooling for managing front-end assets (e.g., Tailwind CSS).

### 6. Reliable Database Integration :
**Persistent Data Storage :** Securely stores user and contact information in a MySQL relational database.
**Optimized with JPA and Hibernate :** Configured with JPA and Hibernate to simplify querying, data manipulation, and ensure robust data management.

## Project Structure 

### Maven Configuration :
The pom.xml file manages the project's dependencies and configurations.

### Source Code :
#### src/main :
- **Config :** Contains configuration classes for user login, registration, and authentication.
- **Controller :** Handles HTTP requests and maps them to appropriate views or services.
- **Services :** Contains the business logic of the application.
- **Model/Entity :** Defines data models for contacts and users.
- **Forms :** Manages contact form data.
- **Validators :** Performs validation on form inputs
- **Repository :** Interfaces for database operations.
- **Thymeleaf Templates :** HTML templates for rendering the front-end.
#### src/test : 
- Contains unit and integration test cases to ensure the application's functionality.

## Tech Stack

### 1. Frontend :
- HTML, CSS, JavaScript
- Tailwind CSS for styling
- Thymeleaf for server-side templates

### 2. Backend :
- Spring Boot
- Java
- RESTful APIs

### 3. Database :
- Relational Database (e.g., MySQL)

### 4. Build Tools :
- Maven
  
### 5. Version Control :
- Git with .gitignore for managing project-specific exclusions.

## Installation

### Prerequisites:
- Java 11 or later
- Maven
- MySQL Database running locally or remotely
