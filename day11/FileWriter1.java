package day11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
	public static void main(String[] args) throws IOException {
		String content = "This is written in file";
		FileWriter writer = new FileWriter("home/sanket/downloads/file1.txt");
		writer.write(content);
		writer.close();
		System.out.println("content successfully written in file");
	}
}
