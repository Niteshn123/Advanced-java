package jdbc_Project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import jdbcProjectFstMarksheet.MarksheetJavaBean;

public class Marksheet_Model {

	public void add(MarksheetJavaBean bean) throws Exception {

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
		System.out.println(i + "Insert");
		conn.close();
		ps.close();
	}

	public void update(MarksheetJavaBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("update MarkSheet1 set Name =? where id = ?");

		ps.setInt(2, bean.getId());

		ps.setString(1, bean.getName());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + "Update");
		conn.close();
		ps.close();

	}

	public void delete(MarksheetJavaBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("Delete from MarkSheet1 where id = ?");

		ps.setInt(1, bean.getId());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + "Delete");
		conn.close();
		ps.close();
	}

	public ArrayList<MarksheetJavaBean> getMeritList() throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement(
				"Select *,(Phy+Chem+Maths) as total,(Phy+Chem+Maths)/3 as percentage from Marksheet1 where (Phy,Chem,Maths)>(40,40,40) order by percentage desc limit 3");
		ResultSet rs = ps.executeQuery();
		ArrayList<MarksheetJavaBean> list = new ArrayList<MarksheetJavaBean>();
		while (rs.next()) {
			MarksheetJavaBean bean = new MarksheetJavaBean();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
			bean.setName(rs.getString(3));
			bean.setLname(rs.getString(4));
			bean.setPhy(rs.getInt(5));
			bean.setChem(rs.getInt(5));
			bean.setMaths(rs.getInt(5));

			list.add(bean);
		}

		conn.commit();

		conn.close();
		ps.close();
		return list;
	}

	public ArrayList<MarksheetJavaBean> search() throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("select * from marksheet1");
		ResultSet rs = ps.executeQuery();
		ArrayList<MarksheetJavaBean> list = new ArrayList<MarksheetJavaBean>();
		while (rs.next()) {
			MarksheetJavaBean bean = new MarksheetJavaBean();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
			bean.setName(rs.getString(3));
			bean.setLname(rs.getString(4));
			bean.setPhy(rs.getInt(5));
			bean.setChem(rs.getInt(5));
			bean.setMaths(rs.getInt(5));

			list.add(bean);
		}

		conn.commit();

		conn.close();
		ps.close();
		return list;
	}

}
