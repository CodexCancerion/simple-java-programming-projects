//	LOOPING EXAMPLE. Determine telephone digit of each letter from the input word.

import java.util.Scanner;
public class character_to_telephone_digit {
	public static void main(String[] args) {
	//	INITIALIZATION OF VARIABLES
			char character;
		String inputStr;
		int teleDigit = 0;
		int index;		//	Index of each letter in the InputStr
		int sum = 0;
		
	//	SCANNING INPUTS
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
			inputStr = scan.nextLine();
		scan.close();
			inputStr = inputStr.toUpperCase();		//	Converting Input to Uppercase
			
	//------------------------------//
		int length = inputStr.length();				// Assigning length of String to variable Length
			System.out.println("\nString length is " + length);	
		char[] characters = new char[length];		// Initialization of Array with size depending on variable Length
	
	//	LOOPING
		for (index = 0; index != length; index++) {
			characters[index] = inputStr.charAt(index);	//	Assigning and converting value from input to Variable Character
			character = characters[index];
			
		//	PROCESSING OF INPUTS
			switch (character) {
			case 'A': case 'B': case 'C': 
				teleDigit = 2;
				sum = sum + teleDigit;	
				break;
			case 'D': case 'E': case 'F': 
				teleDigit = 3;
				sum = sum + teleDigit;	
				break;
			case 'G': case 'H': case 'I': 
				teleDigit = 4;
				sum = sum + teleDigit;	
				break;
			case 'J': case 'K': case 'L': 
				teleDigit = 5;
				sum = sum + teleDigit;	
				break;
			case 'M': case 'N': case 'O': 
				teleDigit = 6;
				sum = sum + teleDigit;	
				break;
			case 'P': case 'Q': case 'R': case 'S':
				teleDigit = 8;
				sum = sum + teleDigit;	
				break;
			case 'T': case 'U': case 'V': 
				teleDigit = 9;
				sum = sum + teleDigit;	
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				teleDigit = 0;
				sum = sum + teleDigit;	
				break;
			default : 
				System.out.println("error");
				break;
			}

			System.out.printf("Telephone Digit of %c is %d\n", character, teleDigit);
		}
		
	//	MESSAGE AFTER THE PROCESS
		System.out.printf("Sum of all indexes is %d\n", sum);
		System.out.println("Process complete, bye");
		
	}

}
