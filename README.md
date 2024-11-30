
### README para el Backend (Spring Boot)


# Todo List Backend

This is the backend application for the Todo List project. It is built using Spring Boot and provides a REST API to manage tasks.

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Installation

Ensure you have Java JDK 17 and Maven installed on your machine. Clone the repository and navigate into the project directory.

```bash
git clone <repository-url>
cd todo-backend
```

### Build the project:


`mvn clean install`

## Configuration
Configure your application.properties file located in src/main/resources with your database details:

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
```

## Usage
To run the application:

`mvn spring-boot:run`

The backend server will start at http://localhost:8080.

## API Endpoints

- GET /api/tareas: Retrieve all tasks.
- POST /api/tareas: Create a new task.
- PUT /api/tareas/{id}: Update task by ID.
- DELETE /api/tareas/{id}: Delete task by ID.