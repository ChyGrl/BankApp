package bankAcctApp;

public class Savings extends Account {
	// list properties specific to savings account
	int safeBoxId;
	int safeBoxKey;

	// constructor to initialize setting for the savings properties
	public Savings(String name, String ssn, double dep) {
		super(name, ssn, dep);
		acctNum = "1" + acctNum;
		System.out.println("Account Number " + this.acctNum);

		
		
//		System.out.println("\n---Savings account---\n");
//		System.out.println("Customer info" + "\nName: " + name + "\nSSN: " + ssn + "\nInitial Deposit: " + dep);

	}
	// list any methods specific to savings account
}
