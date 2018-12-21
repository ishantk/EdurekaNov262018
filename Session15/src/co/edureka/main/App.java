package co.edureka.main;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {

		/*Employee emp1 = new Employee();
		emp1.setEid(null); // Primary key Auto Increment as per hbm file
		emp1.setName("Sia Watson");
		emp1.setEmail("sia@example.com");
		emp1.setSalary(60000);
		emp1.setAddress("Redwood Shores");
		
		Employee emp2 = new Employee(null, "Fionna Flynn", 60000, "fionna@example.com", "Pristine Magnum");*/
		
		//System.out.println(emp1);
		//System.out.println(emp2);
		
		// Data In Object is Temporary. We must Persist It !!
		// We shall use hibernate API's to do so now !!

		Configuration config = null;
		
		//AnnotationConfiguration config = null;
		
		SessionFactory factory = null;
		Session session = null;
		//Session session1 = null; // We can have more than 1 sessions
		Transaction transaction;
		
		try {
			
			config = new Configuration();
			config.configure(); 						// Reads i.e. Parse XML File and Create some Java objects !!
			
			//config = new AnnotationConfiguration();
			//config.configure();							// Consider Employee Class Annotations
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); 			// Creating Connection with DB
			//session1 = factory.openSession();
			transaction = session.beginTransaction();	// Transaction i.e. Atomicity : All at Once 
			
			// Insert operation
			//session.save(emp1); 						// Inserting Employee Object into Table 
			//session.save(emp2); 
			
			// Retrieve Single Record
			//Employee emp = (Employee)session.get(Employee.class, 2);
			//System.out.println(emp);
			
			// Update Record
			// Firstly Get the Employee Object to be Updated
			//emp.setSalary(87500);
			//emp.setAddress("Clover Heights");
			
			//session.update(emp);
			
			/*Employee emp = new Employee();
			emp.setEid(2);
			session.delete(emp);*/
			
			// Retrieve All Records
			// 1. Hibernate Query Language | HQL
			//String hql = "From Employee"; // Similar to SQL where: Select * form Employee
			/*String hql = "From Employee where salary > 50000"; 
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			// 2. Criteria API
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 30000)); // From Employee where salary > 30000
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			/*for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "employee"+i, 20000+i, "employee"+i+"@example.com", "Country Homes"); // 100 new Employee objects shall be created 
				session.save(emp); // 100 new Employee objects shall be saved in session
			}*/
			
			// Cache by Session Object
			System.out.println(">> Fetching Object from DB with id 1");
			Employee e1 = (Employee)session.get(Employee.class, 1);
			System.out.println("e1 is: "+e1);
			
			System.out.println();
			
			System.out.println(">> Fetching Object from DB with id 3");
			Employee e2 = (Employee)session.get(Employee.class, 3);
			System.out.println("e2 is: "+e2);
			
			System.out.println();
			
			System.out.println("Re-Fetch Object with id 1");
			Employee e3 = (Employee)session.get(Employee.class, 1);
			System.out.println("e3 is: "+e3);
			
			System.out.println();
			
			System.out.println("Re-Fetch Object with id 3");
			Employee e4 = (Employee)session.get(Employee.class, 3);
			System.out.println("e4 is: "+e4);
			
			
			transaction.commit(); // Batch Processing Shall Happen !!
			
			System.out.println(">> Transaction Finished !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close(); // Session Object maintains cache till time we do not close it !!
			factory.close(); // SessionFactory Object maintains cache till time we do not close it for multiple Sessions !!
		}
		
	}

}
