# Garments ERP System (Desktop Application)

Garments ERP System is a Java Swing–based desktop application developed using NetBeans.  The system is designed to manage core operational activities of a garments business through a secure, user-friendly, and modular interface.

## Key Features

  User Registration and Login Authentication 
  Dashboard-based Navigation  
  Employee Management  
  Buyer Order Management  
  Production Management  
  Inventory Management  
  Secure MySQL Database Integration using JDBC  

## Technologies Used

  Java (Swing)
  NetBeans IDE
  MySQL
  JDBC

## Project Structure

src/com/garments/erp

  **ui** – Application forms (Login, Register, Dashboard, Modules)  
  **model** – Data models (User, Employee, etc.)  
  **dao** – Database access layer  
  **util** – Database connection utility  

## How to Run the Project

1. Clone or download the repository.
2. Open the project in NetBeans IDE.
3. Configure the MySQL database connection in the DBConnection utility class.
4. Create the required database tables.
5. Run the application starting from the `LoginForm`.

## Security Note

Database credentials and sensitive configuration details are not included in this repository for security reasons.

## Future Improvements

  Role-based access control (Admin, Manager, Operator)
  Report generation (PDF / Excel)
  Advanced inventory analytics
  Web-based version of the ERP system


## Author

   **S.M. Tasrif Zaman**  
   Java Developer | ERP System Enthusiast
