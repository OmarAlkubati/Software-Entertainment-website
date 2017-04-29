package educational.entertainment.controllers;


import java.sql.SQLException;
import java.util.ArrayList;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
=======
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> Fourth Version
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import educational.entertainment.models.Course;
<<<<<<< HEAD
=======
import educational.entertainment.models.User;
>>>>>>> Fourth Version


@Controller
public class CourceController 
{
	Course MyCourse;
<<<<<<< HEAD
	@RequestMapping("/showmycourse")
	public String showmycourse(Model model,HttpServletRequest  request , int id) throws SQLException
	{
		MyCourse = new Course();
		ArrayList<Course> mycourse = MyCourse.getcourses(id);
			
		request.setAttribute("allcourses",mycourse);
		
		return "ShowMyCourse";
	}
	@RequestMapping("/showcourse")
	public String showcourse(Model model,HttpServletRequest  request , @RequestParam("CourseID")int id) throws SQLException
	{
		MyCourse = new Course();
		MyCourse.retrivecourse(id);
=======
	@RequestMapping("/showallcourse")
	public String showallcourse(HttpServletRequest  request) throws SQLException
	{
		MyCourse = new Course();
		ArrayList<Course> mycourses = MyCourse.retriveallcourses();
		request.setAttribute("allcourses",mycourses);
		return "ShowAllCourses";
	}
	@RequestMapping("/showmycourse")
	public String showmycourse(HttpServletRequest  request ) throws SQLException
	{
		HttpSession s=request.getSession();
		User u= (User)s.getAttribute("user");
		MyCourse = new Course();
		ArrayList<Course> mycourse = MyCourse.getcourses(u.getId());
			
		request.setAttribute("allcourses",mycourse);
		
		return "thomepage";
	}
	/*@RequestMapping("/showcourse")
	public String showcourse(HttpServletRequest  request , @RequestParam("CourseID")int id) throws SQLException
	{
		MyCourse = new Course();
		MyCourse=MyCourse.retrivecourse(id);
>>>>>>> Fourth Version
		
		request.setAttribute("course",MyCourse);
		return "ShowCourse";
	}
<<<<<<< HEAD
	
	@RequestMapping("/addcourse")
=======
	*/
	@GetMapping("/addcourse")
>>>>>>> Fourth Version
	public String showcourseform()
	{
		return "addcourse";
	}
	
<<<<<<< HEAD
	@RequestMapping("/addingcourse")
	public String AddCourse(@RequestParam("name") String name,
			 				@RequestParam("age") String  age,
			 				@RequestParam("description") String  des) throws SQLException
	{
      	Course c = new Course();
			c.AddCourse(name, des, age);
			return "/showcourse/id";
=======
	@PostMapping("/addcourse")
	public String AddCourse(HttpServletRequest  request ,@RequestParam("name") String name,
			 				@RequestParam("age") String  age,
			 				@RequestParam("description") String  des) throws SQLException
	{
	     	HttpSession s=request.getSession();
			User u= (User)s.getAttribute("user");
         	Course c = new Course();
			c.AddCourse(name, des, age,u.getId());
			return "redirect:/showmycourse";
>>>>>>> Fourth Version
	
	}
}

