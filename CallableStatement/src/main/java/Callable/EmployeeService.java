package Callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeService {
    public void insertEmployee(String name, double salary) {

                String sql = "CALL insert_employee(? , ?)";
              try(  Connection conn = DatabaseUtil.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)){

//                stmt.setInt(1 , 1);
                stmt.setString(1 , "Somya");
                stmt.setDouble(2 , 558.7);
                stmt.execute();
                System.out.println("Employee inserted successfully");
            } catch (Exception e) {
                  throw new RuntimeException(e);
              }
        }


    }

