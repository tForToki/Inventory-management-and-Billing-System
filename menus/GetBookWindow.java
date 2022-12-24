package menus;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import source.Book;
import source.BookCollection;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GetBookWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetBookWindow frame = new GetBookWindow();
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
	public GetBookWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 510);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Books");
		lblNewLabel.setFont(new Font("Nunito Medium", Font.PLAIN, 35));
		lblNewLabel.setBounds(276, 0, 108, 58);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBackground(Color.CYAN);
		textArea.setBounds(0, 69, 684, 404);
		contentPane.add(textArea);
		
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
		btnNewButton_1.setBounds(0, 23, 85, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Show Books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookCollection bc = new BookCollection();
				Book[] b = bc.getBookCollection();
				for (int i = 0; i < bc.getNumberOfBooks(); i++) {
					textArea.setText(b[i].toString());
				}
				
			}
		});
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(254, 222, 190));
		btnNewButton.setBounds(599, 23, 85, 27);
		contentPane.add(btnNewButton);
		
		
	}
}
