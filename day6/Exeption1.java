package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeption1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the Size: ");
			int size = sc.nextInt();
			int []nums;
			if(size > 0) {
				nums = new int[size];
				System.out.println("Array created of "+ size + "size");
			}
			else {
				nums = null;
			}
			System.out.println("Element Added");
			System.out.println("Enter the numberator index:");
			int numerator = sc.nextInt();
			System.out.println("Enter the denominator index;");
			int den = sc.nextInt();
			int res = nums[numerator]/nums[den];
			System.out.println(res);
		}
//		catch(NullPointerException a){
//			System.out.println("Please enter the size greater than zero");
//		}
		catch(InputMismatchException e) {
			System.out.println("Enter the valid input");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Give the index grater than -1  and less than give size!");
		}
		catch(ArithmeticException a) {
			System.out.println("Don't divide a number by zero");
		}
		catch(NegativeArraySizeException a) {
			System.out.println("The size of the array must be grater than equal to zero");
		}
		System.out.println("Thank You!");
	}
}
