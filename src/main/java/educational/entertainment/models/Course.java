package educational.entertainment.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Course 
{
	
	private String name , description , age;
<<<<<<< HEAD
<<<<<<< HEAD
	private int CourseID;
=======
	private int CourseID,teacherid;
>>>>>>> Fourth Version
=======
	private int CourseID,teacherid;
>>>>>>> 7th V
	public Course()
	{
		name = "";
		description = "";
		age = "";
		CourseID = 0;
	}
	public boolean AvailableCourse(int id) throws SQLException
	{	
		Connection con =  DbConnection.getCon();
	    String query="SELECT name from course where CourseID=?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setInt(1, id);
	    ResultSet rs=   ps.executeQuery();
	    if(rs.next())
	    	return true;  
	    return false;
	    
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	public void AddCourse(String name , String des , String age) throws SQLException
	{
		
		Connection con = DbConnection.getCon();
		String query="INSERT INTO course (name,age,description,CourseID) VALUES (?,?,?)";
=======
=======
>>>>>>> 7th V
	public void AddCourse(String name , String des , String age,int id) throws SQLException
	{
		Course c=new Course();
		Connection con = DbConnection.getCon();
		String query="INSERT INTO course (name,age,description,teacherid) VALUES (?,?,?,?)";
<<<<<<< HEAD
>>>>>>> Fourth Version
=======
>>>>>>> 7th V
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, age);
		ps.setString(3, des);
<<<<<<< HEAD
<<<<<<< HEAD
		ps.executeUpdate();
=======
		ps.setInt(4, id);
		ps.executeUpdate();
       // SELECT MAX(idcourse)  FROM educationalwebsite.course
>>>>>>> Fourth Version
=======
		ps.setInt(4, id);
		ps.executeUpdate();
       // SELECT MAX(idcourse)  FROM educationalwebsite.course
>>>>>>> 7th V
	}
	public Course retrivecourse(int id) throws SQLException
	{
		Course c = new Course();
	    Connection con = DbConnection.getCon();  
<<<<<<< HEAD
<<<<<<< HEAD
	    String query="SELECT * from educationalwebsite.games where CourseID= ?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setInt(1, id);
	    ResultSet rs=  ps.executeQuery();
	    c.CourseID = rs.getInt("CourseID");
	    c.name = rs.getString("name");
	    c.age = rs.getString("age");
	    c.description = rs.getString("description"); 		    	
	    return c;
	}
=======
=======
>>>>>>> 7th V
	    String query="SELECT * from educationalwebsite.course where idcourse= ?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setInt(1, id);
	    ResultSet rs=  ps.executeQuery();
	    rs.next();
	    c.CourseID = rs.getInt("idcourse");
	    c.name = rs.getString("name");
	    c.age = rs.getString("age");
	    c.description = rs.getString("description"); 
	    c.teacherid = rs.getInt("teacherid");
	    return c;
	}
	public ArrayList<Course> retriveallcourses() throws SQLException
	{
		ArrayList<Course> mycourses = new ArrayList<Course>();
		
	    Connection con = DbConnection.getCon();  
	    String query="SELECT * from educationalwebsite.course";
	    PreparedStatement ps =con.prepareStatement(query);
	    ResultSet rs=  ps.executeQuery();
	    while(rs.next())
	    {
	    	Course c = new Course();
	    	c.CourseID = rs.getInt("idcourse");
		    c.name = rs.getString("name");
		    c.age = rs.getString("age");
		    c.description = rs.getString("description");
		    c.teacherid=rs.getInt("teacherid");
		    mycourses.add(c);
	    }
	    return mycourses;
	}
<<<<<<< HEAD
>>>>>>> Fourth Version
=======
>>>>>>> 7th V
	public ArrayList<Course> getcourses(int id) throws SQLException
	{
		ArrayList allcourses = new ArrayList<Course>();
	    Connection con=DbConnection.getCon();
<<<<<<< HEAD
<<<<<<< HEAD
	    String query="SELECT * from educationalwebsite.games where TeacherID= ?";
=======
	    String query="SELECT * from educationalwebsite.course where teacherid= ?";
>>>>>>> Fourth Version
=======
	    String query="SELECT * from educationalwebsite.course where teacherid= ?";
>>>>>>> 7th V
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setInt(1, id);
	    ResultSet rs=  ps.executeQuery();
	    while(rs.next())
	    {
	    	Course c = new Course();
<<<<<<< HEAD
<<<<<<< HEAD
	    	c.CourseID = rs.getInt("CourseID");
=======
	    	c.CourseID = rs.getInt("idcourse"); 
>>>>>>> Fourth Version
=======
	    	c.CourseID = rs.getInt("idcourse"); 
>>>>>>> 7th V
	    	c.name = rs.getString("name");
	    	c.age = rs.getString("age");
	    	c.description = rs.getString("description"); 	
	    	allcourses.add(c);
	    	
	    }
	    return allcourses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======
	public int getteacherid() {
		return teacherid;
	}
>>>>>>> Fourth Version
=======
	public int getteacherid() {
		return teacherid;
	}
>>>>>>> 7th V
	
}
