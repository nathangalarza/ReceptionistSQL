package Entities;

import java.io.Serializable;
import java.sql.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author Nathan Galarza
 * 
 * This is a test connection class
 *
 */
public class SQLConnection2{
Connection conn = null;
public static void main(String[] args)
{
	try {
		
		
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Minicooper2010");
		
		Statement mystm = conn.createStatement();
		
	ResultSet myRs = mystm.executeQuery("select * from Visitors");
			while (myRs.next()) {
				System.out.println(myRs.getString("FirstName")+ ", " +myRs.getString("LastName") + ", " +myRs.getString("Company_From") + "," + myRs.getString("Visitor_ID")+ "," +
			myRs.getString("Photo")+ "," + myRs.getString("Staff_visiting")+ "," + myRs.getString("Office_visiting")+ "," 
						+ myRs.getString("date_begin")+ "," + myRs.getString("date_end"));
				
				
				
				
			}
	
	}catch(Exception exc) {
		exc.printStackTrace();
		
	}
}
public class Visitor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="company_from")
	private String companyFrom;

	@Column(name="date_begin")
	private Timestamp dateBegin;

	@Column(name="date_end")
	private Timestamp dateEnd;

	private String firstName;
	private String lastName;

	@Column(name="office_visiting")
	private String officeVisiting;

	private String photo;

	@Column(name="staff_visiting")
	private String staffVisiting;

	@Column(name="visitor_ID")
	private String visitorID;

	public Visitor() {
	}

	public Visitor(int id, String companyFrom, Timestamp dateBegin, Timestamp dateEnd, String firstName,
			String lastName, String officeVisiting, String photo, String staffVisiting, String visitorID) {
		this.id = id;
		this.companyFrom = companyFrom;
		this.dateBegin = dateBegin;
		this.dateEnd = dateEnd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeVisiting = officeVisiting;
		this.photo = photo;
		this.staffVisiting = staffVisiting;
		this.visitorID = visitorID;
	}

	public Visitor(String companyFrom, Timestamp dateBegin, Timestamp dateEnd, String firstName,
			String lastName, String officeVisiting, String photo, String staffVisiting, String visitorID) {
		this.companyFrom = companyFrom;
		this.dateBegin = dateBegin;
		this.dateEnd = dateEnd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeVisiting = officeVisiting;
		this.photo = photo;
		this.staffVisiting = staffVisiting;
		this.visitorID = visitorID;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyFrom() {
		return this.companyFrom;
	}

	public void setCompanyFrom(String companyFrom) {
		this.companyFrom = companyFrom;
	}

	public Timestamp getDateBegin() {
		return this.dateBegin;
	}

	public void setDateBegin(Timestamp dateBegin) {
		this.dateBegin = dateBegin;
	}

	public Timestamp getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Timestamp dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOfficeVisiting() {
		return this.officeVisiting;
	}

	public void setOfficeVisiting(String officeVisiting) {
		this.officeVisiting = officeVisiting;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getStaffVisiting() {
		return this.staffVisiting;
	}

	public void setStaffVisiting(String staffVisiting) {
		this.staffVisiting = staffVisiting;
	}

	public String getVisitorID() {
		return this.visitorID;
	}

	public void setVisitorID(String visitorID) {
		this.visitorID = visitorID;
	}

	@Override
	public String toString() {
		return "Visitor [id=" + id + ", companyFrom=" + companyFrom + ", dateBegin=" + dateBegin + ", dateEnd="
				+ dateEnd + ", firstName=" + firstName + ", lastName=" + lastName + ", officeVisiting=" + officeVisiting
				+ ", photo=" + photo + ", staffVisiting=" + staffVisiting + ", visitorID=" + visitorID + "]";
	}
}
}