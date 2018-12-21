
public class MyProg {

	/* main is the one which gets executed when we run the program. */
	// we must write code snippets in the main | Programming Instructions
	// Calculator App Demo | Codes in the main to develop a calc app
	// > Model, View and > Controller
	// Input and Output (System.out.println instruction)
	public static void main(String[] args) {
		
		// Whatever we write in the main is executed sequentially i.e. one after the other
		
		System.out.println("*******************************************");
		System.out.println("Hello, Welcome to our First Calculator App");
		System.out.println("*******************************************");
		
		// Model
		// Data Storage : Single Value Container | Primitive Data Type
		// Primitive -> works on values
		int num1 = 10;
		// num1 is the name of BOX or container
		// int is type of box i.e. integer with a size of 32 bits i.e. 4 bytes
		// 10 is the value or data
		
		int num2 = 20; 
		
		double num3 = 2.2;
		double num4 = 3.5;
		
		char ch = 'A';
		boolean isInternetEnabled = true; // true or false only
		
		
		// 1. Write Operation
		// 2. Update Operation
		// 3. Read Operation
		// 4. Delete Operation -> Automatically
		
		int age = 30; 	// Writer Operation
		age = 32;		// Update Operation
		System.out.println("Using Calc App for age of "+age);  // + is concatenation
		
		int num5 = num1 + num2; 		// Addition Operation
		double num6 = num3 + num4;
		
		System.out.println(num1+" and "+num2+" addition is "+num5);
		System.out.println(num3+" and "+num4+" addition is "+num6);
		
		num5++; // num5 = num5+1;
		System.out.println("num5 now is: "+num5);
		
		System.out.println("Is num1 > num2: "+ (num1 > num2) );
		System.out.println("Is num1 < num2: "+ (num1 < num2) );
		
		System.out.println("Is num5 > num1 && num5 > num2: "+ ( (num5 >num1) && (num5 > num2) ) );
		
	}

}
