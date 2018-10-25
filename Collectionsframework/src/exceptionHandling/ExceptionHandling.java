package exceptionHandling;

public class ExceptionHandling {
	int a=10;

	//  Exception handling is of 3 types:
	// 1. try-catch block
	// 2. throws
	// 3. throw

	public static void main(String[] args) {
		try{
			ExceptionHandling obj=new ExceptionHandling();
		
			obj=null;
			System.out.println(obj.a);
		}catch(NullPointerException e) {
			
			//e.printStackTrace();
			
		}
	
		System.out.println("object is null");
	
		try {
			int i = 9 / 0; // this code will throw an exception
			System.out.println(i);
		} catch (ArithmeticException e) {
		   e.printStackTrace();// prints the exception
			//e.getMessage(); //public String getMessage()/Returns the detail message string of this throwable.
			
			
			}
		finally {  //finally is a block
			
			int num1=10;
			int num2=30;
					int add=num1+num2;
					System.out.println(add);
			
			
			
			System.out.println("Exception handled on reachable code");
		}
		

	}
}


