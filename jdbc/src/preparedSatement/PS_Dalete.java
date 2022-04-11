package preparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PS_Dalete {





		public static void main(String[] args) throws Exception {

			TestDelete();
		}

		public static void TestDelete() throws Exception {

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

			int id = 4;
			
			PreparedStatement ps = conn.prepareStatement("delete from employee where id = ?");

			
			ps.setInt(1, id);
			int re = ps.executeUpdate();

			System.out.println(re + "update");

			ps.close();
			conn.close();

		}

	}



