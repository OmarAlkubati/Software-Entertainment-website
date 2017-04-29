package educational.entertainment.models;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


public class User {

	protected int id;
	protected String email;
    protected String password;
    protected String name;
    protected String age;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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
	
	public User Signup(User u)throws SQLException 
	{
		return u;}
	
	public User Login(String email, String pass) throws SQLException
	{
		
		return null;
	}

}
