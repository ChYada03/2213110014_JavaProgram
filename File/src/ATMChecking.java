import java.io.*;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		while ((temp = br.readLine()) != null) {
			String[] data = temp.split("\t");
		}
		return true;
	}

	public void show() {
		System.out.print("You drawing for .2%f" + money + ", get" + "\n\t\t1000 = " + money / 1000 + "\n\t\t500  = "
				+ (money / 1000));
	}
}
