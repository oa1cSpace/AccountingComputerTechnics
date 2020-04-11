package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static void main(String[] args) {
		DBConnection mySQL = new DBConnection();
		
		System.out.println(mySQL.get_connection());
	}
	
	public Connection get_connection() {
		Connection connection = null;
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Accounting_Of_Computer_Technics",
				"dsx", "password");
		} catch (Exception e) {
		// handle an exception
			System.err.println(e);
		}
	return connection;
	}
}
