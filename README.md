# Garments ERP System

A Java Swing–based desktop application developed with NetBeans to manage core operations of a garments business.  
The system provides user authentication, employee and order management, basic production tracking, and inventory management using a MySQL database via JDBC.

## Key Features
- User authentication (Login & Registration)
- Employee management (ID, Name, Department, Salary)
- Buyer order management (ID, Buyer Name, Product, Quantity, Order Date)
- Production management (ID, Order ID, Quantity, Status)
- Inventory management (Item ID, Name, Quantity, Type)
- Secure MySQL database integration via JDBC

## Technologies
- Java (Swing)
- NetBeans IDE
- MySQL
- JDBC

## Project Structure
- **ui** – Application forms (Login, Register, Dashboard, Modules)  
- **model** – Data models (Employee, BuyerOrder, Production, Inventory, etc.)  
- **dao** – Database access layer  
- **util** – Database connection utility  

## How to Run
1. Clone or download the repository.  
2. Open the project in NetBeans.  
3. Configure the MySQL database connection in `DBConnection` class.  
4. Create required database tables.  
5. Run the application starting from the `LoginForm`.  

## Security Note
Database credentials and sensitive configuration details are not included for security reasons.

## Author
**S.M. Tasrif Zaman**  
Java Developer | ERP System Enthusiast
