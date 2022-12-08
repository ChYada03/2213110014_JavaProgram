import javax.swing.*;
public class Lab502 {

	static String email;
	public static void main(String[] args) {
		inputemail();
		checkEmail(email);

	}
	public static void inputemail() {
		String answer="";
		do {
		email = JOptionPane.showInputDialog("Input your e-mail:");
		checkEmail(email);
		answer = JOptionPane.showInputDialog("Continue[y||y] to continue");
		}while (answer.equalsIgnoreCase("y"));

	}
	public static void checkEmail(String chckEmail) {
		while (email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail ,again:");
		}
		chckEmail = chckEmail.toLowerCase();
		//boolean checkEmail = chckEmail.endsWith("@gmail.com")||chckEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, 
				checkmail(chckEmail)?"your e-mail is "+chckEmail : "Your e-mail is not hotmail or gmail dot com");
		}
	public static boolean  checkmail(String chckEmail) {
		if (chckEmail.endsWith("@gmail.com")||chckEmail.endsWith("@hotmail.com")){
			return true;
		}
		else return false;
		}
	}

