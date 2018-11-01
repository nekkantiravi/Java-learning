package interfa;

public class MainBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_amount);

		HSBCBank hsbc = new HSBCBank();
		hsbc.firstname();
		hsbc.debit();
		hsbc.credit();
		hsbc.loan();
		hsbc.educationLoan();
		hsbc.lastName();
		hsbc.mutualFund();

		USBank us = new HSBCBank();
		//dynamic molymorphism:child class object can be referred by parent interface reference variable is called 
		
		us.credit();
		us.debit();
		us.loan();
		us.firstname();
		us.loan();

		BrazilBank br = new HSBCBank();
		br.mutualFund();
	}

}
