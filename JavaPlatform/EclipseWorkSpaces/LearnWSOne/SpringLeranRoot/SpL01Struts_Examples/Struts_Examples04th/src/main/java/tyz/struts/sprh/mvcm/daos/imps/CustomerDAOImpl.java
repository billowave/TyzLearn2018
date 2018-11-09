package tyz.struts.sprh.mvcm.daos.imps;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import tyz.struts.sprh.mvcm.Customer;
import tyz.struts.sprh.mvcm.daos.CustomerDAO;

 
public class CustomerDAOImpl extends HibernateDaoSupport 
    implements CustomerDAO{
	
	//add the customer
	public void addCustomer(Customer customer){
		HibernateTemplate ss = getHibernateTemplate();
		ss.setCheckWriteOperations(false);
		ss.save(customer);
	}
	
	//return all the customers in list
	@SuppressWarnings("unchecked")
	public List<Customer> listCustomer(){
		return (List<Customer>) getHibernateTemplate().find("from Customer");		
	}
	
}