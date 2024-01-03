import javax.swing.JOptionPane;

public class oddAndEvenNumber {
	public static void main(String[] args) {
		
	String num1 = JOptionPane.showInputDialog("Enter a Number");
	
	int mods = Integer.parseInt(num1) % 2;
	boolean result = mods==1;
	
	if (result) {
		JOptionPane.showMessageDialog(null, num1 + " is an Odd Number.");
	}
	else {
		JOptionPane.showMessageDialog(null, num1 + " is an Even Number.");
	}
	
	}
}
