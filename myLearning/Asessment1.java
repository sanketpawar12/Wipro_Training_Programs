package my_learning;

public class Asessment1 {
	public static void main(String[] main) {
		
		int x = 15;
		double doubleValue = x;
		
		System.out.println("After the Type Casting:");
		System.out.println("int: "+ x);
		System.out.println("double: "+ doubleValue);
		
		double anotherDoubleValue = 2345.45;
		int anotherIntValue = (int) anotherDoubleValue;
		
		System.out.println("After downcasting");
		System.out.println("double:"+ anotherDoubleValue);
		System.out.println("int:"+ anotherIntValue);
	}
}	
