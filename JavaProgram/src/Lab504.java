import java.util.*;
public class Lab504 {
	static String name;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by space.\n:");
		name = scan.nextLine();
		int index = name.indexOf(" ");
		String firstname = name.substring(0,index);
		System.out.println(abbreviatName(name)+firstname);
	}//end main
	public static String abbreviatName (String fullname) {
		String letter = "";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
			letter = (letter+fullname.charAt(i+1));
			letter = letter.toUpperCase() +".";
				
		}
	}
		return letter;
	}
}
