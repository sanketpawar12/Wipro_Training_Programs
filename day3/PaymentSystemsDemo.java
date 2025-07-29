package Day3;

interface EcommercePayment{
	void makePayment();
}

abstract class PaymentSystems implements EcommercePayment{
	double amount;
	
	PaymentSystems(double amount){
		this.amount = amount;
	}

void showSuccessMessage() {
	System.out.println("Payment is successfull" + amount);
    }
}

class DebitCardPayment extends PaymentSystems{
	 DebitCardPayment(double amount){
	  super(amount);
	 }
	 public void makePayment() {
	  System.out.println("Debit Card Payment is done...");
	  showSuccessMessage();
	 }
	}

class NetBankingPayment extends PaymentSystems{
	 NetBankingPayment(double amount){
	  super(amount);
	 }
	 public void makePayment() {
	  System.out.println("NetBanking Payment is done...");
	  showSuccessMessage();
	 }
	 
}

public class PaymentSystemsDemo{
	 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  PaymentSystems ep1 = new DebitCardPayment(40000);
		  ep1.makePayment();
		  System.out.println();
		  PaymentSystems ep2 = new NetBankingPayment(40000);
		  ep2.makePayment();

		 }
		}
