package com.capg.repo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class BatchApplication {
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/company_db",
                "postgres",
                "ABCDEF"
        );



    }
}
