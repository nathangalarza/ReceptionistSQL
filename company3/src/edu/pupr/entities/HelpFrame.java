package edu.pupr.entities;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelpFrame extends JFrame {

	private JPanel contentPane;
	private JLabel Picture;
	private JTextPane Description;
	private JLabel lblAddVisitor;
	/**
	 * Launch the application.
	 */
	
	
	
	/**
	 * @param args
	 */
	public static void main (String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpFrame frame = new HelpFrame();
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
	public HelpFrame() {
		setTitle("Help");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 713);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAddVisitor = new JLabel("Add Visitor");
		lblAddVisitor.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 23));
		lblAddVisitor.setBounds(271, 46, 135, 53);
		contentPane.add(lblAddVisitor);
		
		JButton btnNewButton = new JButton("Add Visitor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblAddVisitor.setText("Add Visitor");
				Picture.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Help\\Add 2.PNG"));
				Description.setText("The Add visitor tab Adds a new visitor. Thats the main function. When all of the text fields are filled then we can press insert and update the query with new information.\r\n");
			
				
				
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMainGuiInfo = new JButton("Main GUI info");
		btnMainGuiInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAddVisitor.setText("Main GUI");
				Picture.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Help\\Capture.PNG"));
				Description.setText("The Main GUI has a Main table of the database. Once 'Load' is pressed, then the table will refresh with all of the items from the query on the top left we have the help menu that has (Add Visitor, Display Visitor, Modify Visitor, and Display visitor history) This makes the GUI the father of all the frames..\r\n");
				
			}
		});
		btnMainGuiInfo.setBackground(Color.MAGENTA);
		btnMainGuiInfo.setBounds(122, 11, 127, 23);
		contentPane.add(btnMainGuiInfo);
		
		JButton btnVisitorHistory = new JButton("Visitor History");
		btnVisitorHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblAddVisitor.setText("Visitor History");
				Picture.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Help\\Visitor hitory 2.PNG"));
				Description.setText("Visitor History Tab has a search function within the frame itself that uses the Visitors first name and last name with these inputs we can see the selected visitors history..\r\n");
				
			}
		});
		btnVisitorHistory.setBackground(Color.MAGENTA);
		btnVisitorHistory.setBounds(271, 11, 116, 23);
		contentPane.add(btnVisitorHistory);
		
		JButton btnModifyVisitor = new JButton("Modify Visitor");
		btnModifyVisitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAddVisitor.setText("Modify Visitor");
				Picture.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Help\\Modify 3.PNG"));
				Description.setText("The Modify Tab opens allows the user to modify visitors as they wish, If the Visitors info was Saved incorrectly we can fix that by using the modify tab. Once modified then we can press the Modify button so that the database updates accordingly..\r\n");
				
				
				
			}
		});
		btnModifyVisitor.setBackground(Color.MAGENTA);
		btnModifyVisitor.setBounds(410, 11, 116, 23);
		contentPane.add(btnModifyVisitor);
		
		JButton btnDisplayVisitor = new JButton("Display Visitor");
		btnDisplayVisitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblAddVisitor.setText("Display Visitor");
				Picture.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Help\\Display visitor with pic.PNG"));
				Description.setText("The Display visitor tab what it essentially does is search by name and last name with the purpose of opening a new frame that displays like the figure and also displays the picture of the user as shown in the figure..\r\n");
				
				
				
			}
		});
		btnDisplayVisitor.setBackground(Color.MAGENTA);
		btnDisplayVisitor.setBounds(537, 11, 116, 23);
		contentPane.add(btnDisplayVisitor);
		
		Picture = new JLabel("");
		Picture.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Help\\Add 2.PNG"));
		Picture.setBounds(10, 97, 643, 428);
		contentPane.add(Picture);
		
		Description = new JTextPane();
		Description.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 18));
		Description.setText("The Add visitor tab Adds a new visitor. Thats the main function. When all of the text fields are filled then we can press insert and update the query with new information.\r\n");
		Description.setBounds(128, 520, 431, 125);
		contentPane.add(Description);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnExit.setBackground(Color.MAGENTA);
		btnExit.setBounds(564, 640, 89, 23);
		contentPane.add(btnExit);
	}
}
