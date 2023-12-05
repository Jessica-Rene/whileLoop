package whileLoop;

import java.util.Scanner;
import java.util.Random;

public class KeepTrackofCount {

	public static void main(String[] args) {
		int i = 0;
		double userNum;
		double totalSum = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		while (i < 5) {				// A while loop is beneficial when creating a loop for n number of times!
			
			System.out.println("Enter a number: ");
			userNum = scnr.nextDouble();
			
			totalSum += userNum;	// keeps track of the user # input
			i++;					// keeps track of how many times the loop increments
		}
		System.out.println("Total: " + totalSum);
		System.out.println("");
		
		int userGuess;
		int points = 0;
		int randomNumber = (int) (Math.random()* 10) + 1;
		String guessAgain;
		
		System.out.println("Do you want to guess a number between (yes or no)");
		guessAgain = scnr.next();
		
		while (!guessAgain.equals("no")) {		// I also think while loops are great when asking if user wants to guess again, and when they enter no, loop ends.
			System.out.println("Guess another number between 1 - 10");
			userGuess = scnr.nextInt();
			
			if (userGuess == randomNumber) {
				System.out.println("Good Job, you guessed the correct number!");
				points++;
				
			}
			else {
				System.out.println("Oh, nice try, do you want to guess again (yes or no)?");
				guessAgain = scnr.next();
			}
			
		}
		System.out.println("Maybe another day, Goodbye!");
	}

}
