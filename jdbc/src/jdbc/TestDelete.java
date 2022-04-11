package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) throws Exception {

		TestDelete();
	}

	public static void TestDelete() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		Statement stmt = conn.createStatement();

		int re = stmt.executeUpdate("delete from employee where id = 5");

		System.out.println(re + "update");

		stmt.close();
		conn.close();

	}

}
