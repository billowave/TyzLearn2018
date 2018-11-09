package org.SpLSecond;

import java.security.PublicKey;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class DataOpTest extends TestCase {

	public void testQueryList() throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		List<Department> depts = deptDAO.queryList();

		for (Department dept : depts) {
			System.out.print("Dept ID " + dept.getDeptId());
			System.out.print("tDept No " + dept.getDeptNo());
			System.out.println("\tDept Name " + dept.getDeptName());
		}
		assertTrue(depts.size() > 0);
	}

	public void testQueryone() throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		List<Department> depts = deptDAO.queryOne((long) 333);

		for (Department dept : depts) {
			System.out.print("Dept ID " + dept.getDeptId());
			System.out.print("tDept No " + dept.getDeptNo());
			System.out.println("\tDept Name " + dept.getDeptName());
		}
		assertTrue(depts.size() > 0);
	}

	public void testinsert() throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		Department addto = new Department((long) 2222, "ADD22222", "ADD2222");

		assertTrue(deptDAO.insert(addto));
	}
	
	
	public void testupdate() throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		Department addto = new Department((long) 333, "9999999", "99999999");

		assertTrue(deptDAO.update(addto));
	}
	
	
	public void testdelete() throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		assertTrue(deptDAO.delete((long) 333));
	}
	
	public void testdall() throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		assertTrue(deptDAO.delete((long) 333));
	}
	
	public void deleteall() throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		deptDAO.deleteall(0);
		
	}
	
	
	

}
