package co.edureka.bean;

public class Product {

	// Attributes
	Integer pid;
	String name;
	String brand;
	Integer price;
	
	// Getters and Setters
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
