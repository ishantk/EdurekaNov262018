// Textual Representation how an object shall look like
class Window{
	
	// Attributes : Property of an Object
	int width;
	int height;
	
	// Special Method : Constructor : Name is same as that of class name and has no return type
	// Default Constructor : If we dont create compiler creates one
	// The first method which is executed on any object is constructor.
	// Main role of constructor is to provide some initial value to attributes !!
	Window(){
		width = 12;
		height = 12;
	}
	
	// Overloaded Constructor
	// non default constructor or argument constructor : constructor with inputs
	// LHS i.e. this.width belongs to Object and width belongs to Constructor
	Window(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	// We can have input names same as that of attribute's names.
	
	// this is a reference variable, which will hold reference to current object in execution
	
	// Methods : Property of an Object
	
	// LHS i.e. this.width belongs to Object and width belongs to Method
	void setWidthAndHeight(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	void showWindowDetails(){
		System.out.println("Window is "+width+" by "+height);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
			
		// Object Construction Statement
		Window w1 = new Window(); // call with the new Window(); is call to Constructor.
		w1.setWidthAndHeight(10, 5);
		w1.showWindowDetails();
		
		Window w2 = new Window();
		w2.showWindowDetails();
		
		Window w3 = new Window(16,16); // we give values directly during object construction
		w3.showWindowDetails();

	}

}
