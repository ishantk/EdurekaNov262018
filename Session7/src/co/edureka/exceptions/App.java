package co.edureka.exceptions;

public class App {
	
	// When main method executes normally to the end -> Normal Flow of App
	// In our case App Started and App Finished
	// main may execute and end up in an error at run time. Wherever error shall occur program crahes from thr
	// this is an abnormal termination of App -> Really BAD !!
	// OS shall give message to the user about crashes and will suggest to un-install !!
	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		int[] arr = {10, 20, 30, 40, 50};
		int a =10,b=0,c=0;
		
		
		// try and catch can help to save our program from crashing !!
		// catch catches exceptions thrown by JVM at run time !!
		// 1. either we can have separate try and catch
		// 2. we can have nested try and catch
		// 3. we can have 1 try but multiple catches 
		//    PS: wherever in try error occurs, below statements in try will not be executed !!
		// If a statement has to be executed at any cost, we create a finally block
		// finally will be executed either exception occurs or not !!
		try{
			/*try{
				c = a/b; // if b is 0, division isnt possible !!
			}catch(ArithmeticException aRef){
				System.out.println("Some Div Error Occured : "+aRef);
			}*/
			c = a/b; // if b is 0, division isnt possible !!
			// below statements will not be executed in try block if above statement is erroneous
			System.out.println("arr[10] is: "+arr[10]); //For such an instruction error will be thrown by JVM when we will run the program!!
			
		}/*catch(ArrayIndexOutOfBoundsException aRef){ // in catch block we always give reference to the object which will be caught
			// when error comes in try block, ArrayIndexOutOfBoundsException Object is created with error messages in it, and is thrown by JVM !!
			System.out.println("Some Index Error Occured : "+aRef);
		}catch(ArithmeticException aRef){
			// when error comes in try block, ArrayIndexOutOfBoundsException Object is created with error messages in it, and is thrown by JVM !!
			System.out.println("Some Div Error Occured : "+aRef);
		}*/
		catch(Exception e){ // RTP : Ref Variable of Parent Exception class can point to any Child Exception Class Object
			System.out.println("Some Error Occured : "+e);
		}
		finally{
			System.out.println("This is Awesome");
		}
		
		System.out.println("c is: "+c);
		
		System.out.println("==App Finished==");

		// How to remember which exception comes when ?? We cannot remember them all !!
		// We learn when we see the error !! Therefater we surround code with try catch !!
		// Escape: We just use Exception e, which is RTP, Parent's Ref Var can point to any child object !!
		
		// We may get to see:
		// Compiler can give us a prompt that please surround your line number n, with try catch !!
		// CHECKED EXCEPTIONS
		
		// Compiler will not tell us to surround our code with try catch, so we learn when we get the exception !!
		// Hence, afterwards we put a try catch !! -> Example explained above with ArithmeticException or Array One !!
		// UNCHECKED EXCEPTIONS
		
		// Nested Try Catch:
		/*try{
			try{
				
			}catch(Exception e){
				
			}finally{
				
			}
		}catch(Exception e){
			try{
				
			}catch(Exception e1){
				
			}finally{
				
			}
		}finally{
			try{
				
			}catch(Exception e2){
				
			}finally{
				
			}
		}*/
		
	}

}
