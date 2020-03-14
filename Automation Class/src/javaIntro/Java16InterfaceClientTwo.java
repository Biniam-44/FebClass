package javaIntro;

public class Java16InterfaceClientTwo implements Java14InterfaceBank {
	
	public static void main(String[] args) {
		Java16InterfaceClientTwo ict = new Java16InterfaceClientTwo();
		ict.CheckBalance();
		ict.GenerateStatement();
		ict.PayCreditCard();
		ict.TransferBalance();
	}

	@Override
	public void PayCreditCard() {
		System.out.println("You payment is due on the 30th of each month");
		
	}

	@Override
	public void GenerateStatement() {
		System.out.println("Your statment will generate on the 3rd of each month");
		
	}

	@Override
	public void TransferBalance() {
		System.out.println("There is a $10 fee for balance transfer");
		
	}

	@Override
	public void CheckBalance() {
		// TODO Auto-generated method stub
		System.out.println("your account balance is 123");
	}

}
