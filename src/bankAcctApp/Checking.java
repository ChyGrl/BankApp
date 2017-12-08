package bankAcctApp;

public class Checking extends Account {
	// properties specific to checking account
	int debitCardNum;
	int debitPin;

	// Constructor to initialize checking account properties

	public Checking(String name, String ssn, double dep) {
		super(name, ssn, dep);
		acctNum = "2" + acctNum; 
		System.out.println("Account Number " + this.acctNum);

//		System.out.println("\n---Checking Account---\n");
//		System.out.println("Customer info" + "\nName: " + name + "\nSSN: " + ssn + "\nInitial Deposit: " + dep);
	}

	// list any methods specific to checking account

}
