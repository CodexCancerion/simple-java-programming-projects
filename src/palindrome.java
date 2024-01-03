import java.util.Scanner;
public class palindrome {
	static Scanner scan = new Scanner(System.in);
	public static boolean palindrome(String str) {
		str = str.toLowerCase();
		String newStr = "";
		int ctr;
		for (ctr = str.length()-1; ctr >= 0; ctr--) {
			newStr = newStr + str.charAt(ctr);
		}
		if (str.equals(newStr)) return true;
		else return false;
	}
	public static String reverse(String str) {
		str = str.toLowerCase();
		String newStr = "";
		int ctr;
		for (ctr = str.length()-1; ctr >= 0; ctr--) {
			newStr = newStr + str.charAt(ctr);
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to determine of Palindrome");
			String str = scan.next();
		if (palindrome(str)) System.out.println(str + " is a Palindrome.");
		else {
			System.out.println(str + " is NOT a Palindrome.");
			System.out.println("Reverse word of " + str + " is " + reverse(str));
		}
	}
}
