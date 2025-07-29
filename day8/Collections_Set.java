package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_Set {
	public static void main(String[] args) {
		
		Set<Integer> setData = new HashSet<Integer>();
		setData.add(10);
//		setData.add("sanket");
		setData.add(56);
//		setData.add("Ram");
		setData.add(76);
		setData.add(34);
//		setData.add(10);
		System.out.println(setData);
		Iterator<Integer>  iterator = setData.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}	
