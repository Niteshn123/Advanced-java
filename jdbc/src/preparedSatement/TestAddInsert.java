package preparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestAddInsert {

	public static void main(String[] args) throws Exception {

		teatAdd();
	}

	private static void teatAdd() throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		int ID = 9;
		String NAME = "Yash";
		int SALARY = 19000;
		String LNAME = "Yadav";
		int dep_id = 3;

		PreparedStatement ps = conn.prepareStatement("Insert into Employee values(?,?,?,?,?)");

		ps.setInt(1, ID);
		ps.setString(2, NAME);
		ps.setInt(3, SALARY);
		ps.setString(4, LNAME);
		ps.setInt(5, dep_id);

		int i = ps.executeUpdate();
		System.out.println(i + "Inserted");

		ps.close();
		conn.close();

	}
}