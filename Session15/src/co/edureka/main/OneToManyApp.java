package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToManyApp {

	public static void main(String[] args) {
		
		
		Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setCname("CCNA");
		
		Certificate c3 = new Certificate();
		c3.setCname("AWS");
		
		List<Certificate> certificates = new ArrayList<Certificate>();
		certificates.add(c1);
		//certificates.add(c2);
		certificates.add(c3);
		
		Manager manager = new Manager();
		manager.setName("Fionna");
		manager.setEmail("fionna@example.com");
		manager.setExperience(12);
		manager.setSalary(90000);
		manager.setCertificates(certificates);

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
			
			// Saving Manager shall also save Certificates !!
			//session.save(manager);
			
			Manager mRef = (Manager)session.get(Manager.class, 2);
			System.out.println("===Manager Details for mid 2===");
			System.out.println(mRef);
			
			transaction.commit();
			System.out.println(">> Transaction Commited");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally {
			
		}

	}

}
