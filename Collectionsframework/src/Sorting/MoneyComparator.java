package Sorting;

import java.util.Comparator;

public class MoneyComparator implements Comparator<Object> {

	@Override
	public int compare(Object m1, Object m2) {

		Customer c1 = (Customer) m1;
		Customer c2 = (Customer) m2;
		if (c1.money == c2.money) {
			return 0;
		} else if (c1.money > c2.money) {
			return 1;
		} else {
			return -1;
		}

	}

}
