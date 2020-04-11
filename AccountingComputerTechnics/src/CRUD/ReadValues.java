package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import common.DBConnection;
import common.TechnicsBean;


public class ReadValues {

	public static void main(String[] args) {
		ReadValues read = new ReadValues();
		read.getValues();
	}
	
	public List<TechnicsBean> getValues() {
		
		//instance of DBConnection
		DBConnection objDBConnection = new DBConnection();
		// creating connection
		Connection connection = objDBConnection.get_connection();
		
		PreparedStatement  ps = null;
		ResultSet rs = null;
		
		List<TechnicsBean> list = new ArrayList<TechnicsBean>();
		
		try {
			String query = "SELECT * FROM technics";
			ps=connection.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				TechnicsBean techBean = new TechnicsBean();
				
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("components"));
				System.out.println(rs.getString("supplier"));
				System.out.println(rs.getString("data_of_purchase"));
				System.out.println(rs.getString("moving"));
				System.out.println(rs.getString("existing"));
				System.out.println(rs.getString("employee"));
				System.out.println(rs.getString("state"));
				System.out.println(rs.getString("repair"));
				System.out.println(rs.getString("description"));
				
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
				
				list.add(techBean);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("EXEPTION: " + e);
		}
		return list;
		
	}
	
}
