class BankAccount{
      String accountNumber;
      double balance;	
      
      //Default constructor
      BankAccount(){
    	  accountNumber = "00000";
    	  balance = 0 ;
      }
      
      
      //Parameterized constructor
      BankAccount(String accountNumber, double balance){
    	  this.accountNumber = accountNumber;
    	  this.balance = balance;
    	  
      }
      
      //Method to deposit
      void deposit(double amount) {
    	  if (amount > 0) {
    		  balance  += amount;
    		  System.out.println("Deposited: ₹ " + amount);
    	  }
    	  else {
    		  System.out.println("Deposit amount must be positive.");
    	  }
      }
      
      //method to withdraw
      void withdraw(double amount) {
    	  if(amount > balance) {
    		  System.out.println("Insufficient balance withdraw failed.");
    	  }
    	  else if (amount <= 0) {
    		  System.out.println("Withdraw amount must be in positive ");
    	  }
    	  else {
    	  balance -= amount;
    	  System.out.println("Withdrawn: ₹ " + amount);
      }
      
}
      
      //method to display account details
      void displayAccount() {
    	  System.out.println("AccountNumber: " + accountNumber);
    	  System.out.println("Balance: ₹" + balance );
    	  System.out.println("-----------------------------------------");
      }
      
}   
      
      
public class MainBalance {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("AC1976573" ,1000);
		BankAccount acc3 = new BankAccount("AC2768579" ,2000);
		
		System.out.println("Initial Account Details:");
		acc1.displayAccount();
		acc2.displayAccount();
		acc3.displayAccount();
		
		System.out.println("Transactions on acc3");
		acc3.deposit(500);
		acc3.withdraw(200);
		acc3.withdraw(7000);
		acc3.deposit(-100);
		acc3.displayAccount();
		
	}
}


