import java.util.ArrayList;

public class BankCustomers extends BankAccount{
    private ArrayList<BankAccount> accountsList;

    public BankCustomers(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void addAccount(BankAccount account){
      if (accountsList == null)
          accountsList = new ArrayList<>();
          accountsList.add(account);
    }

    public void showAllBalance(){
        System.out.println("Name           Account number              balance");
        System.out.println("===================================================================");
        for(int i = 0; i < accountsList.size(); ++ i) {
          System.out.printf("%-2d: %-10s   %-16s   %-8f \n", (i + 1), accountsList.get(i).getAccountHolderName(), accountsList.get(i).getAccountNumber(), accountsList.get(i).getBalance());
        }
    }

    @Override
    public void calculateInterest() {

    }

    public BankAccount findAccount(String accountNumber){
        for(BankAccount account : accountsList){
            if(account.getAccountNumber().equals(accountNumber)){
                System.out.println("Name           Account number              balance");
                System.out.println("================================================================");
                 account.displayAccountDetails();
                return account;
            }
        }
        System.out.println("The account number not found.");
        return null;
    }
}
