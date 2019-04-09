package Entities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyVisitorFrame extends JFrame {
	private String idnum;
	private String fName;
	private String LastName1;
	private String company2;
	private String Visitorid1;
	private String Photo2;
	private String staff;
	private String officev;
	private String	datebeg;
	private String	dateend;
	
	private JPanel contentPane;
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField Companytxt;
	private JTextField IDNumber;
	private JTextField StaffVisiting;
	private JTextField OfficeVisiting;
	private JTextField DateBegintxt;
	private JTextField DateEndtxt;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JTextField ID;
	private JTextField Imagesettxt;
	private JLabel lblName;
	private JLabel label;
	private JLabel lblLastName;
	private JLabel lblCompany;
	private JLabel lblVisitorId;
	private JLabel lblVisiting;
	private JLabel lblOffice;
	private JLabel lblTimeEntered;
	private JLabel label_1;
	private JLabel lblPicture;

	/**
	 * Launch the application.
	 */
	/**
	 * Calls the frame
	 */
	public void ModifyDisplay(ResultSet rs) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyVisitorFrame frame = new ModifyVisitorFrame(rs);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 ** 
	 */
	
	/**
	 * Creates the connection with the resultset
	 */
	public ModifyVisitorFrame(ResultSet rs) throws SQLException {
		setTitle("Modifying Visitor");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 554, 394);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		FirstName = new JTextField();
		FirstName.setBounds(146, 48, 429, 14);
		FirstName.setBorder(null);
		FirstName.setForeground(Color.BLACK);
		FirstName.setText("Name");
		FirstName.setHorizontalAlignment(SwingConstants.LEFT);
		FirstName.setBackground(Color.WHITE);
		FirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				FirstName.selectAll();
				separator.setForeground(Color.RED);
				separator.setBackground(Color.RED);
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator.setForeground(Color.BLACK);
				separator.setBackground(Color.BLACK);
			}
		});
		FirstName.setColumns(10);
		
		LastName = new JTextField();
		LastName.setBounds(146, 80, 173, 14);
		LastName.setBorder(null);
		LastName.setText("Last Name");
		LastName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				LastName.selectAll();
				separator_1.setForeground(Color.RED);
				separator_1.setBackground(Color.RED);
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator_1.setForeground(Color.BLACK);
				separator_1.setBackground(Color.BLACK);
			}
		});
		LastName.setColumns(10);
		
		Companytxt = new JTextField();
		Companytxt.setBounds(141, 116, 80, 14);
		Companytxt.setBorder(null);
		Companytxt.setText("Company");
		Companytxt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Companytxt.selectAll();
				separator_2.setForeground(Color.RED);
				separator_2.setBackground(Color.RED);
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator_2.setForeground(Color.BLACK);
				separator_2.setBackground(Color.BLACK);
			}
		});
		Companytxt.setColumns(10);
		
		IDNumber = new JTextField();
		IDNumber.setBounds(141, 150, 80, 14);
		IDNumber.setBorder(null);
		IDNumber.setText("Visitor ID");
		IDNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				IDNumber.selectAll();
				separator_3.setForeground(Color.RED);
				separator_3.setBackground(Color.RED);
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator_3.setForeground(Color.BLACK);
				separator_3.setBackground(Color.BLACK);
			}
		});
		IDNumber.setColumns(10);
		
		StaffVisiting = new JTextField();
		StaffVisiting.setBounds(141, 184, 80, 14);
		StaffVisiting.setBorder(null);
		StaffVisiting.setText("Staff");
		StaffVisiting.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				StaffVisiting.selectAll();
				separator_4.setForeground(Color.RED);
				separator_4.setBackground(Color.RED);
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator_4.setForeground(Color.BLACK);
				separator_4.setBackground(Color.BLACK);
			}
		});
		StaffVisiting.setColumns(10);
		
		OfficeVisiting = new JTextField();
		OfficeVisiting.setBounds(141, 218, 80, 14);
		OfficeVisiting.setBorder(null);
		OfficeVisiting.setText("office");
		OfficeVisiting.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				OfficeVisiting.selectAll();
				separator_5.setForeground(Color.RED);
				separator_5.setBackground(Color.RED);
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator_5.setForeground(Color.BLACK);
				separator_5.setBackground(Color.BLACK);
			}
		});
		OfficeVisiting.setColumns(10);
		
		DateBegintxt = new JTextField();
		DateBegintxt.setBounds(141, 252, 178, 14);
		DateBegintxt.setBorder(null);
		DateBegintxt.setText("Time in ");
		DateBegintxt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				DateBegintxt.selectAll();
				separator_6.setForeground(Color.RED);
				separator_6.setBackground(Color.RED);
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator_6.setForeground(Color.BLACK);
				separator_6.setBackground(Color.BLACK);
			}
		});
		DateBegintxt.setColumns(10);
		
		DateEndtxt = new JTextField();
		DateEndtxt.setBounds(141, 286, 178, 14);
		DateEndtxt.setBorder(null);
		DateEndtxt.setText("time out");
		DateEndtxt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				DateEndtxt.selectAll();
				separator_7.setForeground(Color.RED);
				separator_7.setBackground(Color.RED);
			}
			@Override
			public void focusLost(FocusEvent e) {
				separator_7.setForeground(Color.BLACK);
				separator_7.setBackground(Color.BLACK);
			}
		});
		DateEndtxt.setColumns(10);
		
		JButton btnAdd = new JButton("Modify");
		btnAdd.setBounds(384, 150, 94, 73);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					idnum = ID.getText();
					 fName =FirstName.getText();
					LastName1 = LastName.getText();
					 company2 = Companytxt.getText();
					Visitorid1 = IDNumber.getText();
					Photo2 =Imagesettxt.getText();
					staff =StaffVisiting.getText();
					officev =OfficeVisiting.getText();
					datebeg =DateBegintxt.getText();
					dateend =DateEndtxt.getText();
					
//	String sql = "Update Visitors set FirstName='"+newFirstName.getText()+"', LastName='"+newLastName.getText()+"',Company_from='"+newCompFrom.getText()+"',Visitor_ID='"+newID.getText()+"',Staff_visiting='"+newStaffVisiting.getText()+"',Office_visiting='"+newOfficeVisiting.getText()+"',Visitor_Photo='"+Oldphoto.getText()+"' where FirstName='"+newFirstName.getText()+"' ";
					
					Connection connection = null;
					connection = SQLConnection.dbConnector();
					
//	String search = rs.getString("FirstName");

					String query = "Update visitors set id='"+idnum+"',FirstName='"+fName+"', LastName='"+LastName1+"',Company_from='"+company2+"',Visitor_ID='"+Visitorid1+
							"',Photo='" +Photo2+ "',Staff_visiting='"+staff+"',Office_visiting='"+officev+"',date_begin='"+datebeg+
							"',date_end='"+dateend+ "'where id='" +idnum+"' ";

					

					
					PreparedStatement st = connection.prepareStatement(query);
					
					st.execute();
setVisible(false);

GUI music = new GUI();
music.setVisible(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnAdd.setBackground(Color.MAGENTA);

		separator = new JSeparator();
		separator.setBounds(94, 68, 244, 8);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.MAGENTA);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(94, 102, 243, 8);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.MAGENTA);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(94, 136, 243, 8);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.MAGENTA);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(94, 170, 243, 8);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.MAGENTA);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(94, 204, 243, 8);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.MAGENTA);
		
		separator_5 = new JSeparator();
		separator_5.setBounds(94, 238, 243, 8);
		separator_5.setForeground(Color.BLACK);
		separator_5.setBackground(Color.MAGENTA);
		
		separator_6 = new JSeparator();
		separator_6.setBounds(94, 272, 243, 8);
		separator_6.setForeground(Color.BLACK);
		separator_6.setBackground(Color.MAGENTA);
		
		separator_7 = new JSeparator();
		separator_7.setBounds(94, 306, 243, 8);
		separator_7.setForeground(Color.BLACK);
		separator_7.setBackground(Color.MAGENTA);
		

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int JframeWidth = this.getSize(). width;
		int JframeHeight = this.getSize().height;
		
		int locationX = (dim.width - JframeWidth)/2;
		int locationY = (dim.height - JframeHeight)/2;
		this.setLocation(locationX,locationY);
		
		ID = new JTextField();
		ID.setBounds(140, 16, 323, 14);
		ID.setText("ID ");
		ID.setHorizontalAlignment(SwingConstants.LEFT);
		ID.setForeground(Color.BLACK);
		ID.setColumns(10);
		ID.setBorder(null);
		ID.setBackground(Color.WHITE);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(94, 29, 244, 8);
		separator_8.setForeground(Color.BLACK);
		separator_8.setBackground(Color.MAGENTA);
		
		Imagesettxt = new JTextField();
		Imagesettxt.setBounds(140, 320, 179, 14);
		Imagesettxt.setText("<null>");
		Imagesettxt.setColumns(10);
		Imagesettxt.setBorder(null);
		
		lblName = new JLabel("ID");
		lblName.setBounds(15, 16, 11, 14);
		
		label = new JLabel("Name");
		label.setBounds(15, 48, 63, 14);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(15, 80, 63, 14);
		
		lblCompany = new JLabel("Company");
		lblCompany.setBounds(15, 116, 80, 14);
		
		lblVisitorId = new JLabel("Visitor ID");
		lblVisitorId.setBounds(15, 150, 63, 14);
		
		lblVisiting = new JLabel("Visiting");
		lblVisiting.setBounds(15, 184, 80, 14);
		
		lblOffice = new JLabel("Office #");
		lblOffice.setBounds(15, 218, 80, 14);
		
		lblTimeEntered = new JLabel("Time entered");
		lblTimeEntered.setBounds(15, 252, 80, 14);
		
		label_1 = new JLabel("Time entered");
		label_1.setBounds(15, 286, 80, 14);
		
		lblPicture = new JLabel("Picture");
		lblPicture.setBounds(15, 320, 70, 14);
		String fn = "FirstName";
		String ln = "LastName";
		String comp = "Company_from";
		String VistID = "Visitor_ID";
		String Pic = "Photo";
		String Staff = "Staff_visiting";
		String office = "Office_visiting";
		String DateB = "date_begin";
		String DateE = "date_begin";
		
		ID.setText(rs.getString("id"));
		FirstName.setText(rs.getString(fn));
		LastName.setText(rs.getString(ln));
		Companytxt.setText(rs.getString(comp));
		IDNumber.setText(rs.getString(VistID));
	//	lblFoto.setText(rs.getString(Pic));
		StaffVisiting.setText(rs.getString(Staff));
		OfficeVisiting.setText(rs.getString(office));
		DateBegintxt.setText(rs.getString(DateB));
		DateEndtxt.setText(rs.getString(DateE));
		Imagesettxt.setText(rs.getString(Pic));
		
		
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(lblLastName);
		contentPane.add(lblCompany);
		contentPane.add(lblVisitorId);
		contentPane.add(lblVisiting);
		contentPane.add(lblOffice);
		contentPane.add(lblTimeEntered);
		contentPane.add(lblPicture);
		contentPane.add(label_1);
		contentPane.add(lblName);
		contentPane.add(separator_8);
		contentPane.add(ID);
		contentPane.add(FirstName);
		contentPane.add(LastName);
		contentPane.add(separator);
		contentPane.add(separator_7);
		contentPane.add(Companytxt);
		contentPane.add(separator_1);
		contentPane.add(DateBegintxt);
		contentPane.add(separator_5);
		contentPane.add(OfficeVisiting);
		contentPane.add(separator_4);
		contentPane.add(separator_2);
		contentPane.add(separator_3);
		contentPane.add(IDNumber);
		contentPane.add(StaffVisiting);
		contentPane.add(separator_6);
		contentPane.add(DateEndtxt);
		contentPane.add(btnAdd);
		contentPane.add(Imagesettxt);
		
		
	}
}