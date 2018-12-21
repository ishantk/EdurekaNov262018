
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// 1.
		// Implicit Statement
		int[] a1 = {10, 20, 30, 40, 50}; // By Compiler > int[] a1 = new int[]{10, 20, 30, 40, 50};
		
		// Explicit Statement
		int[] a2 = new int[]{10, 20, 30, 40, 50};
		// new is operator which is creating array in the heap area of RAM
		// it creates the array dynamically i.e. at run time
		
		//2. 
		// Bracket Before or Bracket After : Same Thing
		int a3[] = {10, 20, 30, 40, 50};
		int a4[] = new int[]{10, 20, 30, 40, 50}; 
		//int a4[] = new int[5]{10, 20, 30, 40, 50}; -> Do not Give Size when you are giving values 
		
		//3.
		// We can give size to array and put elements later
		// 2 arrays with 5 elements and all elements are by default 0
		int[] a5 = new int[5];
		int a6[] = new int[5];
		
		a3[2] = 222;
		
		for(int num : a3){
			System.out.print(num+"  ");
		}
		
		System.out.println();
		
		a5[1] = 100;
		a5[3] = 333;
		
		for(int num : a5){
			System.out.print(num+"  ");
		}
		
		System.out.println();
		
		// Arrays can be created for any type !!
		double[] a7 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
	}

}
