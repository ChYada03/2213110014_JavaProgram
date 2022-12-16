import java.util.*;
public class Lab607 {
	static String bdate;
	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
	static int count[] = new int[12];
	public static void main(String[] args) {
		inputBirthDate();
	}//end of main
	public static void inputBirthDate() {
		for (int i = 1 ; i<=5 ; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter BirthDate "+i+" :");
			bdate = scan.nextLine();
			int bmonth = checkBirthDate(bdate);
			count[bmonth-1]++;
		}//end for
		displayCountBday(count);
	}//end inputBirthDate()
	public static int checkBirthDate(String bday) {
		int bdate = Integer.parseInt(bday.substring(3,5));
		return bdate;
	}//end checkBirthDate
	public static void displayCountBday(int[] count){
		for (int i=0;i<count.length;i++) {
			System.out.print("\n"+month[i]+"       ["+count[i]+" people]");
		}//end for
		} 
	
}
