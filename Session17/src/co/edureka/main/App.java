package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Address;
import co.edureka.bean.Customer;
import co.edureka.bean.MobilePhone;

/*
 	Spring Core Procedure:
		1. Configure Build Path of Your Project with Spring Core Jars
		2. Create a bean i.e. a Java Class representing an Object
		3. Copy and edit anyname.xml file in src directory and configure details of an Object
		4. Test Spring IOC Code in class with main method
 */

public class App {

	public static void main(String[] args) {
	
		// Traditionally we create Objects like this
		// Object Cinstruction Statement
		/*Connection con1 = new Connection();
		con1.setDriver("com.mysql.jdbc.Driver");
		con1.setUrl("jdbc:mysql://localhost/edureka");
		con1.setUsername("john");
		con1.setPassword("john123");

		System.out.println("===con1 details===");
		System.out.println(con1);*/
		
		// Spring FW says do not create Objects
		
		/*
		 Inversion of Control
			The way we create an object shall change !!
			We configure the object in an XML file rather than creating it !!
			IOC Container which reads XML files and creates objects for us nad shall also manage life cycle of objects!!
		
			BeanFactory
			ApplicationContext
		 */
		
		// Just request IOC Container to get the Objects 
		// 1. IOC Container : BeanFactory in Action
		//Resource resource = new ClassPathResource("beans.xml"); // Parse i.e. Read XML File
		//BeanFactory factory = new XmlBeanFactory(resource);     // IOC Container that will manage objects for us
		
		// BeanFactory IOC Container constructs the Objects when you request for them !!
		
		/*Connection con2 = (Connection)factory.getBean("cRef1");
		Connection con3 = factory.getBean("cRef2",Connection.class);
		
		System.out.println();
		
		System.out.println("===con2 details===");
		System.out.println(con2);
		
		System.out.println();
		
		System.out.println("===con3 details===");
		System.out.println(con3);*/
		
		// 1. IOC Container : ApplicationContext in Action
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// ApplicationContext IOC Container constructs the Objects before hand !!
		// even if you are not requesting for the objects it shall create the objects automatically !!
		
		/*Connection con2 = (Connection)context.getBean("cRef1");
		Connection con3 = context.getBean("cRef2",Connection.class);
				
		System.out.println("===con2 details===");
		System.out.println(con2+"\n con2 hashCode is "+con2.hashCode());
	
		System.out.println("===con3 details===");
		System.out.println(con3+"\n con3 hashCode is "+con3.hashCode());
		
		System.out.println();
		System.out.println(">> Re Requesting for Same Objects");
		System.out.println();
		
		Connection con4 = (Connection)context.getBean("cRef1");
		Connection con5 = context.getBean("cRef2",Connection.class);
		
		System.out.println("===con4 details===");
		System.out.println(con4+"\n con4 hashCode is "+con4.hashCode());
	
		System.out.println("===con5 details===");
		System.out.println(con5+"\n con5 hashCode is "+con5.hashCode());*/
		
		// Life Cycle of bean
		//Connection con2 = (Connection)context.getBean("cRef1");
		//System.out.println(con2);
		
		//Product product = context.getBean("pRef",Product.class);
		//System.out.println(product);
		
		//MobilePhone phone = context.getBean("mRef",MobilePhone.class);
		//System.out.println(phone);
		
		// ***************************************************************
		
		// Low Coupling shall reduce dependency
		
		//Address address = new Address();
		
		//Customer customer = new Customer(address); // LOW COUPLING
		
		//Customer customer = new Customer(); 
		//customer.setAddress(address); // LOW COUPLING
		 
		Customer customer = context.getBean("cRef",Customer.class);
		System.out.println(customer);
		
		System.out.println("==Customer Phone Numbers: ==");
		System.out.println(customer.getPhoneNumbers());
		
		// Closing the Context shall delete all the objects !! Release Memory !!
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}

}
