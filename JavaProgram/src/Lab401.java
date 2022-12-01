import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String name = scan.nextLine();
		if (name.contains(" ")){
			int index = name.indexOf(" ");
			String firstName = name.substring(0,index);
			String lastName = name.substring(index+1,name.length());
			System.out.println("First Name: "+firstName.toUpperCase());
			System.out.println("Last Name: "+lastName.toLowerCase());
		}
		else {
			System.out.println("Incorrect Name");
		}

	}

}
