package OOP;

public class Bank {

	String name;
	int accountBalance;
	Members member;
	
	public Members getBalance() {
		return member;
	}
	
	
	public int interestGained(int increment) {
		
		accountBalance += increment;
		return accountBalance;
		
	}
	
}
