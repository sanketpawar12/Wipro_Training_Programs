package day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/sanket/downloads/file.txt", true));
		{
			bw.write("This is new content in the file using BufferedWriter");
			bw.newLine();
			bw.close();
			System.out.println("Content written successfully");
		}
	}
}
