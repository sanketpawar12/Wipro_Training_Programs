package day4;

import java.util.Arrays;

public class SortNamesArray {

    public static void main(String[] args) {
        String[] names = {"Harsh", "Aditya", "Pranav", "Om", "Sanket", "Tushar", "Vijay"};

        System.out.println("Original Names: " + Arrays.toString(names));

        
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
               
                if (names[j].compareTo(names[j + 1]) > 0) {
                    
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Names: " + Arrays.toString(names));
    }
}
