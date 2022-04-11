package jdbcProjectFstMarksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModelUpdate {
	
	public  void update(MarksheetJavaBean bean) throws Exception {
		
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("update MarkSheet1 set Name =? where id = ?");
		
		ps.setInt(2, bean.getId());
		
		ps.setString(1, bean.getName());
		
        
       int i = ps.executeUpdate();
        conn.commit();
        System.out.println(i+"Update");
		conn.close();
		ps.close();
	


	}
}