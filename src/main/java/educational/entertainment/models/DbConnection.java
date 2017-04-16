package educational.entertainment.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final  class DbConnection {
  
	public static Connection getCon() throws SQLException{
	 Connection con=null;
	 try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/educationalwebsite","root","root");
			 return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
 
}
