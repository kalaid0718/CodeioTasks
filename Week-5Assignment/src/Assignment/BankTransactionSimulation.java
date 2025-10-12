package Assignment;

import java.util.Random;


//1️ Custom Exception: For Insufficient Balance

class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}


//2️ Custom Exception: For Invalid Amount (negative or zero)

class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}


//3️ BankAccount Class

class BankAccount {
 
 private int balance;

 public BankAccount(int initialBalance) {
     this.balance = initialBalance;
 }

 // Synchronized Deposit Method

 public synchronized void deposit(int amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be positive!");
     }

     balance += amount; // add to balance
     System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount + ". Current balance: ₹" + balance);
 }

 // Synchronized Withdraw Method
 
 public synchronized void withdraw(int amount) throws InsufficientBalanceException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be positive!");
     }
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance for withdrawal of ₹" + amount);
     }

     balance -= amount; // subtract from balance
     System.out.println(Thread.currentThread().getName() + " withdrew ₹" + amount + ". Current balance: ₹" + balance);
 }

 // Getter method to check balance
 public int getBalance() {
     return balance;
 }
}


//4️ UserThread Class (each thread = one user doing transactions)
class UserThread extends Thread {
 private BankAccount account;
 private Random random = new Random();

 public UserThread(BankAccount account, String name) {
     super(name); // set thread name
     this.account = account;
 }

 @Override
 public void run() {
     // Each user performs 5 random transactions
     for (int i = 0; i < 5; i++) {
         int amount = random.nextInt(500) + 1; // random amount between 1–500
         boolean deposit = random.nextBoolean(); // randomly choose deposit or withdraw

         try {
             if (deposit) {
                 account.deposit(amount);
             } else {
                 account.withdraw(amount);
             }
         } catch (Exception e) {
             System.out.println(Thread.currentThread().getName() + " failed: " + e.getMessage());
         }

         // Simulate delay between transactions
         try {
             Thread.sleep(200);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}


//5️ Main Class
public class BankTransactionSimulation {
 public static void main(String[] args) {
     // Step 1: Create one shared BankAccount with ₹1000
     BankAccount account = new BankAccount(1000);

     // Step 2: Create 3 threads (representing 3 users)
     UserThread user1 = new UserThread(account, "User1");
     UserThread user2 = new UserThread(account, "User2");
     UserThread user3 = new UserThread(account, "User3");

     // Step 3: Start all threads
     user1.start();
     user2.start();
     user3.start();

     // Step 4: Wait for all threads to finish
     try {
         user1.join();
         user2.join();
         user3.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     // Step 5: Display final balance
     System.out.println("\n✅ Final balance: ₹" + account.getBalance());
 }
}
