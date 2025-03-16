public class Main {
    public static void main(String[] args) {
     BankAccount bankAccount = new BankAccount();
     TransactionAccount transactionAccount1 = new TransactionAccount("5057 7510 8558 7634", "Mohammad", 222000);
     TransactionAccount transactionAccount2 = new TransactionAccount("6219 8610 7654 4354", "Mahoor", 230000);
     TransactionAccount transactionAccount3 = new TransactionAccount("5057 6518 3990 0321", "Siavash", 570000);

     SavingAccount savingAccount1 = new SavingAccount("5057 5646 8767 9154", "Goli", 1000);
     SavingAccount savingAccount2 = new SavingAccount("6037 7558 9981 5454", "Farbod", 226);
     SavingAccount savingAccount3 = new SavingAccount("7792 3458 7648 9981", "Tina", 172900);

     System.out.println("Balance of Mohammad is:" + transactionAccount1.getBalance());
     
    }
}