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

public void editTechnic(TechnicsBean techBean) {
		
		//instance of DBConnection
		DBConnection objDBConnection = new DBConnection();
		// creating connection
		Connection connection = objDBConnection.get_connection();
		
		PreparedStatement  ps = null;
		ResultSet rs = null;
		
		try {
			String query = "UPDATE technics "
						+ "SET name=?,components=?,supplier=?,data_of_purchase=?,moving=?,existing=?,employee=?,state=?,repair=?,description=? "
						+ "WHERE id=?";
			
			ps=connection.prepareStatement(query);
			
			ps.setString(1, techBean.getName());
			ps.setString(2, techBean.getComponents());
			ps.setString(3, techBean.getSupplier());
			ps.setString(4, techBean.getData_of_purchase());
			ps.setString(5, techBean.getMoving());
			ps.setString(6, techBean.getExisting());
			ps.setString(7, techBean.getEmployee());
			ps.setString(8, techBean.getState());
			ps.setString(9, techBean.getRepair());
			ps.setString(10, techBean.getDescription());
			ps.setString(11, techBean.getId());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("EXEPTION: " + e);
		}
		
	}
	
	
}
