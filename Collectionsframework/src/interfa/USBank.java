package interfa;

public interface USBank {
	
	//100% abstraction
	//only method declaration
	//no body, only method prototype
	//in interface, we can declare the variable, vars.. are by default static in nature
	//vars.. values will not be changed, its final/constant in nature
	//no static method in interface
	//no main method in interface
	//we can not create the object of interface
	//interface is abstract in nature
	

	final int min_amount = 100;

	public int credit();

	public int debit();

	public String firstname();

	public void loan();

}
