package tyz.struts.sprh.mvcm.interfaces;

import java.util.List;

import tyz.struts.sprh.mvcm.Customer;

 
public interface CustomerBo{
	
	void addCustomer(Customer customer);
	List<Customer> listCustomer();
	
}