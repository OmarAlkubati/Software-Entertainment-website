package educational.entertainment.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Question {

	String fullQuestion;
	int questionID;
	int gameID;
	ArrayList<Choice> Choices;
	
	public String getFullQuestion() {
		return fullQuestion;
	}
	public void setFullQuestion(String fullQuestion) {
		this.fullQuestion = fullQuestion;
	}
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public int getGameID() {
		return gameID;
	}
	public void setGameID(int gameID) {
		this.gameID = gameID;
	}
	
	public ArrayList<Choice> getChoices() {
		return Choices;
	}
	public void setChoices(ArrayList<Choice> choices) {
		Choices = choices;
	}
	
	public ArrayList<Question> getQuestions(int gameID) throws SQLException
	{
		ArrayList allQuestion=new ArrayList<Question>();
	    Connection con=DbConnection.getCon();  
	    String query="SELECT * from educationalwebsite.questions where gameID= ?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setInt(1, gameID);
	    ResultSet rs=  ps.executeQuery();
	    while(rs.next())
	    {
	    	Question q=new Question();
	    	q.gameID=rs.getInt("gameID");
	    	q.questionID=rs.getInt("questionID");
	    	q.fullQuestion=rs.getString("questionName");
	    	allQuestion.add(q);
	    	
	    }
	    return allQuestion;
	}
	
	public void getChoices(ArrayList<Question> allQuestions) throws SQLException
	{
		 Connection con=DbConnection.getCon(); 
		 
		 //for every question get its choices from db
		 for(int i=0;i<allQuestions.size();i++)
		 {
			 String query="SELECT * from educationalwebsite.choices where questionID= ?";
			 PreparedStatement ps =con.prepareStatement(query);
		     ps.setInt(1, allQuestions.get(i).getQuestionID());
		     ResultSet rs=  ps.executeQuery();
		     allQuestions.get(i).Choices =new ArrayList<Choice>();
	   	     while(rs.next())
				{
			    	Choice ch=new Choice();
				   	ch.choiceID=rs.getInt("choiceID");
				   	ch.questionID=rs.getInt("questionID");
				   	ch.fullChoice=rs.getString("choicesName");
				   	ch.correct=rs.getBoolean("correct");
				   	
				   	allQuestions.get(i).Choices.add(ch);
				    	
				 }
			 
		 }
	}
	
}
