//---Program for the Calculation of COST, REVENUE AND PROFIT from the user-prompted FIXED COST, VARIABLE COST, PRICE AND VOLUME. It also outputs the COST, REVENUE AND PROFIT FUNCTIONS including the BREAKEVEN POINT------//
//---Created by MELBERT P.MARAFO----//
//---Date Finished: 8:16 AM 9/23/2022----//

import java.util.Scanner;
public class cost_revenue_profit_calculation {
		static Scanner scan = new Scanner(System.in);
		public static void main(String[] args){
			double FC, VC, PR, VOL;
			double totalVR, totalCost, totalRevenue, totalProfit;
			String costFunction = "C(x) = FC + VC(x)", 
					revenueFunction = "R(x) = Pr(x)", 
					profitFunction = "P(x) = (Pr(x)) - (FC + VC(x))";
			
			System.out.println("--------------------------------------------->>");
		
			print("Enter Fixed Cost(FC): ");
				FC = scan.nextDouble();
			print("Enter Variable Cost (VC): ");
				VC = scan.nextDouble();
			print("Enter Price/Unit(Pr): ");
				PR = scan.nextDouble();
			
	//------------EVALUTATING VALUES FOR THE FUNCTIONS--------// 
			String CFunc = "C(x) = " + FC + " + " + VC + "x";
			String RFunc = "R(x) =" + PR + "x";
			String PRFunc = "P(x) = " + (PR - VC) + "x" + " - " + FC;
			String breakEven = "x = " + (FC/PR - VC);
			
	//----------------PRINTING OF INITIAL VALUES-----------------------//
			String initialValues = String.format("\n\tINITIAL VALUES \n\t\tFixed Cost is: %.2f \n\t\tVariable Cost is: %.2f \n\t\tPrice is: %.2f", FC, VC, PR);
	
	//----------------PRINTING OF FUNCTIONS-----------------------//
			
			String CFmessage = String.format("\n\tCOST FUNCTION \n\t\tFrom the General Function %s, \n\t\tthe Cost Function is %s", costFunction, CFunc);
			String RFmessage = String.format("\n\tREVENUE FUNCTION \n\t\tFrom the General Function %s, \n\t\tthe Revenue Function is %s", revenueFunction, RFunc);
			String PROFITFmessage = String.format("\n\tPROFIT FUNCTION \n\t\tFrom the General Function %s, \n\t\tthe Profit Function is %s", profitFunction, PRFunc);
			String breakEvenMessage = String.format("\n\tBREAKEVEN PROINT \n\t\tFrom the given Profit Function, \n\t\tthe Breakeven Point is %.2f", FC/PR - VC);
			String finalMessage = String.format(initialValues + CFmessage + RFmessage + PROFITFmessage + breakEvenMessage);
			print(finalMessage);
	
			print("\n\nEnter Volume or Value of (x): ");
				VOL = scan.nextDouble();
			
	//-----------------PROCESSING OF VALUES---------------------//
			totalVR = VC * VOL;
			totalCost = FC + totalVR;
			totalRevenue = PR * VOL;
			totalProfit = totalRevenue - totalCost;
			
	//-------------------PRINTING OF OUTPUTS-------------------------//
	
			String finalestMessage = String.format("\n\tTotal Cost is: %.2f \n\tTotal Revenue is: %.2f \n\tTotal Profit is: %.2f", totalCost, totalRevenue, totalProfit);
			print(finalestMessage);
		}
		
	static void print(String s) {
		System.out.print(s);
	}
}
