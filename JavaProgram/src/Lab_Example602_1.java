import javax.swing.*;

public class Lab_Example602_1 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptWasFound = false;
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter a department name");
		
		for (int i = 0 ; i<deptName.length ; i++) {
			if(name.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}
		if (deptWasFound) {
			JOptionPane.showMessageDialog(null,name +" was found in the list");
		}else JOptionPane.showMessageDialog(null,name +" was not found in the list");
	}

}
