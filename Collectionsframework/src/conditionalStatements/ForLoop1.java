package conditionalStatements;

public class ForLoop1 {

	public static void main(String[] args) {

		String str[] = { "loop", "string", "decimal", "array" };

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println("******print values of int array");
		
		int arr[] = { 20, 30, 40, 50, 90 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("********advanced for loop");
		for(int k: arr) {
			System.out.println(k);
		}

	}

}
