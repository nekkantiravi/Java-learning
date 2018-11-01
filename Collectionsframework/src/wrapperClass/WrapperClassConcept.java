package wrapperClass;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// Data conversion: String to integer

		String x = "100";
		System.out.println(x + 20);

		int j = Integer.parseInt(x);
	
		System.out.println(j);

		// String to double conversion
		String k = "100.20";
		double l = Double.parseDouble(k);
		System.out.println(l);

		// String to boolean
		String h = "true";
		boolean t = Boolean.parseBoolean(h);
		System.out.println(t);

		System.out.println("**********");
		// int to string conversion

		int p = 200;
		//System.out.println(p + 20);

		String r = String.valueOf(p);
		System.out.println(r + 20);
        
		
		String z = "100ABC";

		Integer.parseInt(z);// NumberFormatException: For input string: "100ABC"

	}

}
