package preparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




public class Test_add02 {

	public static void main(String[] args) throws Exception {
		
		testadd();
	}
	
	private static void testadd() throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		int id = 10;
		String name = "Nitesh";
		String lname = "Vishvkarma";
		int salary = 20000;
		int did = 1;
		
		PreparedStatement ps = conn.prepareStatement("?,?,?,?,?");
		
		String s = "Insert into employee values("+id+",'"+name+"','"+lname+"',"+salary+","+did+")";
		      int i = ps.executeUpdate(s);
		System.out.println(i +"Inserted");
		  //    ps.close();
		      conn.close();
		
	}
	
}
