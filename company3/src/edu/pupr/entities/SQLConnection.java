package edu.pupr.entities;
import java.io.Serializable;
import java.sql.*;


/**
 * @author Nathan Galarza 104586
 * 
 *This is the main connection used for almost every class. This is the main connector.
 */
public class SQLConnection{
Connection conn = null;
public static Connection dbConnector()
{
	try {
		
		
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","minicooper");
		
		return conn;
		
	
	}catch(Exception exc) {
		exc.printStackTrace();
		return null;
	}
}

}