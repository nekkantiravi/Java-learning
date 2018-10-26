package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Selenum");
		ll.add("QTP");
		ll.add("Jmeter");

		ll.get(1);

		ll.addFirst("cucumber");
		ll.addLast("framework");
		ll.set(2, "Yes");
		ll.removeFirst();
		ll.removeLast();
		// ll.remove(2);
		System.out.println(ll);

		// how to print all the values of linked list
		// for loop
		System.out.println("********for loop");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		// advanced for loop

		System.out.println("********for each loop");

		for (String str : ll) {
			System.out.println(str);
		}
		// iterator

		System.out.println("********using Iterator");

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) { // boolean hasNext()Returns true if the iteration has more elements

			System.out.println(it.next());
		}

		// while

		System.out.println("********using whileloop");

		int num = 0;

		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;

		}

	}

}
