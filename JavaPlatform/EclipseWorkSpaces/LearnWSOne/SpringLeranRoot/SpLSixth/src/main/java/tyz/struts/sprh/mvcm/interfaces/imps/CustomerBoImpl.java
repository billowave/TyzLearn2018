package tyz.struts.sprh.mvcm.interfaces.imps;

import java.util.List;

import tyz.struts.sprh.mvcm.Customer;
import tyz.struts.sprh.mvcm.daos.CustomerDAO;
import tyz.struts.sprh.mvcm.interfaces.CustomerBo;

 
public class CustomerBoImpl implements CustomerBo{
	
	CustomerDAO customerDAO;
	//DI via Spring
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	//call DAO to save customer
	public void addCustomer(Customer customer){
		customerDAO.addCustomer(customer);
	}
	
	//call DAO to return customers
	public List<Customer> listCustomer(){
		return customerDAO.listCustomer();
	}
}