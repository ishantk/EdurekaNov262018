
public class MultiDimArrays {

	public static void main(String[] args) {
		
		int a1 = 10;
		
		int[] a2 = {10, 20, 30, 40, 50}; // 1-D
		
		// Array of Arrays | 2-D Array
		// a3 is having 5 of 1-D Arrays
		int[][] a3 = {
						{10, 20, 30}, 				// 0
						{10, 20},					// 1
						{10, 20, 30, 40, 50},		// 2
						{10, 20, 30, 40},			// 3
						{10}						// 4
					 };
		
		System.out.println("a1 is "+a1);
		System.out.println("a2 is "+a2+" and length is "+a2.length);
		System.out.println("a3 is "+a3+" and length is "+a3.length);
		
		System.out.println();
		
		for(int i=0;i<a3.length;i++){
			System.out.println("a3["+i+"] is "+a3[i]+" and length is "+a3[i].length);
		}

		System.out.println("a3[2][3] is: "+a3[2][3]); // 40
		
		System.out.println();
		
		// Read the entire Array
		for(int i=0;i<a3.length;i++){ 			// i: 0, 1, 2, 3, 4
			for(int j=0;j<a3[i].length;j++){ 	// j: 3(0,1,2), 2(0,1), 5(0,1,2,3,4), 4(0,1,2,3), 1(0) 
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][][] a4 = {
							{
								{10, 20, 30}, 				// 0
								{10, 20},					// 1
								{10, 20, 30, 40, 50},		// 2			0
								{10, 20, 30, 40},			// 3
								{10}						// 4
							 },
							 {
								{10, 20, 30}, 				// 0
								{10, 20},					// 1
								{10, 20, 30, 40, 50},		// 2			1
								{10, 20, 30, 40},			// 3
								{10}						// 4
							  }
						};
		
		System.out.println("a4 is: "+a4+" and length is: "+a4.length);
		System.out.println(a4[0][1][1]); // 20
		
		
	}

}
