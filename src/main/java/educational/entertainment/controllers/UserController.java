package educational.entertainment.controllers;

import java.awt.List;
import java.awt.PopupMenu;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.Connection;

import educational.entertainment.models.Student;
import educational.entertainment.models.Teacher;
import educational.entertainment.models.User;


@Controller

public class UserController  extends HttpServlet  {
	
    private User user;
    
	@RequestMapping("/")
	public String add(){
		
		return "register";
	}
	
	
	@RequestMapping("/signup")
	public String Signup(HttpServletResponse resp,@RequestParam("email") String email,@RequestParam("name") String name,
			@RequestParam("password") String pass,@RequestParam("age") String age,
			@RequestParam("type") int type,HttpServletRequest req) throws SQLException,ServletException, IOException
	{
		user=new Student();
	    boolean isExist=user.Search(email);
	    user=new Teacher();
	    boolean isExist2=user.Search(email);
	//String attributeName = req.getParameter("attributeName");
    //String attributeValue = req.getParameter("attributeValue");
   // req.getSession().setAttribute("email", email);
   //  resp.sendRedirect(req.getContextPath() + "/");
		if(!isExist && !isExist2)
		{
			if(type==1){
				user=new Student();
				user.setEmail(email);
				user.setName(name);
				user.setPassword(pass);
				user.setAge(age);
				user=user.Signup(user);
				HttpSession s=req.getSession();
				s.setAttribute("user", user);
				s.setAttribute("type", "student");
				System.out.println("Emaillllll = "+user.getName()+"  "+user.getId());
				return "redirect:/studentacheivements";
			}
			else if(type==2){
				user=new Teacher();
				user.setEmail(email);
				user.setName(name);
				user.setPassword(pass);
				user.setAge(age);
				user=user.Signup(user);
				HttpSession s=req.getSession();
				s.setAttribute("user", user);
				s.setAttribute("type", "teacher");
				System.out.println("Emaillllll = "+user.getName()+"  "+user.getId());
				
				resp.sendRedirect("/showmycourse");
			}
		}
		
		return "register";
	
		
		
		
	}
	
   
	@RequestMapping("/login")
	public String Login(HttpServletRequest req,HttpServletResponse resp,@RequestParam("email") String email,@RequestParam("password") String pass) throws SQLException, ServletException, IOException
	{
	    //HttpSession s=req.getSession();
	  //  System.out.println("Email = "+s.getAttribute("email"));
		HttpSession s=req.getSession();
		user=new Student();
	    user=user.Login(email,pass);
		if(user!=null)
		{
			
			System.out.println("Emaillllll = "+user.getName());
		    s=req.getSession();
			s.setAttribute("user", user);
			s.setAttribute("type", "student");
			return "redirect:/studentacheivements";
		}
		user=new Teacher();
	    user=user.Login(email,pass);
	    if(user!=null)
		{
			
			System.out.println("Emaillllll = "+user.getName());
		    s=req.getSession();
			s.setAttribute("user", user);
			s.setAttribute("type", "teacher");
			  /*RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/showmycourse");
              dispatcher.forward(req,resp);*/
			resp.sendRedirect("/showmycourse");
		}
	     	
			
			return "register";
		
	}
	
}
