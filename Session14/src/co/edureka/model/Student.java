package co.edureka.model;

// Structure of an Object !!
public class Student {
	
	int roll;
	String name;
	String addrrss;
	
	public Student() {
	
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrrss() {
		return addrrss;
	}

	public void setAddrrss(String addrrss) {
		this.addrrss = addrrss;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addrrss=" + addrrss + "]";
	}
	
}
