package strings;

import java.util.Arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {

		int[] numbers = { -99,3445555, 100, -66, 99,-20 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println("given array is: " + Arrays.toString(numbers));
		System.out.println("largest number::" + largest);
		System.out.println("smallest number::" + smallest);
	}
}
