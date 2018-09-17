package Sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Object> {

	@Override
	public int compare(Object n1, Object n2) {
		Customer c1 = (Customer) n1;
		Customer c2 = (Customer) n2;
		return c1.name.compareTo(c2.name);
	}

}
