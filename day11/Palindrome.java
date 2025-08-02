package day11;

public class Palindrome {
	public static void main(String[] args) {
		
		String data = "ada";
		String revData = "";
		
		for(int i = data.length() -1; i >= 0; i--) {
			revData += data.charAt(i);
		}
		
		if(data.equals(revData)) {
			System.out.println(data + " is Palindrome");
		}
		else {
			System.out.println(data + " is not Palindrome");
		}
	}
}
