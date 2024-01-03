/*	Write a program that prompts the user to input 3 numbers.
 *	The programs should then output the numbers in non-descending order.
 */

import java.util.Scanner;

public class sort_non_descending_order {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			System.out.print("Enter Num1: ");
				int num1 = scan.nextInt();
			System.out.print("Enter Num2: ");
				int num2 = scan.nextInt();
			System.out.print("Enter Num3: ");
				int num3 = scan.nextInt();
		scan.close();
		
		
		if (num1 <= num2 && num2 <= num3) System.out.printf("\nORDER:\tNum1\tNum2\tNum3 \n\t%d \t%d \t%d", num1, num2, num3);
		else if (num2 <= num1 && num1 <= num3) System.out.printf("\nORDER:\tNum2\tNum1\tNum3 \n\t%d \t%d \t%d", num2, num1, num3);
		else if (num3 <= num1 && num1 <= num2) System.out.printf("\nORDER:\tNum3\tNum1\tNum2 \n\t%d \t%d \t%d", num3, num1, num2);
		else System.out.printf("\nORDER:\tNum3\tNum2\tNum1 \n\t%d \t%d \t%d", num3, num2, num1);
		
		System.out.println("\nBye");
	}

}
