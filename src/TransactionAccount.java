public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance){
     super(accountHolderName, accountNumber, initialBalance);
    }

    @Override
    public void calculateInterest(){
     System.out.println("There is no interest on this account.");
    }

    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= (balance + overDraftLimit)){
            amount -= balance;
            System.out.println("The amount of " + amount + " deducte from the account.");
        }
        if(amount > 0 && amount > (balance + overDraftLimit))
            System.out.println("You can not withdraw more than your balance + 500 . you balance is: " + balance);
        else System.out.println("Amount must be positive.");
    }
}

