package day8;

import java.util.ArrayList;
import java.util.List;

public class Collections_List {
	public static void main(String[] args) {
		
		List<Integer> data = new ArrayList<Integer>();
		data.add(20);
		data.add(90);
		data.add(45);
		data.add(34);
		data.add(86);
		System.out.println(data.get(3));
		System.out.println(data.indexOf(86));
		
		for(Object i : data) {
			int data1 = (Integer) i;
			System.out.println(data1);
		}
	}
}
