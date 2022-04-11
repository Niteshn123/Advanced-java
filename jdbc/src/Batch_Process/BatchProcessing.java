package Batch_Process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessing {
	
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		Statement stmt = conn.createStatement();
		
		stmt.addBatch("insert into marksheet1(id,rollno,name,lname,phy,chem,maths) values(6,'rs07','aman','varma',55,45,78)");
		
				int[] c = stmt.executeBatch();
				System.out.println(c+"inserted");
	}

}
