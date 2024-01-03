import java.util.Scanner;
public class fibonnaci_find_the_nth_term {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		int n1 = 1;
		int counter = 1;
		System.out.printf("%d term: %d \n", counter, n1);
		int n2 = n1;
		counter++;
		System.out.printf("%d term: %d \n", counter, n2);
		int n3 = 0;
		System.out.println("Which term [n] are you looking for?");
			n = scan.nextInt();
		while (counter != n) {
			n3 = n1+n2;
			counter++;
			System.out.printf("%d term: %d \n", counter, n3);
			n1 = n2 + n3;
			counter++;
			System.out.printf("%d term: %d \n", counter, n1);
			n2 = n1 + n3;
			counter++;
			System.out.printf("%d term: %d \n", counter, n2);
		}
	}
}
