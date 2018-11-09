package org.SpLSecond;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDAO {

	List<Department> queryList() throws SQLException;
	List<Department> queryOne(long id) throws SQLException;
	boolean update(Department upto) throws SQLException;
	boolean insert(Department addto) throws SQLException;
	boolean delete(long id) throws SQLException;
	boolean deleteall(int in) throws SQLException;

}