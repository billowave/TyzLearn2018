package test.just.hibernate.webs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import test.just.hibernate.Student;

public class TestData {

	public static void main(String[] args) {

		// Configuration cfg = new Configuration();
		// cfg.configure("/test/just/hibernate/hibernate.cfg.xml");// populates the data
		// of the configuration file
		//
		// SessionFactory factory = cfg.buildSessionFactory();
		//
		// Session session = factory.openSession();
		//
		// Transaction t = session.beginTransaction();
		//
		// t.commit();// transaction is committed
		// session.close();

		User user01 = new User(111, "tyz", "123456", "tyz@126.com");

		
		if(UserDao.save(user01) > 0)
		{

			System.out.println("successfully saved");
		}
		else
		{
			System.out.println("fail saved");
		}


	}

}
