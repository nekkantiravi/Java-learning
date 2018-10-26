package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		// Hashmap is a class implements map interface
		// extends abstract map
		// it contains only unique elements
		// Stores the values in ---key- value pair, not on indexes.
		// it may have only one null value and multiple null values
		// it maintains no insertion order
		// hashmap is non-synchronized---not thread safe
		// concurrent modification exception-fail-fast condition

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "selenium");
		hm.put(2, "Automation");
		hm.put(3, "QTP");
		hm.put(4, "jmater");
		hm.put(5, "index");
		System.out.println(hm);

		System.out.println(hm.get(4));
		System.out.println(hm.remove(4));
		System.out.println("after removing key:" + hm);
		for (Entry<Integer, String> m : hm.entrySet()) {

			System.out.println(m.getKey() + "  " + m.getValue());

		}

		HashMap<Integer, Person> hm1 = new HashMap<Integer, Person>();

		Person per1 = new Person(20, "nekk", 2300);
		Person per2 = new Person(30, "yes", 2400);
		Person per3 = new Person(40, "no", 2500);

		hm1.put(1, per1);
		hm1.put(2, per2);
		hm1.put(3, per3);

		for (Entry<Integer, Person> e : hm1.entrySet()) {

			int key = e.getKey();
			Person emp = e.getValue();
			System.out.println("Employee " + key + " Info: ");
			System.out.println(emp.age + " " + emp.name + " " + emp.salary);
		}

	}

}
