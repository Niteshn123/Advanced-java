package Batch_Process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PS_Batch_Processing {
	
	
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into marksheet1 values(?,?,?,?,?,?,?)");
		
		ps.setInt(1, 7);
		ps.setInt(2, 8);
		ps.setString(3, "RD");
		ps.setString(4, "sharma");
		ps.setInt(5, 50);
		ps.setInt(6, 40);
		ps.setInt(7, 56);
		
		ps.addBatch();
		
		
		ps.setInt(1, 10);
		ps.setInt(2, 11);
		ps.setString(3, "MG");
		ps.setString(4, "sharma");
		ps.setInt(5, 50);
		ps.setInt(6, 40);
		ps.setInt(7, 56);
		
		ps.addBatch();
		int[] count = ps.executeBatch();
				System.out.println(count+"inserted");
	}

}



