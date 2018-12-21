package co.edureka.model;

// All the Attributes other than provate shall be inherited
public class TV extends Product{ // IS-A Relationship
	
	Integer screenSize;

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "TV [screenSize=" + screenSize + ", pid=" + pid + ", brand=" + brand + ", name=" + name + ", price="
				+ price + "]";
	}
	
}
