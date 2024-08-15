# My First Spring Boot Application

Welcome to my first Spring Boot application! This project demonstrates a basic CRUD (Create, Read, Update, Delete) operation on an `Account` entity, using a MySQL database hosted on Clever Cloud.

## Features

- **Spring Boot**: The project is built using the Spring Boot framework, making it easy to create stand-alone, production-grade Spring-based applications.
- **CRUD Operations**: Perform basic operations like Create, Read, Update, and Delete on the `Account` entity.
- **MySQL Database**: The application is connected to a MySQL database hosted on Clever Cloud, ensuring a reliable and scalable database solution.
- **Controller API**: Exposes a Controller API for interacting with the `Account` data.

## Getting Started

### Prerequisites

- **Java 17** or later
- **Maven**: For managing dependencies and building the project.
- **MySQL Database on Clever Cloud**: Make sure you have set up your MySQL database on Clever Cloud and have the connection details ready.

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/your-repo-name.git
    cd your-repo-name
    ```

2. **Configure the database connection:**

   Update the `application.properties` file located in `src/main/resources/` with your Clever Cloud MySQL database connection details:

    ```properties
    spring.datasource.url=jdbc:mysql://<your-database-url>:3306/<your-database-name>
    spring.datasource.username=<your-username>
    spring.datasource.password=<your-password>
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. **Build the project:**

    ```bash
    mvn clean install
    ```

4. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

5. **Access the API:**

   The application runs on `http://localhost:8080`. You can access the API endpoints via tools like Postman or your web browser.

### Controller Endpoints

- **Create Account**: `POST /addacc`
- **Get All Accounts**: `GET /showacc`
- **Get Account by ID**: `POST /searchacc/{id}`
- **Update Account**: `POST /depositeamt/{id, amount}`
- **Delete Account**: `DELETE deleteacc/{id}`

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

Happy coding!
