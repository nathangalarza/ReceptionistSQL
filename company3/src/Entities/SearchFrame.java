package Entities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.sql.*;
public class SearchFrame extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField entersearch;
	 private JTextField Lastnamesrch;
	   static final String DATABASE_URL = "jdbc:mysql://localhost:3306/company";
	   
	 
	      Connection connection = null; // manages connection
	      Statement statement = null; // query statement
	      PreparedStatement ps = null;
	      ResultSet rs = null; // manages results
	      private JButton searchButton;
	      private JLabel lblEnterVisitorLast;
	     

	/**
	 * Launch the application.
	 * @param selected variable that is chosen between visitor display or modify visitor
	 * 
	 */
	public void search(String selected) {
		try {
			SearchFrame dialog = new SearchFrame(selected);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public class Fuction {
		
		
		
		 public ResultSet find(String s ,String s2) {
			 try {
				 connection = SQLConnection.dbConnector();
					 ps = connection.prepareStatement("SELECT * FROM visitors  where LastName=?");
					 ps.setString(1, entersearch.getText());
					 ps.setString(1, Lastnamesrch.getText());
					rs = ps.executeQuery();
			 }catch( Exception ex) {
				 JOptionPane.showMessageDialog(null,ex.getMessage());
			 }
			 
			 return rs;
		 }
		
	
	}
	  
	  /**
	   * 
	   * @param selected 
	   *an if statements decides whether the modify or the visitor display is called.
	   *
	   */
	  
	public SearchFrame(String selected) {
		setTitle("Search");
		setBounds(100, 100, 467, 167);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		entersearch = new JTextField();
		entersearch.setBounds(157, 31, 187, 20);
		entersearch.setColumns(10);
	
		
		JLabel Filter = new JLabel("Enter visitor Name");
		Filter.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 13));
		Filter.setForeground(Color.DARK_GRAY);
		Filter.setBounds(11, 33, 136, 14);
		
			searchButton = new JButton("Search");
			searchButton.setBackground(Color.MAGENTA);
			searchButton.setBounds(354, 30, 87, 64);
			searchButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					   
						String enter = entersearch.getText();
						String enter2 = Lastnamesrch.getText();
						
						Fuction f = new Fuction();
						
						ResultSet rs = null;
						rs = f.find(enter, enter2);
						try {
							
							if(rs.next()) {
								
								{
									if(selected.equalsIgnoreCase("modify")) {
									setVisible(false);
									ModifyVisitorFrame modify = new ModifyVisitorFrame(rs);
									modify.ModifyDisplay(rs);
									}
									else if (selected.equalsIgnoreCase("display")) {
										setVisible(false);
										DisplayVisitor visitor = new DisplayVisitor(rs);
										visitor.display(rs);
										
									
										
										
									}
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "No Data");
							}
							
						}catch(Exception ex) {
							JOptionPane.showMessageDialog(null, ex.getMessage());
						}
					
				}
		
	});
			searchButton.setActionCommand("OK");
			getRootPane().setDefaultButton(searchButton);
		contentPanel.setLayout(null);
		contentPanel.add(Filter);
		contentPanel.add(entersearch);
		contentPanel.add(searchButton);
		
		Lastnamesrch = new JTextField();
		Lastnamesrch.setColumns(10);
		Lastnamesrch.setBounds(157, 78, 187, 20);
		contentPanel.add(Lastnamesrch);
		
		lblEnterVisitorLast = new JLabel("Enter visitor Last Name");
		lblEnterVisitorLast.setForeground(Color.DARK_GRAY);
		lblEnterVisitorLast.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 13));
		lblEnterVisitorLast.setBounds(11, 80, 166, 14);
		contentPanel.add(lblEnterVisitorLast);
	}

}