package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable {
	public int age;
	public String name;
	
	public Student(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Student[age ="+ age + ",name=" + name + "]";
	}
}
public class Comparator_String {
	public static void main(String[] args) {
		
		Comparator<Student1> com = new Comparator<Student1>() {
			public int compare(Student1 i, Student1 j) {
				if(i.age > j.age) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		List<Student1> student = new ArrayList<>();
		student.add(new Student1 ("Sanket",23));
		student.add(new Student1 ("Harsh", 22));
		student.add(new Student1 ("Om", 34));
		student.add(new Student1 ("Prasad", 32));
		Collections.sort(student, com);
		
	for(Student1 s:student) {
		System.out.println(s);
	}
	}
}
