# 🚀 Enterprise Java — College Practicals

<div align="center">

# ☕ Enterprise Java Practicals

### 📚 TYBSc Information Technology

**University of Mumbai**

---

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![Servlet](https://img.shields.io/badge/Servlet-000000?style=for-the-badge\&logo=apachetomcat\&logoColor=white)
![JSP](https://img.shields.io/badge/JSP-5382A1?style=for-the-badge\&logo=java\&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge\&logo=mysql\&logoColor=white)
![EJB](https://img.shields.io/badge/EJB-Enterprise%20Java-orange?style=for-the-badge)

**A complete collection of Enterprise Java practical programs and solutions.**

</div>

---

## 📖 About This Repository

This repository contains my **Enterprise Java practicals**, including source code, database queries, JSP pages, Servlets, JavaBeans, JDBC applications, JSTL examples, and EJB applications.

The practicals are based on the **University of Mumbai — Enterprise Java Practical Teacher's Reference Manual** for **T.Y. B.Sc. Information Technology**.

The repository is intended for:

* 🎓 College practical submissions
* 💻 Enterprise Java practice
* 🧪 Practical examination preparation
* 📚 Quick revision
* 🗂️ Maintaining all practical solutions in one place

---

# 🛠️ Technologies Used

| Technology                        | Purpose                      |
| --------------------------------- | ---------------------------- |
| ☕ Java                            | Core programming             |
| 🌐 Servlets                       | Server-side web applications |
| 📄 JSP                            | Dynamic web pages            |
| 🗄️ JDBC                          | Database connectivity        |
| 🐬 MySQL                          | Database management          |
| 🫘 JavaBeans                      | Reusable Java components     |
| 🧩 JSTL                           | JSP Standard Tag Library     |
| 🏢 EJB                            | Enterprise Java components   |
| 🍃 HTML                           | Web forms and UI             |
| 🖥️ NetBeans                      | Development IDE              |
| 🐱 Apache Tomcat / Java EE Server | Application deployment       |

The reference manual lists **JDK 8u181, NetBeans 8.1 or higher, and MySQL 5.5 or higher** among its requirements.

---

# 📂 Repository Structure

```text
Enterprise-Java/
│
├── Practical-1/
│   ├── 1a-Calculator-Servlet/
│   ├── 1b-Login-Servlet/
│   └── 1c-Registration-JDBC/
│
├── Practical-2/
│   ├── 2a-RequestDispatcher/
│   ├── 2b-Cookies/
│   └── 2c-Sessions/
│
├── Practical-3/
│   ├── 3a-File-Upload-Download/
│   ├── 3b-Quiz-Application/
│   └── 3c-NonBlocking-Read/
│
├── Practical-4/
│   ├── 4a-JSP-Intrinsic-Objects/
│   ├── 4b-JSP-Validation-JavaBean/
│   └── 4c-JSP-Registration-Login-JDBC/
│
├── Practical-5/
│   ├── 5a-Employee-Update/
│   ├── 5b-JSP-Expression-Language/
│   └── 5c-JSTL-CRUD/
│
├── Practical-6/
│   ├── 6a-Currency-Converter-EJB/
│   ├── 6b-Room-Reservation-EJB/
│   └── 6c-Shopping-Cart-Stateful-EJB/
│
└── README.md
```

---

# 🧪 Practical 1 — Servlet & JDBC Basics

## 1a. Calculator Application Using Servlet 🧮

A simple calculator application using a Servlet.

### Operations

* ➕ Addition
* ➖ Subtraction
* ✖️ Multiplication
* ➗ Division

The application accepts two numbers and an operation through an HTML form and displays the calculated result.

### Main Files

```text
index.html
CalculatorServlet.java
```

---

## 1b. Login Page Using Servlet 🔐

A Servlet-based login application.

### Functionality

* Accepts User ID
* Accepts Password
* Valid credentials → Welcome message
* Invalid credentials → Login failed message

The reference implementation uses `admin` with password `12345` for its basic demonstration.

### Main Files

```text
index.html
LoginServlet.java
```

---

## 1c. Registration Servlet Using JDBC 📝

A registration application that stores user information in MySQL using JDBC.

### Details

* Username
* Password
* Email
* Country

### Database

```sql
CREATE DATABASE LoginDB;

USE LoginDB;

CREATE TABLE user(
    username VARCHAR(20) PRIMARY KEY,
    password VARCHAR(20),
    email VARCHAR(20),
    country VARCHAR(20)
);
```

The manual's example connects the Servlet to MySQL and inserts the submitted values using a `PreparedStatement`.

---

# 🧪 Practical 2 — RequestDispatcher, Cookies & Sessions

## 2a. Request Dispatcher Interface 🔄

A Servlet application demonstrating `RequestDispatcher`.

### Functionality

* Validates password
* Correct password → forwards to Welcome Servlet
* Incorrect password → includes the login page and displays an error

The reference example uses the password `servlet` for the demonstration.

### Main Files

```text
index.html
LoginServlet.java
WelcomeServlet.java
```

---

## 2b. Cookies 🍪

A Servlet application demonstrating Cookies and visitor tracking.

### Concepts

* Creating Cookies
* Reading Cookies
* Updating Cookies
* Tracking number of visits
* Passing user information between pages

The reference implementation stores a username and visit count in Cookies and increments the visit count on subsequent pages.

### Main Files

```text
index.html
Page1.java
Page2.java
Page3.java
Page4.java
Page5.java
```

---

## 2c. Session Management 🔑

A Servlet application demonstrating:

* Session creation
* Session ID
* Session attributes
* Visit tracking
* Session creation time
* Session termination

The example uses `HttpSession` and provides a logout Servlet that invalidates the session.

### Main Files

```text
index.html
Page1.java
Page2.java
Page3.java
Page4.java
LogoutServlet.java
```

---

# 🧪 Practical 3 — File Handling, Database Quiz & Non-Blocking I/O

## 3a. File Upload & Download 📁

A Servlet application for uploading and downloading files.

### Upload

Uses:

```java
@MultipartConfig
```

and handles uploaded files using:

```java
Part
InputStream
OutputStream
```

### Download

Files can be downloaded using a dedicated Download Servlet.

### Main Files

```text
index.html
FileUploadServlet.java
DownloadServlet.java
```

---

## 3b. Quiz Application Using Database 🧠

A database-driven quiz application using Servlet + JDBC + MySQL.

### Database

```text
qadb
```

### Table

```text
quiz
```

### Stored Information

```text
Question Number
Question
Option 1
Option 2
Option 3
Option 4
Correct Answer
```

### Application Flow

```text
index.html
     ↓
QuizServlet
     ↓
MySQL Database
     ↓
Display Questions
     ↓
User Selects Answers
     ↓
ShowResult
     ↓
Score
```

The reference implementation retrieves questions from MySQL and compares submitted answers against the stored `ans` field.

### Main Files

```text
index.html
QuizServlet.java
ShowResult.java
```

---

## 3c. Non-Blocking Read Operation ⚡

A Servlet application demonstrating **Non-Blocking I/O**.

### Concepts

* `AsyncContext`
* `ServletInputStream`
* `ReadListener`
* Asynchronous processing
* Non-blocking read operation

The manual uses `ReadingListener` with `ReadingNonBlockingServlet` and enables asynchronous Servlet support.

### Main Files

```text
index.html
NonBlockingServlet.java
ReadingListener.java
ReadingNonBlockingServlet.java
```

---

# 🧪 Practical 4 — JSP & JavaBeans

## 4a. JSP Intrinsic Objects 📄

A JSP application demonstrating JSP intrinsic objects.

### Objects Demonstrated

```text
request
response
session
```

### Information Displayed

* Query String
* Context Path
* Remote Host
* Character Encoding
* Content Type
* Locale
* Session ID
* Session Creation Time
* Last Access Time

The reference application displays these values directly from JSP intrinsic objects.

---

## 4b. JSP Validation Using JavaBean ✅

A JSP application that passes form values between pages and validates them using a JavaBean.

### Input Fields

* Name
* Age
* Hobbies
* Email
* Gender

### JavaBean

```text
CheckerBean.java
```

### JSP

```text
index.html
Validate.jsp
successful.jsp
```

The Bean exposes getter/setter methods and a `validate()` method; the JSP uses `<jsp:useBean>` and `<jsp:setProperty>`.

---

## 4c. JSP Registration & Login Using JDBC 🔐

A complete registration and authentication system using:

```text
HTML
JSP
JDBC
MySQL
```

### Registration

```text
Register.html
        ↓
Register.jsp
        ↓
MySQL
```

### Login

```text
Login.html
        ↓
Login.jsp
        ↓
MySQL
        ↓
Authentication
```

## The reference implementation checks password confirmation during registration and queries the stored password during login.

# 🧪 Practical 5 — JSP Database Operations

## 5a. Employee Record Update 👨‍💼

A JSP application that updates employee information based on employee number.

### Fields

```text
Employee Number
Name
Age
Salary
```

### Database

```text
emp
```

### Operations

* Search employee
* Verify employee existence
* Update salary
* Update age

The reference practical defines an employee table and updates records matching the submitted employee ID.

---

## 5b. JSP Expression Language (EL) 🧩

A JSP application demonstrating **Expression Language**.

### Example Concepts

```text
${expression}
${param.value}
${variable}
```

The manual specifies this practical as an EL demonstration and allows an example such as a calculator or formula-based application.

---

## 5c. JSP Standard Tag Library (JSTL) 🗃️

A JSP database application demonstrating **JSTL Core and SQL tags**.

### Operations

```text
INSERT
SELECT
UPDATE
DELETE
```

### Database

```text
sampleDB
```

### Table

```text
product
```

### Example Data

```text
Mouse       50
Keyboard     5
Monitor     34
```

### Main JSP Files

```text
index.jsp
insert.jsp
insertdb.jsp
display.jsp
update.jsp
updatedb.jsp
deletedb.jsp
```

## The reference implementation uses JSTL `core` and `sql` tag libraries to implement database CRUD operations.

# 🧪 Practical 6 — Enterprise JavaBeans (EJB)

## 6a. Currency Converter Using EJB 💱

A currency converter application using a **Stateless Session Bean**.

### Conversion

```text
Rupees → Dollars
Dollars → Rupees
```

### Components

```text
index.html
CCServlet.java
CCBean.java
```

The Servlet injects `CCBean` using `@EJB`, while `CCBean` is declared using `@Stateless`.

---

## 6b. Room Reservation System Using EJB 🏨

A room reservation application using EJB.

### Room Types

```text
Delux
Super Delux
Suit
```

### System Features

* Select room type
* Enter customer name
* Enter mobile number
* Find available room
* Book room
* Store customer information
* Update room status
* Display room charges

### Database

```text
rrdb
```

### Main Components

```text
RoomBook.html
RBServlet.java
RRBean.java
```

## The reference uses a room table with room type, charges, customer information and booking status, and a Stateless Session Bean to perform the booking operation.

## 6c. Shopping Cart Using Stateful Session Bean 🛒

A simple shopping cart application demonstrating a **Stateful Session Bean**.

### Components

```text
CartBeanLocal.java
CartBean.java
CartTestServlet.java
```

### Features

* Initialize customer
* Add books
* Remove books
* Display cart contents
* Remove/terminate cart

The `CartBean` is declared with `@Stateful` and maintains a list of items for the customer.

### Sample Books

```text
Java 8 Cookbook
Enterprise Java 7
Java for Dummies
Learn Java 8
```

---

# 📊 Practical Overview

| Practical | Topic                | Main Technology        |
| --------- | -------------------- | ---------------------- |
| 1a        | Calculator           | Servlet                |
| 1b        | Login                | Servlet                |
| 1c        | Registration         | Servlet + JDBC         |
| 2a        | Request Dispatcher   | Servlet                |
| 2b        | Cookies              | Servlet                |
| 2c        | Sessions             | Servlet                |
| 3a        | File Upload/Download | Servlet                |
| 3b        | Quiz Application     | Servlet + JDBC + MySQL |
| 3c        | Non-Blocking Read    | Servlet Async I/O      |
| 4a        | Intrinsic Objects    | JSP                    |
| 4b        | Form Validation      | JSP + JavaBean         |
| 4c        | Registration/Login   | JSP + JDBC             |
| 5a        | Employee Update      | JSP + JDBC             |
| 5b        | Expression Language  | JSP EL                 |
| 5c        | CRUD                 | JSP + JSTL + MySQL     |
| 6a        | Currency Converter   | EJB                    |
| 6b        | Room Reservation     | EJB + JDBC             |
| 6c        | Shopping Cart        | Stateful EJB           |

---

# ⚙️ Setup & Requirements

According to the practical reference manual, the original environment includes:

```text
JDK 8u181
NetBeans 8.1 or higher
MySQL 5.5 or higher
```

### Recommended Project Setup

1. Install Java JDK.
2. Install NetBeans.
3. Install MySQL Server.
4. Configure the required Servlet/JSP/EJB server.
5. Create the required MySQL databases.
6. Add the required JDBC driver.
7. Open the practical project.
8. Configure database credentials.
9. Run the application on the configured Java server.

---

# 🗄️ Database-Based Practicals

The repository contains database-based applications involving:

```text
LoginDB
qadb
empdb
sampleDB
rrdb
```

These databases are used throughout the practicals for registration, quiz, employee, JSTL CRUD and room reservation applications.

> ⚠️ **Note:** Database usernames, passwords, JDBC URLs and server configuration may need to be changed according to your local setup.

---

# 🎯 Learning Outcomes

By completing these practicals, I practiced:

* ✅ Java Servlets
* ✅ HTTP Request & Response
* ✅ HTML Forms
* ✅ RequestDispatcher
* ✅ Cookies
* ✅ Session Management
* ✅ File Upload & Download
* ✅ JDBC
* ✅ MySQL
* ✅ JSP
* ✅ JSP Intrinsic Objects
* ✅ JSP Expression Language
* ✅ JavaBeans
* ✅ JSTL
* ✅ CRUD Operations
* ✅ Asynchronous Servlet Processing
* ✅ EJB
* ✅ Stateless Session Beans
* ✅ Stateful Session Beans
* ✅ Database-driven Enterprise Applications

---

# 📚 Practical Progress

```text
Practical 01  ████████████████████ 100% ✅
Practical 02  ████████████████████ 100% ✅
Practical 03  ████████████████████ 100% ✅
Practical 04  ████████████████████ 100% ✅
Practical 05  ████████████████████ 100% ✅
Practical 06  ████████████████████ 100% ✅
```

---

# 📌 Disclaimer

This repository is created for **educational and practical-learning purposes**.

The programs are based on the **University of Mumbai Enterprise Java Practical Teacher's Reference Manual**.

Some examples in the original manual use older Java EE APIs, JDBC drivers and server configurations. Depending on your Java/server version, small configuration or compatibility changes may be required.

---

# 👨‍💻 Author

**Omkar**

🎓 T.Y. B.Sc. Information Technology
💻 Enterprise Java Practicals

---

<div align="center">

### ⭐ If this repository helped you, consider giving it a star!

**Made with ☕ Java & ❤️ for learning**

</div>
