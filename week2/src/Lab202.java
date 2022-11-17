import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int minutes = scan.nextInt();
		int year = minutes / 525600 ;
		int overminutes = minutes % 525600;
		int day = overminutes / 1440 ;
		System.out.println(minutes+" is approximately "+year+" years and "+day+" days");

	}

}
