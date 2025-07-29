package day5;

public class BankApp {
    public static void main(String[] args) {
        Bank account = new SavingsAccount(1000);

        account.displayAccountType();           
        account.executeTransaction("deposit", 500);   
        account.executeTransaction("withdraw", 200);  
        account.executeTransaction("withdraw", -50); 
        System.out.println("Final Balance: $" + account.getBalance());
    }
}

