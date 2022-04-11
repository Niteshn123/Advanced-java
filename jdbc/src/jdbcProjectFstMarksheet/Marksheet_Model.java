package jdbcProjectFstMarksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Marksheet_Model {

	public  void add(MarksheetJavaBean bean) throws Exception {
		
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("insert into marksheet1 values(?,?,?,?,?,?,?)");
		
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getName());
		ps.setString(4, bean.getLname());
		ps.setInt(5, bean.getPhy());
		ps.setInt(6, bean.getChem());
        ps.setInt(7, bean.getMaths());
        
       int i = ps.executeUpdate();
        conn.commit();
        System.out.println(i+"Insert");
		conn.close();
		ps.close();
	}
		
	}
