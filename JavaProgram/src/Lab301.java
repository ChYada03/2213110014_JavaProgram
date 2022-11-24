import javax.swing.*;
import java.text.*;
public class Lab301 {
	static final int pricePerson = 299;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		int numberOfCustomer = Integer.parseInt
				(JOptionPane.showInputDialog("How many customer per bill?"));
		double totalprice = numberOfCustomer * pricePerson;
		int membercard;
		do {
		membercard = JOptionPane.showConfirmDialog
				(null,"Total Price is "+frm.format(totalprice)+ "baht."
						+"\nDo you have a member card?");
		}while(membercard == 2);
		if (membercard == 0)
		{
			totalprice = totalprice*90/100;
			JOptionPane.showMessageDialog
			(null, "Amount to be paid  is "+frm.format(totalprice)+" baht.");
		}
		else if (membercard == 1) {
			JOptionPane.showMessageDialog
		(null, "Amount to be paid  is "+frm.format(totalprice)+" baht.");
		}

	}

}
