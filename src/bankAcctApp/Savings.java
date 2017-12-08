package bankAcctApp;

public class Savings extends Account {
	// list properties specific to savings account
	int safeBoxId;
	int safeBoxKey;

	// constructor to initialize setting for the savings properties
	public Savings(String name, String ssn, double dep) {
		super(name, ssn, dep);
		acctNum = "1" + acctNum;
		setSafeBox();
		
		
//		System.out.println("\n---Savings account---\n");
//		System.out.println("Customer info" + "\nName: " + name + "\nSSN: " + ssn + "\nInitial Deposit: " + dep);

	}
	private void setSafeBox() {
		safeBoxId = (int)(Math.random() * Math.pow(10, 3));
		safeBoxKey = (int)(Math.random()* Math.pow(10, 4));
	}
	
	// list any methods specific to savings account
	
	public void showInfo() {

		super.showInfo();
		System.out.println("Account Type: Savings");

		System.out.println("Safety Deposit Box ID: " + safeBoxId
				+ "\nSafety Deposit Box Key: " + safeBoxKey);
	}
}
