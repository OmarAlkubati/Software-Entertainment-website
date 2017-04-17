package educational.entertainment.controllers;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import educational.entertainment.models.Course;


@Controller
public class CourceController 
{
	Course MyCourse;
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
		
		request.setAttribute("course",MyCourse);
		return "ShowCourse";
	}
	
	@RequestMapping("/addcourse")
	public String showcourseform()
	{
		return "addcourse";
	}
	
	@RequestMapping("/addingcourse")
	public String AddCourse(@RequestParam("name") String name,
			 				@RequestParam("age") String  age,
			 				@RequestParam("description") String  des) throws SQLException
	{
      	Course c = new Course();
			c.AddCourse(name, des, age);
			return "/showcourse/id";
	
	}
}

