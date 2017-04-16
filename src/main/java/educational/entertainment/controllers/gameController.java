package educational.entertainment.controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import educational.entertainment.models.Game;

@Controller
public class gameController {

	Game game;
	@RequestMapping("/showgames")
	public String showgames(Model model,HttpServletRequest  request) throws SQLException
	{
		game=new Game();
		ArrayList<Game> allgames=game.getGames(2);
		for(int i=0 ; i<allgames.size(); i++)
		{
			System.out.println(allgames.get(i).gameName);
		}
		
		request.setAttribute("allgames",allgames);
		
		HttpSession s = request.getSession(true);
		s.setAttribute("Session_Var", "DONE and FUCK U");
		
		return "hhh";
	}
	
	@RequestMapping(value="/playgame",method= RequestMethod.GET)
	public String playgame(Model model,HttpServletRequest  request,@RequestParam("gameid") int gameid) throws SQLException
	{
		
			System.out.println(gameid);
		
		//request.setAttribute("allgames",allgames);
		
		return "";
	}
	
}
