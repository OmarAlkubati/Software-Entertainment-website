package educational.entertainment.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class Student extends User {


	/*public boolean Search( String email) throws SQLException 
	{
		 // System.out.println("SELECT name from test.table1 where name='"+email+"';");
	    Connection con=DbConnection.getCon();  
	    String query="SELECT name from table1 where name= ?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setString(1, email);
	    ResultSet rs=   ps.executeQuery();
	    if(rs.next())
	    	return true;
	    
	    return false;
	   }

	public void Signup(User u) throws SQLException 
	{
		Connection con=DbConnection.getCon();
		String query="INSERT INTO table1 (name) VALUES (?)";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, u.email);
		ps.executeUpdate();
	}
	
	public User Login(String email, String pass) throws SQLException
	{
		    User u=new Student();
		    Connection con=DbConnection.getCon();  
		    String query="SELECT name from table1 where name= ?";
		    PreparedStatement ps =con.prepareStatement(query);
		    ps.setString(1, email);
		    ResultSet rs=   ps.executeQuery();
		   
		    if(rs.next())
		    {
		       u.setEmail(rs.getString(1));//setEmail(rs.getString(1));
		       return u;
		    }
		return null;
	}
	*/
	
}
