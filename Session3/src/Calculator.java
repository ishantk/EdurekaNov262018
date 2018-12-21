
public class Calculator {
	
	void add(int num1, int num2){
		int result = num1 + num2;
		System.out.println("Result is: "+result);
	}
	
	// if we use the same name with same inputs: its an error
	// even modifying the names for inputs is not acceptable
	// even by modfying the return type is not acceptable
	// PS: We cannot use the same method name: if we change input names or change return type
	// Compiler cannot link execution with defintion i.e. cannot perform binding operation
	//void add(int n1, int n2){
	/*int add(int n1, int n2){
		int result = n1 + n2;
		//System.out.println("Result is: "+result);
		return result;
	}*/
	
	// Overloading:
	/*
	 	1. Name should be same
	 	2. inputs should be different and unique
	 		2.1 number of inputs (arguments)
	 		2.2 type of inputs
	 		2.3 sequence of inputs
	 	3. return type has no role to play
	 */
	
	void add(int num1, int num2, int num3){
		int result = num1 + num2 + num3;
		System.out.println("Result is: "+result);
	}
	
	void add(double num1, double num2){
		double result = num1 + num2;
		System.out.println("Result is: "+result);
	}
	
	void add(int num1, double num2){
		double result = num1 + num2;
		System.out.println("Result is: "+result);
	}
	
	void add(double num1, int num2){
		double result = num1 + num2;
		System.out.println("Result is: "+result);
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		// Static or Compile Time Polymorphism :  Compiler will link execution call to the defintion
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(2.1275, 3.1234);
		c.add(20, 3.1234);
		c.add(2.1275, 30);

	}

}
