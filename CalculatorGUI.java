package scientific;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcu {

	private JFrame frame;
	private JTextField textField;

	double firstNum;
	double secondNum;
	double result;
	String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu window = new Calcu();
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
	public Calcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 192));
		frame.setBounds(100, 100, 389, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setBackground(new Color(0, 128, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(49, 0, 300, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(10, 34, 344, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("R");
		btnNewButton.setBounds(10, 101, 54, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setBounds(10, 152, 54, 40);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(1 / num));
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX_1.setBounds(10, 254, 54, 40);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(num * num * num));
			}
		});
		frame.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("x^2");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(10, 305, 54, 40);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(num * num));
			}
		});
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(10, 356, 54, 40);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textField.getText());
				int fact = 1;
				for (int i = 1; i <= num; i++) {
					fact *= i;
				}
				textField.setText(String.valueOf(fact));
			}
		});
		frame.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setBounds(10, 407, 54, 40);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(num * -1));
			}
		});
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_7.setBounds(78, 101, 54, 40);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.exp(num)));
			}
		});
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_1.setBounds(78, 152, 54, 40);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.log10(num)));
			}
		});
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.setBounds(78, 254, 54, 40);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.setBounds(78, 305, 54, 40);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBounds(78, 356, 54, 40);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("sin");
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSin.setBounds(154, 101, 54, 40);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.sin(Math.toRadians(num))));
			}
		});
		frame.getContentPane().add(btnSin);
		
		JButton btnNewButton_1_2 = new JButton("sinh");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_2.setBounds(154, 152, 54, 40);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.sinh(num)));
			}
		});
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.setBounds(154, 254, 54, 40);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.setBounds(154, 305, 54, 40);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBounds(154, 356, 54, 40);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBounds(74, 407, 134, 40);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		frame.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCos.setBounds(229, 101, 54, 40);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.cos(Math.toRadians(num))));
			}
		});
		frame.getContentPane().add(btnCos);
		
		JButton btnNewButton_1_3 = new JButton("cosh");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_3.setBounds(229, 152, 54, 40);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.cosh(num)));
			}
		});
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBackSpace.setBounds(229, 203, 54, 40);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn9.setBounds(229, 254, 54, 40);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn6.setBounds(229, 305, 54, 40);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.setBounds(229, 356, 54, 40);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(229, 407, 54, 40);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEqual.setBounds(293, 407, 54, 40);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(textField.getText());
				switch (operations) {
					case "+":
						result = firstNum + secondNum;
						break;
					case "-":
						result = firstNum - secondNum;
						break;
					case "*":
						result = firstNum * secondNum;
						break;
					case "/":
						result = firstNum / secondNum;
						break;
					case "x^y":
						result = Math.pow(firstNum, secondNum);
						break;
					default:
						result = 0;
						break;
				}
				textField.setText(String.valueOf(result));
			}
		});
		frame.getContentPane().add(btnEqual);
		
		JButton btnDIV = new JButton("/");
		btnDIV.setBackground(new Color(240, 240, 240));
		btnDIV.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDIV.setBounds(293, 356, 54, 40);
		btnDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		frame.getContentPane().add(btnDIV);
		
		JButton btnMUL = new JButton("*");
		btnMUL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMUL.setBounds(293, 305, 54, 40);
		btnMUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		frame.getContentPane().add(btnMUL);
		
		JButton btnSUB = new JButton("-");
		btnSUB.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSUB.setBounds(293, 254, 54, 40);
		btnSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		frame.getContentPane().add(btnSUB);
		
		JButton btnADD = new JButton("+");
		btnADD.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnADD.setBounds(293, 203, 54, 40);
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		frame.getContentPane().add(btnADD);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTanh.setBounds(293, 152, 54, 40);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.tanh(num)));
			}
		});
		frame.getContentPane().add(btnTanh);
		
		JButton btnTan = new JButton("tan");
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTan.setBounds(293, 101, 54, 40);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(Math.tan(Math.toRadians(num))));
			}
		});
		frame.getContentPane().add(btnTan);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(154, 203, 54, 40);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBounds(78, 203, 54, 40);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(num / 100));
			}
		});
		frame.getContentPane().add(btnPercent);
		
		JButton btnXy = new JButton("x^y");
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnXy.setBounds(10, 203, 54, 40);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "x^y";
			}
		});
		frame.getContentPane().add(btnXy);
	}
}