# OAuth Security using Spring Boot

## 📌 Project Overview

This project demonstrates **OAuth 2.0 Authentication** using **Spring Boot** and **Spring Security**.

Users can log in using their **GitHub account** instead of creating a username and password. After successful authentication, Spring Security authorizes the user and grants access to protected resources.

---

## 🚀 Features

* OAuth 2.0 Authentication
* GitHub Login
* Spring Security Integration
* Secure Authentication
* Role-based Security Support
* Simple Spring Boot Configuration

---

## 📂 Project Structure

```text
src
 └── main
      ├── java
      │     └── com.aadiandjava
      │            ├── config
      │            ├── controller
      │            ├── rest
      │            └── OAuthSecurityApplication.java
      │
      └── resources
            ├── application.properties
            └── static
```

---

## 🛠 Technologies Used

* Java 17
* Spring Boot
* Spring Security
* OAuth 2.0
* GitHub OAuth App
* Maven
* Eclipse IDE
* Git
* GitHub

---

## ⚙️ OAuth Authentication Flow

```text
User
   │
   ▼
Spring Boot Application
   │
   ▼
Spring Security
   │
   ▼
GitHub Login Page
   │
   ▼
User Authentication
   │
   ▼
Authorization Code
   │
   ▼
Access Token
   │
   ▼
User Details
   │
   ▼
Application Home Page
```

---

## 📦 Dependencies

* Spring Boot Starter Web
* Spring Boot Starter Security
* Spring Security OAuth2 Client

---

## ▶️ How to Run

1. Clone the repository.
2. Open the project in Eclipse or IntelliJ IDEA.
3. Configure your GitHub OAuth Client ID and Client Secret in `application.properties`.
4. Run the Spring Boot application.
5. Open the browser.
6. Click **Login with GitHub**.
7. After successful login, access the secured application.

---

## 🔑 Concepts Covered

* Spring Security
* OAuth 2.0
* Authentication
* Authorization
* GitHub Login
* Client Registration
* Access Token
* Secure Login Flow

---

## 📸 Output

* Login using GitHub
* User Authentication Successful
* Secure Access to Application

---

## 👩‍💻 Author

**Monali Babasaheb Palve**
