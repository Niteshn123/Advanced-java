package TransactionHandling;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WithoutTryCatch {
	
	public static void main(String[] args) throws Exception {
		
		testinsert();
	}

	private static void testinsert() throws Exception {
		
Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		  conn.setAutoCommit(false);
		  Statement stmt = conn.createStatement();
		  
		  int r = stmt.executeUpdate("insert values(9, 'lab')");
		  r = stmt.executeUpdate("insert values(10, 'Assistant')");
		  
		  conn.commit();
		  
		  System.out.println("inserted");
		
		  stmt.close();
		  conn.close();
	}

}
