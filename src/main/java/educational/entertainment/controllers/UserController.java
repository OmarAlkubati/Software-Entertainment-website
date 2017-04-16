package educational.entertainment.controllers;

import java.awt.List;
import java.awt.PopupMenu;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
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
import educational.entertainment.models.User;


@Controller

public class UserController  extends HttpServlet  {
	
    private User user;
    
	@RequestMapping("/")
	public String add(){
		System.out.println("\n\nhelllllllllllllllllllllllllllllllllllllllllllllllllllo\n\n");
		return "hel";
	}
	
	
	@RequestMapping("/signup")
	public String Signup(@RequestParam("email") String email,HttpServletRequest req) throws SQLException,ServletException, IOException
	{
		user=new Student();
	boolean isExist=user.Search(email);
		
	//String attributeName = req.getParameter("attributeName");
    //String attributeValue = req.getParameter("attributeValue");
    req.getSession().setAttribute("email", email);
        //  resp.sendRedirect(req.getContextPath() + "/");
		if(!isExist)
		{
			user.setEmail(email);
			user.Signup(user);
			return "login";
		}
		
		else
		{
			return "index";
		}
		
	}
	
@RequestMapping("/login")
	
	public String Login(@RequestParam("email") String email,HttpServletRequest req)/*,@RequestParam("password") String pass)*/ throws SQLException
	{
	    HttpSession s=req.getSession();
	    System.out.println("Email = "+s.getAttribute("email"));
		user=new Student();
	    user=user.Login(email," ");
		if(user!=null)
		{
			System.out.println("Emaillllll = "+user.getEmail());
			return "index2";
		}
		
		else
		{
			return "index";
		}
	}
	
}
