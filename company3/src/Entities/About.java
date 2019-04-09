package Entities;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setTitle("About\r\n");
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 257);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nathan Galarza");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 48));
		lblNewLabel.setBounds(62, 107, 323, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("104586");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 34));
		lblNewLabel_1.setBounds(160, 149, 114, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Visitor");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 31));
		lblNewLabel_2.setBounds(162, 46, 158, 47);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("Version 1.0  All rights Reserve");
		label.setForeground(UIManager.getColor("Tree.selectionBorderColor"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(104, 189, 235, 29);
		contentPane.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Soe\\Workplace\\company3\\src\\shutterstock_69907924-110x80.jpg"));
		lblNewLabel_3.setBounds(286, 21, 114, 81);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Soe\\Workplace\\company3\\src\\shutterstock_69907924-110x80.jpg"));
		label_1.setBounds(25, 21, 114, 81);
		contentPane.add(label_1);
	}

}
