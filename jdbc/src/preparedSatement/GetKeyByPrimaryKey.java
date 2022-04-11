package preparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetKeyByPrimaryKey {
	public static void main(String[] args) throws Exception {
		
		testget();
		}

		private static void testget() throws Exception {
			// TODO Auto-generated method stub

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

			PreparedStatement ps = conn.prepareStatement("Select * from employee where ID =?");
			
			ps.setInt(1, 4);

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


