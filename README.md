//----------------------* Airline Management System *--------------------------------\\

=> ProjectOverview <=

This project is a desktop-based Airline Management System developed using Core Java (Swing) and MySQL database.
The system focuses on managing airline operations such as passenger details, flight booking, cancellation, and payment tracking.

The main emphasis of this project is on:
        ->Core Java logic (OOP, JDBC)
        ->Database design and operations
        ->Efficient handling of real-time data

🛠️Technologies Used:
      ->Core Java (Primary Logic)
      ->Java Swing (GUI)
      ->JDBC (Database Connectivity)
      ->MySQL (Backend Database)


--Project Screens--

1-Login Interface Screen

<img width="723" height="458" alt="Screenshot 2026-03-19 104125" src="https://github.com/user-attachments/assets/e8d6cef4-26a6-4d5a-91f0-7e0ebdf92d54" />


Description:
This screen represents the main login interface of the Airline Management System. It provides input fields for the user to enter their username and password.
The interface is designed with a background image related to aviation to enhance user experience. It also includes two primary actions:
.Login button for existing users to access the system
.SignUp button for new users to create an account

2-Passenger Dashboard
<img width="1772" height="1077" alt="Screenshot 2026-03-19 105021" src="https://github.com/user-attachments/assets/d51ad7b7-b70d-43c9-be48-ab6ea40939af" />

Description:
This screen represents the main dashboard after login. It provides navigation options such as managing passengers, booking flights, viewing flight details, cancellations, billing, and logout.
The system uses Core Java event handling to manage navigation and integrates with the database to fetch user-specific data dynamically.

3-Add Passenger Details

<img width="1773" height="1073" alt="Screenshot 2026-03-19 105142" src="https://github.com/user-attachments/assets/ddc50a64-a7db-470f-a631-39302a03533f" />


Description:
This module allows users to insert new passenger records into the system. The data entered (name, age, address, passport, etc.) is validated using Core Java validation logic and stored in the MySQL database using JDBC PreparedStatements, ensuring data integrity and security.

4-View Passenger Details

<img width="1914" height="594" alt="Screenshot 2026-03-19 105233" src="https://github.com/user-attachments/assets/7336dafa-ec33-43d9-8c4b-f50f0dce519a" />


Description:
This screen displays all passenger records in a tabular format. Data is retrieved from the database using SQL SELECT queries and displayed using Java Swing components.
It demonstrates efficient database querying and result set handling in Core Java.

5-Update Passenger Details

<img width="1771" height="1073" alt="Screenshot 2026-03-19 105311" src="https://github.com/user-attachments/assets/a062257f-8e71-43a1-a9b0-b8bdb32ebdef" />


Description:
This module enables updating existing passenger information. The system fetches current data from the database and allows modifications.
Updates are performed using SQL UPDATE queries via JDBC, showcasing real-time database interaction and consistency.

6-Fight Information Module

<img width="1768" height="1076" alt="Screenshot 2026-03-19 105545" src="https://github.com/user-attachments/assets/674e8efe-3add-4720-b0ac-911fc5df0f29" />


Description:
This screen displays available flight details such as flight code, destination, class, and price.
The data is dynamically fetched from the database, demonstrating Core Java integration with relational data models and efficient query handling.

7-Book Flight

<img width="1632" height="947" alt="Screenshot 2026-03-19 105448" src="https://github.com/user-attachments/assets/5cd20b6e-6ea4-401e-9f83-11dbc01d1445" />


Description:
This module handles flight booking operations. It captures user selections such as source, destination, class, and generates a ticket ID.
The booking process is implemented using Core Java business logic, and the data is inserted into the database using JDBC transactions, ensuring reliability.

8-Cancel Flight Ticket

<img width="1916" height="1056" alt="Screenshot 2026-03-19 105720" src="https://github.com/user-attachments/assets/3280ac79-39d2-47ab-b296-9b6ec2eb4e2c" />


Description:
This screen allows users to cancel booked tickets by selecting a ticket ID.
The system retrieves booking details from the database and performs cancellation using SQL DELETE/UPDATE operations, maintaining accurate records.

9-Payment Details

<img width="1425" height="868" alt="Screenshot 2026-03-19 105943" src="https://github.com/user-attachments/assets/30be92eb-8d8b-4bb6-a7d2-3b54b3ee699e" />


Description:

This module displays payment-related information such as ticket ID, price, journey date, and status.
It demonstrates the use of database joins and queries to combine booking and payment data, highlighting backend data processing.

~ Conclusion:
This project demonstrates how Core Java can be effectively used with databases to build a complete real-world application.
The focus is on backend logic, database interaction, and data consistency.
-----------------------------------------------------------------------------------------------------------------------------------------------
# Airline Management System

A desktop-based Airline Management System built with Core Java, Java Swing, JDBC, and MySQL. The project manages common airline operations such as user login, passenger profile management, flight search, ticket booking, ticket cancellation, booked ticket history, cancelled ticket history, and payment status tracking.

This project focuses mainly on Core Java logic, object-oriented programming, JDBC-based database operations, Swing event handling, and real-time interaction with a relational MySQL backend.

## Project Overview

The Airline Management System is a Java desktop application designed to simplify airline data management through a graphical user interface. It allows users to maintain passenger records, view flight availability, book flights, cancel tickets, and check payment-related booking information.

The application uses Java Swing for the interface and JDBC for database communication. Data is stored and retrieved from a MySQL database named `ams`.

## Main Focus Areas

- Core Java programming and OOP-based screen/module structure
- Java Swing GUI design with event-driven navigation
- JDBC database connectivity using MySQL Connector/J
- SQL operations for insert, update, select, and status management
- Real-time data handling between desktop UI and MySQL tables
- Passenger, flight, booking, cancellation, and payment workflows

## Technologies Used

| Technology | Purpose |
|---|---|
| Core Java | Main application logic and OOP implementation |
| Java Swing | Desktop GUI screens, forms, menus, tables, and buttons |
| JDBC | Database connectivity and SQL execution |
| MySQL | Backend relational database |
| Maven | Project build and dependency management |
| MySQL Connector/J | Java driver for MySQL connectivity |
| rs2xml | Converts JDBC `ResultSet` data into Swing `JTable` models |
| NetBeans IDE | Development environment |

## Key Features

- Secure user login and signup flow
- Passenger profile creation
- Passenger profile viewing in table format
- Passenger details update module
- Dynamic flight search by source, destination, class, price, flight code, and flight name
- Ticket booking with generated ticket ID
- Booked flight history
- Ticket cancellation with cancellation reason
- Cancelled ticket history
- Journey details lookup
- Flight zone lookup by flight code
- Payment status view for successful bookings
- Menu-driven dashboard for smooth navigation

## Project Modules

### 1. Login Interface

The login screen allows existing users to access the system using username and password credentials. It also provides a signup option for new users.

Implemented in:

```text
src/main/java/AMS/Login.java
```

Database table used:

```text
users
```

### 2. Passenger Dashboard

After successful login, the user is redirected to the main dashboard. The dashboard uses a menu-based navigation system for accessing passenger, flight, cancellation, billing, and logout features.

Implemented in:

```text
src/main/java/AMS/HomePage.java
```

### 3. Add Passenger Details

This module captures passenger details such as username, name, age, date of birth, address, phone number, email, nationality, gender, and passport number. The entered data is stored in the MySQL `passenger` table.

Implemented in:

```text
src/main/java/AMS/AddPassengerDetails.java
```

Database table used:

```text
passenger
```

### 4. View Passenger Details

This screen retrieves passenger records from MySQL and displays them in a Swing table using `DbUtils.resultSetToTableModel()`.

Implemented in:

```text
src/main/java/AMS/ViewPassenger.java
```

### 5. Update Passenger Details

This module allows existing passenger records to be updated. A username is selected, current passenger data is loaded from the database, and modified information is saved back using an SQL `UPDATE` operation.

Implemented in:

```text
src/main/java/AMS/UpdatePassenger.java
```

### 6. Flight Information Module

The flight zone module displays flight data based on flight code. It helps users view available flight details stored in the `flight` table.

Implemented in:

```text
src/main/java/AMS/FlightZone.java
```

Database table used:

```text
flight
```

### 7. Book Flight

The booking module dynamically loads available sources, destinations, flight classes, prices, flight codes, and flight names from the database. It generates a ticket ID and stores the booking details with a success status.

Implemented in:

```text
src/main/java/AMS/BookFlight.java
```

Database table used:

```text
bookedFlight
```

### 8. Cancel Flight Ticket

This module allows users to cancel a booked ticket by selecting a ticket ID. It stores cancellation information in the `cancelFlight` table and updates the booking status in `bookedFlight`.

Implemented in:

```text
src/main/java/AMS/CancelFlight.java
```

Database tables used:

```text
bookedFlight
cancelFlight
```

### 9. Payment Details

The payment details module displays booking-related payment information such as ticket ID, price, journey date, journey time, username, and status for successful bookings.

Implemented in:

```text
src/main/java/AMS/CheckPaymentDetails.java
```

## Source Code Structure

```text
AMS/
|-- pom.xml
|-- nbactions.xml
|-- mysql-connector-j-9.3.0.jar
|-- src/
|   |-- mysql-connector-j-9.3.0.jar
|   |-- main/
|       |-- java/
|       |   |-- AMS/
|       |       |-- AddPassengerDetails.java
|       |       |-- BookFlight.java
|       |       |-- CancelFlight.java
|       |       |-- CheckPaymentDetails.java
|       |       |-- ConnectionClass.java
|       |       |-- FlightJourney.java
|       |       |-- FlightJourneyDetails.java
|       |       |-- FlightZone.java
|       |       |-- HomePage.java
|       |       |-- Login.java
|       |       |-- UpdatePassenger.java
|       |       |-- ViewBookedFlight.java
|       |       |-- ViewCanceledTicket.java
|       |       |-- ViewPassenger.java
|       |-- resources/
|           |-- icons/
```

## Database Design

The application connects to a local MySQL database:

```text
Database name: ams
Host: localhost
Port: 3306
```

Main tables used by the application:

| Table | Purpose |
|---|---|
| `users` | Stores login and signup credentials |
| `passenger` | Stores passenger profile information |
| `flight` | Stores available flight details |
| `bookedFlight` | Stores successful flight bookings |
| `cancelFlight` | Stores cancelled ticket records |

### Inferred Table Fields

Based on the Java source code, the project expects fields similar to the following:

```sql
CREATE DATABASE IF NOT EXISTS ams;
USE ams;

CREATE TABLE users (
    username VARCHAR(100),
    password VARCHAR(100)
);

CREATE TABLE passenger (
    username VARCHAR(100),
    name VARCHAR(100),
    age VARCHAR(20),
    dob VARCHAR(50),
    address VARCHAR(255),
    phone VARCHAR(30),
    email VARCHAR(120),
    nationality VARCHAR(80),
    gender VARCHAR(30),
    passport VARCHAR(80)
);

CREATE TABLE flight (
    f_code VARCHAR(50),
    F_name VARCHAR(100),
    source VARCHAR(100),
    destination VARCHAR(100),
    class_name VARCHAR(100),
    price VARCHAR(50)
);

CREATE TABLE bookedFlight (
    tId VARCHAR(50),
    source VARCHAR(100),
    destination VARCHAR(100),
    class_name VARCHAR(100),
    price VARCHAR(50),
    fcode VARCHAR(50),
    fname VARCHAR(100),
    journey_date VARCHAR(50),
    journey_time VARCHAR(50),
    username VARCHAR(100),
    name VARCHAR(100),
    status VARCHAR(50)
);

CREATE TABLE cancelFlight (
    tid VARCHAR(50),
    source VARCHAR(100),
    destination VARCHAR(100),
    class_name VARCHAR(100),
    price VARCHAR(50),
    fcode VARCHAR(50),
    fname VARCHAR(100),
    jdate VARCHAR(50),
    jtime VARCHAR(50),
    username VARCHAR(100),
    name VARCHAR(100),
    reason VARCHAR(255)
);
```

Note: The SQL above is inferred from the current Java code. If your local database already has a different schema, keep your actual column names aligned with the queries used in the Java files.

## How to Run

### Prerequisites

- Java JDK 22 or compatible JDK version configured in the project
- NetBeans IDE
- MySQL Server
- Maven
- MySQL database named `ams`

### Setup Steps

1. Clone the repository.

```bash
git clone https://github.com/your-username/your-repository-name.git
```

2. Open the `AMS` project in NetBeans.

3. Create the MySQL database.

```sql
CREATE DATABASE ams;
```

4. Create the required tables using the database structure above.

5. Update the database username and password in:

```text
src/main/java/AMS/ConnectionClass.java
```

Current connection format:

```java
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "your-password");
```

6. Build and run the project from NetBeans.

Recommended starting class:

```text
AMS.Login
```

## Maven Dependencies

The project uses the following Maven dependencies:

```xml
<dependency>
    <groupId>com.github.proteanit</groupId>
    <artifactId>rs2xml</artifactId>
    <version>1.0.0</version>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.3.0</version>
</dependency>
```

## Screenshots

Add your project screenshots in a folder such as:

```text
docs/screenshots/
```

Then update the paths below.

| Screen | Preview |
|---|---|
| Login Interface | `docs/screenshots/login-interface.png` |
| Passenger Dashboard | `docs/screenshots/passenger-dashboard.png` |
| Add Passenger Details | `docs/screenshots/add-passenger-details.png` |
| View Passenger Details | `docs/screenshots/view-passenger-details.png` |
| Update Passenger Details | `docs/screenshots/update-passenger-details.png` |
| Flight Information Module | `docs/screenshots/flight-information.png` |
| Book Flight | `docs/screenshots/book-flight.png` |
| Cancel Flight Ticket | `docs/screenshots/cancel-flight-ticket.png` |
| Payment Details | `docs/screenshots/payment-details.png` |

Example Markdown image format:

```md
![Login Interface](docs/screenshots/login-interface.png)
```

## Core Java Concepts Demonstrated

- Class-based modular screen design
- Swing components such as `JFrame`, `JLabel`, `JTextField`, `JButton`, `JMenuBar`, `JMenuItem`, `Choice`, `JPanel`, and `JTable`
- Event handling using `ActionListener`, `MouseAdapter`, and `ItemListener`
- JDBC connection handling with `DriverManager`
- SQL query execution using `Statement` and `PreparedStatement`
- Result-set processing with `ResultSet`
- Dynamic UI data loading from MySQL
- Table rendering using `DbUtils.resultSetToTableModel()`
- Random ticket ID generation
- Database-driven booking and cancellation workflow

## Learning Outcome

This project demonstrates how Core Java can be used to build a complete database-driven desktop application. It highlights practical use of Swing GUI design, JDBC database integration, SQL operations, and object-oriented module separation. The main learning focus is backend logic, real-time database interaction, and maintaining consistency across passenger, flight, booking, cancellation, and payment records.

## Future Enhancements

- Add stronger input validation for passenger and booking forms
- Use `PreparedStatement` consistently for all SQL operations
- Encrypt or hash user passwords before storing them
- Add a dedicated SQL dump file for database setup
- Improve ticket ID generation to avoid duplicates
- Add admin and passenger role separation
- Add reports for bookings, cancellations, and payments
- Add unit tests for validation and database service logic

## Conclusion

The Airline Management System is a practical Core Java desktop application that connects Java Swing interfaces with a MySQL backend using JDBC. It provides a complete workflow for managing passengers, flights, tickets, cancellations, and payment status, making it a strong academic and portfolio project for demonstrating Java database application development.

