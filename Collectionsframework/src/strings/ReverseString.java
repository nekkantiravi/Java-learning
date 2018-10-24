package strings;

public class ReverseString {

	public static void main(String[] args) {

		// Diff..between String and String buffer class
		// String is immutable and SB class is mutable

		String s = "Selenium";
		int len = s.length();// 8

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
