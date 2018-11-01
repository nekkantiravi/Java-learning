package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// It is similar to hasmap-but it is Synchronized(thread safe)
		// Stores the value on the basis if keyvalue pair
		// it maintains no insertion order
		// it contains only unique values
		// no null key and null values
		// key-->object-Hashcode--->value(In hashtable the key is strored in the form of
		// object and each and every object
		// inside the java it has one unique specific identifier for object i,e hashcode
		// and on that particular hashcode value will be stored

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "ravi");
		ht.put(2, "OSI");
		ht.put(3, "Lead");

		System.out.println(ht);

		// Create a clone copy/shallow copy

		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht1 = (Hashtable) ht.clone();

		System.out.println("values of ht" + ht);
		System.out.println("values of ht1" + ht1);
		// ht.clear();
		System.out.println("values of ht after removing" + ht);
		System.out.println("values of ht1" + ht1);

		// containsValue method
		if (ht1.containsValue("ravi")) {
			System.out.println("value is found");
		}

		// An object that implements the Enumeration interface generates a series of
		// elements, one at a time.
		// Successive calls to the nextElement method return successive elements of the
		// series.
		// For example, to print all elements of a Vector<E> v:
		// for (Enumeration<E> e = v.elements(); e.hasMoreElements();)
		// System.out.println(e.nextElement());

		// Print all the values of Hashtable using--Enumeration-elements();
		Enumeration e = ht.elements();

		while (e.hasMoreElements()) {

			System.out.println(" Values of enumeration: " + e.nextElement());

			// Get all the values of Hastable using--Entry set() --set of Hashtable values

			Set et = ht.entrySet();
			System.out.println(" Values of entry set: " + et);

			// Get the value from a key

			System.out.println("Key value: " + ht.get(2));

			// get the Hashcode of Hashtable object

			System.out.println("Hashcode oject: " + ht.hashCode());
			System.out.println("Hashcode oject: " + ht1.hashCode());

		}

	}

}
