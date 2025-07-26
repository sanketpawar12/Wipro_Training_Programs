package day6;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int n2 = sc.nextInt();
		try {
			int res = n1 / n2;
			System.out.println(res);
		}
		catch(ArithmeticException ae) {
			System.out.println("Don't divide by zero");
		}
		System.out.println("Thank You");
	}
}
