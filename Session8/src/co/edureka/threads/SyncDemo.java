package co.edureka.threads;

class Printer{
	
	// synchronized method is a method which will be accessed by a thread one by one
	// A lock will be acquired when execution begins and no other thread can access the synchronized method
	// Lock releases automatically when method execution finishes
	
	//synchronized void printDocuments(int copies, String documentName){
	void printDocuments(int copies, String documentName){
		for(int i=1;i<=copies;i++){
			System.out.println(">> Printing "+documentName+" Copy #"+i);
		}
	}
	
	void show(){
		System.out.println("==This is show==");
	}
}

class MyPrintingTask extends Thread{
	
	Printer pRef;
	
	MyPrintingTask(Printer p){
		pRef = p;
	}
	
	public void run() {
		// till tile synchronized Block is active, no other thread can access the Printer Object
		// synchronized Block !!
		synchronized (pRef) { // acquires lock here
			pRef.printDocuments(10, "** MyProfile.pdf **");
			pRef.show();
		} // releases lock here
	}
}

class YourPrintingTask extends Thread{
	
	Printer pRef;
	
	YourPrintingTask(Printer p){
		pRef = p;
	}
	
	public void run() {
		synchronized (pRef) { // acquires lock here
			pRef.printDocuments(10, "## eBook.pdf ##");
		} // releases lock here
		
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		// Only 1 Object of Printer we have Created : Only 1 Single Printer !!
		Printer printer = new Printer();
		
		// Why print in the main thread. For large number of copies main thread might hang !!
		// We will off-load the printing task to a Thread
		
		// Two Different Threads are working on the same Printer Object
		MyPrintingTask mRef = new MyPrintingTask(printer); // Pass Reference to Printer Object !!
		YourPrintingTask yRef = new YourPrintingTask(printer);
		
		mRef.start();
		/*try {
			mRef.join(); // have to call join on every thread which we start so as to achieve synchronization
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		yRef.start();

		
		System.out.println(">> App Finished");
		
		// PS: If we have multiple threads working on their own objects -> They must run Asynchronously 
		//     If we have multiple threads working on the same object -> They must run Synchronously !!
	}

}
