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

**A collection of Enterprise Java practical programs and solutions, organized by practical number.**

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
Java-Enterprize/
├── Practical10-a/
├── Practical10-b/
├── Practical10-c/
├── Practical8-c/
├── Practical9-a/
├── Practical9-b/
├── Practical9-c/
├── Practical_1(a)/
├── Practical_1(b)/
├── Practical_1(c)/
├── Practical_2(a)/
├── Practical_2(b)/
├── Practical_2(c)/
├── Practical_3(a)_FileDownloadApp/
├── Practical_3(a)_FileUploadApp/
├── Practical_3(b)/
├── Practical_3(c)/
├── Practical_4(a)/
├── Practical_4(b)/
├── Practical_4(c)/
├── Practical_5(a)/
├── Practical_6(c)/
├── Practical_7(a)/
├── Practical_7(b)/
├── Practical_7(c)/
├── Practical_8(a)/
├── Practical_8(b)/
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


---

# 🧪 Practical 7 — JSF & Enterprise JavaBeans (EJB)

## 7a. JSF Hit Counter

A JSF application that displays a hit counter using a managed bean and a Singleton EJB.

### Main Files

```text
Practical_7(a)/
├── HitCountPage.xhtml
├── Count.java
└── CounterBean.java
```

## 7b. Visitor Statistics Using EJB and Message-Driven Bean

A visitor-tracking application using EJB components and a message-driven bean.

### Main Files

```text
Practical_7(b)/
├── VisitorPage.xhtml
├── visitor.java
├── VisitorCounter.java
└── VisitorMessageBean.java
```

## 7c. Marks Entry Using EJB and MySQL

A marks-entry application that uses a JSF page and an EJB to process marks data.

### Main Files

```text
Practical_7(c)/
├── MarksPage.xhtml
├── Marks.java
└── MarksBean.java
```

---

# 🧪 Practical 8 — JPA Applications

## 8a. Inventory Management Using JPA

An inventory application using JPA entities and an EJB to manage product information.

### Main Files

```text
Practical_8(a)/
├── InventoryPage.xhtml
├── Product.java
├── Inventory.java
└── persistence.xml
```

## 8b. Guest Book Using JPA

A Guest Book application that stores and displays guest-book entries using JPA.

### Main Files

```text
Practical_8(b)/
├── index.html
├── index.jsp
├── GuestBookView.jsp
├── GuestBook.java
└── persistence.xml
```

## 8c. Book Application Using JPA

A JPA application for working with book details.

### Main Files

```text
Practical8-c/
├── index.html
├── index.jsp
├── BookView.jsp
├── Book.java
└── persistence.xml
```

---

# 🧪 Practical 9 — JPA Associations & Hibernate

## 9a. JPA ORM Associations

A JPA application demonstrating the association between Employee and Department entities.

### Main Files

```text
Practical9-a/
├── Employee.java
├── Department.java
├── index.html
├── index.jsp
├── View.jsp
└── persistence.xml
```

## 9b. Guest Book Using Hibernate

A Hibernate application that stores guest-book feedback.

### Main Files

```text
Practical9-b/
├── GuestBookBean.java
├── hibernate.cfg.xml
├── index.html
└── fb.jsp
```

## 9c. Employee Details Using Hibernate

A Hibernate application to store and retrieve employee details.

### Main Files

```text
Practical9-c/
├── Employee.java
├── EmployeeServlet.java
├── HibernateUtil.java
├── hibernate.cfg.xml
├── index.jsp
└── employees.jsp
```

---

# 🧪 Practical 10 — Hibernate & Feedback Applications

## 10a. Student Details Using Hibernate

A Hibernate application to store and display student details.

### Main Files

```text
Practical10-a/
├── Student.java
├── StudentDetails.java
├── StudentServlet.java
├── HibernateUtil.java
├── hibernate.cfg.xml
├── index.jsp
└── students.jsp
```

## 10b. Course Details Using Hibernate

A Hibernate application to manage course information.

### Main Files

```text
Practical10-b/
├── Course.java
├── CourseServlet.java
├── HibernateUtil.java
├── hibernate.cfg.xml
├── index.jsp
└── courses.jsp
```

## 10c. Feedback Application Using JDBC

A feedback application that saves and displays feedback using Servlets, JSP, and JDBC.

### Main Files

```text
Practical10-c/
├── DBConnection.java
├── Feedback.java
├── SaveFeedbackServlet.java
├── ViewFeedbackServlet.java
├── index.jsp
├── feedback.jsp
└── viewFeedback.jsp
```

---

# ⚠️ Practicals Not Present in This ZIP

The following practical folders are not included in the supplied repository archive:

- **5b — JSP Expression Language (EL)**
- **5c — JSP Standard Tag Library (JSTL) CRUD**
- **6a — Currency Converter Using EJB**
- **6b — Room Reservation System Using EJB**

They remain listed in the practical overview as missing source folders and should not be marked as completed until their files are added.

# 📊 Practical Overview

| Practical | Topic | Main Technology | Status in ZIP |
| --- | --- | --- | --- |
| 1a | Calculator | Servlet | Present |
| 1b | Login | Servlet | Present |
| 1c | Registration | Servlet + JDBC | Present |
| 2a | Request Dispatcher | Servlet | Present |
| 2b | Cookies | Servlet | Present |
| 2c | Sessions | Servlet | Present |
| 3a | File Upload | Servlet | Present |
| 3a | File Download | Servlet | Present |
| 3b | Quiz Application | Servlet + JDBC | Present |
| 3c | Non-Blocking Read | Servlet Async I/O | Present |
| 4a | JSP Intrinsic Objects | JSP | Present |
| 4b | Form Validation | JSP + JavaBean | Present |
| 4c | Registration/Login | JSP + JDBC | Present |
| 5a | Employee Update | JSP + JDBC | Present |
| 5b | Expression Language | JSP EL | **Missing** |
| 5c | CRUD | JSP + JSTL + MySQL | **Missing** |
| 6a | Currency Converter | EJB | **Missing** |
| 6b | Room Reservation | EJB + JDBC | **Missing** |
| 6c | Shopping Cart | Stateful EJB | Present |
| 7a | JSF Hit Counter | JSF + EJB | Present |
| 7b | Visitor Statistics | JSF + EJB / MDB | Present |
| 7c | Marks Entry | JSF + EJB | Present |
| 8a | Inventory Management | JPA + EJB | Present |
| 8b | Guest Book | JPA | Present |
| 8c | Book Application | JPA | Present |
| 9a | Employee/Department Associations | JPA | Present |
| 9b | Guest Book | Hibernate | Present |
| 9c | Employee Details | Hibernate | Present |
| 10a | Student Details | Hibernate | Present |
| 10b | Course Details | Hibernate | Present |
| 10c | Feedback Application | Servlet + JSP + JDBC | Present |
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

The source folders in this repository cover the following concepts (some listed practicals are currently missing, as noted above):

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
Practical 01  Source folder present ✅
Practical 02  Source folder present ✅
Practical 03  Source folders present ✅
Practical 04  Source folder present ✅
Practical 05  Partial — 5b and 5c missing ⚠️
Practical 06  Partial — 6a and 6b missing ⚠️
Practical 07  Source folders present ✅
Practical 08  Source folders present ✅
Practical 09  Source folders present ✅
Practical 10  Source folders present ✅
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
