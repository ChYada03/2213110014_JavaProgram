import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int student = scan.nextInt();
		Student[] std = new Student[student];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input Student Name : ");
			std[i].setName(scan.next());
			System.out.print("Input Student Score : ");
			std[i].setScore(scan.nextInt());
			System.out.println("-------------------------------");
			while (!std[i].checkScore()) {
				System.out.print("Input Student Score, again : ");
				std[i].setScore(scan.nextInt());
			}
		} // end of for
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " get grade " + STD.findGrade(STD.getScore()));
			}
		}
		// System.out.println(">> "+STD.getName()+" get
		// grade"+STD.findGrade(STD.getScore()));
		/*
		 * for (int i =0;i<std.length;i++) { if(std[i].isPass()) {
		 * System.out.println(">> "+std[i].getName()+" ("+std[i].getScore()+" )");
		 */
	}

}
