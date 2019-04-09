package edu.pupr.entities;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DisplayVisitor extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField FirstNametxt;
	private JTextField LastNametxt;
	private JTextField Companytxt;
	private JTextField Visitortxt;
	private JTextField Visitingtxt;
	private JTextField officetxt;
	private JTextField Timeintxt;
	private JTextField Timeouttxt;

	/**
	 * Launch the application.
	 */
	public  void display(ResultSet rs) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayVisitor frame = new DisplayVisitor(rs);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param rs 
	 */
	public DisplayVisitor(ResultSet rs) {
		setTitle("View Visitor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 368);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID");
		label.setBounds(27, 48, 11, 14);
		contentPane.add(label);
		
		id = new JTextField();
		id.setHorizontalAlignment(SwingConstants.LEFT);
		id.setForeground(Color.BLACK);
		id.setColumns(10);
		id.setBorder(null);
		id.setBackground(Color.WHITE);
		id.setBounds(127, 48, 90, 14);
		contentPane.add(id);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(27, 73, 90, 14);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(27, 98, 90, 14);
		contentPane.add(lblLastName);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setBounds(27, 120, 90, 14);
		contentPane.add(lblCompany);
		
		JLabel lblVisitorId = new JLabel("Visitor ID");
		lblVisitorId.setBounds(27, 145, 90, 14);
		contentPane.add(lblVisitorId);
		
		JLabel lblVisiting = new JLabel("Visiting");
		lblVisiting.setBounds(27, 169, 90, 14);
		contentPane.add(lblVisiting);
		
		JLabel lblOffice = new JLabel("Office");
		lblOffice.setBounds(27, 194, 90, 14);
		contentPane.add(lblOffice);
		
		JLabel lblTimeIn = new JLabel("Time in ");
		lblTimeIn.setBounds(27, 219, 90, 14);
		contentPane.add(lblTimeIn);
		
		JLabel lblTimeOut = new JLabel("Time out ");
		lblTimeOut.setBounds(27, 246, 90, 14);
		contentPane.add(lblTimeOut);
		
		FirstNametxt = new JTextField();
		FirstNametxt.setHorizontalAlignment(SwingConstants.LEFT);
		FirstNametxt.setForeground(Color.BLACK);
		FirstNametxt.setColumns(10);
		FirstNametxt.setBorder(null);
		FirstNametxt.setBackground(Color.WHITE);
		FirstNametxt.setBounds(127, 73, 90, 14);
		contentPane.add(FirstNametxt);
		
		LastNametxt = new JTextField();
		LastNametxt.setHorizontalAlignment(SwingConstants.LEFT);
		LastNametxt.setForeground(Color.BLACK);
		LastNametxt.setColumns(10);
		LastNametxt.setBorder(null);
		LastNametxt.setBackground(Color.WHITE);
		LastNametxt.setBounds(127, 95, 90, 14);
		contentPane.add(LastNametxt);
		
		Companytxt = new JTextField();
		Companytxt.setHorizontalAlignment(SwingConstants.LEFT);
		Companytxt.setForeground(Color.BLACK);
		Companytxt.setColumns(10);
		Companytxt.setBorder(null);
		Companytxt.setBackground(Color.WHITE);
		Companytxt.setBounds(127, 117, 90, 14);
		contentPane.add(Companytxt);
		
		Visitortxt = new JTextField();
		Visitortxt.setHorizontalAlignment(SwingConstants.LEFT);
		Visitortxt.setForeground(Color.BLACK);
		Visitortxt.setColumns(10);
		Visitortxt.setBorder(null);
		Visitortxt.setBackground(Color.WHITE);
		Visitortxt.setBounds(127, 142, 90, 14);
		contentPane.add(Visitortxt);
		
		Visitingtxt = new JTextField();
		Visitingtxt.setHorizontalAlignment(SwingConstants.LEFT);
		Visitingtxt.setForeground(Color.BLACK);
		Visitingtxt.setColumns(10);
		Visitingtxt.setBorder(null);
		Visitingtxt.setBackground(Color.WHITE);
		Visitingtxt.setBounds(127, 166, 90, 14);
		contentPane.add(Visitingtxt);
		
		officetxt = new JTextField();
		officetxt.setHorizontalAlignment(SwingConstants.LEFT);
		officetxt.setForeground(Color.BLACK);
		officetxt.setColumns(10);
		officetxt.setBorder(null);
		officetxt.setBackground(Color.WHITE);
		officetxt.setBounds(127, 194, 90, 14);
		contentPane.add(officetxt);
		
		Timeintxt = new JTextField();
		Timeintxt.setHorizontalAlignment(SwingConstants.LEFT);
		Timeintxt.setForeground(Color.BLACK);
		Timeintxt.setColumns(10);
		Timeintxt.setBorder(null);
		Timeintxt.setBackground(Color.WHITE);
		Timeintxt.setBounds(127, 216, 116, 14);
		contentPane.add(Timeintxt);
		
		Timeouttxt = new JTextField();
		Timeouttxt.setHorizontalAlignment(SwingConstants.LEFT);
		Timeouttxt.setForeground(Color.BLACK);
		Timeouttxt.setColumns(10);
		Timeouttxt.setBorder(null);
		Timeouttxt.setBackground(Color.WHITE);
		Timeouttxt.setBounds(127, 246, 127, 14);
		contentPane.add(Timeouttxt);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.MAGENTA);
		separator.setBounds(124, 62, 93, 8);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.MAGENTA);
		separator_1.setBounds(124, 90, 96, 8);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.MAGENTA);
		separator_2.setBounds(124, 110, 93, 8);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.MAGENTA);
		separator_3.setBounds(127, 135, 90, 8);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.MAGENTA);
		separator_4.setBounds(127, 161, 90, 8);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBackground(Color.MAGENTA);
		separator_5.setBounds(127, 180, 90, 8);
		contentPane.add(separator_5);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBackground(Color.MAGENTA);
		separator_7.setBounds(127, 263, 90, 8);
		contentPane.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setBackground(Color.MAGENTA);
		separator_8.setBounds(127, 210, 90, 8);
		contentPane.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.BLACK);
		separator_9.setBackground(Color.MAGENTA);
		separator_9.setBounds(127, 234, 90, 8);
		contentPane.add(separator_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(264, 48, 221, 217);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel Photolbl = new JLabel("New label");
		Photolbl.setBounds(10, 11, 201, 195);
		panel.add(Photolbl);
		String fn = "FirstName";
		String ln = "LastName";
		String comp = "Company_from";
		String VistID = "Visitor_ID";
		String Pic = "Photo";
		String Staff = "Staff_visiting";
		String office = "Office_visiting";
		String DateB = "date_begin";
		String DateE = "date_begin";
		
		try {
			id.setText(rs.getString("id"));
			FirstNametxt.setText(rs.getString(fn));
			LastNametxt.setText(rs.getString(ln));
			Companytxt.setText(rs.getString(comp));
			Visitortxt.setText(rs.getString(VistID));
//	lblFoto.setText(rs.getString(Pic));
			Visitingtxt.setText(rs.getString(Staff));
			officetxt.setText(rs.getString(office));
			Timeintxt.setText(rs.getString(DateB));
			Timeouttxt.setText(rs.getString(DateE));
			Photolbl.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Visitors Pictures\\" + (rs.getString(Pic))));
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				
				
				
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(274, 276, 197, 41);
		contentPane.add(btnNewButton);
	}
}
