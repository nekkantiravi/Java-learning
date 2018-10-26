package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SortingHashSet {

	public static void main(String args[]) {

		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pear");
		fruits.add("Pear");
		

		System.out.println("HashSet elements before sorting: " + fruits);

		// Method 1: Sorting HashSet using List interface

		ArrayList<String> fruitlist = new ArrayList<String>(fruits);
		Collections.sort(fruitlist);
		// Displaying list
		System.out.println("HashSet elements after sorting: " + fruitlist);

		// Method 2: Sorting using TreeSet
		TreeSet<String> tset = new TreeSet<String>(fruits);

		System.out.println("HashSet elements after using TreeSet: " + tset);

	}
}