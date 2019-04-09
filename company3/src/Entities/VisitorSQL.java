package Entities;

import java.lang.Object;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.ErrorManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;


import java.sql.*;


public class VisitorSQL {
	private EntityManagerFactory emfactory;
	private EntityManager entitymanager;

	public VisitorSQL() {
		try {
			Connection myConn=null;
			
			myConn=SQLConnection.dbConnector();
			emfactory = Persistence.createEntityManagerFactory("Visitors");
			entitymanager = emfactory.createEntityManager();
		} catch (PersistenceException persistenceException) {
			System.err.println("Error: " + persistenceException.getMessage());
			System.exit(1);
		}
	}

	public Visitor getID(int id) {
		Visitor visitor = entitymanager.find(Visitor.class, id);

		return visitor;
	}

	public Visitor findVisitor(String lastName, String firstName) {
		Query query = entitymanager.createNamedQuery("Visitor.findVisitor");

		query.setParameter("lastName", lastName);
		query.setParameter("firstName", firstName);
		Visitor visitor = (Visitor) query.getResultList().get(0);

		return visitor;
	}
	
	public List<Visitor> getAll() {
		Query query = entitymanager.createNamedQuery("Visitor.findAll");

		List<Visitor> visitors = (List<Visitor>) query.getResultList();

		return visitors;
	}
	
	public List<Visitor> getTodayList() {
		Query query = entitymanager.createNamedQuery("Visitor.findTodayList");

		List<Visitor> visitors = query.getResultList();

		return visitors;
	}
	
	public void add(String companyFrom, Timestamp dateBegin, Timestamp dateEnd, String firstName,
			String lastName, String officeVisiting, String photo, String staffVisiting, String visitorID) {
		Visitor visitor = new Visitor(companyFrom, dateBegin, dateEnd, firstName, lastName, officeVisiting, photo, staffVisiting, visitorID);
		
		//ErrorManager.getTransaction().begin();
		entitymanager.persist(visitor);
		entitymanager.getTransaction().commit( );

	}

	public void update(Visitor visitor) {
		entitymanager.getTransaction().begin();
		entitymanager.merge(visitor);
		entitymanager.getTransaction().commit();
	}
	
	public void update(int id, String companyFrom, Timestamp dateBegin, Timestamp dateEnd, String firstName,
			String lastName, String officeVisiting, String photo, String staffVisiting, String visitorID) {
		update(new Visitor(companyFrom, dateBegin, dateEnd, firstName, lastName, officeVisiting, photo, staffVisiting, visitorID));
	}

	public void disconnect() {
		entitymanager.close();
		emfactory.close();
	}

}
