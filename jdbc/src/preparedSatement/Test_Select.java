package preparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test_Select {

	public static void main(String[] args) throws Exception {

		testSelect();
	}

	private static void testSelect() throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		PreparedStatement ps = conn.prepareStatement("Select * from employee");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.println("\t" + rs.getString(5));

		}
		rs.close();
		ps.close();
		conn.close();
	}

}
