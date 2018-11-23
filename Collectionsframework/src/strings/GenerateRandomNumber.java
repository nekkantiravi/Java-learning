package strings;

import java.util.Random;

public class GenerateRandomNumber {

	public void randomNumber() {
		Random ran = new Random();

		for (int j = 0; j < 5; j++) {

			int randomnumbers = ran.nextInt(100);
			System.out.println(randomnumbers);
		}

	}

	public static void main(String[] args) {
		GenerateRandomNumber obj = new GenerateRandomNumber();
		obj.randomNumber();
	}

}
