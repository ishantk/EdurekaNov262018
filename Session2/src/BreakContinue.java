
public class BreakContinue {

	public static void main(String[] args) {
		
		int whichFloor = 5;
		
		for(int floor=1; floor<=10; floor++){
			System.out.println("Elevator is on Floor #"+floor);
			if(whichFloor ==  floor){
				System.out.println("Stop Elevator on Floor #"+floor+" to Step Out");
				break;
			}
		}
		
		// break -> terminates the loop
		// continue -> Makes the loop to move to the next iteration
		
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i<=5){
				continue;
			}
			System.out.println("i is: "+i);
		}

	}

}
