import java.awt.*;
import javax.swing.*;
	
public class TestGUI extends JFrame{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblLength = new JLabel("Enter the length:",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width:",SwingConstants.RIGHT);
		lblArea = new JLabel("Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.RIGHT);
		
		//txtLength = new JTextField(10);
		
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength); //add(txtLength);
		add(lblWidth); //add(txtLength);
		add(lblArea); //add(txtLength);
		add(lblPerimeter); //add(txtLength);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();
	}

}