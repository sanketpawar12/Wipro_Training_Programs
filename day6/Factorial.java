package day6;

public class Factorial {

    public static long calculateFactorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorialIterative(number);
        System.out.println("The factorial of " + number + " is: " + factorial); 
       
        System.out.println("Factorial / 2: " + (factorial / 2));
    }
}