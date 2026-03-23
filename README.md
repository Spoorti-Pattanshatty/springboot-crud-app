# 📚 Spring Boot CRUD Application

A **RESTful Book Management API** built using **Spring Boot**, implementing full CRUD operations with a clean layered architecture.

---

## 🚀 Project Overview

This project demonstrates how to build a **scalable backend application** using Spring Boot.  
It provides APIs to create, read, update, and delete book records while following industry-standard design patterns.

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3.x**
- **Spring Web (REST APIs)**
- **Spring Data JPA**
- **Hibernate (ORM)**
- **MySQL**
- **Maven**
- **Embedded Tomcat**

---

## 📂 Project Structure

src/main/java/com/tap
│── controller # Handles HTTP requests
│── service # Business logic
│── repository # Database operations
│── model # Entity classes

src/main/resources
│── application.properties
│── static
│── templates


---

## 🔗 API Endpoints

| Method | Endpoint        | Description            |
|--------|---------------|------------------------|
| GET    | /Book         | Get all books          |
| GET    | /Book/{id}    | Get book by ID         |
| POST   | /Book         | Create new book        |
| PUT    | /Book/{id}    | Update book            |
| DELETE | /Book/{id}    | Delete book            |

---

## ⚙️ Setup & Installation

### 1️⃣ Clone Repository
```bash
git clone https://github.com/your-username/springboot-crud-app.git
cd springboot-crud-app

