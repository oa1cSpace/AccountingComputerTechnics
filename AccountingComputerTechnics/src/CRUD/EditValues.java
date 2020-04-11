package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import common.DBConnection;
import common.TechnicsBean;

public class EditValues {

	public TechnicsBean getValuesOfTechnic(String id) {
		
		//instance of DBConnection
		DBConnection objDBConnection = new DBConnection();
		// creating connection
		Connection connection = objDBConnection.get_connection();
		
		PreparedStatement  ps = null;
		ResultSet rs = null;
		
		TechnicsBean techBean = new TechnicsBean();
		
		try {
			String query = "SELECT * FROM technics WHERE id=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			while(rs.next()) {
			
				techBean.setId(rs.getString("id"));
				techBean.setName(rs.getString("name"));
				techBean.setComponents(rs.getString("components"));
				techBean.setSupplier(rs.getString("supplier"));
				techBean.setData_of_purchase(rs.getString("data_of_purchase"));
				techBean.setMoving(rs.getString("moving"));
				techBean.setExisting(rs.getString("existing"));
				techBean.setEmployee(rs.getNString("employee"));
				techBean.setState(rs.getString("state"));
				techBean.setRepair(rs.getString("repair"));
				techBean.setDescription(rs.getString("description"));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("EXEPTION: " + e);
		}
		return techBean;
		
	}

	
	
	
	
	
}
