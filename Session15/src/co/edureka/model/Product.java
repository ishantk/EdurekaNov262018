package co.edureka.model;

public class Product {

	// Attributes
	Integer pid;
	String brand;
	String name;
	Integer price;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	
}
