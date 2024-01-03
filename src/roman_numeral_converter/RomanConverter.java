package roman_numeral_converter;
import java.util.*;
public class RomanConverter {
	
	/*	Returns the converted value from Roman to Arabic
	 */
	int toRoman(String str) {
		int finale=0;
		//if(valid(sliceToArray(str))==true) {
			//LOOPING EVERY CHAR OF STRING
			for (int i=str.length()-1; i>=0; i-- ) {
				int x, y;
				x = romanToArab(stringOf(str, i));
				if (i==0) {
					finale += x;
					break;
				}
				else y = romanToArab(stringOf(str, i-1));
				if (y<x) {
					finale +=(x-y);
					i--;
				}
				else finale += x;
			}
		//}	
		//else System.out.println("Invalid Roman Numeral");
		return finale;
	}
	
	int romanToArab(String s) {
		switch (s){
		case "I" :
			return 1;
		case "V" :
			return 5;
		case "X" :
			return 10;
		case "L" :
			return 50;
		case "C" :
			return 100;
		case "D" :
			return 500;
		case "M" :
			return 1000;
		}
		return 0;
	}
	
	String toArabic(int num) {
		String finale = "";
		int x,y,z;
		y = num;
		z = num%10;
		int[] arr = new int[String.valueOf(num).length()];
		
		for (int i=0; i<String.valueOf(num).length(); i++) {
			x = y%10;
			y /= 10;
			arr[i] = Integer.valueOf(String.valueOf(x)+("0".repeat(i)));
		}
		System.out.print(Arrays.toString(arr));
		
		for (int i = arr.length; i>0; i--) {
			
		}
		
		return finale;
	}
	
	String arabToRoman(int i) {
					
		switch (i){
		case 1 :
			return "I";
		case 5 :
			return "I";
		case 10 :
			return "I";
		case 50 :
			return "I";
		case 100 :
			return "I";
		case 500 :
			return "I";
		case 1000 :
			return "I";
		}
		return "ERROR";
	}
		
	boolean valid(String[] a) {
		for (int i=0; i<=a.length/4; i++) {
			for (int j=0; j<a.length;) {
				if(a[j]==a[++j] && a[j]==a[++j] && a[j]==a[++j]) return false;
				else return true;
			}
		}
		return true;
	}
	
	String[] sliceToArray(String s) {
		String[] a = new String[s.length()];

		for (int i=0; i<s.length(); i++) {
			if (s.length()<3) break;
			a[i] = stringOf(s, i);
		}
		return a;
	}
	
	String stringOf(String s, int i) {
		return Character.toString(s.charAt(i));
	}
}
