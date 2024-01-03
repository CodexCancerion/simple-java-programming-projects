//	GAME: Computer chooses a random number and user inputs numbers until he gets the correct number

import java.util.Scanner;
public class guess_the_number_game {
	public static void main(String[] args) {
	
	//	INITIALIZATION OF VARIABLES
		int random = (int)(Math.random() * 1000);
		int guess = 0;
		int counter = 1;
		
	//	SCANNING INPUTS
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Guess from 1-1000: ");
			guess = scan.nextInt();
		
	//	LOOPING
		while (guess != random) {
			if (guess < random) System.out.println("Your guess is less than the number");
			else System.out.println("Your guess is greater than the number");
			System.out.print("Enter your Guess: ");
				guess = scan.nextInt();
			counter++;
		}
		
	//	MESSAGE AFTER THE PROCESS
		System.out.printf("\nNice, You Guessed the number correctly with %d guesses.\nBye", counter);
	}
}
