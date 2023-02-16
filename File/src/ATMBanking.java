import java.util.*;

public class ATMBanking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number  : ");
		String accnumber = scan.nextLine();

		System.out.print("Enter password  : ");
		String password = scan.nextLine();
		while (password.length() != 4) {
			System.out.print("Enter password  : ");
			password = scan.nextLine();
		}
		System.out.print("Enter money  : ");
		int money = scan.nextInt();
		while (money <= 0) {
			System.out.print("Enter money  : ");
			money = scan.nextInt();
		}
		ATMChecking bank = new ATMChecking(accnumber, password, money);
		bank.show();

	}

}
