package educational.entertainment.controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import educational.entertainment.models.Achievement;
import educational.entertainment.models.Game;
import educational.entertainment.models.Question;
import educational.entertainment.models.User;

@Controller
public class gameController {

	Game game;
	
	@GetMapping("/addgame")
	public String addgame(HttpServletRequest  request,@RequestParam("courseid") int  courseid
			)
	{
		HttpSession s=request.getSession();
		s.setAttribute("courseid", courseid);
		return "gameform";
	}
	@PostMapping("/addgame")
	public String addgame(HttpServletRequest  request, @RequestParam("name") String  name,
			 @RequestParam("description") String  des,@RequestParam ("question") String [] Question,
			 @RequestParam ("choice") String []choice, @RequestParam ("answer") int []Answar) throws SQLException{
		game=new Game();
<<<<<<< HEAD
<<<<<<< HEAD
		ArrayList<Game> allgames=game.getGames(2);
		for(int i=0 ; i<allgames.size(); i++)
=======
		HttpSession s=request.getSession();
		int courseid=(int)s.getAttribute("courseid");
		game.setCourseId(courseid);
		game.setGameName(name);
		game.setDescription(des);
		////////Add Game To Data Base/////////
		game.addgame(game);
		int gameid=game.retrivelastid();
        ////////Add Game's Questions To Data Base/////////
		game.insertquestion(Question,choice, Answar,gameid);
		 return "redirect:/showgames?courseid="+courseid;
	}
	
	  @RequestMapping("/studentacheivements")
	  public String studentacheivements(HttpServletRequest request) throws SQLException
	  {
		  game=new Game();
		  HttpSession s=request.getSession();
		  User u=(User) s.getAttribute("user");
		 ArrayList<Achievement> Al= new ArrayList<Achievement>();
		 Al=game.getacheivements(u.getId());
		  
		 request.setAttribute("Ach", Al);
		  return "shomepage";
	  }
	/*  @RequestMapping("/addquestions")
	   public String greetingSubmit( @RequestParam ("question") String [] Question,@RequestParam ("choice") String []choice,
			                         @RequestParam ("answer") int []Answar,HttpServletRequest request) throws SQLException {
		  
		 game=new Game();
		 game.insertquestion(Question,choice, Answar, request,gameid);
		 HttpSession s=request.getSession();
		 int courseid=(int)s.getAttribute("courseid");
		 return "redirect:/showgames?courseid="+courseid;
	    }*/
	
		
	    @RequestMapping("/showgames")
		public String showgames(Model model,HttpServletRequest  request,@RequestParam("courseid") int  courseid) throws SQLException
>>>>>>> 7th V
		{
	    	HttpSession s=request.getSession();
			s.setAttribute("courseid", courseid);
		  System.out.println("IN Showgames");
			game=new Game();
			System.out.println("courseid is "+ courseid);
			//courseID =2 e.g
			ArrayList<Game> allgames=game.getGames(courseid);
			for(int i=0;i<allgames.size();i++)
			{
				System.out.println(allgames.get(i).getGameName());
			}
			
			request.setAttribute("allgames",allgames);
						
			return "showGames";
		}
		
<<<<<<< HEAD
		request.setAttribute("allgames",allgames);
		
		HttpSession s = request.getSession(true);

		s.setAttribute("Session_Var", "DONE and FUCK U");

		s.setAttribute("Session_Var", "DONE ");

		return "hhh";
=======
		HttpSession s=request.getSession();
		int courseid=(int)s.getAttribute("courseid");
		game.setCourseId(courseid);
		game.setGameName(name);
		game.setDescription(des);
		////////Add Game To Data Base/////////
		game.addgame(game);
		int gameid=game.retrivelastid();
        ////////Add Game's Questions To Data Base/////////
		game.insertquestion(Question,choice, Answar,gameid);
		 return "redirect:/showgames?courseid="+courseid;
>>>>>>> Fourth Version
	}
	
	  @RequestMapping("/studentacheivements")
	  public String studentacheivements(HttpServletRequest request) throws SQLException
	  {
		  game=new Game();
		  HttpSession s=request.getSession();
		  User u=(User) s.getAttribute("user");
		 ArrayList<Achievement> Al= new ArrayList<Achievement>();
		 Al=game.getacheivements(u.getId());
		  
		 request.setAttribute("Ach", Al);
		 // System.out.println("achhhhhhhhhhhhhhhievmennnnnts    "+Al.get(0).getScore());
		  return "shomepage";
	  }
	  
	  /*@RequestMapping("/addquestions")
	   public String greetingSubmit( @RequestParam ("question") String [] Question,@RequestParam ("choice") String []choice,
			                         @RequestParam ("answer") int []Answar,HttpServletRequest request) throws SQLException {
		  
		 game=new Game();
		 game.insertquestion(Question,choice, Answar, request,gameid);
		 HttpSession s=request.getSession();
		 int courseid=(int)s.getAttribute("courseid");
		 return "redirect:/showgames?courseid="+courseid;
	    }*/
	
		
	    @RequestMapping("/showgames")
		public String showgames(Model model,HttpServletRequest  request,@RequestParam("courseid") int  courseid) throws SQLException
		{
	    	HttpSession s=request.getSession();
			s.setAttribute("courseid", courseid);
		  System.out.println("IN Showgames");
			game=new Game();
			System.out.println("courseid is "+ courseid);
			//courseID =2 e.g
			ArrayList<Game> allgames=game.getGames(courseid);
			for(int i=0;i<allgames.size();i++)
			{
				System.out.println(allgames.get(i).getGameName());
			}
			
			request.setAttribute("allgames",allgames);
						
			return "showGames";
		}
		
		@RequestMapping(value="/playgame",method= RequestMethod.GET)
		public String playgame(Model model,HttpServletRequest  request,
				@RequestParam("gameid") int gameid) throws SQLException
		{
			HttpSession s=request.getSession();
			s.setAttribute("gameid", gameid);
			
			Question question =new Question();
			ArrayList<Question> allQuestions=question.getQuestions(gameid);
			
			question.getChoices(allQuestions);
			System.out.println("IN playGame serv");
//			for(int i=0 ; i<allQuestions.size(); i++)
//			{
//				System.out.println(allQuestions.get(i).getFullQuestion());
//				for(int j=0;j<allQuestions.get(i).getChoices().size();j++)
//				{
//					System.out.println(allQuestions.get(i).getChoices().get(j).getFullChoice());
//				}
//			}
			
			request.setAttribute("allquestions",allQuestions);
			
			return "playGame";
		}
		
		@RequestMapping(value="/calcScore",method= RequestMethod.POST)
		public String calcScore(Model model,HttpServletRequest  request) throws SQLException
		{
			HttpSession s=request.getSession();
			int gameid=(int)s.getAttribute("gameid");
			System.out.println("in /calcScore ");
			Question question =new Question();
			ArrayList<Question> allQuestions=question.getQuestions(gameid);
			question.getChoices(allQuestions);
			
			int score=0;
			String str="group";
			ArrayList<String> ans=new ArrayList<String>();
			ArrayList<String> crAns=new ArrayList<String>();
	 		//for every Question check its correctness
			
			for(int i=0;i<allQuestions.size();i++)
			{
				int choiceidx= Integer.parseInt(request.getParameter(str+i));
				ans.add(allQuestions.get(i).getChoices().get(choiceidx).getFullChoice());
				System.out.println((str+i) + "choice"+ choiceidx);
				
				if(allQuestions.get(i).getChoices().get(choiceidx).isCorrect())
				{
					score+=100;
				}
				for(int j=0;j<allQuestions.get(i).getChoices().size();j++)
				{
					if(allQuestions.get(i).getChoices().get(j).isCorrect())
					{
						crAns.add(allQuestions.get(i).getChoices().get(j).getFullChoice());
						break;
					}
				}
				
			}
			/////////////////Add to scores table
			//in case of student we update score in the database
			String str1=(String) s.getAttribute("type");
			if(str1.equals("student"))
			{
				User user=new User();
				user=(User) s.getAttribute("user");
				int stID=user.getId();
				
				//get score form db ==> if max ==> update
				int oldScore=game.getScore(stID,gameid);
				System.out.println(oldScore + " " + score);
				if(oldScore==-10)
				{
					game.setScore(stID,gameid,score);
				}
				else if(oldScore<score)
				{
					game.updateScore(stID,gameid,score);
				}
			}
			
			int fullMark=allQuestions.size()*100;
			
			request.setAttribute("score", score);
			request.setAttribute("perfectScore", fullMark);
			request.setAttribute("userAnswers", ans);
			request.setAttribute("correctAnswers", crAns);
			s.setAttribute("perfectscore", fullMark);
			System.out.println("in the end of calcsocre");
=======
		@RequestMapping(value="/playgame",method= RequestMethod.GET)
		public String playgame(Model model,HttpServletRequest  request,
				@RequestParam("gameid") int gameid) throws SQLException
		{
			HttpSession s=request.getSession();
			s.setAttribute("gameid", gameid);
			
			Question question =new Question();
			ArrayList<Question> allQuestions=question.getQuestions(gameid);
			
			question.getChoices(allQuestions);
			System.out.println("IN playGame serv");
//			for(int i=0 ; i<allQuestions.size(); i++)
//			{
//				System.out.println(allQuestions.get(i).getFullQuestion());
//				for(int j=0;j<allQuestions.get(i).getChoices().size();j++)
//				{
//					System.out.println(allQuestions.get(i).getChoices().get(j).getFullChoice());
//				}
//			}
			
			request.setAttribute("allquestions",allQuestions);
			
			return "playGame";
		}
		
		@RequestMapping(value="/calcScore",method= RequestMethod.POST)
		public String calcScore(Model model,HttpServletRequest  request) throws SQLException
		{
			HttpSession s=request.getSession();
			int gameid=(int)s.getAttribute("gameid");
			System.out.println("in /calcScore ");
			Question question =new Question();
			ArrayList<Question> allQuestions=question.getQuestions(gameid);
			question.getChoices(allQuestions);
			
			int score=0;
			String str="group";
			ArrayList<String> ans=new ArrayList<String>();
			ArrayList<String> crAns=new ArrayList<String>();
	 		//for every Question check its correctness
			
			for(int i=0;i<allQuestions.size();i++)
			{
				int choiceidx= Integer.parseInt(request.getParameter(str+i));
				ans.add(allQuestions.get(i).getChoices().get(choiceidx).getFullChoice());
				System.out.println((str+i) + "choice"+ choiceidx);
				
				if(allQuestions.get(i).getChoices().get(choiceidx).isCorrect())
				{
					score+=100;
				}
				for(int j=0;j<allQuestions.get(i).getChoices().size();j++)
				{
					if(allQuestions.get(i).getChoices().get(j).isCorrect())
					{
						crAns.add(allQuestions.get(i).getChoices().get(j).getFullChoice());
						break;
					}
				}
				
			}
			/////////////////Add to scores table
			//in case of student we update score in the database
			String str1=(String) s.getAttribute("type");
			if(str1.equals("student"))
			{
				User user=new User();
				user=(User) s.getAttribute("user");
				int stID=user.getId();
				
				//get score form db ==> if max ==> update
				int oldScore=game.getScore(stID,gameid);
				System.out.println(oldScore + " " + score);
				if(oldScore==-10)
				{
					game.setScore(stID,gameid,score);
				}
				else if(oldScore<score)
				{
					game.updateScore(stID,gameid,score);
				}
			}
			
			int fullMark=allQuestions.size()*100;
			
			request.setAttribute("score", score);
			request.setAttribute("perfectScore", fullMark);
			request.setAttribute("userAnswers", ans);
			request.setAttribute("correctAnswers", crAns);
		
>>>>>>> 7th V
			return "CalcScore";
		}
		
	
}
