package testngIntro;

import org.testng.annotations.Test;

public class Testng02Loans {
	
	@Test(groups = {"Smoke"})
	public void Login() {
		System.out.println("User have logged in succesfully");
	}
	
	@Test
	public void CreateLoan() {
		System.out.println("Loan Number xxxx123 Have been created");
	}
	
	@Test
	public void ApproveLoan() {
		System.out.println("Loan Number xxxx123 have been approved");
	}
	
	@Test(enabled = false)
	public void CloseLoan() {
		System.out.println("Loan number xxxx123 have been closed");
	}

}
