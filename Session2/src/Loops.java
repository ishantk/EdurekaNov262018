
public class Loops {

	public static void main(String[] args) {
	
		int num = 5;
		int i = 1;
		
		// Table of a Number: We are writing same code every time. | Repetitive Code.
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // increment i by 1
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
	
		// Update the Variables Values
		num = 7;
		i = 11;
		
		System.out.println("****while loop****");
		while(i<=10){ // Condition is checked in the begining (Entry Level Check)
			System.out.println(num+" "+i+"'s are "+(num*i));
			//i++; 		// i = i + 1;
			//i+=1;  	// i = i + 1;
			++i;    	// i = i + 1;
		}
		
		
		System.out.println("****do while loop****");
		num = 9;
		i = 11;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++; 	
		}while(i<=10); // Condition is checked in the end (Exit Level Check)
		// Even if condition fails -> do while will be executed at least once.
		
		// Use Case : ATM Machines
		
		
		System.out.println("****for loop****");
		
		// Check Condition -> Enter Loop -> Execute Statements in Loop -> Increment
		for(num=11,i=1; i<=10; i++){ // 1. Initialize Variables ; 2. Condition 3. Increment or Decrement
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		
		System.out.println("**************");
		num = 13;
		i = 1;
		for(;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		System.out.println("**************");
		// n and j is destroyed automatically when loop terminates
		for(int n=21,j=1;j<=10;j++){  // int n=21,j=1 -> Variable Creation in the Loop itself
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
	} // main terminates here

}
