/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garments.erp.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TASRIF ZAMAN
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/garments_erp";
    private static final String USER = "root";
    private static final String Password = "root";
     
     public static Connection getConnection(){
          try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               return DriverManager.getConnection(URL, URL, Password);
         } catch (Exception e) {
             throw new RuntimeException(e);
        }
     }
}
