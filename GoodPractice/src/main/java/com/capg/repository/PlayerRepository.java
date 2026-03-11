package com.capg.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PlayerRepository {
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5433/company_db", "postgres","ABCDEF");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
