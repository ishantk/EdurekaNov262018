package co.edureka.bean;

public class Product {
	
	Integer pid;
	String name;
	String brandName;
	Integer price;
	Integer stock;
	
	public Product() {
	
	}

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

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	// Business Method
	public void processOrder(String deliveryVenue, String deliveryTimings){
		
		// PreProcessing -> In Real it would be kind of getting into the DB and checking for the stock !!
		/*if(stock>0){
			
			// Actual Logic
			System.out.println(">> "+name+" Product has to be delivered at User's "+deliveryVenue);
			System.out.println(">> "+name+" Product has to be delivered in "+deliveryTimings);
			
			// Post Processing Lets process Payments 
			if(User.paymentMode == 1){
				System.out.println(">> Please Pay in Cash on Delivery");
			}else if(User.paymentMode == 2){
				System.out.println(">> Please Pay by Credit Card");
			}else{
				System.out.println(">> Please make an Online Transaction");
			}
			
		}else{
			System.out.println(">> Sorry !!"+name+" product is out of Stock");
		}*/
		
		// Actual Logic
		if(User.orderStatus){
			System.out.println("**************************");
			System.out.println(">> Product Order Procced");
			System.out.println("**************************");
		}else{
			System.out.println(">> We cannot Process The Order");
		}
		
	}
	

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brandName=" + brandName + ", price=" + price + ", stock="
				+ stock + "]";
	}

}
