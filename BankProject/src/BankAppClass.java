/**
 * Bank App Class
 * @author Dhruv
 *
 */
//---- Start of Bank App class --------
public class BankAppClass {

	public static void main(String[] args) {
		Account dhruvSavingAccount = new Account();
		dhruvSavingAccount.setAccountNumber(39873892742l);
		dhruvSavingAccount.setAccountType('S');
		dhruvSavingAccount.setBalance(0);
		dhruvSavingAccount.setName("Dhruv Saving");
		
		Account dhruvCheckingAccount = new Account();
		dhruvCheckingAccount.setAccountNumber(39873892742l);
		dhruvCheckingAccount.setAccountType('S');
		dhruvCheckingAccount.setBalance(0);
		dhruvCheckingAccount.setName("Dhruv Checking");
		
		System.out.println("Current balance for "+dhruvSavingAccount.getName()+" is "+dhruvSavingAccount.getBalance());
		dhruvSavingAccount.deposit(100.00f);
		System.out.println("Current balance for "+dhruvSavingAccount.getName()+" is "+dhruvSavingAccount.getBalance());
		
		dhruvSavingAccount.deposit(0);
	}
}
