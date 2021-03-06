package co.edureka.model;

// Structure for User Object !!
public class User {
	
	// Attributes
	public String name;
	public String email;
	public String password;
	
	public User() {
	
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
