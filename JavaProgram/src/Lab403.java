import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		int count = 0;
		for (int i=0;i<message.length();i++) {
		if(message.indexOf("Nichi")>=0) {
			count++;
		}
	}
		if (count > 0) System.out.print("Nichi is a sentence");
		if (count == 0) System.out.println(message);
	}

}