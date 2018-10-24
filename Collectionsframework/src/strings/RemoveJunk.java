package strings;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "@#@#@# java l#)((*earning";

		// Regular expression [^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		

		// How to reverse an integer
        // first approach
		int reve = 12345;

		System.out.println(new StringBuffer(String.valueOf(reve)).reverse());
		
        //Second approach
		int num = 12345;
		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("Reverse num is:" +rev);
	}

}
