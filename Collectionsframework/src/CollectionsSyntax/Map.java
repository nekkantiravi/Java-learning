package CollectionsSyntax;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map.put(10000, "ravi");
		map.put(200, "test");

		map.put(3, "test2");
		map.put(1, "test1");
		map.put(6, "test2");
		for (Entry<Integer, String> m1 : map.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}

		/*for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
*/
		/*
		  Set<Entry<Integer, String>> set = map.entrySet(); Iterator<Entry<Integer,
		  String>> itr = set.iterator(); while (itr.hasNext()) { Entry<Integer, String>
		  entry = itr.next(); System.out.println(entry.getKey() + " " +
		  entry.getValue()); }
		 */

	}
}
