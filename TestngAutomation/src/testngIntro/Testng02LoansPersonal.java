package testngIntro;

import org.testng.annotations.Test;

public class Testng02LoansPersonal {
	
	@Test(groups = {"Smoke"})
	public void LoginPersonalLoan() {
		System.out.println("User have logged in succesfully to Personal Loan");
	}
	
	@Test(dependsOnMethods="LoginPersonalLoan")
	public void CreateLoanPersonalLoan() {
		System.out.println("Loan Number xxxx123 Have been created to Personal Loan");
	}
	
	@Test(dependsOnMethods="CreateLoanPersonalLoan")
	public void ApproveLoanPersonalLoan() {
		System.out.println("Loan Number xxxx123 have been approved to Personal Loan");
	}
	
	@Test(dependsOnMethods="ApproveLoanPersonalLoan")
	public void CloseLoanPersonalLoan() {
		System.out.println("Loan number xxxx123 have been closed to Personal Loan");
	}

}
