package roman_numeral_converter;
import java.util.*;
public class RomanConverter2 {
	
	/*	Returns the converted value from Roman to Arabic
	 */
	int convertRoman(String str) {
		int finale=0;
		String t="", u="";
		ArrayList<String> romans = new ArrayList<String>();

		System.out.println(Arrays.toString(sliceToArray(str)));
		if (!valid(sliceToArray(str))) {
			System.out.print("Error! ["+str+"] is not a valid Roman Numeral.");
		}
		else {
			//LOOPING EVERY CHAR OF STRING
			for (int i=0; i<str.length()-1; ) {

					if (i!=str.length()-1){
						t = stringOf(str, i);
						if (i+1!=str.length()) {
							u = stringOf(str, ++i);
							if (combine(t,u)) romans.add(String.format("%s%s",t,u));
							else romans.add(t);
						}
						else romans.add(t);

						//i++;
					}
			}
			Iterator<String> iterate = romans.iterator();
			while (iterate.hasNext()){
				Object element = iterate.next();
				System.out.print(element + " ");
			}
			System.out.println(romans.size());
		
			//ADDING
			for (int i=0; i<romans.size(); i++) {
				finale+=romanToArab(romans.get(i));
			}
		}
		return finale;
	}
	
	/*	Returns the Arabic value of any Roman Character and valid Character combination
	 */
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
		case "IV" :
			return 4;
		case "IX" :
			return 9;
		case "XL" :
			return 40;
		case "XC" :
			return 90;
		case "CD" :
			return 400;
		case "LD" :
			return 450;
		case "CM" :
			return 900;
		}
		return 0;
	}
	
	/*	Returns TRUE if consecutive characters are valid to combine according to the rules in converting Roman to Arabic.
	 *	Otherwise FALSE 
	 */
	boolean combine(String t, String u) {
		switch(t+u) {
		case "IV" :
			return true;
		case "IX" :
			return true;
		case "XL" :
			return true;
		case "XC" :
			return true;
		case "CD" :
			return true;
		case "LD" :
			return true;
		case "CM" :
			return true;	
		}
		return false;
	}
	
	boolean valid(String[] a) {
		for (int i=0; i<a.length/4; i++) {
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
