package Sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Object> {

	@Override
	public int compare(Object a1, Object a2) {
		Customer c1 = (Customer) a1;
		Customer c2 = (Customer) a2;

		if (c1.age == c2.age) {
			return 0;
		} else if (c1.age > c2.age) {
			return 1;
		} else {
			return -1;
		}

	}

}
