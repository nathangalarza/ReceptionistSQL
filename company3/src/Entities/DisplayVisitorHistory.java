package Entities;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;

public class DisplayVisitorHistory extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField FirstNametxt;
	private JTextField LastNametextField;
	 Connection connection = null; // manages connection
     Statement statement = null; // query statement
     PreparedStatement ps = null;
     ResultSet rs = null; // manages results

	/**
	 * Launch the application.
	 */
	public void Display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayVisitorHistory frame = new DisplayVisitorHistory();
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
	public DisplayVisitorHistory() {
		setTitle("Visitor History ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 547);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 802, 362);
		
		FirstNametxt = new JTextField();
		FirstNametxt.setBounds(15, 51, 120, 19);
		FirstNametxt.setColumns(10);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(185, 51, 120, 19);
		LastNametextField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(697, 39, 112, 44);
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection = null;
				connection =SQLConnection.dbConnector();
				
				/*ID.setText(rs.getString("id"));
				FirstName.setText(rs.getString(fn));
				LastName.setText(rs.getString(ln));
				Companytxt.setText(rs.getString(comp));
				IDNumber.setText(rs.getString(VistID));
			//	lblFoto.setText(rs.getString(Pic));
				StaffVisiting.setText(rs.getString(Staff));
				OfficeVisiting.setText(rs.getString(office));
				DateBegintxt.setText(rs.getString(DateB));
				DateEndtxt.setText(rs.getString(DateE));
				*/
				try {
					
					
					String src = FirstNametxt.getText();
					String src2 = LastNametextField.getText();
					SearchFrame srch = new SearchFrame(src);
					 connection = SQLConnection.dbConnector();
					 ps = connection.prepareStatement("SELECT * FROM visitors  where LastName=?");
					 ps.setString(1, src);
					 ps.setString(1, src2);
					 
					rs = ps.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Enter first Name");
		lblNewLabel.setBounds(15, 5, 77, 15);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		JLabel lblEnterLastName = new JLabel("Enter Last Name");
		lblEnterLastName.setBounds(185, 5, 107, 15);
		lblEnterLastName.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Staff visiting", "office", "photo", "sign out", "date begin", "visitor id", "company", "id", "last Name"
			}
		));
		scrollPane.setColumnHeaderView(table);
		contentPane.add(scrollPane);
		contentPane.add(FirstNametxt);
		contentPane.add(lblNewLabel);
		contentPane.add(LastNametextField);
		contentPane.add(btnNewButton);
		contentPane.add(lblEnterLastName);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(94, 81, 77, 15);
		lblFirstName.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(179, 81, 77, 15);
		lblLastName.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblLastName);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setBounds(256, 81, 77, 15);
		lblCompany.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblCompany);
		
		JLabel lblVisitorId = new JLabel("Visitor ID");
		lblVisitorId.setBounds(320, 81, 77, 15);
		lblVisitorId.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblVisitorId);
		
		JLabel lblPhoto = new JLabel("Photo");
		lblPhoto.setBounds(399, 81, 77, 15);
		lblPhoto.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblPhoto);
		
		JLabel lblStaffVisiting = new JLabel("Staff visiting");
		lblStaffVisiting.setBounds(467, 81, 77, 15);
		lblStaffVisiting.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblStaffVisiting);
		
		JLabel lblOffice = new JLabel("Office ");
		lblOffice.setBounds(570, 81, 77, 15);
		lblOffice.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblOffice);
		
		JLabel lblSignIn = new JLabel("Sign in ");
		lblSignIn.setBounds(643, 81, 77, 15);
		lblSignIn.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblSignIn);
		
		JLabel lblSignOut = new JLabel("Sign out");
		lblSignOut.setBounds(735, 81, 77, 15);
		lblSignOut.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(lblSignOut);
		
		JLabel label = new JLabel("#");
		label.setBounds(15, 81, 77, 15);
		label.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(256, 456, 112, 41);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		contentPane.add(btnNewButton_1);
	}
}
