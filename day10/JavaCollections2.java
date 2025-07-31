package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollections2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4000, 3000,5000,6000));
		a.add(8000);
		a.add(7000);
		System.out.println(a);
		Collections.sort(a);
		System.out.println("Sorted: " + a);
		int b = Collections.binarySearch(a , 40000);
		System.out.println("Index of 5000 in sorted list : "+ b);
		Collections.reverse(a);
		System.out.println(a);
	}
}
