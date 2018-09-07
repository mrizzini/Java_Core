package OOP;

public class TestBank {

	public static void main(String[] args) {

		Bank bank1 = new Bank();
		
		bank1.name = "HSBC";
		bank1.accountBalance = 10000;
		bank1.interestGained(500);
		System.out.println(bank1.accountBalance);
		
		
		
//		here we create an object of member class
		
		Members member1 = new Members();
		member1.address = "1801 South Avenue, California";
		member1.name = "Jack Daniels";
		
		bank1.member = member1;
		
		System.out.println(bank1.member.address);
		System.out.println(bank1.member.name);
		
		Bank bank2 = new Bank();
		bank2.name = "Barclays";
		bank2.accountBalance = 20000;
		bank2.member = new Members();
		
		bank2.member.address = "12 Road Street, LA";
		bank2.member.name = "Cory";
		
		System.out.println(bank2.member.address);
		System.out.println(bank2.member.name);
		
		bank2.getBalance();
		
		Members member2 = bank2.getBalance();
		
		member2.deposit();
		member2.withdraw();
		
		bank2.getBalance().deposit();
		bank2.getBalance().withdraw();
		
		
		
	}

}
