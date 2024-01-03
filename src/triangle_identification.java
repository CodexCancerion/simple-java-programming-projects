/*	Identifies whether the entered 3 sides forms a Triangle
 * 	If it forms a Triangle, identify whether it forms an Equilateral, Isosceles or Scalene triangle
 *	if, Nested if, else, JOptionPane
 *	Bye
 */

import javax.swing.JOptionPane;
public class triangle_identification {
	public static boolean isTriangle(int s1, int s2, int s3) {
		if (s1+s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) return true;
		else return false;
	}
	public static String triangleType(int s1, int s2, int s3) {
		if (s1 == s2 && s2 == s3 && s1 == s3) return "Equilateral Triangle";
		else if (s1 == s2 || s2 == s3 || s1 == s3) return "Isosceles Triangle";
		else return "Scalene Triangle";
	}
	public static void main(String[] args) {
		
		String side1 = JOptionPane.showInputDialog("Enter Side 1");
		String side2 = JOptionPane.showInputDialog("Enter Side 2");
		String side3 = JOptionPane.showInputDialog("Enter Side 3");
		
		int s1 = Integer.parseInt(side1);
		int s2 = Integer.parseInt(side2);
		int s3 = Integer.parseInt(side3);
		
		String TriangleType = triangleType(s1, s2, s3);
		
		if (isTriangle(s1, s2, s3)) JOptionPane.showMessageDialog(null, "Yes, It forms a triangle. " + TriangleType);
		else JOptionPane.showMessageDialog(null, "Nah babeh, It won't form a triangle.");
	}

}
