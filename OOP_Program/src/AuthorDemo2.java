import java.util.*;
public class AuthorDemo2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Author[] at = new Author[4];
		for (int i = 0; i < at.length; i++) {
			at[i] = new Author();
			System.out.println("Information Author "+(i+1));
			System.out.println("-------------------------------------");
			System.out.print("Input author name: ");
			String name = scan.nextLine();
			System.out.print("Input author e-mail: ");
			String email = scan.nextLine();
			at[i] = new Author(name,email);
			System.out.println("-------------------------------------");
		} // end of for
		System.out.println();
        int i = 1;
        for(Author _author : at){
            System.out.println(i + ". " + _author.getName() + " (" + _author.getEmail() + ")");
            i++;
        }
	}

}
