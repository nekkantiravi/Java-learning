package pyramidPatterns;

public class Pattern1 {
	//int n = 5;

	public void printStars(int n) {

		// outer loop to handle no of rows

		for (int i = 0; i < n; i++) {
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// int n = 5;
		Pattern1 p = new Pattern1();
		p.printStars(5);
	}

}
