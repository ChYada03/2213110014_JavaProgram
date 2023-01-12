import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.*;
import java.text.*;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Enter Number 1");
		lblNum1.setBounds(31, 33, 107, 25);
		contentPane.add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(148, 35, 101, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblNum2 = new JLabel("Enter Number 2");
		lblNum2.setBounds(31, 69, 106, 20);
		contentPane.add(lblNum2);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(148, 66, 101, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResult.setBounds(306, 171, 62, 30);
		contentPane.add(lblResult);
		
		final JComboBox cbOperator = new JComboBox();
		cbOperator.setBounds(148, 97, 101, 20);
		cbOperator.addItem("+");
		cbOperator.addItem("-");
		cbOperator.addItem("*");
		cbOperator.addItem("/");
		contentPane.add(cbOperator);
		
		JLabel lblOperator2 = new JLabel("How to show Digit");
		lblOperator2.setBounds(31, 128, 107, 14);
		contentPane.add(lblOperator2);
		
		JRadioButton rdbtn1digit = new JRadioButton("1 Digit");
		rdbtn1digit.setBounds(144, 124, 101, 23);
		contentPane.add(rdbtn1digit);
		
		JRadioButton rdbtn2digit = new JRadioButton("2 Digit");
		rdbtn2digit.setBounds(144, 151, 109, 23);
		contentPane.add(rdbtn2digit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn1digit);
		group.add(rdbtn2digit);
		
		JLabel lblOptionchckbox = new JLabel("Option to show");
		lblOptionchckbox.setBounds(31, 181, 107, 14);
		contentPane.add(lblOptionchckbox);
		
		JCheckBox chckbxShowResult = new JCheckBox("Show Result at DialogBox");
		chckbxShowResult.setBounds(144, 177, 97, 23);
		contentPane.add(chckbxShowResult);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNum1.getText());
					num2 = Double.parseDouble(txtNum2.getText());
					//sum = num1+num2;
					operator = (String)cbOperator.getSelectedItem();
					if (operator.equals("+")) sum = num1+num2;
					if (operator.equals("-")) sum = num1-num2;
					if (operator.equals("*")) sum = num1*num2;
					if (operator.equals("/")) sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					if(rdbtn1digit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}else if (rdbtn2digit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					if(chckbxShowResult.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
					
					
					lblResult.setText(frmNumber.format(sum));
				}
			}
		});
		
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(31, 100, 71, 17);
		contentPane.add(lblOperator);
		
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOK.setBounds(121, 227, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExit.setBounds(212, 227, 89, 23);
		contentPane.add(btnExit);
		
		
		

	}
}
