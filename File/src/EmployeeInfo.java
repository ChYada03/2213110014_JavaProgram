import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data(from file)?: ");
		choice = console.next();
		while(!choice.equals("insert")&& !choice.equals("read")){
			System.out.print("Please text insert or read : ");
			choice = console.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		}else {
			System.out.print("\nEnter department: ");
			department = console.next();
			file.setDept(department);
			file.read();
		}
	}//main()

}
