package co.edureka.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {
	
	CA ca; // HAS-A Relationship
	
	public CB() {
	
	}

	//@Autowired 					// shall link our dependency automatically by matching the name of reference variable
	public CB(CA ca) { 				// Constructor Based Dependency Injection
		System.out.println(">> Constructor Based Dependency Injection");
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) { 	// Setter Based Dependency Injection
		System.out.println(">> Setter Based Dependency Injection");
		this.ca = ca;
	}
	
	

}
