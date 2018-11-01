package arrays;

import java.util.Arrays;

public class SortExample2 {

	public static void main(String[] args) {
		
		// A sample Java program to sort a subarray 
		// using Arrays.sort(). 
		
		// Sort subarray from index 1 to 4, i.e., 
        // only sort subarray {100,12,15,400} and 
        // keep other elements as it is.
		
		int []sort = {9,100,12,15,400,20,1,30};
		Arrays.sort(sort,1,4);
		System.out.println("Subarray sorting:" + Arrays.toString(sort));
	}

}
