package co.edureka.bean;

import java.util.List;

public class Customer {
	
	String name;
	String phone;
	String email;
	
	// Address is dependency
	Address address; // HAS-A Relationship | 1 to 1 Relationship !!
	
	// Collection DI i.e. we have 1 to many relationship
	List<String> phoneNumbers; // HAS-A Relationship | 1 to many Relationship !!

	public Customer() {
		// Creating Object of Address in Constructor of Customer will introduce high coupling
		// Address Object Construction is now dependent on Customer Object Construction !!
		//address = new Address(); // This is not good !! this should be avoided
	}
	
	// Having a Constructor which takes reference to the Address Object shall reduce Coupling
	// Address Object can be constructed separately and Customer Object separately !!
	public Customer(Address address) {
		System.out.println(">> Constructor Based Dependency Injection");
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	// Having a Setter which takes reference to the Address Object shall reduce Coupling
	// Address Object can be constructed separately and Customer Object separately !!
	public void setAddress(Address address) {
		System.out.println(">> Setter Based Dependency Injection");
		this.address = address;
	}
	
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address + "]";
	}	
	
}
