package co.edureka.threads;

/*class PrintingTask{
	void printBook(){
		for(int i=1;i<=10;i++){
			System.out.println("** Printing Book Page #"+i);
		}
	}
}*/

// Now PrintingTask IS-A Thread
class PrintingTask extends Thread{
	// Jobs of a Child Thread must be in the run method
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("** Printing Book Page #"+i);
		}
	}
}

public class ThreadDemo {

	// main method is main thread !!
	public static void main(String[] args) {
		
		System.out.println("==Main Started==");

		// Till time PrintingTask is not finished, below statements are blocked !!
		PrintingTask task = new PrintingTask();
		//task.printBook();
		task.start(); // start will execute run method internally
		// start is a method which we call on Thread Object and it internally executes run method !!
		
		// for loop and main finished will be executed once printBooks is finished
		for(int i=1;i<=10;i++){
			System.out.println(">> Printing Document #"+i);
		}
		
		System.out.println("==Main Finished==");
		
		// Why we off loaded task to child thread. 
		// If main is busy in executing a task which takes long time, OS will give user a message : Would you like to wait or kill the app !!
		// main thread is blocked hence your application isnt responding !!
	}

}
