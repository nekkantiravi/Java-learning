package collection;

import java.util.LinkedList;

public class QueueInterface {

	public static void main(String[] args) {
		//1.A Queue is designed in such a way so that the elements added to it are placed at the end of Queue 
		//and removed from the beginning of Queue.
		//2. Queue interface in Java collections has two implementation: LinkedList and PriorityQueue, 
		//these two classes implements Queue interface.
		
		/*
	       * We cannot create instance of a Queue as it is an
	       * interface, we can create instance of LinkedList or
	       * PriorityQueue and assign it to Queue
	       */
	      java.util.Queue<String> q = new LinkedList<String>();
		    
	      //Adding elements to the Queue
	      q.add("Rick");
	      q.add("Maggie"); 
	      q.add("Glenn");
	      q.add("Negan");
	      q.add("Daryl");
		    
	      System.out.println("Elements in Queue:"+q);

	      /*
	       * We can remove element from Queue using remove() method,
	       * this would remove the first element from the Queue 
	       */
	      System.out.println("Removed element: "+q.remove());
	      q.add("ravi");
	      
	      System.out.println("Elements in Queue:"+q);
		    
	      /*
	       * element() method - this returns the head of the
	       * Queue. Head is the first element of Queue
	       */
	      System.out.println("Head: "+q.element());
		    
	      /*
	       * poll() method - this removes and returns the 
	       * head of the Queue. Returns null if the Queue is empty
	       */
	      System.out.println("poll(): "+q.poll());
		    
	      /*
	       * peek() method - it works same as element() method,
	       * however it returns null if the Queue is empty
	       */
	      System.out.println("peek(): "+q.peek());
		    
	      //Again displaying the elements of Queue
	      System.out.println("Elements in Queue:"+q);

	}

}
