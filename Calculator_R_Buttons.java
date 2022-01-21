package Calculator_RO_Buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_R_Buttons extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_R_Buttons frame = new Calculator_R_Buttons();
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
	public Calculator_R_Buttons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 39, 348, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn9.setBounds(22, 116, 89, 46);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(121, 116, 89, 46);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(220, 116, 89, 46);
		contentPane.add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn6.setBounds(22, 189, 89, 46);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn5.setBounds(121, 189, 89, 46);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn4.setBounds(220, 189, 89, 46);
		contentPane.add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn3.setBounds(22, 253, 89, 49);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn2.setBounds(121, 254, 89, 46);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn1.setBounds(220, 253, 89, 49);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn0.setBounds(121, 316, 89, 46);
		contentPane.add(btn0);
		
		JButton btn15 = new JButton(".");
		btn15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn15.setBounds(22, 316, 89, 46);
		contentPane.add(btn15);
		
		JButton btn14 = new JButton("c");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn14.setBounds(220, 316, 89, 46);
		contentPane.add(btn14);
		
		JButton btn10 = new JButton("+");
		btn10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn10.setBounds(319, 116, 51, 46);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("-");
		btn11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn11.setBounds(319, 189, 51, 46);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("/");
		btn12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn12.setBounds(319, 253, 51, 49);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("*");
		btn13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn13.setBounds(319, 316, 51, 46);
		contentPane.add(btn13);
		
		JButton btn17 = new JButton("=");
		btn17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btn17.setBounds(219, 385, 151, 54);
		contentPane.add(btn17);
		
		JButton btn16 = new JButton("%");
		btn16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btn16.setBounds(22, 385, 144, 54);
		contentPane.add(btn16);
	}
}
