package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;

public class CollectionSorting {
	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		//Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		// Customer c1=new Customer(20, 12000, "klm", null);
		list.add(new Customer(12, 12000, "test1"));
		list.add(new Customer(15, 78000, "test6"));
		list.add(new Customer(14, 16000, "test5"));

		System.out.println("Sorting by age");
		Collections.sort(list, new AgeComparator());
		Iterator<Customer> itr = list.iterator();
		while (itr.hasNext()) {
			Customer cs = itr.next();
			System.out.println(cs.age);

		}

		System.out.println("Sorting by name");

		Collections.sort(list, new NameComparator());
		Iterator<Customer> itr1 = list.iterator();
		while (itr1.hasNext()) {
			Customer cs1 = itr1.next();
			System.out.println(cs1.name);

		}
		System.out.println("Sorting by money");
		Collections.sort(list, new MoneyComparator());
		Iterator<Customer> itr2 = list.iterator();
		while (itr2.hasNext()) {
			Customer cs2 = itr2.next();
			System.out.println(cs2.money);

		}
	}

}
