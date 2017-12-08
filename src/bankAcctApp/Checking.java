package bankAcctApp;

public class Checking extends Account {
	// properties specific to checking account
	int debitCardNum;
	int debitPin;

	// Constructor to initialize checking account properties

	public Checking(String name, String ssn, double dep) {
		super(name, ssn, dep);
		acctNum = "2" + acctNum;
		setDebitCardNum();
		// System.out.println("\n---Checking Account---\n");
		// System.out.println("Customer info" + "\nName: " + name + "\nSSN: " + ssn +
		// "\nInitial Deposit: " + dep);
	}

	private void setDebitCardNum() {
		debitCardNum = (int) (Math.random()* Math.pow(10, 12));
		debitPin= (int)(Math.random()*Math.pow(10, 4));
	}

	// list any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Checking");
		System.out.println("Debit Card Number: " + debitCardNum
				+ "\nDebit Pin *DO NOT SHARE*:  " + debitPin);
	}
}
