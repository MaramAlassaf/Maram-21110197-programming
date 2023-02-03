package eventdrivenGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class GUICalculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String operation;
	String ans;

	Scanner in =new Scanner(System.in);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICalculator window = new GUICalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUICalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{55, 55, 55, 70, 0};
		gridBagLayout.rowHeights = new int[]{56, 56, 56, 56, 56, 61, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 4;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		final JButton button_equal = new JButton("=");
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button_equal.getText();
				textField.setText(number);
			}
		});
		GridBagConstraints gbc_button_equal = new GridBagConstraints();
		gbc_button_equal.fill = GridBagConstraints.BOTH;
		gbc_button_equal.insets = new Insets(0, 0, 5, 5);
		gbc_button_equal.gridx = 0;
		gbc_button_equal.gridy = 1;
		frame.getContentPane().add(button_equal, gbc_button_equal);
		
		final JButton button_backspace = new JButton("⌫");
		button_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace= null;
				if(textField.getText().length()> 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace= str.toString();
					textField.setText(backSpace);
				}
			}
		});
		GridBagConstraints gbc_button_backspace = new GridBagConstraints();
		gbc_button_backspace.fill = GridBagConstraints.BOTH;
		gbc_button_backspace.insets = new Insets(0, 0, 5, 5);
		gbc_button_backspace.gridx = 1;
		gbc_button_backspace.gridy = 1;
		frame.getContentPane().add(button_backspace, gbc_button_backspace);
		
		final JButton button_power = new JButton("X²");
		button_power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button_power.getText();
				textField.setText(number);
			}
		});
		GridBagConstraints gbc_button_power = new GridBagConstraints();
		gbc_button_power.fill = GridBagConstraints.BOTH;
		gbc_button_power.insets = new Insets(0, 0, 5, 5);
		gbc_button_power.gridx = 2;
		gbc_button_power.gridy = 1;
		frame.getContentPane().add(button_power, gbc_button_power);
		
		final JButton button_sqrt = new JButton("√x");
		button_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button_sqrt.getText();
				textField.setText(number);
			}
		});
		GridBagConstraints gbc_button_sqrt = new GridBagConstraints();
		gbc_button_sqrt.fill = GridBagConstraints.BOTH;
		gbc_button_sqrt.insets = new Insets(0, 0, 5, 0);
		gbc_button_sqrt.gridx = 3;
		gbc_button_sqrt.gridy = 1;
		frame.getContentPane().add(button_sqrt, gbc_button_sqrt);
		
		final JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button1.getText();
				textField.setText(number);
			}
		});
		button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button1 = new GridBagConstraints();
		gbc_button1.fill = GridBagConstraints.BOTH;
		gbc_button1.insets = new Insets(0, 0, 5, 5);
		gbc_button1.gridx = 0;
		gbc_button1.gridy = 2;
		frame.getContentPane().add(button1, gbc_button1);
		
		final JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button2.getText();
				textField.setText(number);
			}
		});
		button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button2 = new GridBagConstraints();
		gbc_button2.fill = GridBagConstraints.BOTH;
		gbc_button2.insets = new Insets(0, 0, 5, 5);
		gbc_button2.gridx = 1;
		gbc_button2.gridy = 2;
		frame.getContentPane().add(button2, gbc_button2);
		
		final JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button3.getText();
				textField.setText(number);
			}
		});
		button3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button3 = new GridBagConstraints();
		gbc_button3.fill = GridBagConstraints.BOTH;
		gbc_button3.insets = new Insets(0, 0, 5, 5);
		gbc_button3.gridx = 2;
		gbc_button3.gridy = 2;
		frame.getContentPane().add(button3, gbc_button3);
		
		final JButton button_multiply = new JButton("*");
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button_multiply.getText();
				textField.setText(number);
			}
		});
		GridBagConstraints gbc_button_multiply = new GridBagConstraints();
		gbc_button_multiply.fill = GridBagConstraints.BOTH;
		gbc_button_multiply.insets = new Insets(0, 0, 5, 0);
		gbc_button_multiply.gridx = 3;
		gbc_button_multiply.gridy = 2;
		frame.getContentPane().add(button_multiply, gbc_button_multiply);
		
		final JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button4.getText();
				textField.setText(number);
			}
		});
		button4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button4 = new GridBagConstraints();
		gbc_button4.fill = GridBagConstraints.BOTH;
		gbc_button4.insets = new Insets(0, 0, 5, 5);
		gbc_button4.gridx = 0;
		gbc_button4.gridy = 3;
		frame.getContentPane().add(button4, gbc_button4);
		
		final JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button5.getText();
				textField.setText(number);
			}
		});
		button5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button5 = new GridBagConstraints();
		gbc_button5.fill = GridBagConstraints.BOTH;
		gbc_button5.insets = new Insets(0, 0, 5, 5);
		gbc_button5.gridx = 1;
		gbc_button5.gridy = 3;
		frame.getContentPane().add(button5, gbc_button5);
		
		final JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button6.getText();
				textField.setText(number);
			}
		});
		button6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button6 = new GridBagConstraints();
		gbc_button6.fill = GridBagConstraints.BOTH;
		gbc_button6.insets = new Insets(0, 0, 5, 5);
		gbc_button6.gridx = 2;
		gbc_button6.gridy = 3;
		frame.getContentPane().add(button6, gbc_button6);
		
		final JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=in.nextDouble();
				textField.setText("");
				operation="+";
				
				
			}
		});
		button_add.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button_add = new GridBagConstraints();
		gbc_button_add.fill = GridBagConstraints.BOTH;
		gbc_button_add.insets = new Insets(0, 0, 5, 0);
		gbc_button_add.gridx = 3;
		gbc_button_add.gridy = 3;
		frame.getContentPane().add(button_add, gbc_button_add);
		
		final JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button7.getText();
				textField.setText(number);
			}
		});
		button7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button7 = new GridBagConstraints();
		gbc_button7.fill = GridBagConstraints.BOTH;
		gbc_button7.insets = new Insets(0, 0, 5, 5);
		gbc_button7.gridx = 0;
		gbc_button7.gridy = 4;
		frame.getContentPane().add(button7, gbc_button7);
		
		final JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button8.getText();
				textField.setText(number);
			}
		});
		button8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button8 = new GridBagConstraints();
		gbc_button8.fill = GridBagConstraints.BOTH;
		gbc_button8.insets = new Insets(0, 0, 5, 5);
		gbc_button8.gridx = 1;
		gbc_button8.gridy = 4;
		frame.getContentPane().add(button8, gbc_button8);
		
		final JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button9.getText();
				textField.setText(number);
			}
		});
		button9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button9 = new GridBagConstraints();
		gbc_button9.fill = GridBagConstraints.BOTH;
		gbc_button9.insets = new Insets(0, 0, 5, 5);
		gbc_button9.gridx = 2;
		gbc_button9.gridy = 4;
		frame.getContentPane().add(button9, gbc_button9);
		
		final JButton button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button_sub.getText();
				textField.setText(number);
			}
		});
		button_sub.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_button_sub = new GridBagConstraints();
		gbc_button_sub.fill = GridBagConstraints.BOTH;
		gbc_button_sub.insets = new Insets(0, 0, 5, 0);
		gbc_button_sub.gridx = 3;
		gbc_button_sub.gridy = 4;
		frame.getContentPane().add(button_sub, gbc_button_sub);
		
		final JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() +button0.getText();
				textField.setText(number);
			}
		});
		button0.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_button0 = new GridBagConstraints();
		gbc_button0.fill = GridBagConstraints.VERTICAL;
		gbc_button0.insets = new Insets(0, 0, 0, 5);
		gbc_button0.gridwidth = 2;
		gbc_button0.gridx = 1;
		gbc_button0.gridy = 5;
		frame.getContentPane().add(button0, gbc_button0);
	}
}
