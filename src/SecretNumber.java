import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {

		String yesOrNo = "y";
		int randomNumber = 0;
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		randomNumber = number.nextInt(50);

		while (yesOrNo.equals("y")) {

			System.out.println("What is your guess between 0-50?");
			int userGuess = keyboard.nextInt();

			if (userGuess == randomNumber) {
				System.out.println("congrats you got the random number!");
				break;
			}

			if (userGuess < randomNumber) {
				System.out.println("your guess is too low");
				System.out.println("would you like to continue? y/n");
				yesOrNo = keyboard.next();

			}

			if (userGuess > randomNumber) {
				System.out.println("your guess was too high");
				System.out.println("would you like to continue? y/n");
				yesOrNo = keyboard.next();
			}

		}
		if (!yesOrNo.equals("y")) {
			System.out.println("The random number was " + randomNumber);

		}
		System.out.println("goodbye");

	}

}
