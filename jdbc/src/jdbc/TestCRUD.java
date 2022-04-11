package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestCRUD {

	public static void main(String[] args) throws Exception {
		 
		testselect();
	}

	private static void testselect() throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select * from employee");
		
		while (rs.next()) {
			
			System.out.print(rs.getString(1));
			
			System.out.print(rs.getString(2));
			System.out.print(" "+rs.getString(3));
			System.out.print(" "+rs.getString(4));
			System.out.print(" "+rs.getString(5));
		}
		stmt.close();
		conn.close();
		rs.close();
		
	}
}
