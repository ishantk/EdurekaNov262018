
public class ArraysDemo {

	public static void main(String[] args) {
		
		int a1 = 10;
		//int a1 = 10,20; // error : since a1 is a Single Value Container
		
		// Indexing Happens Here from 0 to 4 (n-1, where n is 5)
		int[] a2 = {10, 20, 30, 40, 50}; // a2 is a Multi Value Container | It is Homogeneous in Nature
		
		// Read 
		System.out.println("a1 is: "+a1); // a1 is a variable
		System.out.println("a2 is: "+a2); // a2 is a "reference variable" (it is holding some hash code)

		System.out.println("a2[0] is: "+a2[0]);
		System.out.println("a2[3] is: "+a2[3]);
		
		System.out.println("Length of a2 is: "+a2.length);
		
		// Read Entire Array 
		// 1. For Loop or while or do while
		for(int i=0;i<a2.length;i++){
			System.out.print(a2[i]+"  ");
		}
		System.out.println();
		
		// 2. Enhanced or For Each Loop | Works on Arrays
		for(int elm : a2){
			System.out.print(elm+"  ");
		}
	}

}
