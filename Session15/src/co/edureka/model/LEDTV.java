package co.edureka.model;

public class LEDTV extends TV{ // IS-A Relation
	
	String technology;

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "LEDTV [technology=" + technology + ", screenSize=" + screenSize + ", pid=" + pid + ", brand=" + brand
				+ ", name=" + name + ", price=" + price + "]";
	}

}
