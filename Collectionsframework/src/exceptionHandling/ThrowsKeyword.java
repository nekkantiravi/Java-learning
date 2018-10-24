package exceptionHandling;

public class ThrowsKeyword {
	// Throws keyword is used when we have method chaining.
	// A kind of handling where exception will be thrown from one method to another method
 

	public void sum() { 
		try {
			div(); // calling method
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}

	}

	public void div() throws ArithmeticException { //  called method
		int i = 10 / 0;
	}

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("Exception successful");

	}

}
