package tyz.tests.actions.all;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import junit.framework.TestCase;
import tyz.actions.all.HelloWorldAction;

public class TestHibernate extends TestCase {
	
	
	
	public void test() {
		
		
		Configuration cfg=new Configuration();  
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

        //creating seession factory object  
        SessionFactory factory=cfg.buildSessionFactory();  

        //creating session object  
        Session session=factory.openSession();  
        
        
		
	}


}
