import java.util.*;
public class MovieDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input movie id : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String MovieName = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name : ");
		String DirectorName = scan.nextLine();
		scan.nextLine();
		System.out.print("Input director e-mail : ");
		String email = scan.nextLine();
		System.out.print("Input director gender : ");
		char gender = scan.next().toLowerCase().charAt(0);
		while(gender!='f'&&gender!='m'){
			System.out.print("Input director gender, again : ");
			gender = scan.next().toLowerCase().charAt(0);
		}
		System.out.println();
		
		System.out.print("Input movie theater no. : ");
		int thearterNo = scan.nextInt();
		while(thearterNo<=0 || thearterNo>15) {
			System.out.print("Please input 1 - 15 only : ");
			thearterNo = scan.nextInt();
		}
		System.out.println();
		Theater theater = new Theater(id,MovieName,
				new Director(DirectorName, email, gender),thearterNo);
		System.out.println(theater);


	}

}
