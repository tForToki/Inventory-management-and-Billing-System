package menus;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import others.InvoiceWindow;

public class Sort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sort frame = new Sort();
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
	public Sort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 510);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setForeground(Color.WHITE);
		txtpnLogin.setEditable(false);
		txtpnLogin.setBackground(Color.BLUE);
		txtpnLogin.setFont(new Font("Nunito ExtraBold", Font.BOLD, 45));
		txtpnLogin.setText("Sort By");
		txtpnLogin.setBounds(250, 0, 186, 68);
		contentPane.add(txtpnLogin);
		
		JButton btnNewButton = new JButton("Year Of Publish");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton.setBounds(0, 336, 684, 47);
		contentPane.add(btnNewButton);
		
		JButton btnRemoveBook = new JButton("ISBN\r\n");
		btnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveBook.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnRemoveBook.setForeground(Color.WHITE);
		btnRemoveBook.setBackground(Color.RED);
		btnRemoveBook.setBounds(0, 426, 684, 47);
		contentPane.add(btnRemoveBook);
		
		JButton btnBookInformation = new JButton("Price");
		btnBookInformation.setForeground(Color.WHITE);
		btnBookInformation.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnBookInformation.setBackground(Color.MAGENTA);
		btnBookInformation.setBounds(0, 381, 684, 47);
		contentPane.add(btnBookInformation);
		
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
		btnNewButton_1.setBounds(0, 20, 85, 27);
		contentPane.add(btnNewButton_1);
	}

}
