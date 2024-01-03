/*	This program reads a given set of integers and then prints the number of positive integers, 
 * 	the number of negative integers, 
 * 	and the number of zeros.
 */

import java.util.Scanner;

public class numbers_classification {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int def = 10;
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		int counter;
		int num;
		
		System.out.println("Enter 10 Positive, Negative and Zero Numbers");
		
		for (counter = 1; counter <= def; counter++) {
			num = scan.nextInt();
			System.out.print(num + " ");
			
			if (num > 0) positive++;
			else if (num < 0) negative++;
			else if (num == 0) zeros++;
			
		}
		
		System.out.printf("Number of Positive Integers are: %d\nNumbers of Negative Integers are: %d\nNumbers of Zeros are: %d",
							positive, negative, zeros);

	}

}
