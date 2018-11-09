package org.SpLSecond;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DepartmentImplDAO implements DepartmentDAO {

	private DataSource datasrc;

	public DataSource getDatasrc() {
		return datasrc;
	}

	public void setDatasrc(DataSource datasrc) {
		this.datasrc = datasrc;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.SpLSecond.DepartmentDAO#queryList()
	 */
	public List<Department> queryList() throws SQLException {
		Connection conn = datasrc.getConnection();

		DriverManagerDataSource adsa = new DriverManagerDataSource();

		String sql = "Select d.dept_id, d.dept_no, d.dept_name from department d";
		Statement smt = conn.createStatement();

		ResultSet rs = smt.executeQuery(sql);
		List<Department> list = new ArrayList<Department>();
		while (rs.next()) {
			Long deptId = rs.getLong("dept_id");
			String deptNo = rs.getString("dept_no");
			String deptName = rs.getString("dept_name");
			Department dept = new Department(deptId, deptNo, deptName);
			list.add(dept);
		}
		return list;
	}

	public List<Department> queryOne(long id) throws SQLException {

		Connection conn = datasrc.getConnection();

		String sql = "Select d.dept_id, d.dept_no, d.dept_name from department d where d.dept_id = ?";

		PreparedStatement pStatement = conn.prepareStatement(sql);

		pStatement.setLong(1, id);

		ResultSet rs = pStatement.executeQuery();

		List<Department> list = new ArrayList<Department>();

		while (rs.next()) {
			Long deptId = rs.getLong("dept_id");
			String deptNo = rs.getString("dept_no");
			String deptName = rs.getString("dept_name");
			Department dept = new Department(deptId, deptNo, deptName);
			list.add(dept);
		}
		return list;
	}

	public boolean update(Department upto) throws SQLException {
		Connection conn = datasrc.getConnection();

		String sql = "UPDATE Department SET DEPT_NAME = ? , DEPT_NO =?  WHERE DEPT_ID = ?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(3, upto.getDeptId());
		ps.setString(1, upto.getDeptName());
		ps.setString(2, upto.getDeptNo());

		return (ps.executeUpdate() > 0 ? true : false);
	}

	public boolean insert(Department addto) throws SQLException {

		Connection conn = datasrc.getConnection();
		String sql1 = "insert into Department (DEPT_ID, DEPT_NAME, DEPT_NO, LOCATION) values (?,?,?,?)";
		String sql2 = "insert into Department (DEPT_ID, DEPT_NAME, DEPT_NO) values (?,?,?)";
		String sql3 = "insert into Department values (?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql2);
		ps.setLong(1, addto.getDeptId());
		ps.setString(2, addto.getDeptName());
		ps.setString(3, addto.getDeptNo());
		return (ps.executeUpdate() > 0 ? true : false);
	}

	public boolean delete(long id) throws SQLException {
		// TODO 自动生成的方法存根
		Connection conn = datasrc.getConnection();

		String sql = "delete from Department WHERE DEPT_ID = ?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(1, id);

		return (ps.executeUpdate() > 0 ? true : false);
	}

	public boolean deleteall(int d) throws SQLException {
		MysqlDataSource ss = new MysqlDataSource();
		ss.setUser("root");
		ss.setPassword("123456");
		ss.setDatabaseName("storyfm");

		com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) ss.getConnection();
		com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) connection.createStatement();
		String sql = "Select d.dept_id, d.dept_no, d.dept_name from department d";
		String sqld = "delete from user";

		if (d > 0) {
			stm.executeUpdate(sqld);
		} else {
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {

				System.out.println(rs.getString("dept_name") + "****" + rs.getLong("dept_id") + "+++++++++"
						+ rs.getString("dept_no"));
			}

		}

		connection.checkClosed();
		
		return false;
	}

}
