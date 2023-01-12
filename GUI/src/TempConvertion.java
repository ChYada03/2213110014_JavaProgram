import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConvertion extends JFrame {
	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC =5.0/9.0;
	private static final double CTOC =9.0/5.0;
	private static final int OFFSET =32;
	
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;
	
	private JTextField tfCelsius;
	private JTextField tfFahrenheit;

public TempConvertion() {
	
	Container c = getContentPane();
	c.setLayout(new GridLayout(1,4));
	
	lblCelsius = new JLabel("Tmp in Celsius:");
	tfCelsius = new JTextField(10);
	c.add(lblCelsius); 
	c.add(tfCelsius);
	lblFahrenheit = new JLabel("Temp in Fahrenheit:");
	tfFahrenheit = new JTextField(10);
	c.add(lblFahrenheit); 
	c.add(tfFahrenheit);
	
	CelHandler celsiusHandler = new CelHandler();
	tfCelsius.addActionListener(celsiusHandler);
	
	frhHandler fahrenheitHandler = new frhHandler();
	tfFahrenheit.addActionListener(fahrenheitHandler);
	
	setTitle("Temp Convertion");
	setSize(WIDTH,HEIGHT);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

}

private class CelHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		double celsius,fahrenheit;
		celsius = Double.parseDouble(tfCelsius.getText());
		fahrenheit = celsius * CTOC+OFFSET;
		tfFahrenheit.setText(String.format("%.2f",fahrenheit));
	}
}
private class frhHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		double celsius,fahrenheit;
		fahrenheit = Double.parseDouble(tfFahrenheit.getText());
		celsius = (fahrenheit-OFFSET) * FTOC;
		tfCelsius.setText(String.format("%.2f",celsius));
	}
}

	public static void main(String[] args) {
		TempConvertion tempcon = new TempConvertion();

	}

}
