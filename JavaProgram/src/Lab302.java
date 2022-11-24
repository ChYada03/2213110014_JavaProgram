import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat ("#,###.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog
				(null,"Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog
				(null,"Input Height:"));
		double BMI = weight / ((height/100.0)*(height/100.0));
		if (BMI <= 18.5) {
		JOptionPane.showMessageDialog
		(null, "BMI = "+frm.format(BMI)+"\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (BMI >= 18.5 || BMI <= 24.9) {
		JOptionPane.showMessageDialog
		(null, "BMI = "+frm.format(BMI)+"\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (BMI >= 25.0 || BMI <= 29.9) {
		JOptionPane.showMessageDialog
		(null, "BMI = "+frm.format(BMI)+"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else JOptionPane.showMessageDialog
		(null, "BMI = "+frm.format(BMI)+"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		
	}

}
