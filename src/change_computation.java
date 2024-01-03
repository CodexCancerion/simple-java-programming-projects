//---Program for the Calculation of Numbers of FiveHundred, OneHundred, Fifty, Twenty, Ten and One Peso Bills according to the Calculated Change from the Amount Given to the Amount Paid------//
//---Created by MELBERT P.MARAFO, SECTION A, BATCH 2----//
//---Submitted to Sir JESS EMMANUEL ARCE----//
//---In the Subject, COMPUTER PROGRAMMING 1----//
//---Under BS INFORMATION TECHNOLOGY----//
//---Date Finished: 12:15 PM 9/9/2022----//

import java.util.Scanner;
public class change_computation
{
	public static void main(String[] args)
	{
	//-----------INITIALIZATION--------//
		int totalPrice, amountGiven, change, fiveHundreths, oneHundreths, fifties, twenties, tenths, fives, onePesos;
	//----------INPUT-----------------//
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter Total Amount to pay: ");
			totalPrice = scan.nextInt();
		System.out.print("Enter Amount Given: ");
			amountGiven = scan.nextInt();
	//------------PROCESS--------------//
		change = amountGiven - totalPrice;	
	
		fiveHundreths = change / 500;
		oneHundreths = (change % 500) / 100;
		fifties = ((change % 500) % 100) / 50;
		twenties = (((change % 500) % 100) % 50) / 20;
		tenths = ((((change % 500) % 100) % 50) % 20) / 10;
		fives = (((((change % 500) % 100) % 50) % 20) % 10) / 5;
		onePesos = ((((((change % 500) % 100) % 50) % 20) % 10) % 5);
	//-----------OUTPUT---------------//
		System.out.println("\n-----------------RESULT---------------- \n");
		System.out.println("TOTAL PRICE PAID: " + totalPrice + " Pesos");
		System.out.println("AMOUNT GIVEN: " + amountGiven + " Pesos");

		System.out.println("YOUR CHANGE IS " + change + " Pesos");

		System.out.println("\t Number of Five Hundred Peso Bills: " + fiveHundreths);
		System.out.println("\t Number of One Hundred Peso Bills: " + oneHundreths);
		System.out.println("\t Number of Fifty Peso Bills: " + fifties);
		System.out.println("\t Number of Twenty Peso Bills: " + twenties);
		System.out.println("\t Number of Ten Peso Bills: " + tenths);
		System.out.println("\t Number of Five Peso Bills: " + fives);
		System.out.println("\t Number of One Peso Bills: " + onePesos);
			
	}
}