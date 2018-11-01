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
		
		//public static String valueOf(int i)

		//Returns the string representation of the int argument. 
		//The representation is exactly the one returned by the Integer.toString method of one argument.
		//Parameters:i - an int.Returns:a string representation of the int argument.

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
