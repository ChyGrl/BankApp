package bankAcctApp;

public abstract class Account implements IBaseRate{
	//Parent Class
	
	//list common properties for Savings and checking accounts
	String name;
	String ssn;
	double balance;
	
	static int index = 10000;
	String acctNum;
	double rate;
	
	
	//Constructor to set base properties and initialize the account
	
	public Account(String name, String ssn, double dep) {
		this.name = name;
		this.ssn = ssn;
		balance = dep;

	//Set account number
		index++;
		this.acctNum = setAcctNumber();
	}
	
		private String setAcctNumber() {
			String lastTwoSsn = ssn.substring(ssn.length()-2, ssn.length());
			int uniqueID = index;
			int randNum = (int) (Math.random() * Math.pow(10, 3));
			return lastTwoSsn + uniqueID + randNum;
			
			
		}
		//List common methods
	public void showInfo() {
		System.out.println(" \n---------- " +
	
				"\nName: " + name +
				"\nAccount Number: " + acctNum + 
				"\nBalance: " + balance);
		
		
	}	
		
	}


