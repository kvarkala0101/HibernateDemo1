package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setId(222);
		st.setEmail("k***@yahoo.com");
		st.setName("kumar");
		st.setMarks(600);
		// student object is transient state 
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.save(st);
		//student object state is persistent
		
		
		s.beginTransaction().commit();
		// student object is moved to database
		
		s.evict(st);
		// student object will be removed from persistance state
		//the gc can collect student object
		
		
		
		
		
		
		
		
		
		
	}
}
