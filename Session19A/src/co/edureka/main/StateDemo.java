package co.edureka.main;

interface State{
	String getState();
}

class Ordered implements State{
	public String getState(){
		return "State is Ordered";
	}
}

class Shipment implements State{
	public String getState(){
		return "State is Shipment";
	}
}

class Delivered implements State{
	public String getState(){
		return "State is Delivered";
	}
}

class Product{
	
	State state; // HAS-A | Product HAS A State
	
	void changeState(State newState){
		state = newState;
	}
}

public class StateDemo {

	public static void main(String[] args) {
		
		Ordered oState = new Ordered();
		Shipment sState = new Shipment();
		Delivered dState = new Delivered();
		
		System.out.println(">> Product is ordered by Customer");
		Product product = new Product();
		
		product.changeState(oState);
		System.out.println(product.state.getState());
		//.....
		System.out.println(">> Product was Shipped to Customer");
		product.changeState(sState);
		System.out.println(product.state.getState());
		
		//....
		System.out.println(">> Product was Delivered to Customer");
		product.changeState(dState);
		System.out.println(product.state.getState());
		
		
		 

	}

}
