package roman_numeral_converter;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String rmn = "";
		while(rmn != "EXIT") {
			System.out.print("Enter [Roman Number] to convert to Arabic or [EXIT]: ");
				rmn = scan.next().toUpperCase();
			RomanConverter roman = new RomanConverter();
			System.out.println(roman.toArabic(2345));
		}
	}
}
