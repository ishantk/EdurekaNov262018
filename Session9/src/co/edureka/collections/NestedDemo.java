package co.edureka.collections;

class Outer{
	void show(){
		System.out.println("This is show of Outer");
	}
	
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}

public class NestedDemo {

	public static void main(String[] args) {
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
