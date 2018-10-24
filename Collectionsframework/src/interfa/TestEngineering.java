package interfa;

public class TestEngineering {

	public static void main(String[] args) {
       
		College c=new College();
		c.computerDepartment();
		c.civilDepartment();
		c.mechanicalDepartment();
		c.collegeStaff();
		
		Engineering e=new College();//Dynamic polymorphism
		e.computerDepartment();
		e.civilDepartment();
		e.mechanicalDepartment();
		
		int b=Engineering.loan_percentage;
		System.out.println(b);
		
		int k=c.deposit_minamount;
		System.out.println(k);
		
		
	}

}
