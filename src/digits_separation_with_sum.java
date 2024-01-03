/* Write a program that prompts the user to input an integer 
 * and then outputs both the individual digits of the number and the sum of the digits. 
 * For example, the program should: output the individual digits of 3456 as 3 4 5 6 and the sum as 18.
 */

import java.util.Scanner;
public class digits_separation_with_sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter numbers: ");
			String numStr = scan.next();
		
		int length = numStr.length();
		int index;
		int sum = 0;
		
		for (index = 0; index != length; index++) {
			char ch = numStr.charAt(index);
			int num = Character.getNumericValue(ch);	// Used to get numeric value of datatype char and store to int
			System.out.print(num + " ");
			sum = sum + num;
		}
			System.out.print(" Sum is " + sum);
	}
}
