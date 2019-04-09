package edu.pupr.entities;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Add_visitor extends JFrame {

	private JPanel contentPane;
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField Companytxt;
	private JTextField NumberID;
	private JTextField IDNumbertxt;
	private JLabel lblName;
	private JLabel lblLastName;
	private JLabel lblCompany;
	private JLabel lblId;
	private JLabel lblId_1;
	private JLabel lblStaffVisiting;
	private JLabel lblOffice;
	private JTextField Stafftxt;
	private JTextField OfficeTxt;
	private JLabel lblPhoto;
	private JTextField PictureTxtfield;
	private JLabel lblPicture;
	private JButton AttachBtn;
	private JTextField Timestarttxt;
	private JLabel lblTimeStamp;
	private JTextField Timeendtxt;
	private JLabel lblTimeStampend;

	/**
	 * Launch the application.
	 */
	public void displayvisitor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_visitor frame = new Add_visitor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JButton btnE;
	/**
	 * Create the frame.
	 */
	public Add_visitor() {
		setTitle("New visitor");
		connection = SQLConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 578);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		FirstName = new JTextField();
		FirstName.setColumns(10);
		
		LastName = new JTextField();
		LastName.setColumns(10);
		
		Companytxt = new JTextField();
		Companytxt.setColumns(10);
		
		NumberID = new JTextField();
		NumberID.setColumns(10);
		
		JButton btnInsert = new JButton("insert");
		btnInsert.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		btnInsert.setBackground(Color.MAGENTA);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				
					String Query = "insert into Visitors (ID,FirstName,Lastname,Company_from,Visitor_ID,Photo,Office_visiting,Staff_Visiting,date_begin,date_end) values (?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(Query); 
					pst.setString(1,  NumberID.getText() );
					pst.setString(2, FirstName.getText() );
					pst.setString(3, LastName.getText() );
					pst.setString(4, Companytxt.getText() );
					pst.setString(5, IDNumbertxt.getText() );
					pst.setString(6, PictureTxtfield.getText());
					pst.setString(7, OfficeTxt.getText() );
					pst.setString(8, Stafftxt.getText() );					
					pst.setString(9, Timestarttxt.getText());
					pst.setString(10, Timeendtxt.getText());
					pst.execute();
					 
					JOptionPane.showMessageDialog(null, "Data Saved!!!");
					pst.close();
					
					
				}catch(Exception ex) {
					
					ex.printStackTrace();
				}
				
				/*try {
					String query = "insert into Visitors (";
					mystm = connection.createStatement();
					ResultSet myRs = mystm.executeQuery("select * from Visitors");
					table.setModel(DbUtils.resultSetToTableModel(myRs));
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
			}
		});
		
		IDNumbertxt = new JTextField();
		IDNumbertxt.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				
				
				
				
			}
		});
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		lblCompany = new JLabel("Company:");
		lblCompany.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		lblId_1 = new JLabel("ID #");
		lblId_1.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		lblStaffVisiting = new JLabel("Staff Visiting:");
		lblStaffVisiting.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		lblOffice = new JLabel("Office #:");
		lblOffice.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		Stafftxt = new JTextField();
		Stafftxt.setColumns(10);
		
		OfficeTxt = new JTextField();
		OfficeTxt.setColumns(10);
		
		PictureTxtfield = new JTextField();
		PictureTxtfield.setColumns(10);
		
		lblPicture = new JLabel("Picture:");
		lblPicture.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		AttachBtn = new JButton("Attach");
		AttachBtn.setBackground(Color.MAGENTA);
		AttachBtn.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		AttachBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblPhoto.setIcon(new ImageIcon("C:\\Users\\Soe\\Desktop\\Visitors Pictures\\" + PictureTxtfield.getText()));
				
				/*lblPhoto.setIcon();PictureTxtfield.getText();
				
				lblPhoto.updateUI();
				
				*/
				
				
				
			}
		});
		
		Timestarttxt = new JTextField();
		Timestarttxt.setColumns(10);
		
		lblTimeStamp = new JLabel("Time stamp");
		lblTimeStamp.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		Timeendtxt = new JTextField();
		Timeendtxt.setColumns(10);
		
		lblTimeStampend = new JLabel("Time stamp (end)");
		lblTimeStampend.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		
		btnE = new JButton("Exit");
		btnE.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 13));
		btnE.setBackground(Color.MAGENTA);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(25)
								.addComponent(lblPicture, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(PictureTxtfield, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(AttachBtn))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblName)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(FirstName, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
														.addComponent(lblLastName)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(LastName, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
															.addGap(85))
														.addComponent(NumberID, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblId_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED, 111, GroupLayout.PREFERRED_SIZE))
														.addComponent(IDNumbertxt, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
														.addComponent(Companytxt, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
														.addComponent(Stafftxt, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblStaffVisiting, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
													.addGap(18))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(lblTimeStamp, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(Timestarttxt, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(Timeendtxt, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblTimeStampend, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))))
									.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblCompany, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(8)
										.addComponent(OfficeTxt, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnInsert, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addGap(32))
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblOffice, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 504, GroupLayout.PREFERRED_SIZE)))
					.addGap(47))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(50)
									.addComponent(lblId)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(NumberID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(lblName)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(FirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblLastName)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(LastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblCompany)
									.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPicture)
								.addComponent(PictureTxtfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(AttachBtn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(57))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(223)
							.addComponent(Companytxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblId_1)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(IDNumbertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblStaffVisiting)
							.addGap(5)
							.addComponent(Stafftxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOffice)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(17)
									.addComponent(lblTimeStamp)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(Timeendtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(Timestarttxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnInsert, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblTimeStampend))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(OfficeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)))
					.addGap(46))
		);
		
		lblPhoto = new JLabel("photo");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblPhoto, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblPhoto, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	

	}
	public void thequery(String query) {
		
		Connection con = null;
		Statement st = null;
		
		try {
			
			con = DriverManager.getConnection("jbdc:mysql://localhost:3306/company", "root","minicooper");
			st = con.createStatement();
			st.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Query Executed");
			
			
			
			
		}
		catch(Exception ex) {
			
			JOptionPane.showMessageDialog(null, "did not work");
		
		
	}
	}
}

	
