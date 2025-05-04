# 📝 Journal App API

A simple yet powerful Spring Boot REST API that allows users to create and manage personal journal entries. Designed for beginners to understand RESTful principles and Spring Boot architecture.

---

## 🚀 Features

- ✅ Create new journal entries
- 📋 Retrieve all existing entries
- 🛠 Built with Spring Boot and Java
- 📦 In-memory data storage using `HashMap` (no database required)

---

## 📦 Tech Stack

- **Language**: Java
- **Framework**: Spring Boot
- **Tool**: Maven
- **IDE Recommended**: IntelliJ IDEA or Eclipse

---

## 🔧 How to Run the Project Locally

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/journal-app-api.git

# Navigate into the project directory
cd journal-app-api

# Run the application using Maven
mvn spring-boot:run

Once it runs successfully, the server will start on:
http://localhost:8080

## Testing with Postman
Open Postman.

For GET request:

Choose GET, paste http://localhost:8080/journal → Hit Send.

For POST request:

Choose POST, paste http://localhost:8080/journal

Go to Body → raw → JSON, and paste the JSON data shown above.

Hit Send.

You should see the new entry reflected in the GET response.
