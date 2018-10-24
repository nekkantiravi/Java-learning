package CollectionsSyntax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



public class ListInterface {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		ArrayList<Person> l1 = new ArrayList<Person>();

		Person s1 = new Person(10, "test", 12000);

		l1.add(s1);

		Iterator<Person> itr = l1.iterator();
		while (itr.hasNext()) {
			Person per = itr.next();
			System.out.println(per.age + " " + per.name + " " + per.salary);

		}

		list.add("collection");
		list.add("arrays");

		list2.add(20);
		list2.add(40);

		Iterator<String> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		for (Integer i : list2)
			System.out.println(i);

		
		ArrayList<Integer> list9 = new ArrayList<Integer>();
		list9.add(5);
		list9.add(Integer.valueOf(5));
		list9.add(2,10);
		
		System.out.println(list9);
		
		}
	}
