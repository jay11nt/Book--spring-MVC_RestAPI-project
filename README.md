# Spring Boot Book Management System
🔸 Spring MVC project named Book, Rest-API calling services of book entity

## **Overview**

- This is a simple Book Management System built using Spring Boot. It provides a RESTful API to manage books, including functionalities to add, update, retrieve, and delete books.
  
## **Project Structure**

      book-management-system/
      │   ├── src/
      │   │   ├── main/
      │   │   │   ├── java/in/sb/main/
      │   │   │   │   ├── controller/BookController.java
      │   │   │   │   ├── entity/Book.java
      │   │   │   │   ├── services/BookService.java
      │   │   ├── resources/
      │   │   │   ├── application.properties
      │   ├── pom.xml
      │   ├── README.md

**Technologies Used**

 - Java
 - Spring Boot
 - REST API
 - Maven

**API Endpoint-**

Method      Endpoint            Description

GET        /api/books            Get all books
GET        /api/books/{id}       Get book by ID
POST        /api/books           Add a new book  
PUT        /api/books/{id}      Update book details
DELETE      /api/books/{id}      




Delete a book
**API Endpoints**
▪  for GET -> http://localhost:8080/books

▪  for GET by id -> http://localhost:8080/books/1 or 2
