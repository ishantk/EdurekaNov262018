package co.edureka.threads;

class Message{
	
	String message;
	
	Message(){
		message = "No Message Available";
	}
	
	void writeMessage(){
		message = "Search the Candle rather than cursing the darkness !!";
		System.out.println(">> Message Written");
	}
	
	void readMessage(){
		System.out.println(">> Message is: "+message);
	}
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) { // Lock Acqusition Happens Here
			
			try {
				m.wait(); // wait is a command where thread will pause its execution and wait to be notified to resume its execution
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}	
}

class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			m.writeMessage();
			//m.notify(); // who so ever is waiting on m, notify it !!
			m.notifyAll();// notifies all waiting threads on the same object m
		}
	}
	
}

public class WaitNotifyDemo {

	public static void main(String[] args) {

		// Only 1 Message Object
		Message mRef = new Message();

		// 2 Diff threads are working on same Message Object. Hence, we need Synchronization !!
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		WriterThread wt = new WriterThread(mRef);
				
		rt1.start(); // ReaderThread will start Before WriterThread
		rt2.start();
		wt.start();

	}

}
