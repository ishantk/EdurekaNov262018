package co.edureka.main;

import co.edureka.model.Connection;

public class Application {

	public static void main(String[] args) {
		
		// As of now we are getting 3 different object for our class Connection
		/*Connection con1 = new Connection();
		Connection con2 = new Connection();		
		Connection con3 = new Connection();*/
		
		// When Constructor is private we wont be able to create objects
		
		/*Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		Connection con3 = Connection.getConnection();
		
		System.out.println("con1: "+con1);
		System.out.println("con2: "+con2);
		System.out.println("con3: "+con3);*/
		
		Plan plan = PlanFactory.getPlan(4);
		plan.showDataAndPrice();

	}

}
