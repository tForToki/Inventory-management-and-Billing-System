package menus;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import others.InvoiceWindow;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AddBooks extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBooks frame = new AddBooks();
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
	public AddBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Book\r\n");
		lblNewLabel.setFont(new Font("Nunito Medium", Font.PLAIN, 35));
		lblNewLabel.setBounds(556, 10, 171, 65);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(34, 147, 532, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(34, 244, 532, 47);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(34, 341, 532, 47);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(34, 438, 532, 47);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(34, 535, 532, 47);
		contentPane.add(textField_4);
		
		lblNewLabel_1 = new JLabel("Name\r\n");
		lblNewLabel_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(34, 107, 163, 30);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Writer");
		lblNewLabel_2.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(34, 204, 163, 30);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(34, 301, 163, 30);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("ISBN");
		lblNewLabel_4.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(34, 398, 163, 30);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Year Of Publish");
		lblNewLabel_5.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(34, 495, 163, 30);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(681, 147, 532, 47);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(681, 244, 532, 47);
		contentPane.add(textField_6);
		
		lblNewLabel_6 = new JLabel("Price\r\n");
		lblNewLabel_6.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(681, 107, 163, 30);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Percentage Of Discount");
		lblNewLabel_7.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(681, 204, 211, 30);
		contentPane.add(lblNewLabel_7);
		
		btnNewButton = new JButton("ADD !\r\n");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 30));
		btnNewButton.setBounds(681, 535, 532, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu1 m1 = new Menu1();
				m1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(254, 222, 190));
		btnNewButton_1.setBounds(0, 52, 85, 27);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}
