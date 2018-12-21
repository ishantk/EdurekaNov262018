
public class MultiDimArrays {

	public static void main(String[] args) {
		
		int[][] a1 = {
						{10,20,30},			//0	| 3 | 0,0  0,1  0,2
						{10,20,30,40},		//1 | 4 | 0,0  0,1  0,2  0,3
						{10},				//2 | 1
						{10,20,30,40,50},	//3 | 5
						{10,20},			//4 | 2
					 };
		
		// Write/Update Data in Array
		a1[1][2] = 122; // 30 is updated to a newer value

		for(int i=0;i<a1.length;i++){ 			// 5 times : i-> 0, 1, 2, 3, 4
			for(int j=0;j<a1[i].length;j++){	// n times : i:0, j:0,1,2 | i:1, j:0,1,2,3 | i:2, j:0 .. ...
				System.out.print(a1[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// IF We Dont Know What Will Be The Elements !!
		
		// Here in below statement, we created an array with 3 arrays, each array having 5 elements and all the elements are by default 0.
		int[][] a2 = new int[3][5]; // 3-> 3 Arrays | 5-> 5 elements in each array
		a2[1][1] = 11;
		for(int i=0;i<a2.length;i++){ 			
			for(int j=0;j<a2[i].length;j++){	
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] a3 = new int[3][]; // 3-> 3 1-D Arrays | [] -> we dont know how many elements in each array !!
		a3[0] = new int[5];		   // 0th Array will have 5 elements
		a3[1] = new int[15];	   // 1st Array will have 15 elements
		a3[2] = new int[25];	   // 2nd Array will have 25 elements	
		
		a3[0][0] = 1;
		a3[1][9] = 1;
		a3[2][14] = 1;
		
		for(int i=0;i<a3.length;i++){ 			
			for(int j=0;j<a3[i].length;j++){	
				System.out.print(a3[i][j]+"  ");
			}
			System.out.println();
		}
		
		// a1 a2 and a3 are reference variables. They can be any name of your choice. 
	}

}
