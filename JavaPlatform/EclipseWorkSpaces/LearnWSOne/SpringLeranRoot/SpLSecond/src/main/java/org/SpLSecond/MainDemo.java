package org.SpLSecond;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/spring-module.xml");

		DepartmentDAO deptDAO = (DepartmentDAO) context.getBean("departmentDAO");

		List<Department> depts = deptDAO.queryList();

		for (Department dept : depts) {
			System.out.print("Dept ID " + dept.getDeptId());
			System.out.print("tDept No " + dept.getDeptNo());
			System.out.println("\tDept Name " + dept.getDeptName());
		}

		Department addto = new Department((long) 32, "ADD2222", "ADD2222");

		if (deptDAO.insert(addto)) {
			System.out.println("成功");
		} else {
			System.out.println("失败");
		}

	}

}
