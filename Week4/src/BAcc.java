abstract class BankAccount{
	double balance;
	BankAccount(double balance){
		this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
class SavingAccount extends BankAccount{
	private static final double MIN_BALANCE = 1000;
	SavingAccount(double balance){
		super(balance);
	}
	
	@Override
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: "+ amount +",New Balance: " + balance );
	}
	@Override
	void withdraw(double amount) {
		if(balance - amount >= MIN_BALANCE) {
			balance -= amount; 
			System.out.println("Withdrawn: " + amount + ",Remaining Balance: " + balance);
		}
		else {
			System.out.println("Withdrawal denied! Minimum balance of " + MIN_BALANCE + "must be maintained");
		}
		
	}
	
}
class CurrentAccount extends BankAccount {
	private static final double OVERDRAFT_LIMIT = 5000;
	CurrentAccount(double balance){
		super(balance);
	}
	@Override
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: "+ amount +",New Balance: " + balance );
	}
	@Override
	void withdraw(double amount) {
		if(balance - amount >= OVERDRAFT_LIMIT) {
			balance -= amount; 
			System.out.println("Withdrawn: " + amount + ",Remaining Balance: " + balance);
		}
		else {
			System.out.println("Withdrawal denied! Overdraft limit  of " + OVERDRAFT_LIMIT + "exceeded");
		}
	}
	
}
public class BAcc {
	public static void main(String [] args) {
		BankAccount acc1 = new SavingAccount(2000);
		acc1.deposit(1000);
		acc1.withdraw(250);
		acc1.withdraw(25000);
		System.out.println("__________________________________");
		
		BankAccount acc2 = new CurrentAccount(10000);
		acc2.deposit(700);
		acc2.withdraw(2000);
		acc2.withdraw(20000);
	}

}
