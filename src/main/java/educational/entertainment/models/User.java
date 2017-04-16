package educational.entertainment.models;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


public class User {

	protected String email;
    protected String password;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean Search(String s)  throws SQLException 
	{
		
		return true;
	}
	
	public void Signup(User u)throws SQLException 
	{}
	
	public User Login(String email, String pass) throws SQLException
	{
		
		return null;
	}

}
