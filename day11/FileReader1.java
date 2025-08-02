package day11;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		
		FileReader reader1 = new FileReader("C:\\Users\\Ankush\\file1.txt");
		int ch;
		while((ch = reader1.read()) != -1) {
			System.out.println((char) ch);
		}
	}

}