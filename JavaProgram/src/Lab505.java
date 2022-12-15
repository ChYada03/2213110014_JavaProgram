import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		String studentID = scan.nextLine();
		System.out.print("Enter Subject Id: ");
		String subjectID = scan.nextLine();
		isLength(studentID,subjectID);
		isITStudent(studentID);
	}
	public static boolean isLength(String student,String subject) {
		if (student.length()==10 || subject.length()==7) {
			return true;
		}
		else {
			return false;
		}	
	}//end isLength
	public static boolean isITStudent(String student) {
	
	}// end isITStudent

}
