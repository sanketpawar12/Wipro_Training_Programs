package day6;

public class NullPointerException { 

    public static void main(String[] args) {

        String myString = null;

        try {
            System.out.println("Trying to get the length of myString...");
            int length = myString.length(); 
            System.out.println("Length of myString: " + length); 
        } catch (java.lang.NullPointerException e) { 
            System.err.println("Caught a NullPointerException!");
            System.err.println("Error message: " + e.getMessage());
            System.err.println("Cause: You tried to perform an action on a variable that currently holds null.");
        }

        System.out.println("\n---------------------------------\n");

        Student student = null;

        try {
            System.out.println("Trying to get the student's name...");
            String studentName = student.name; 
            System.out.println("Student Name: " + studentName);
        } catch (java.lang.NullPointerException e) { 
            System.err.println("Caught a NullPointerException again!");
            System.err.println("Error message: " + e.getMessage());
            System.err.println("Cause: You tried to access a field of a variable that currently holds null.");
        }

        System.out.println("\nProgram continues after handling exceptions.");
    }

    
}


class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}