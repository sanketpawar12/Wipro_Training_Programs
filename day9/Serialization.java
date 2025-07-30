package day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Student1 s1 = new Student1();
		s1.setName("Sanket");
		s1.setAge(25);
		
		FileOutputStream out = new FileOutputStream("/home/downloads/outputdemo.docx");
		ObjectOutputStream output = new ObjectOutputStream(out);
		output.writeObject(s1);
		out.close();
		output.close();
		FileInputStream in = new FileInputStream("/home/downloads/outputdemo.docx");
		ObjectInputStream input = new ObjectInputStream(in);
		Student s2 = (Student) input.readObject();
	}
}
