
public class Conditions {

	// Code is executed in a SEQUENCE. The way we have written !!
	public static void main(String[] args) {
		
		boolean isInternetEnabled = true;
		boolean isGPSConnected = false;
		
		if(isInternetEnabled){
			System.out.println("You can surf Interent !!");
		}else{
			System.out.println("Please Enable Internet and Try Again !!");
		}

		// Nested if/else - if else within the if else
		if(isInternetEnabled){
			if(isGPSConnected){
				System.out.println("You can use Google Maps for Navigation !!");
			}else{
				System.out.println("Please Enable GPS and Try Again !!");
			}
		}else{
			System.out.println("Please Enable Internet and Try Again !!");
		}
		
		int poolCab = 1;
		int luxCab = 2;
		int suvCab = 3;
		
		int userChoice = 10; 
		
		// Ladder if/else
		if(userChoice == poolCab){
			System.out.println("Your Pool Cab is Booked. Arriving Soon !! Please Pay $10");
		}else if(userChoice == luxCab){
			System.out.println("Your Luxuxry Cab is Booked. Arriving Soon !! Please Pay $20");
		}else if(userChoice == suvCab){
			System.out.println("Your SUV Cab is Booked. Arriving Soon !! Please Pay $30");
		}else{
			System.out.println("Please make a Valid Choice first !!");
		}
		
	}

}
