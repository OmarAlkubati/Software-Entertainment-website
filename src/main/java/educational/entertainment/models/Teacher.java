package educational.entertainment.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teacher extends User {


	public boolean Search( String email) throws SQLException 
	{
		 // System.out.println("SELECT name from test.table1 where name='"+email+"';");
	    Connection con=DbConnection.getCon();  
	    String query="SELECT * from teacher where email= ?";
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
		String query="INSERT INTO teacher (email,name,password,age) VALUES (?,?,?,?)";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, u.email);
		ps.setString(2, u.name);
		ps.setString(3, u.password);
		ps.setString(4, u.age);
		ps.executeUpdate();
		query="SELECT idteacher from teacher where email= ? AND password=?";
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
		    User u=new Teacher();
		    Connection con=DbConnection.getCon();  
		    String query="SELECT idteacher,name from teacher where email= ? AND password=?";
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
