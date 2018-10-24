package conditionalStatements;

public class IfElseConcept {

	public static void main(String[] args) {
      int a=10;
      int b=50;
      
      if(a>b) {
    	  System.out.println("print a is greater than b");
      }else {
    	  System.out.println("print b is greater than a");
      }
      
      //Comparsion operators
      //< > >= <= ==
      
      int c=100;
      int d=100;
      if(c==d) {
    	  System.out.println("c is equal to d");
    	  
      }else {
    	  System.out.println("c is not equal to d");
      }
      
      //write a logic to find out the highest number
      //nested if-else
      int a1=300;
      int b1=400;
      int c1=500;
      
      if(a1>b1 & a1>c1) { 
    	  System.out.println("a1 is greatest");
      }
      
      else if(b1>c1 & b1>a1) {
    	  System.out.println("b1 is greatest");
      }else {
    	  System.out.println("c1 is greatest");
      }
      
	}

}
