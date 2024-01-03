/* Write a program that determines whether a positive integer is divisible by 3 and 9 
 * by first finding the sum of its digits and then checking whether the sum is divisible by 3 and 9. 
 */

import java.util.Scanner;

public class divisibility_test_by_3_and_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.print("Enter multipe digit positive integer: ");
			num = scan.nextInt();
			
		int temp = num;
		
		do {
			sum = sum + num % 10; //adds the last digit of the entered number to sum;
			
			num = num / 10;
		}
		while (num > 0);
		
		System.out.printf("The sum of all digits of %d is %d", temp, sum);
		
		if (sum % 3 == 0) System.out.printf("\n%d is divisible by 3.", temp);
		else System.out.printf("\n%d is NOT divisible by 3.", temp);
		
		if (sum % 9 == 0) System.out.printf("\n%d is divisible by 3 and 9.", temp);
		else System.out.printf("\n%d is NOT divisible by 9.", temp);
		
	}
	

}
