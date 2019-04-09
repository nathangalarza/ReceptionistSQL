package edu.pupr.entities;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.Dispatch;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JTextField LogintextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
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
	public Login2() {
		setTitle("Login");
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 432);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		LogintextField = new JTextField();
		LogintextField.setBounds(270, 151, 146, 20);
		LogintextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(270, 208, 146, 17);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(270, 131, 85, 16);
		lblUsername.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 14));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(270, 182, 74, 15);
		lblPassword.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(278, 249, 153, 94);
		btnLogin.setBackground(Color.MAGENTA);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = LogintextField.getText();
				String passw = passwordField.getText();
				
				if(user.equals("Admin") && passw.equals("1234")) {
					
					GUI gui = new GUI();
					gui.displaygui();
					dispose();
					
					
					
				}
				
			}
		});
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 5, 225, 373);
		panel.setBackground(Color.MAGENTA);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 225, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 373, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		contentPane.add(panel);
		contentPane.add(lblUsername);
		contentPane.add(lblPassword);
		contentPane.add(passwordField);
		contentPane.add(LogintextField);
		contentPane.add(btnLogin);
	}
}
