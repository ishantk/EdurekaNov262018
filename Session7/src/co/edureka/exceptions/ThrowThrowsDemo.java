package co.edureka.exceptions;

import java.io.IOException; // IOException is not child of RuntimeException -> CHECKED EXCEPTION

// User-Defined, UNCHECKED EXCEPTION
class MyBankingExcpetion extends RuntimeException{
	MyBankingExcpetion(String message){
		super(message); // Passing the message to Parent Constructor !!
	}
}

//User-Defined, CHECKED EXCEPTION
class YourBankingExcpetion extends Exception{
	YourBankingExcpetion(String message){
		super(message);
	}
}

class Banking{
	
	int accountBalance = 10000;
	int minBalance = 2000; // By Bank
	
	int attempts = 0;
	
	// If a method internally throws a CHECKED EXCPETION, we need to put the same in method's signature with throws clause !!
	void withdraw(int amt) throws IOException, YourBankingExcpetion {
		accountBalance = accountBalance - amt;
		if(accountBalance <= minBalance){
			accountBalance = accountBalance + amt;
			System.out.println("Sorry !! Transaction Failed !! Balance is LOW \u20b9"+accountBalance);
			attempts++;
		}else{
			System.out.println("\u20b9"+amt+" Successfully Withdrawn from Account and updated Balance is: \u20b9"+accountBalance);
		}
		
		// Throwing an UNCHECEKED EXCEPTION OBJECT (Unchecked exception are children of RuntimeException class)
		/*if(attempts == 3){
			// Create an Object yourself !!
			ArithmeticException aRef = new ArithmeticException("Illegal Attempts !!");
			throw aRef; // throw an exception object explicitly and crash the program !!
		}*/
		
		// Throwing a CHECEKED EXCEPTION OBJECT (Checked exception are not children of RuntimeException class)
		if(attempts == 3){
			// Create an Object yourself !!
			//IOException iRef = new IOException("Illegal Attempts !!");
			// While throwing a Checked Exception compiler is giving us an error message !!
			//throw iRef; // throw an exception object explicitly and crash the program !!
			
			// YourBankingExcpetion is a User Defined, Checked Exception
			YourBankingExcpetion yRef = new YourBankingExcpetion("ILLEAGAL ATTEMPTS !! BALANCE IS LOW !!");
			throw yRef;
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("==Banking Started==");

		Banking bRef = new Banking();
		
		// If some illegal attempts are being made, we need to check that part !!
		try{
			for(int i=1;i<=500;i++){
				bRef.withdraw(3000);
			}
		}catch(Exception e){ // RTP
			System.out.println("Some Exception: "+e);
		}
		
		System.out.println("==Banking Finished==");
	}

}
