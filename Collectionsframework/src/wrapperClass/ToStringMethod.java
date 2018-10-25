package wrapperClass;

public class ToStringMethod {
	
	    String name; 
	    int age; 
	    String college; 
	    String course; 
	    String address; 
	    ToStringMethod 
	    (String name, int age, String college, String course, String address) 
	    { 
	        this.name = name; 
	        this.age = age; 
	        this.college = college; 
	        this.course = course; 
	        this.address = address; 
	    } 
	/*public String toString() 
	    { 
	        return name + " " + age + " " + college + " " + course + " " + address; 
	    } */
	public static void main(String[] args) 
	    { 
		ToStringMethod b =  
	        new ToStringMethod("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu"); 
	        System.out.println(b.name+" " +b.age); 
	        //System.out.println(b.toString()); 
	    } 
	} 

