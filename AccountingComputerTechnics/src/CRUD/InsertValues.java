package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DBConnection;

public class InsertValues {

	// create method for INSERT 
	public void insertValues(String name, String components, String supplier, String data_of_purchase, String moving, String existing, String employee, String state, String repair, String description) {
		
		//instance of DBConnection
		DBConnection objDBConnection = new DBConnection();
		
		// creating connection
		Connection connection = objDBConnection.get_connection();
		
		PreparedStatement ps = null;
		
		try {
			// creating INSERT request into DB
			String query = "INSERT INTO technics(name, components, supplier, data_of_purchase, moving, existing, employee, state, repair, description)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
			
			ps = connection.prepareStatement(query);
			
			ps.setString(1, name);
			ps.setString(2, components);
			ps.setString(3, supplier);
			ps.setString(4, data_of_purchase);
			ps.setString(5, moving);
			ps.setString(6, existing);
			ps.setString(7, employee);
			ps.setString(8, state);
			ps.setString(9, repair);
			ps.setString(10, description);
			
			
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("EXEPTION: " + e);
		}
		
		
	}
}
