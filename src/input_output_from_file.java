import java.io.*;
import java.util.*;
public class input_output_from_file {
	public static void main(String[] args) 
					throws FileNotFoundException
	{
		int ID;
		String name, discard;
		String winner = new String();
		int vote;
		int totalVote, winningVote;
		Scanner inFile = new Scanner(new FileReader("src/simple_java_programming_projects/input_output_from_file.txt"));
		winningVote = 0;		// Stores the highest totalVote
		while (inFile.hasNext()) {
			ID = inFile.nextInt();
				discard = inFile.nextLine();
			name = inFile.nextLine();
			totalVote = 0;				// Resets TotalVote count to 0 for every repetition			
			
			while (inFile.hasNext()) {
				vote = inFile.nextInt();
				if (vote == -999) break;	
				totalVote = totalVote + vote;
			}
			if (totalVote > winningVote) {		// Determines whether the new totalVote is greater than the stored winningVote
				winner = name; 
				winningVote = totalVote;
			}
			System.out.printf("%s     \twith ID %d \thas \t%d total number of votes. \n", name, ID, totalVote);
		}
			System.out.print("\n//--------------------------------------//\n");
			System.out.printf("WINNER is %s with %d number of votes. \nbye bye", winner, winningVote);
			System.out.print("\n//--------------------------------------//\n");
	}
}
