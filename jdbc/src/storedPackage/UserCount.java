package storedPackage;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;



public class UserCount {

	public static void main(String[] args) throws Exception {
		testcallable();
	}
	
	private static void testcallable() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		  CallableStatement cal = conn.prepareCall("{ call empcount(?)}");
		  cal.registerOutParameter(1, Types.INTEGER); cal.execute();
		  cal.execute();
		  System.out.println("testProcedure : " + cal.getInt(1));
		 
	}
}
