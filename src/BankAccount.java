import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;

public abstract class BankAccount {

    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
      this.accountNumber = accountNumber;
      this.accountHolderName = accountHolderName;
      this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){
      if(amount > 0) {
          System.out.println("The amount of " + amount + " add to account number " + accountNumber);
          balance = balance + amount;
      }
      else System.out.println("Amount must be positive.");
    }

    public void withdraw(double amount){
      if(amount > 0 && amount <= balance){
          balance = balance - amount;
          System.out.println("The amount of " + amount + " deducte from the account.");
      }
      if(amount > 0 && amount > balance)
          System.out.println("You can not withdraw more than your balance. you balance is: " + balance);
      if(amount <= 0)
          System.out.println("Amount must be positive.");
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void displayAccountDetails(){
        System.out.println(accountHolderName + "           " + accountNumber + "         " + balance);
    }
}
