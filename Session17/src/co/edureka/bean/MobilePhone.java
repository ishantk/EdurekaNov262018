package co.edureka.bean;

public class MobilePhone extends Product{ // IS-A Relationship

	String os;
	int ram;
	int memory;

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "MobilePhone [os=" + os + ", ram=" + ram + ", memory=" + memory + ", pid=" + pid + ", name=" + name
				+ ", brand=" + brand + ", price=" + price + "]";
	}
	
}
