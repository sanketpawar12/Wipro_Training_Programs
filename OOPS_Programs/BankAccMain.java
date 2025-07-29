package OOPS_Programs;

public class BankAccMain {
	public static void main(String[] args) {
		BankAccount b = new BankAccount("Harsh", 5000);
		b.deposit(2000);
		b.withdraw(500);
		b.displayDetails();
	}
}