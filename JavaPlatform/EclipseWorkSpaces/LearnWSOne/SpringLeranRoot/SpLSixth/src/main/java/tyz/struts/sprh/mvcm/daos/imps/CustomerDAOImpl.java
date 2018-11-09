package tyz.struts.sprh.mvcm.daos.imps;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import tyz.struts.sprh.mvcm.Customer;
import tyz.struts.sprh.mvcm.daos.CustomerDAO;

 
public class CustomerDAOImpl extends HibernateDaoSupport 
    implements CustomerDAO{
	
	//add the customer
	public void addCustomer(Customer customer){
		getHibernateTemplate().save(customer);
	}
	
	//return all the customers in list
	@SuppressWarnings("unchecked")
	public List<Customer> listCustomer(){
		return getHibernateTemplate().find("from Customer");		
	}
	
}