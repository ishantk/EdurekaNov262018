package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// Our Divided Business Logic's Pre-Processing shall happen here
public class BeforeAdvice implements MethodBeforeAdvice{

	// before method shall be executed before any method in our bean is executed
	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		if(method.getName().equals("processOrder")){
			
			System.out.println("==========before==========");
			
			Product product = (Product)beanRef;
			
			if(product.getStock()>0){
				
				System.out.println(">> Process the Order and ship it at "+inputs[0]+" in "+inputs[1]);
				
			}else{
				User.orderStatus = false;
				System.out.println(">> Sorry !!"+product.getName()+" product is out of Stock");
			}
			
			System.out.println("==========================");
		}
		
	}

}
