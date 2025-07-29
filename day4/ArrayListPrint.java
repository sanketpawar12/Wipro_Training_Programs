package day4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrint{
	    public static void main(String[] args) {
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
	}

