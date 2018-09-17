package CollectionsSyntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Syntax{

	public static void main(String[] args) {

		// List interface syntax
		List list = new ArrayList<>();
		List list1 = new LinkedList<>();

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();

		ArrayList<String> l3 = new ArrayList<String>();
		LinkedList<String> l4 = new LinkedList<String>();

		ArrayList<Object> a1 = new ArrayList<Object>();
		LinkedList<Object> a2 = new LinkedList<Object>();

		// Set interface syntax

		Set set = new HashSet<>();
		Set set1 = new LinkedHashSet<>();
		Set set2 = new TreeSet<>();

		HashSet<Integer> h1 = new HashSet<Integer>();
		LinkedHashSet<String> h2 = new LinkedHashSet<String>();
		TreeSet<Object> h3 = new TreeSet<Object>();

		Map m1 = new HashMap<>();
		Map m2 = new LinkedHashMap<>();
		Map m3 = new TreeMap<>();

		Map<Integer, String> m4 = new HashMap<Integer, String>();
		Map<Integer, String> m5 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> m6 = new TreeMap<Integer, String>();

		HashMap<Integer, String> m7 = new HashMap<Integer, String>();
		HashMap<Integer, String> m8 = new HashMap<Integer, String>();
		TreeMap<Integer, String> m9 = new TreeMap<Integer, String>();

		ArrayList<Person> p1 = new ArrayList<Person>();
		LinkedList<Person> p2 = new LinkedList<Person>();
		HashSet<Person> p3 = new HashSet<Person>();

		Person o1 = new Person(24, "ravi", 35000);
		Person o2 = new Person(25, "nekkanti", 40000);

		p1.add(o1);
		p2.add(o2);
		
	     Iterator itr=p1.iterator();
	     while(itr.hasNext()) {
	     System.out.println(itr.next());
	     }

	}

}
