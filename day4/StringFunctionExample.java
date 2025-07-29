package day4;

public class StringFunctionExample {
	   public static void main(String[] args) {
	       
	       String str = "   I am an employee of ITC   ";
	       
	       System.out.println("Length of the string: " + str.length());
	       
	       System.out.println("Character at index 5: " + str.charAt(5)); 
	      
	       String subStr = str.substring(3, 8); 
	       System.out.println("Substring (3 to 8): " + subStr); 
	     
	       System.out.println("String in lowercase: " + str.toLowerCase()); 
	      
	       System.out.println("String in uppercase: " + str.toUpperCase());
	       String anotherStr = "I am an employee of ITC";
	       System.out.println("Strings are equal: " + str.trim().equals(anotherStr));
	      
	       System.out.println("Strings are equal (ignore case): " + str.equalsIgnoreCase("   i am an employee of itc   "));
	       System.out.println("Trimmed string: '" + str.trim() + "'"); 
	      
	       System.out.println("Replace 'a' with 'A': " + str.replace('a', 'A'));
	      
	       System.out.println("Contains 'employee': " + str.contains("employee")); 
	       
	       System.out.println("Index of 'employee': " + str.indexOf("employee"));
	       String[] words = str.trim().split(" ");
	       System.out.println("Words in the string:");
	       for (String word : words) {
	           System.out.println(word);
	       }
	       System.out.println("Starts with 'I am': " + str.startsWith("I am"));
	       
	       System.out.println("Ends with 'ITC': " + str.endsWith("ITC")); 
	      
	       int number = 456;
	       String numberStr = String.valueOf(number);
	       System.out.println("String value of number: " + numberStr); 
}
}