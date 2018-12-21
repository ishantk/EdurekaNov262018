package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO (Plain Old Java Object) | Model | Bean
// Structure of an Object

@Entity
@Table(name="EMPLOYEES")
public class Employee {
	
	// Attributes 
	// Mapping Attributes to Table using Annotations
	@Id @GeneratedValue
	@Column(name="EID")
	Integer eid;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="SALARY")
	Integer salary;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="ADDRES")
	String address;
	
	// Constructors
	public Employee() {
	
	}

	public Employee(Integer eid, String name, Integer salary, String email, String address) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]";
	}
}
