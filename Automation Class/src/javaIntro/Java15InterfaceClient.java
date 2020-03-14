package javaIntro;

public class Java15InterfaceClient implements Java14InterfaceBank, Java17InterfaceBankOffers{

	public static void main(String[] args) {
		Java15InterfaceClient ic = new Java15InterfaceClient();
		ic.CheckBalance();
		ic.GenerateStatement();
		ic.PayCreditCard();
		ic.TransferBalance();
		ic.Anualfee();
		ic.APRIntrest();
		ic.CashBackOffer();

	}

	@Override
	public void PayCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("Your credit card due is on the 15th of each month");
	}

	@Override
	public void GenerateStatement() {
		// TODO Auto-generated method stub
		System.out.println("Your statment will generate on the 18th of each month");
	}

	@Override
	public void TransferBalance() {
		// TODO Auto-generated method stub
		System.out.println("Ther is no fee to transfer a balance");
	}

	@Override
	public void CheckBalance() {
		// TODO Auto-generated method stub
		System.out.println("your account balance is 123");
	}

	@Override
	public void CashBackOffer() {
		System.out.println("You have 2% cash back");
		
	}

	@Override
	public void Anualfee() {
		System.out.println("Ther is no Anual fee");
		
	}

	@Override
	public void APRIntrest() {
		// TODO Auto-generated method stub
		System.out.println("23% APR after one year");
	}

}
