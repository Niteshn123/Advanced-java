package preparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PS_Update {

	public static void main(String[] args) throws Exception {
		testUpdate();
	}

	private static void testUpdate() throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		String LNAME = "Patidar";
        int id =1;
		PreparedStatement ps = conn.prepareStatement("update employee set LNAME= ? where ID=?");		
		
		ps.setString(1, LNAME);
	    ps.setInt(2,id);
	
	    int re = ps.executeUpdate();
	    
	    System.out.println(re +"updated");
	
	}
}
