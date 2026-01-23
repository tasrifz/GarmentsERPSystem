package com.garments.erp.dao;

import com.garments.erp.model.Employee;
import com.garments.erp.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TASRIF ZAMAN
 */
public class EmployeeDAO {
    
    public void aadEmployee(Employee emp){
        try {
             Connection con = DBConnection.getConnection();
              String sql = "INSERT INTO employee VALUES (?,?,?,?)";
               PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, emp.getEmpId());
                 ps.setString(2, emp.getEmpName());
                  ps.setString(3, emp.getDepartment());
                   ps.setDouble(4, emp.getSalary());
                    ps.executeUpdate();
                 
                 System.out.println("Employee added succesfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewEmployees(){
         try {
              Connection con = DBConnection.getConnection();
               String sql = "SELECT * FROM employee";
                PreparedStatement ps = con.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery();
                 System.out.println("ID | Name | Dept | Salary");
                  
                  while (rs.next()) {                 
                      System.out.println(rs.getInt(1)+ " | " + rs.getString(2)+ " | " + rs.getString(3)+ " | " +rs.getDouble(4)+ " | " );
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}
