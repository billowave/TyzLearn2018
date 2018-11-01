package tyz.struts2.shall;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.
                     annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.
                     annotations.TransactionTarget;
import org.hibernate.cfg.Configuration;

public class StudentDAO {
	
   @SessionTarget
   Session session;

   @TransactionTarget
   Transaction transaction;

   @SuppressWarnings("unchecked")
   public List<Student> getStudents()
   {
      List<Student> students = new ArrayList<Student>();
      try
      {
    	  Configuration cfg = new Configuration().configure();
   	   SessionFactory sFactory = cfg.buildSessionFactory();
         students = session.createQuery("from Studentsh").list();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      return students;
   }

   public void addStudent(Student student)
   {
	   Configuration cfg = new Configuration().configure();
	   SessionFactory sFactory = cfg.buildSessionFactory();
	   session = sFactory.openSession();
	   
      session.save(student);
   }
}
