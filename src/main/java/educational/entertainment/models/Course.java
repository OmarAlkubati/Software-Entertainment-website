/*package educational.entertainment.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {
	public String name , age , description;
	public int CourseID;
	
	public boolean AvailableCourse(String name) throws SQLException
	{
	    Connection con = DbConnection.getCon();  
	    String query="SELECT name from table1 where name='"+name+"'";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setString(1, name);
	    ResultSet rs=   ps.executeQuery();
	    if(rs.next())
	    	return true;  
	    return false;
	   
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}

}
*/