

/*class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(){
		System.out.println(">> Cab Booked !! Arriving Soon !!");
	}
}*/

// 1. Its a class for which we cannot create Objects !! | It cannot be instantiated !!
// 2. It can have abstract methods which will have no defintions !! We can have n number of abstract methods !!
// 3. All the abstract method in Parent acts as RULES which must be defined by Children !!

// PS:In the output we will see Cab Object Constructed i.e. Rule of Inheritance in actions
//    We cannot create Parent Object, but JVM Constructs it !! 

// Optimizing RUN TIME POLYMORPHISM !!
/*abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// Can be created only in abstract class
	// abstract is a concept w.r.t. Object and not to Class, so no static usage here !!
	// bookCab is a RULE by abstract class i.e. Parent
	abstract void bookCab();	// RULE
	
	void show(){
		System.out.println("This is show of Cab");
	}
}*/

// Optimizing RUN TIME POLYMORPHISM to the BEST !!
// Make your abstract class as interface
// 1. Neither We can Create its Objects, nor JVM can !! 
interface Cab{
	
	// We cant have constructor here as No Objects for interfaces !!
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// bookCab method is a RULE by interface i.e. not a Parent
	void bookCab();	// RULE -> public abstract void bookCab();
	
	// No Methods with defintions in interfaces
	/*void show(){
		System.out.println("This is show of Cab");
	}*/
}

class UberGo implements Cab{ //extends Cab{ // UberGo IS-A Cab (Here UberGo is Child and Cab is Parent)
	
	UberGo(){
		System.out.println(">> UberGo Object Constructed");
	}
	
	// Override Method of Parent in Child : Redefining method with same signature
	// In Child, abstract method must be redefined !!
	public void bookCab(){
		System.out.println(">> UberGo Booked !! Arriving Soon !!");
	}
	
}

class UberX implements Cab{ //extends Cab{ // UberX IS-A Cab (Here UberX is Child and Cab is Parent)
	
	UberX(){
		System.out.println(">> UberX Object Constructed");
	}
	
	// Override Method of Parent in Child : Redefining method with same signature
	public void bookCab(){
		System.out.println(">> UberX Booked !! Arriving Soon !!");
	}
	
}

class UberMoto implements Cab{ //extends Cab{ // UberX IS-A Cab (Here UberX is Child and Cab is Parent)
	
	UberMoto(){
		System.out.println(">> UberMoto Object Constructed");
	}
	
	// Override Method of Parent in Child : Redefining method with same signature
	public void bookCab(){
		System.out.println(">> UberMoto Booked !! Arriving Soon !!");
	}
	
	void hello(){
		System.out.println("Hello from UberMoto Driver !!");
	}
	
}


public class RTPDemo {

	public static void main(String[] args) {
		
		//Cab cRef = new Cab(); // Object Construction Statement
		//cRef.bookCab(); 	  	// Method Execution
		
		// Before the Object of Child, Parent Object is Constructed and thrafter Child Object is Constructed
		//UberGo uRef = new UberGo();	// Object Construction Statement
		// Since bookCab is overrided in child, child's version shall be executed
		//uRef.bookCab();				// Method Execution
				
		Cab cRef; 				// Reference Variable of Parent i.e. Cab
		// Reference Variable of Parent can point to any child object !!
		// Reference Variable of Interface can point to any object which implements it !!
		cRef = new UberGo();	// Polymorphic Statement
		cRef.bookCab();			// Overriding comes to action and Child's version shall be executed even ref variable belongs to Parent

		System.out.println();
		
		cRef = new UberX();
		cRef.bookCab();
		
		System.out.println();
		
		cRef = new UberMoto();
		cRef.bookCab();
		
		//cRef.show(); 	// Parent's Methods are Inherited and can be executed i.e. accessed
		
		// error
		//cRef.hello();	// Child's Methods cannot be executed by ref var of Parent as we dont have it in Parent
		
		// Same Reference Variable of Parent is Pointing to Multiple Child Objects (more than 1 form)
		// Same bookCab() method upon executions is executing different definitions !! -> RUN TIME POLYMORPHISM
		
		System.out.println();
		
		// Lets Write such Statement:
		// These Statements shall be of no use as type of booking cab isnt known to us. Its just a generic cab !!
		// Further executing bookCab() method in cRef will be again of no use !!
		
		// So, by making Cab as abstract we have limited the user from creating objects !!
		//cRef = new Cab();
		//cRef.bookCab();
		
		
	}

}
