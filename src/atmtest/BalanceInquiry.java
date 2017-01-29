package atmtest;
/**
 * @author Java How to Program Deitel & Deitel Ch.34
 *
 */
public class BalanceInquiry extends Transaction {
	
	public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
		super(userAccountNumber, atmScreen, atmBankDatabase);
	}//end BalanceInquiry constructor
	
	@Override
	public void execute(){
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
		double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());
		
		screen.displayMessageLine("\nBalance Information:");
		screen.displayMessage(" - Available balance: ");
		//screen.displayDollarAmount(availableBalance);
		screen.displayMessage("\n - Total balance:     ");
		//screen.displayDollarAmount(totalBalance);
		screen.displayMessageLine("");
	}//end method execute
}//end class BalanceInquiry


