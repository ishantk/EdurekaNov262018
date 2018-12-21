package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.LEDTV;
import co.edureka.model.Product;
import co.edureka.model.TV;

public class InheritanceApp {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("iPhoneX");
		product.setBrand("Apple");
		product.setPrice(80000);
		
		TV tv = new TV();
		tv.setName("Plasma TV");
		tv.setBrand("Samsung");
		tv.setPrice(30000);
		tv.setScreenSize(40);
		
		LEDTV ledtv = new LEDTV();
		ledtv.setName("OLED TV");
		ledtv.setBrand("Samsung");
		ledtv.setPrice(70000);
		ledtv.setScreenSize(50);
		ledtv.setTechnology("OLED");
		
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
			
			// All three Products shall be saved in a Single Table !!
			session.save(product);
			session.save(tv);
			session.save(ledtv);
			
			transaction.commit();
			System.out.println(">> Transaction Commited");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally {
			
		}		
		
		
		
	}

}
