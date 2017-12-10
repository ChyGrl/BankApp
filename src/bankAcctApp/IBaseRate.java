package bankAcctApp;

public interface IBaseRate {

	// Interface for the Rates

	// write a method that returns base rate.
	default double getBaseRate() {
		return 2.5;

	}

}
