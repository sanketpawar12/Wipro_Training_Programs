package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparable {
	public static void main(String[] args) {
		
		Comparator<Integer> c1 = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i > j) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		
		ArrayList<Integer> num = new ArrayList();
		num.add(23);
		num.add(43);
		num.add(45);
		num.add(98);
		num.add(56);
		System.out.println(num);
		
		Collections.sort(num, c1);
		System.out.println(num);
	}
}
