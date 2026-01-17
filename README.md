# Fintech Spring Boot Backend

This repository contains a **fintech backend mini project** built with **Java Spring Boot**. The project is designed as a hands-on learning and portfolio project to strengthen backend development skills, especially for real-world fintech use cases.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot 3
- Spring Web (REST API)
- Spring Data JPA (Hibernate)
- Spring Security
- H2 Database (in-memory)
- Maven

---

## 🎯 Project Goals

- Practice building RESTful APIs using Spring Boot
- Understand layered architecture (Controller, Service, Repository)
- Implement basic database integration with JPA
- Configure Spring Security for local development
- Build a strong backend foundation for fintech systems

---

## 📂 Project Structure

```
fintech
 └── src/main/java/com/example/fintech
     ├── config        # Security configuration
     ├── controller    # REST controllers
     ├── service       # Business logic
     ├── repository    # JPA repositories
     └── entity        # JPA entities
```

---

## ▶️ How to Run the Application

### Prerequisites
- Java 17+
- Maven

### Steps

```bash
mvn clean install
mvn spring-boot:run
```

Application will be available at:

```
http://localhost:8080
```

---

## 🗄️ H2 Database Console

- URL: http://localhost:8080/h2
- JDBC URL: jdbc:h2:mem:fintechdb
- Username: sa
- Password: (empty)

---

## 🔐 Security

- Spring Security is enabled
- H2 Console access is allowed for development
- CSRF and frame options are disabled for local use only

⚠️ Security configuration is for development purposes and must be adjusted for production.

---

## 📌 Current Features

- REST API endpoints
- DTO-based responses
- H2 in-memory database
- Basic Spring Security setup

---

## 🛣️ Roadmap

- JPA Entity & Repository implementation
- Persist balance data in database
- Create & update APIs
- Exception handling
- Validation
- Unit & integration testing

---

## 👤 Author

Eko Puji Pramono

---

## 📄 License

This project is for learning and portfolio purposes.
