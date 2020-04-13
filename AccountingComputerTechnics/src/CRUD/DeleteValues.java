package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.DBConnection;
import common.TechnicsBean;

public class DeleteValues {


	public void deleteValue(String id) {
		
		//instance of DBConnection
		DBConnection objDBConnection = new DBConnection();
		// creating connection
		Connection connection = objDBConnection.get_connection();
		
 		PreparedStatement  ps = null;
		
		
		try {
			String query = "DELETE FROM technics WHERE id=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("EXEPTION: " + e);
		}
	}

	
}
