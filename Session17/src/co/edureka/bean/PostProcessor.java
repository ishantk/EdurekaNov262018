package co.edureka.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanName) throws BeansException {
		System.out.println(">> postProcessAfterInitialization Executed  "+beanName);
		
		// Downcasting and get the reference to Connection Object
		Connection con = (Connection)beanRef;
		
		// Check for some data in Connection Object i.e. kind of pre-processing
		if(con.username.equals("fionna")){
			//...
		}else{
			//....
		}
		return beanRef;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanName) throws BeansException {
		System.out.println(">> postProcessBeforeInitialization Executed  "+beanName);
		
		// Downcasting and get the reference to Connection Object
		Connection con = (Connection)beanRef;
				
		// Check for some data in Connection Object i.e. kind of post-processing
		
		return beanRef;
	}

}
