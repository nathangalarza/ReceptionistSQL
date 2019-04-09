package Entities;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.border.LineBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import net.proteanit.sql.DbUtils;

import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Button;
import java.awt.Font;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public void displaygui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Visitors");
		connection = SQLConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 590);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmAddVisitor = new JMenuItem("Add Visitor");
		mntmAddVisitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_visitor visitor = new Add_visitor();
				visitor.setVisible(true);
				
				
				
				
			}
		});
		mnFile.add(mntmAddVisitor);
		
		JMenuItem mntmModifyVisitor = new JMenuItem("Modify Visitor");
		mntmModifyVisitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Modify = "modify";
				
				 SearchFrame search = new SearchFrame(Modify);
				 search.search(Modify);
				
				
				 
				
			}
		});
		mnFile.add(mntmModifyVisitor);
		
		JMenuItem mntmDisplayVisitor = new JMenuItem("Display visitor");
		mntmDisplayVisitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Modify = "display";
				
				 SearchFrame search = new SearchFrame(Modify);
				 search.search(Modify);
				
				
			}
		});
		mnFile.add(mntmDisplayVisitor);
		
		JMenuItem mntmVisitorHistory = new JMenuItem("Visitor History");
		mntmVisitorHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplayVisitorHistory hist = new DisplayVisitorHistory();
				hist.Display();
			}
		});
		mnFile.add(mntmVisitorHistory);
		
		JMenuItem menuItem_4 = new JMenuItem("Exit");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		mnFile.add(menuItem_4);
		
		JMenu mnHelp = new JMenu("help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About ab = new About();
				
				ab.setVisible(true);
				
			}
		});
		mnHelp.add(mntmAbout);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HelpFrame hlp = new HelpFrame();
				
				hlp.setVisible(true);
				
				
				
				
			}
		});
		mnHelp.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 32, 897, 437);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "Company", "Visitor ID", "photo", "Staff Name", "ID", "Office", "Date in", "Date out"
			}
		));
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
			
				Statement mystm;
				try {
					mystm = connection.createStatement();
					ResultSet myRs = mystm.executeQuery("select * from Visitors");
					table.setModel(DbUtils.resultSetToTableModel(myRs));
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}
		});
		btnLoad.setBounds(459, 480, 89, 23);
		contentPane.add(btnLoad);
		
		JLabel lblTodayReport = new JLabel("today report");
		lblTodayReport.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 18));
		lblTodayReport.setBounds(415, -2, 169, 23);
		contentPane.add(lblTodayReport);
	}
}
