
// Progrmans get compiled to a bytecode
public class ValueVsRef {
	
	// Non Static Method
	void squareOfNum(int n){
		n++; 				// Increment by 1
		System.out.println("n is: "+n);
		int sq = n*n;		// Calculate Square
		System.out.println("sq is: "+sq);
	}
	
	void squareOfNumbers(int[] arr){
		System.out.println("arr is: "+arr);
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]*arr[i];
		}
	}

	public static void main(String[] args) {
		
		ValueVsRef v = new ValueVsRef();
		int a = 10; 						// 10 is data i.e. a value
		v.squareOfNum(a); 					// Passing the Value
		System.out.println("a is: "+a);	    // 10
		
		System.out.println("**************");
		int[] a1 = {11, 22, 33, 44, 55};	// a1 contains a HashCode | a1 is a reference variable
		System.out.println("a1 is: "+a1);
		
		v.squareOfNumbers(a1); 				// Passing the Reference | Copying hashCode
		
		for(int elm : a1){
			System.out.print(elm+"  ");
		}
		System.out.println();
	}
}
