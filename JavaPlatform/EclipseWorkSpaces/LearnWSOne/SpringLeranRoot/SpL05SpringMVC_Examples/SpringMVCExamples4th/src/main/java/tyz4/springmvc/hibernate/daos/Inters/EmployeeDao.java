package tyz4.springmvc.hibernate.daos.Inters;

import java.util.List;

import tyz4.springmvc.hibernate.modelbeans.Employee;



public interface EmployeeDao {

	Employee findById(int id);

	void saveEmployee(Employee employee);
	
	void deleteEmployeeBySsn(String ssn);
	
	List<Employee> findAllEmployees();

	Employee findEmployeeBySsn(String ssn);

}