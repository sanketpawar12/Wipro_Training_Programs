package day4;

public class TypeCasting {
	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 99.99;
		
		float floatValue = (float) intValue;
		
		int intFromDouble = (int) doubleValue;
		
		System.out.println("int value: "+ intValue);
		System.out.println("float value after conversion: "+ floatValue);
		System.out.println("double value: "+ doubleValue);
		System.out.println("int value after converting from double: "+ intFromDouble);
	}
}
