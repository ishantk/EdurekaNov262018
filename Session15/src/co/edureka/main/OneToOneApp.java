package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneApp {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("John Watson");
		person.setEmail("john@example.com");
		person.setPhone("+91 99999 88888");
		
		Address address = new Address();
		address.setAdrsLine("Pristine Magnum");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		// 1 to 1 relationship 
		person.setAddress(address);
		address.setPerson(person);
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parse hibernate.cfg.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			// We are saving only Person Object !!
			// Saving Person shall also save Address | cascade = all
			session.save(person); 
			// 1st Table Person shall save person and 2nd Table Address shall save address
			
			transaction.commit();
			System.out.println(">> Transaction Commited");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
