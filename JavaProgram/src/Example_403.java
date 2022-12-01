import java.util.*;
import javax.swing.*;
public class Example_403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// String sentence = JOptionPane.showInputDialog("Input a sentence:");
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while (sentence.endsWith(".")) {
			System.out.print("Input a sentence ,again : ");
			// sentence = JOptionPane.showInputDialog("Input a sentence, again:");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spaceofword=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofword++;
			}
		}
		//JOptionPane.showMessageDialog(null, "This sentence has "+spaceofword+" spacebar.");
		//JOptionPane.showMessageDialog(null, "This sentence has "+(spaceofword+1)+" words.");
		System.out.println("This sentence has "+spaceofword+" spacebar.");
		System.out.println("This sentence has "+(spaceofword+1)+" words.");
	}

}
