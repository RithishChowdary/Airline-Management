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

<img width="723" height="458" alt="Screenshot 2026-03-19 104125" src="https://github.com/user-attachments/assets/e8d6cef4-26a6-4d5a-91f0-7e0ebdf92d54" />
1-Login Interface Screen
Description:
This screen represents the main login interface of the Airline Management System. It provides input fields for the user to enter their username and password.
The interface is designed with a background image related to aviation to enhance user experience. It also includes two primary actions:
.Login button for existing users to access the system
.SignUp button for new users to create an account

2-Passenger Dashboard
Description:
This screen represents the main dashboard after login. It provides navigation options such as managing passengers, booking flights, viewing flight details, cancellations, billing, and logout.
The system uses Core Java event handling to manage navigation and integrates with the database to fetch user-specific data dynamically.

3-Add Passenger Details
Description:
This module allows users to insert new passenger records into the system. The data entered (name, age, address, passport, etc.) is validated using Core Java validation logic and stored in the MySQL database using JDBC PreparedStatements, ensuring data integrity and security.

4-View Passenger Details
Description:
This screen displays all passenger records in a tabular format. Data is retrieved from the database using SQL SELECT queries and displayed using Java Swing components.
It demonstrates efficient database querying and result set handling in Core Java.

5-Update Passenger Details
Description:
This module enables updating existing passenger information. The system fetches current data from the database and allows modifications.
Updates are performed using SQL UPDATE queries via JDBC, showcasing real-time database interaction and consistency.

6-Fight Information Module
Description:
This screen displays available flight details such as flight code, destination, class, and price.
The data is dynamically fetched from the database, demonstrating Core Java integration with relational data models and efficient query handling.

7-Book Flight
Description:
This module handles flight booking operations. It captures user selections such as source, destination, class, and generates a ticket ID.
The booking process is implemented using Core Java business logic, and the data is inserted into the database using JDBC transactions, ensuring reliability.

8-Cancel Flight Ticket
Description:
This screen allows users to cancel booked tickets by selecting a ticket ID.
The system retrieves booking details from the database and performs cancellation using SQL DELETE/UPDATE operations, maintaining accurate records.

9-Payment Details
Description:
This module displays payment-related information such as ticket ID, price, journey date, and status.
It demonstrates the use of database joins and queries to combine booking and payment data, highlighting backend data processing.

~ Conclusion:
This project demonstrates how Core Java can be effectively used with databases to build a complete real-world application.
The focus is on backend logic, database interaction, and data consistency.
