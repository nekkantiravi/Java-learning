package interfa;

public class College extends Engineering{
	
	//Engineering method:overridden
	
	//College method
	
	public void collegeStaff() {
		System.out.println("College staff");
	}

	@Override
	public void computerDepartment() {
		System.out.println(" College computerDepartment");
	}

	
}
