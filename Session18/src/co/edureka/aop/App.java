package co.edureka.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Product;

public class App {

	public static void main(String[] args) {
		
		//ProxyFactoryBean -> Configure it in XML File for Before and After
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Product product = context.getBean("pRef",Product.class);
		//System.out.println(product);
		
		Product product = context.getBean("productProxy",Product.class);
		
		product.processOrder("Home", "Evening");
		// processOrder is one of the business Logic's 
		// it can be divided into small logics using AOP. For this business logic we have pre-processing and post-processing.
	}

}
