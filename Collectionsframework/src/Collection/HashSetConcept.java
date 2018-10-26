package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetConcept {

	public static void main(String[] args) {
		
		//HashSet doesn’t maintain any order, the elements would be returned in any random order.
		//HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
		//HashSet allows null values however if you insert more than one nulls it would still return only one null value.
		//h1.clear() deletes all the elements in Hashset.		

		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(20);
		h1.add(40);
		h1.add(60);
		h1.add(40);
		System.out.println(h1);

		for (Integer set : h1) {
			System.out.println(set);
		}

		Iterator<Integer> it = h1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// LinkedHashSet
		//LinkedHashSet maintains the insertion order. 
		//Elements gets sorted in the same sequence in which they have been added to the Set.
		LinkedHashSet<String> h2 = new LinkedHashSet<String>();
		h2.add("klm");
		h2.add("man");
		h2.add("sir");
		h2.add("play");
		h2.add("crick");
		h2.add("ground");
		System.out.println(h2);

		System.out.println("********");

		// Treeset
		//TreeSet elements are sorted in ascending order by default.
		//TreeSet does not hold duplicate elements

		TreeSet<Object> t1 = new TreeSet<Object>();

		t1.add("cric");
		t1.add("base");
		t1.add("indore");
		t1.add("indore");
		/*
		 * t1.add(45); t1.add(60); t1.add(45); t1.add(35);
		 */
		System.out.println(t1);
		
		// Program to convert a HashSet to a TreeSet
		// Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating a TreeSet of HashSet elements
	     Set<String> tset = new TreeSet<String>(hset);
	 
	     // Displaying TreeSet elements
	     System.out.println("TreeSet contains: ");
	     for(String temp : tset){
	        System.out.println(temp);
	     }
	  }
	
	}


