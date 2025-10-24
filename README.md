# 📧 Notification Service (Spring Boot Email Sender)

This project is a simple **Spring Boot Email Notification Service** that sends emails using Gmail SMTP.  
It can be tested easily with **Firecamp** or **Postman** using a JSON request.

---

## 🚀 Features
- Send emails through Gmail SMTP
- Secure configuration using App Passwords
- Simple REST API endpoint
- Easy testing with Firecamp or Postman

---

## ⚙️ Project Setup

### 1️⃣ Prerequisites
- Java 17 or higher
- Maven
- A Gmail account
- App Password generated from your Google Account

---

### 2️⃣ Gmail SMTP Configuration

In your `application.properties` (or `.yml`) file, add:

```properties
spring.application.name=NotificationService
spring.mail.host=smtp.gmail.com
spring.mail.port=465
spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password

spring.mail.protocol=smtps
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.ssl.enable=true
spring.mail.properties.mail.smtp.starttls.enable=true
