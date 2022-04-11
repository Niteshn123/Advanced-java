package TransactionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tryCatch {
	
		public static void main(String[] args) throws Exception {
			
			testinsert();
		}

		private static void testinsert() throws Exception {
			
	Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
			
			  conn.setAutoCommit(false);
			  Statement stmt = conn.createStatement();
			
			  try
			  {int r = stmt.executeUpdate("insert into department values(12,'lab')");
			  r = stmt.executeUpdate("insert into department values(13, 'Assistant')");
			  
			  conn.commit();
			  }
			  catch(Exception e)
			  {System.out.println(e.getMessage());
				  conn.rollback();
			  }
			  
			  System.out.println("inserted");
			
			  stmt.close();
			  conn.close();
		}

	}