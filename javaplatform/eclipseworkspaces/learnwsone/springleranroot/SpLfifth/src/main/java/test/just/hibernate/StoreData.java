package test.just.hibernate;  

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

public class StoreData {  
    public static void main(String[] args) {  

        //creating configuration object  
        Configuration cfg=new Configuration();  
        cfg.configure("/test/just/hibernate/hibernate.cfg.xml");//populates the data of the configuration file  

        //creating seession factory object  
        SessionFactory factory=cfg.buildSessionFactory();  

        //creating session object  
        Session session=factory.openSession();  

        //creating transaction object  
        Transaction t=session.beginTransaction();  

        Student e1=new Student();
        e1.setId(100);
        e1.setFirst_name("Max");
        e1.setLast_name("Su");
        e1.setMarks(80);

        session.persist(e1);//persisting the object  

        t.commit();//transaction is committed  
        session.close();  

        System.out.println("successfully saved");  

    }  
}