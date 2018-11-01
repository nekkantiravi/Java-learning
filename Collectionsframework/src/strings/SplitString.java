package strings;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {

		// The string split() method breaks a given string around matches of the given
		// regular expression.
		// This variant of split method takes a regular expression as parameter,
		// and breaks the given string around matches of this regular expression regex.

		String str = "GeeksforGeeks:A Computer Science Portal";
		String[] arrOfStr = str.split(":");

		for (String a : arrOfStr)
			System.out.println(a);
		  // ****************************//
		String str1 = "GeeksforGeeksforStudents"; 
        String[] arrOfStr1 = str1.split("for"); 
  
        for (String a : arrOfStr1) 
            System.out.println(a); 
        //****************************//
        String str2 = "Geeks for Geeks"; 
        String[] arrOfStr2 = str2.split(" "); 
  
        for (String a : arrOfStr2) 
            System.out.println(a);
        
       /* Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the java string:");
          String sc =s.nextLine();
          
          String[] m=sc.split("-");
            
          for (String k:m) {
        	  System.out.println(k);
          }*/
	}

}
