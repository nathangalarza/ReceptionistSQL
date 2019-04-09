package Entities;


import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the visitors database table.
 * 
 */
@Entity
@Table(name="visitors")
@NamedQueries({
	@NamedQuery(name="Visitor.findAll", query="SELECT v FROM Visitor v"),
	@NamedQuery(name="Visitor.findVisitor", query="SELECT v FROM Visitor v "
			                                    + " where v.lastName = :lastName"
			                                    + "   and v.firstName = :firstName"),
	@NamedQuery(name="Visitor.findTodayList", query="SELECT v FROM Visitor v "
			                                      + " where function('date', CURRENT_TIMESTAMP) = function('date', v.dateBegin)")
})
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