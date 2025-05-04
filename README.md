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
## 🌐 Server URL

Once the project runs successfully, the Spring Boot server will start at:
http://localhost:8080/


---

## 🧪 Testing the API with Postman

You can use [Postman](https://www.postman.com/) or any REST client to test the endpoints.

### 🔹 GET Request: Fetch All Journal Entries

- **Method**: `GET`  
- **URL**: `http://localhost:8080/journal`

#### ✅ Steps:
1. Open Postman.
2. Set method to `GET`.
3. Enter the URL: `http://localhost:8080/journal`
4. Click **Send**.
5. You should receive a JSON array of all journal entries.

---

### 🔹 POST Request: Create a New Journal Entry

- **Method**: `POST`  
- **URL**: `http://localhost:8080/journal`
- **Headers**: `Content-Type: application/json`
- **Body (raw JSON)**:

```json
{
  "id": 1,
  "title": "First Entry",
  "content": "This is my first journal entry!"
}



## 🔧 How to Run the Project Locally

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/journal-app-api.git

# Navigate into the project directory
cd journal-app-api

# Run the application using Maven
mvn spring-boot:run




