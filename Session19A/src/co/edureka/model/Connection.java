package co.edureka.model;

public class Connection {

	// Create an Object within the same class
	private static Connection con = new Connection();
	
	// Making Constructor private, user cannot create an object now !!
	private Connection() {
		//System.out.println(">> Connection Object Constructed | HashCode: "+hashCode());
		System.out.println(">> Connection Object Constructed | HashCode: "+this);
	}
	
	public static Connection getConnection(){
		return con;
	}
	
}
