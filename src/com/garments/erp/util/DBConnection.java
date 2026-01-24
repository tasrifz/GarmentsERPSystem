package com.garments.erp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/garments_erp";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_CLASS);
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con; 
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Database Connection Failed", e);
        }
    }
}

