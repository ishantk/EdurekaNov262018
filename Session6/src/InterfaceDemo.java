interface Inf1{
	void hello();
	void show();
}

interface Inf2{
	void show();
	void bye();
}

// Multiple Inheritance in Java
// Interface to Interface Inheritance, No Objects Involved !!
interface Inf3 extends Inf1, Inf2{
	int i = 10; // public static final int i = 10;
	// hello, show and bye shall be inherited
}

// We can have multiple Implementation but not multiple extension 
// Multiple Inheritance(Parent Child Relation) not supported in Java, but Multiple Implementation(Traffic Police and Us Relation) is supported !!
class CC implements Inf3{//Inf1, Inf2{
	
	public void hello(){
		System.out.println("Hello from CC");
	}
	
	// It must be defined once even though its from 2 diff interfaces
	public void show(){
		System.out.println("Show of CC");
	}
	
	public void bye(){
		System.out.println("Bye from CC");
	}
	
	void fun(){
		System.out.println("Fun from CC");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
	
		// Write Polymorphic Statement
		// Ref Var of Interface can point to the Object which implements it !!
		Inf1 iRef1 = new CC();
		iRef1.show();
		iRef1.hello();
		//iRef1.bye(); // not accessible as its not a rule in Inf1
		
		System.out.println();
		
		Inf2 iRef2 = new CC();
		iRef2.show();
		iRef2.bye();
		// iRef2.hello(); //not accessible as its not  rule in Inf2

		// Below wont work. Not Accessible !!
		//iRef1.fun();
		//iRef2.fun();
		
		System.out.println();
		
		Inf3 iRef3 = new CC();
		iRef3.show();
		iRef3.hello();
		iRef3.bye();
		
		//Inf3.i = 100; // cannot modify !!
		System.out.println("i is: "+Inf3.i);
	}

}
