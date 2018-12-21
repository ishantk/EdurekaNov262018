// final classes cannot be extended
final class CA{
	
	// final methods of Parent cannot be overrided i.e. redefined by children
	final void show(){
		System.out.println("This is show of CA");
	}
	
}

class CB{ //extends CA{ // error in extension
	
	// Error
	/*void show(){
		System.out.println("This is show of CB");
	}*/
	
}


public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100; 		// manipulate/modify value of i anytime in program i.e. Update Operation on Container
		
		// We cannot change its Value anymore. It is acting as Constant. Rather its a read only variable !!
		final int j = 10;
		//j = 100; // error
		
		final double pi = 3.14;

	}

}
