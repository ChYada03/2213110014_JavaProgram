import java.util.*;

public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PiggyBank pb = new PiggyBank(); pb.setPiggyBank(500);
		 * System.out.println("Money Total : " + pb.getTotal()); pb.addTwo(34);
		 * System.out.println("Add 2 Baht Money: " + 34);
		 * System.out.println("Money Total : " + pb.getTotal()); pb.addTen(13);
		 * System.out.println("Add 10 Baht Money: " + 13);
		 * System.out.println("Money Total : " + pb.getTotal()); pb.addFive(100);
		 */
		sizeOfPiggyBank();
	}// end of main

	public static void sizeOfPiggyBank() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank:");
		// int size = scan.nextInt();
		// pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank:" + pb.getPiggyBank());
		inputCoin();
	}// end sizeOfPiggyBank

	public static void inputCoin() {
		while (true) {
			System.out.print("\n========================" + "\nMenu of PiggyBank" + "\n========================"
					+ "\n[1] one baht." + "\n[2] two baht." + "\n[3] five baht." + "\n[4] ten baht." + "\n[5] Exit"
					+ "\n========================" + "\nPlease select choice : ");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("Insert 1 baht : ");
				pb.addOne(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 2) {
				System.out.print("Insert 2 baht : ");
				pb.addTwo(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 3) {
				System.out.print("Insert 5 baht : ");
				pb.addFive(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 4) {
				System.out.print("Insert 10 baht : ");
				pb.addTen(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 5) {
				System.out.println("Bye Bye");
				break;
			}
		}

	}
}
