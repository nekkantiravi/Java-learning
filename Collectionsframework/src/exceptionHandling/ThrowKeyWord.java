package exceptionHandling;

public class ThrowKeyWord {

	public static void main(String[] args){
       //Throw keyword is used when we have to throw an exception deliberately.Create own exception and throw it. 
		System.out.println("ABC");
		
		
		
		try {
			throw new Exception("ravi exception");
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		System.out.println("test"); //Unreachable code, with throws key word we can not execute the next line of code
		
		String s="";
		
		if(s.equals("")) {
			
			try {
				throw new Exception("String is blank");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Flag passed");
	}
	
	

}
