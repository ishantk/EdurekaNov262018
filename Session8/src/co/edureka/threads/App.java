package co.edureka.threads;

class MyTask extends Thread{ // MyTask IS-A thread !!
	// Access Modifier to override should be same or more accessible
	public void run(){  // run method represents task to be executed by thread
		
		System.out.println("MyTask State in Run Method: "+getState());
		
		for(int i=0;i<=10;i++){
			
			try {
				Thread.sleep(500); // it will pause thread for 0.5 secs and resume it again
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("** MyTask ** "+i);
		}
	}
}

class CA{
	
}

//class YourTask extends CA, Thread{ // Multiple Inheritance Not Supported in Java
class YourTask extends CA implements Runnable{
	public void run(){  // run method represents task to be executed by thread
		for(int i=0;i<=10;i++){
			try {
				Thread.sleep(250); // it will pause thread for 0.25 secs and resume it again
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("## YourTask ## "+i);
		}
	}
}

public class App {

	// main method represents main thread !!
	public static void main(String[] args) {
		
		System.out.println(">> App Started");

		MyTask mRef = new MyTask();
		System.out.println("MyTask State after creation of Object: "+mRef.getState());
		
		Runnable r = new YourTask(); // Polymorphic Statement : Ref Var of Runnable is pointing to the Objetc of YourTask
		Thread yRef = new Thread(r);
		
		mRef.setName("John");
		yRef.setName("Jennie");
		Thread.currentThread().setName("Jack");
		
		// Setting of Priority is a Request to JVM for low memory or busy conditions
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		yRef.setPriority(Thread.NORM_PRIORITY); // 5
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
		
		System.out.println("MyTask State before start method: "+mRef.getState());
		mRef.start(); // start is internally executing run method by maintaining some states of a thread
		System.out.println("MyTask State after start method: "+mRef.getState());
		// executing join method immediately after start !!
		try {
			mRef.join(); // execute all the jobs of MyTask and let others wait till i finish !!
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("MyTask State after join method: "+mRef.getState());
		
		
		yRef.start();
		
		
		// Below Statements shall not execute till MyTask has finished execution !!
		for(int i=0;i<=10;i++){
			try {
				Thread.sleep(1000); // it will pause thread for 1 secs and resume it again
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Main >> "+i);
		}
		
		// We are checking what is the name of thread and what is the priority of thread !!
		System.out.println("MyTask Name is: "+mRef.getName()+" and Priority is: "+mRef.getPriority());
		System.out.println("YourTask Name is: "+yRef.getName()+" and Priority is: "+yRef.getPriority());
		System.out.println("Main Name is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		//Thread.State.RUNNABLE
		
		System.out.println(">> App Finished");
	}
	
	// Output is a mixed Output and it will always be different or may be even same.
	// Because main thread and MyTask they are running parallely i.e. together
	// MyTask is an Asynchronous/Parallel/Concurrent execution i.e. running together with main
	

}
