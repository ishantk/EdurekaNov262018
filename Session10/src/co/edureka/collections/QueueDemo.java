package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// FIFO : First In First Out
		// Sorts the data as well for us automatically
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// Queue
		// (Head) 10	9	8	7	6	5	4	3	2	1 (Tail)
		
		// But, Queue sorts the data as well for us !!
		// (Head) 1		2	3	4	5	6	7	8	9	10 (Tail)
		
		/*
		System.out.println("Size of Queue is: "+queue.size());
		System.out.println("Head of Queue is: "+queue.peek());
		
		// Remove the Head
		queue.poll(); // Remove the head of queue
		
		System.out.println("Size of Queue is: "+queue.size());
		System.out.println("Head of Queue is: "+queue.peek());
		*/
		
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.peek()); 	// Reading the head of Queue
			queue.poll(); 						// removing the head of Queue shall reduce the size
			System.out.println("Queue new size is: "+queue.size());
		}
	}

}
