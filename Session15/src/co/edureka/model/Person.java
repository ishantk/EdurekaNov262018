package co.edureka.model;

public class Person {
	
	// Attributes
	Integer pid;
	String name;
	String phone;
	String email;
	Address address; // HAS-A Relationship | 1 to 1 (address is a reference variable which shall refer to a Address Object)
	
	public Integer getPid() {
		return pid;
	}
	
	public void setPid(Integer pid) {
		this.pid = pid;
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
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + "]";
	}
}
