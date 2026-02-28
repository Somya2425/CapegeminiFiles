package Callable;


//import com.sun.java.swing.plaf.windows.TMSchema;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseUtil {
    private static Properties properties = new Properties();
    static {
        try (FileInputStream fis = new FileInputStream("/Users/admin/Desktop/CallableStatement/Anything.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(
                properties.getProperty("db.url"),
                properties.getProperty("db.user"),
                properties.getProperty("db.password")
        );
    }
}