package day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student3{	
	private int rollno;
	private String name;
	
	public Student3(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Student3() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class  Serialization_demo{
	public static void main(String[] args) throws IOException {
		Student1 student3 = new Student1();
		student3.setRollno(10);
		student3.setName("Afrid");
		
		try{
			FileOutputStream out = new FileOutputStream("C://Users/Admin/Desktop/javafile.txt");
			ObjectOutputStream output = new ObjectOutputStream(out);
			output.writeObject(student3);
			
			System.out.println("Serialized data saved in file");
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}


