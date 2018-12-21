package co.edureka.model;

// Structure of an Object
public class Student {
	
	// Attributes
	public int roll;
	public String name;
	public int age;
	public String email;
	public String address;
	
	public Student() {
	
	}

	public Student(int roll, String name, int age, String email, String address) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]";
	}
	
}
