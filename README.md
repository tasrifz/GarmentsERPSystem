#Garments ERP System

A Java Swing–based desktop application developed with NetBeans to manage core operations of a garments business. The system provides user authentication, employee and order management, production tracking, inventory management, and full CRUD (Create, Read, Update, Delete) operations using a MySQL database via JDBC.

##Key Features

User authentication (Login & Registration)

Employee management (ID, Name, Department, Salary) with CRUD operations

Buyer order management (ID, Buyer Name, Product, Quantity, Order Date) with CRUD operations

Production management (ID, Order ID, Quantity, Status) with CRUD operations

Inventory management (Item ID, Name, Quantity, Type) with CRUD operations

Secure MySQL database integration via JDBC

##Technologies

Java (Swing)

NetBeans IDE

MySQL

JDBC

##Project Structure

ui – Application forms (Login, Register, Dashboard, Modules)

model – Data models (Employee, BuyerOrder, Production, Inventory, etc.)

dao – Database access layer (CRUD operations)

util – Database connection utility

##How to Run

Clone or download the repository.

Open the project in NetBeans.

Configure the MySQL database connection in DBConnection class.

Create required database tables.

Run the application starting from the LoginForm.

##Security Note

Database credentials and sensitive configuration details are not included for security reasons.

##Author

S.M. Tasrif Zaman
Java Developer | ERP System Enthusiast
