package day6;

public class Exception2 {
	public static void main(String[] args) {
		int a = 30;
		int b = 0;
		try {
			int res = a / b;
		}
		catch(ArithmeticException ae){
			System.out.println("Don't divide by zero");
		}
		finally {
			System.out.println("Thank You!");
		}
	}
}
