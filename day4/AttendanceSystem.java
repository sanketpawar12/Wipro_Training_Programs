package day4;

import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] employeeNames = new String[n];
        boolean[] isPresent = new boolean[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            employeeNames[i] = scanner.nextLine();
        }

        
        System.out.println("\nMark your attendance (Present/Absent):");
        for (int i = 0; i < n; i++) {
            System.out.print(employeeNames[i] + ": ");
            String input = scanner.nextLine().trim();
            isPresent[i] = input.equalsIgnoreCase("Present");
        }

        
        System.out.println("\nAttendance Report:");
        for (int i = 0; i < n; i++) {
            String status = isPresent[i] ? "Present" : "Absent";
            System.out.println(employeeNames[i] + " -- " + status);
        }

        scanner.close();
    }
}