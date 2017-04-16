/*package educational.entertainment.controllers;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import educational.entertainment.models.Course;

@Controller
public class CourseController
{
	Course course = new Course();
	@RequestMapping("/addingcourse")
	public String addcourse(){
		return "addcorseindex";
	}
	
	@RequestMapping("/addcourse")
	public String AddCourse(@RequestParam("name") String name,@RequestParam("age") String age
						  ,@RequestParam("des") String des,@RequestParam("id") int id) throws SQLException
	{	
		if (course.AvailableCourse(name))
		{
			return "index2";
		}
		else
		{
			return "addcourseindex";
		}
	}

}
*/