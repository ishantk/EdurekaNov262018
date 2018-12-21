
public class Functions {
	
	// Non-Static Functions or Methods -> They need an Object
	
	// void means no return in method !!
	void addNumbers(int n1, int n2){ // Value or Primitves as Input
		int n3 = n1 + n2;
		System.out.println("n3 is: "+n3);
	}
	
	// Function with Return Type : We need to return integer data in the END.
	int addNumbersAgain(int n1, int n2){
		int n3 = n1 + n2;
		return n3;
	}
	
	// A Function/Method with array as input | Reference as Input | arr holds hashCodes
	void addManyNumbers(int[] arr){
		System.out.println("arr is: "+arr);
		int sum = 0;
		for(int elm : arr){
			sum = sum + elm;
		}
		System.out.println("Sum is: "+sum);
	}
	
	// Static Function/Method -> Can be executed by Class Name
	
	static void squareOfNumber(int num){
		int result = num*num;
		System.out.println("Square of "+num+" is "+result);
	}
	
	static double areaOfCircle(double radius){
		double result = 3.14*radius*radius;
		return result;
	}

	public static void main(String[] args) {
	
		/*
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1+num2;
		System.out.println("num3 is: "+num3);
		
		num1 = 12;
		num2 = 13;
		num3 = num1 + num2;
		System.out.println("num3 is: "+num3);
		
		num1 = 17;
		num2 = 18;
		num3 = num1 + num2;
		System.out.println("num3 is: "+num3);*/
		
		// Object Construction Statement: What is an object, we shall discuss later
		Functions f = new Functions(); // So that we can execute functions or Methods
		
		f.addNumbers(10, 20);
		f.addNumbers(12, 13);
		f.addNumbers(17, 18);
		
		int result = f.addNumbersAgain(19, 19); // Capture Returned Value from Method / Function
		System.out.println("result is: "+result);
		
		result = f.addNumbersAgain(22, 23);
		System.out.println("result is: "+result);
		
		int[] a1 = {10, 20, 30, 40, 50}; // a1 is a ref var containing some hashCode -> a1 is in stack where array is in the heap
		System.out.println("a1 is: "+a1);
		f.addManyNumbers(a1);
		
		// We dont need Object Construction for static methods
		// Directl access them with class name
		Functions.squareOfNumber(7);
		Functions.squareOfNumber(77);
		Functions.squareOfNumber(777);
		
		double area = Functions.areaOfCircle(2.0);
		System.out.println("Area is: "+area);
		System.out.println("Area of Circle with radius 5.5 is: "+Functions.areaOfCircle(5.5)); // Returned Valus is directly printed
	}

}
