package day4;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		
		System.out.println("Random number: "+ randomNumber);

	}

}
