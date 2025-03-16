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
        System.out.println("     Name               Account number              balance");
        System.out.println("------------------------------------------------------------");
        for(int i = 0; i < accountsList.size(); ++ i) {
          System.out.println((i + 1) +": " + accountsList.get(i).getAccountHolderName() + "   " + accountsList.get(i).getAccountNumber() + "    " + accountsList.get(i).getBalance());
        }
    }

    @Override
    public void calculateInterest() {

    }

    public BankAccount findAccount(String accountNumber){
        for(int i = 0; i < accountsList.size(); ++ i){
            if(accountNumber.equals(accountsList.get(i).getAccountNumber()) == true){
                System.out.println("     Name               Account number              balance");
                System.out.println("------------------------------------------------------------");
                System.out.println((accountsList.get(i).getAccountHolderName() + "   " + accountsList.get(i).getAccountNumber() + "    " + accountsList.get(i).getBalance());
                return accountsList.get(i);
            }

            else{
                System.out.println("The account number not found.");
                return null;
            }
        }
    }
}
