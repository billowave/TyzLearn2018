package tyz.struts.sprh.mvcm.daos;

import java.util.List;

import tyz.struts.sprh.mvcm.Customer;
 
public interface CustomerDAO{
	
	void addCustomer(Customer customer);
	List<Customer> listCustomer();	
	
}