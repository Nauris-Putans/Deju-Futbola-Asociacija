package JavaApplication1;

// STEP 1: Import required packages
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class javaConnect {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/dfa";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";
	
	public static void ConnecrDb() 
	{
		Connection conn = null;
		Statement stmt = null;
		Scanner scn = new Scanner(System.in);
		String first_name = null, last_name = null;

		try 
		{
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// STEP 3: Open a connection
			System.out.print("\nConnecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println(" SUCCESS!\n");
			
			// STEP 4: Ask for user input
			System.out.print("Enter first name: ");
			first_name = scn.nextLine();

			System.out.print("Enter last name: ");
			last_name = scn.nextLine();
			
			// STEP 5: Excute query
			System.out.print("\nInserting records into table...");
			stmt = conn.createStatement();

			String sql = "INSERT INTO users (first_name, last_name)" +
				 "VALUES ('"+first_name+"','"+last_name+"')";
			stmt.executeUpdate(sql);

			System.out.println(" SUCCESS!\n");	
		} 
		
		catch (SQLException e){
			System.out.println(e);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(javaConnect.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
