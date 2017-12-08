package bankAcctApp;

public abstract class BankAcctApp {

	public static void main(String[] args) {
	
		Checking chkacct1 = new Checking("Toe Jam", "459865789", 1500);
		Savings savacct1 = new Savings("Jay Lowe", "454584968", 2000);
		chkacct1.showInfo();
		savacct1.showInfo();
		
		//read CSV file and create new accounts based on that data
		
	}

}
