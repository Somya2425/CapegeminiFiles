
   
	package ABC;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class JDBC {

	    private static final String URL = "jdbc:postgresql://localhost:5432/Student";
	    private static final String USER = "postgres";
	    private static final String PASSWORD = "ABCDEF";

	    public static void main(String[] args) {

	    	String sql =
	    		    "INSERT INTO a(id , name) VALUES (?, ?)";


	        try (
	            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
	            PreparedStatement ps = con.prepareStatement(sql);
	        ) {
	            ps.setInt(1, 1);
	            ps.setString(2 , "Somya");

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                int id = rs.getInt("id");
	                System.out.println("Inserted with ID: " + id);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	       
	    }
	}

