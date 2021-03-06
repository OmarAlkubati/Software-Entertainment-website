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


	public boolean Search( String email) throws SQLException 
	{
		 // System.out.println("SELECT name from test.table1 where name='"+email+"';");
	    Connection con=DbConnection.getCon();  
	    String query="SELECT * from student where email= ?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setString(1, email);
	    ResultSet rs=   ps.executeQuery();
	    if(rs.next())
	    	return true;
	    
	    return false;
	   }

	public User Signup(User u) throws SQLException 
	{
		Connection con=DbConnection.getCon();
		String query="INSERT INTO student (email,name,password,age) VALUES (?,?,?,?)";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, u.email);
		ps.setString(2, u.name);
		ps.setString(3, u.password);
		ps.setString(4, u.age);
		ps.executeUpdate();
		query="SELECT idStudent from student where email= ? AND password=?";
		ps =con.prepareStatement(query);
	    ps.setString(1, u.email);
		ps.setString(2,  u.password);
		ResultSet rs=   ps.executeQuery();
		rs.next();
		u.id=(rs.getInt(1));	       
		return u;
		 
		
	}
	
	public User Login(String email, String pass) throws SQLException
	{
		    User u=new Student();
		    Connection con=DbConnection.getCon();  
		    String query="SELECT idStudent,name from student where email= ? AND password=?";
		    PreparedStatement ps =con.prepareStatement(query);
		    ps.setString(1, email);
		    ps.setString(2, pass);
		    ResultSet rs=   ps.executeQuery();
		    if(rs.next())
		    {
		       u.id=(rs.getInt(1));
		       u.name=(rs.getString(2));	       
		       return u;
		    }
		return null;
	}
	
}
