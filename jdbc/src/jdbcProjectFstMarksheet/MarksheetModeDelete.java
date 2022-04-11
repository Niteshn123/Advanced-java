package jdbcProjectFstMarksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModeDelete {

	public  void delete(MarksheetJavaBean bean) throws Exception {
		
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("Delete from MarkSheet1 where id = ?");
		
		ps.setInt(1, bean.getId());
	
		int i = ps.executeUpdate();
        conn.commit();
        System.out.println(i+"Delete");
		conn.close();
		ps.close();
	}
}