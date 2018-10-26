package collection;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {

		PriorityQueue<String> q1 = new PriorityQueue<String>();
		q1.add("test1");
		q1.add("test2");
		q1.add("test3");
		q1.add("test4");
		q1.add("test5");

		System.out.println("head:" + q1.element() + "  " + q1.peek() + " " + q1.size());

	}
}
