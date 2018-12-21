package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//Our Divided Business Logic's Post-Processing shall happen here
public class AfterAdvice implements AfterReturningAdvice{

	// afterReturning method shall be executed after any method in our bean is executed
	@Override
	public void afterReturning(Object obj, Method method, Object[] inputs, Object beanRef) throws Throwable {
		if(method.getName().equals("processOrder")){
			
			System.out.println("==========after==========");
			
			Product product = (Product)beanRef;
			
			if(User.orderStatus){
				if(User.paymentMode == 1){
					System.out.println(">> Please Pay in Cash on Delivery");
				}else if(User.paymentMode == 2){
					System.out.println(">> Please Pay by Credit Card");
				}else{
					System.out.println(">> Please make an Online Transaction");
				}
				
				System.out.println(">> Shimpment shall be processed");
			}else{
				System.out.println(">> We cannot Process The Order");
			}
			
			System.out.println("==========================");
		}
	}

}
