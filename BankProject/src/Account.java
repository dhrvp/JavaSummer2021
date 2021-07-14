
/**
 * Create a class Account
 * @author Dhruv
 *
 */
import java.util.Date;

public class Account {

	private long accountNumber;
	private String Name;
	private float balance;
	private char accountType;
	private AccountActivity[] activities = new AccountActivity[25];

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	int counter = 0;

	public void deposit(float aAmount) {
		AccountActivity activity = new AccountActivity();
		activity.setTxnDate(new Date());
		activity.setDescription("Cash Deposit");
		activity.setAmount(aAmount);
		activity.setRunningBalance(aAmount);
		balance = balance + aAmount;

	}
}
