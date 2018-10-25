package interfa;

public abstract class Engineering {
	
	    //partial abstraction
		//hiding the implementation logic--is called abstraction(oop concept)
		//Abstract class can have abstract methods and non-abstract methods
		//can not create the object of abstract class
		//can have static/final and non static variables


	int deposit_minamount = 500;
	static int loan_percentage = 8;

	public abstract void computerDepartment();

	public static void mechanicalDepartment() {
		System.out.println(" Engineering mechanicalDepartment");
	}

	public int civilDepartment() {
		System.out.println("Engineering civilDepartment ");
		return deposit_minamount;
	}

}
