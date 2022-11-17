import java.util.*;
import javax.swing.JOptionPane;
import java.text.*;
public class MusicWorldApp {

	public static void main(String[] args) {
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		//DecimalFormat f2 = new DecimalFormat()
		String cdid = JOptionPane.showInputDialog("This program calculates the total cost of a CD order"+
	" \nPlease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please ente the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		final double TAX_RATE = 0.0625;
		double cdSubtotal = cdPrice * cdQuantity;
		double cdTotal = cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null,"Summary of the transaction:\n\nCD ID: "+cdid+
				"\nCD Title: "+cdTitle+"\nCD Unit Price: "+f1.format(cdPrice)+"\nCD Quantity: "+cdQuantity+
				"\n\nsubtotal: $"+cdSubtotal+"\nTax rate: "+(TAX_RATE*100)+"%\nTotal: $"+cdTotal+
				"\n\nEnd of Program");
	}

}
