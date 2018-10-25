package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		// dynamic array--array list
		// 1.Can contain duplicate values/elements
		// 2.maintains insertion order
		// 3.Synchronized
		// 4.allows random access to fetch the elements because it stores the values on
		// the basis of indexes.

		ArrayList al = new ArrayList();
		al.add(20); // 0
		al.add("test");// 1
		al.add(true);// 2
		al.add(20);// 3
		al.add(50);// 4
		al.add(60);// 5
		System.out.println(al.size()); // size of arraylist
		System.out.println(al.get(3));// to get the values from an index

		// To print all the values from arraylist
		// 1. for loop
		// 2. Iterator

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// non-generic vs Generic

		ArrayList<Integer> al1 = new ArrayList<Integer>(); // Generic syntax

		al1.add(20);
		al1.add(30);

		try {
			al1.add(Integer.parseInt("nekk"));
		} catch (NumberFormatException e) {
			// e.printStackTrace();
		}

		System.out.println("************");

		System.out.println(al1);

		ArrayList<String> al2 = new ArrayList<String>(); // Generic syntax
		al2.add("selenium");
		al2.add("Automation");
		// al2.add(String.valueOf(2));
		System.out.println(al2);

		// Employee class objects
		Person p1 = new Person(12, "ravi", 20000);
		Person p2 = new Person(13, "test", 30000);

		// Create Array list
		ArrayList<Person> al3 = new ArrayList<Person>(); // Storing the specific user defined class object in array list

		al3.add(p1);
		al3.add(p2);

		// Iterator to traverse the values
		Iterator<Person> it = al3.iterator();

		while (it.hasNext()) {
			Person per = it.next();

			System.out.println(per.age + " " + per.name + " " + per.salary);
		}

		ArrayList<Object> ob = new ArrayList<Object>();// Class Object is the root of the class hierarchy.
		                                               // Every class has Object as a superclass
		ob.add("ravi");
		ob.add(20);

		// addall() method

		ArrayList<Integer> al4 = new ArrayList<Integer>();
		al4.add(20);
		al4.add(30);
		al4.add(40);
		
		ArrayList<Integer> al5 = new ArrayList<Integer>();
		al5.add(20);
		al5.add(90);
		
		al4.addAll(al5);
		
		for(int j=0; j<al4.size();j++) {
			System.out.println(al4.get(j));
		}
		
		System.out.println("#####");
		//removeAll() method
		
		al4.removeAll(al5);
		
		for(int j=0; j<al4.size();j++) {
			System.out.println(al4.get(j));
		}
		//retainall method
		
         al4.retainAll(al5);
         
		
		for(int j=0; j<al4.size();j++) {
			System.out.println(al4.get(j));
		}
	}

}
