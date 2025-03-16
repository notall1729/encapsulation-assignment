public class Main {
    public static void main(String[] args) {

     BankCustomers bank = new BankCustomers("", "", 0);

     TransactionAccount transactionAccount1 = new TransactionAccount("5057 7510 8558 7634", "Mohammad", 222000);
     TransactionAccount transactionAccount2 = new TransactionAccount("6219 8610 7654 4354", "Mahoor", 230000);
     TransactionAccount transactionAccount3 = new TransactionAccount("5057 6518 3990 0321", "Siavash", 570000);

     SavingAccount savingAccount1 = new SavingAccount("5057 5646 8767 9154", "Goli", 1000);
     SavingAccount savingAccount2 = new SavingAccount("6037 7558 9981 5454", "Farbod", 226);
     SavingAccount savingAccount3 = new SavingAccount("7792 3458 7648 9981", "Tina", 172900);

     bank.addAccount(savingAccount1);
     bank.addAccount(savingAccount2);
     bank.addAccount(savingAccount3);
     bank.addAccount(transactionAccount1);
     bank.addAccount(transactionAccount2);
     bank.addAccount(transactionAccount3);

     bank.findAccount("5057 5646 8767 9154");
     bank.findAccount("1001 5465 8734 6543");
     printLine();

     System.out.println("Balance of Mohammad is: " + transactionAccount1.getBalance());
     transactionAccount1.deposit(1000);
     System.out.println(" New balance of Mohammad is: " + transactionAccount1.getBalance());
     printLine();

     savingAccount2.deposit(-500);

     transactionAccount2.calculateInterest();
     savingAccount1.calculateInterest();
     System.out.println("Balance of Mahoor is: " + transactionAccount2.getBalance());
     System.out.println("Balance of Goli is: " + savingAccount1.getBalance());
     printLine();

     transactionAccount3.withdraw(1000);
     transactionAccount3.withdraw(-500);
     transactionAccount3.withdraw(580000);

     savingAccount3.withdraw(10000);
     savingAccount3.withdraw(-65);
     savingAccount3.withdraw(170000);

     bank.showAllBalance();

    }
 public static void printLine(){
  System.out.println("---------------------------------------------------");
  System.out.println();
 }

}