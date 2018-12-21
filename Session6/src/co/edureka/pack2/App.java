package co.edureka.pack2;

// If we wish to create Objects out of the package we must import the class
import co.edureka.pack1.One;    // public is accessible within the package and even outside the package
//import co.edureka.pack1.Two;  // default is not accessible outside the package

// Inheritance across the package | Protected is inheritable, default is not Inheritable
// 1. only public and protected is inherited. default and private is not inherited.
// 2. protected after inheritance behaves as private.
class CC extends One{
	
	void show(){
		protShow(); // execute protShow from show(is accessible)
	}
	
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();   // For a public class One, private method is not accessible. Its visibility is just within the class
		//oRef.defShow();   // For a public class One, default method is not accessible outside the package. Its visibility is just within the package
		//oRef.protShow();  // For a public class One, protected method is not accessible outside the package. Its visibility is just within the package
		oRef.pubShow();
		
		System.out.println();
		
		CC cRef = new CC();
		//cRef.protShow(); // Inherited but is behaving as private !!
		cRef.pubShow();
		cRef.show();
	}
}
