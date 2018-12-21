
public class NestedLoops {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++){
			System.out.println("I is: "+i); // 1 2 3
			for(int j=1;j<=i;j++){   		// i 1 * j 1  |  i 2 * j 1 2  | i 3 * j 1 2 3
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
