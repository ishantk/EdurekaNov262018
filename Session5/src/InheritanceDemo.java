// Product : Parent Class
class Product{
	
	// Attributes : Belongs to Object
	int pid;
	int price;
	String brand;
	
	Product(){
		pid = 1001;
		price = 500;
		brand = "Amazon";
		System.out.println("==Product Object Constructed==");
	}
	
	// Method: Belongs to Object
	void setProductDetails(int pid, int price, String brand){
		this.pid = pid;
		this.price = price;
		this.brand = brand;
	}
	
	void showProductDetails(){
		System.out.println("=====PID:"+pid+"=====");
		System.out.println("Price: "+price);
		System.out.println("Brand: "+brand);
		System.out.println("====================");
	}
}

// MobilePhone : Child Class
// MobilePhone IS-A Product
class MobilePhone extends Product{ // MobilePhone is an extension of Product

	int screenSize;
	int ram;
	int memory;
	
	MobilePhone(){
		screenSize = 5;
		ram = 1;
		memory = 4;
		System.out.println("==MobilePhone Object Constructed==");
	}
	
	// ReDefine the same method in Child Object with different inputs : OVERLOADING
	void setProductDetails(int pid, int price, String brand, int screenSize, int ram, int memory){
		this.pid = pid;
		this.price = price;
		this.brand = brand;
		this.screenSize = screenSize;
		this.ram = ram;
		this.memory = memory;
	}
	
	// ReDefine the same method in Child Object with Same Inputs : OVERRIDING
	void showProductDetails(){
		System.out.println("=====PID:"+pid+"=====");
		System.out.println("Price: "+price);
		System.out.println("Brand: "+brand);
		System.out.println("ScreenSize: "+screenSize);
		System.out.println("RAM: "+ram);
		System.out.println("Memory: "+memory);
		System.out.println("====================");
	}
	
}

/*
//Shoe IS-A Product
class Shoe extends Product{

	int shoeSize;
	int weight;
	String color;
}
*/

public class InheritanceDemo {

	public static void main(String[] args) {
		
		// Object Construction for Product
		//Product pRef = new Product();
		
		// Object Construction for MobilePhone which is Child to Product
		// Rule1 : Before Child Object is Constructed Parent Object is Constructed
		// Rule2 : Everything from Parent comes into the Child, other than Constructors and private data
		MobilePhone mRef = new MobilePhone();
		//mRef.setProductDetails(1791, 7550, "Samsung");
		mRef.setProductDetails(1231, 80000, "Apple", 5, 4, 128); // Overloading | Static Polymorphism
		
		mRef.showProductDetails(); // We will get the Child's definition executed // Overriding | Dynamic Polymorphism

	}

}
