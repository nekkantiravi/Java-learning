package interfa;

public class HSBCBank implements USBank,BrazilBank {
	
	//If a class is implementing any interface,then its mandatory to define/override all the methods of interface

	//overriding from USBank
	public int credit() {
		System.out.println("HSBC credit us amount");

		return 0;

	}

	public int debit() {
		System.out.println("HSBC Debited us amount");
		return 0;

	}

	public String firstname() {
		System.out.println("HSBC firstname us amount");
		return null;

	}

	public void loan() {
		System.out.println("HSBC loan us amount");
	}

	//Seperate methods of HSBC Bank
	public String lastName() {
		System.out.println("hasbc last name");
		return null;

	}

	public void educationLoan() {
		System.out.println("hasbc eduvationloan");
	}

	//Overriding from Brazilbank
	@Override
	public void mutualFund() {
		
		System.out.println("HSBC Mutual fund");
		
	}
}
