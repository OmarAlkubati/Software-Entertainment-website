package educational.entertainment.models;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;

public class Game {

	private int gameId;
	private String gameName;
	private int courseId;
    private String description;
    
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public void addgame(Game g) throws SQLException
	{
		Connection con = DbConnection.getCon();
		String query="INSERT INTO games (gameName,courseID,description) VALUES (?,?,?)";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, g.gameName);
		ps.setInt(2, g.courseId);
		ps.setString(3, g.description);
		ps.executeUpdate();
	}
	public ArrayList<Game> getGames(int cid) throws SQLException
	{
		ArrayList allGames=new ArrayList<Game>();
	    Connection con=DbConnection.getCon();  
	    String query="SELECT * from educationalwebsite.games where courseID= ?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setInt(1, cid);
	    ResultSet rs=  ps.executeQuery();
	    while(rs.next())
	    {
	    	Game g=new Game();
	    	g.gameId=rs.getInt("gameID");
	    	g.gameName=rs.getString("gameName");
	    	g.courseId=rs.getInt("courseID");
	    	g.description=rs.getString("description");
	    	allGames.add(g);
	    	
	    }
	    
	    return allGames;
	}
	public int retrivelastid() throws SQLException {
		    Connection con = DbConnection.getCon();  
		    String query="SELECT MAX(gameID)  FROM educationalwebsite.games";
		    PreparedStatement ps =con.prepareStatement(query);
		    ResultSet rs=  ps.executeQuery();
		    rs.next();
		    int id=rs.getInt(1);
		    return id;
		
	}
	
	public int retrievequestionId() throws SQLException {
		 Connection con = DbConnection.getCon();  
		    String query="SELECT MAX(questionID)  FROM educationalwebsite.questions";
		    PreparedStatement ps =con.prepareStatement(query);
		    ResultSet rs=  ps.executeQuery();
		    rs.next();
		    int id=rs.getInt(1);
		    return id;
	}
	public void insertquestion(String [] Question,String []choice,int []Answar,int gameid) throws SQLException{
		
		Connection con = DbConnection.getCon();
		int choicenum=0;
		for(int i=0 ; i<Question.length ; i++){
			
		String query="INSERT INTO questions (questionName,gameID) VALUES (?,?)";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, Question[i]);
		ps.setInt(2, gameid);
		ps.executeUpdate();
		int qid=retrievequestionId();
			for(int j=0 ; j<4 ; j++,choicenum++)
			{
			    query="INSERT INTO choices (choicesName,correct,questionID) VALUES (?,?,?)";
				ps =con.prepareStatement(query);
				ps.setString(1, choice[choicenum]);
				if(Answar[i]==j+1)
				   ps.setInt(2, 1);
				else
					ps.setInt(2, 0);
				ps.setInt(3, qid);
				ps.executeUpdate();
			}
		}
		
		
		
	}
	
	public void setScore(int stID,int gameID,int score) throws SQLException
	{
		 	Connection con=DbConnection.getCon();  
		    String query="INSERT INTO educationalwebsite.scores (score,gameID,studentID) values(?,?,?)";
		    PreparedStatement ps =con.prepareStatement(query);
		    ps.setInt(2, gameID);
		    ps.setInt(3, stID);
		    ps.setInt(1, score);
		    ps.executeUpdate();
	}
	
	public int getScore(int stID,int gameID) throws SQLException
	{
		 	Connection con=DbConnection.getCon();  
		    String query="SELECT score from educationalwebsite.scores where gameID= ? AND studentID=?";
		    PreparedStatement ps =con.prepareStatement(query);
		    ps.setInt(1, gameID);
		    ps.setInt(2, stID);
		    ResultSet rs=  ps.executeQuery();
		    int score=-10;
		    if(rs.next())
		    	score=rs.getInt("score");
		    
		    return score;
	}
	
	public void updateScore(int stID,int gameID,int score) throws SQLException
	{
		 	Connection con=DbConnection.getCon();  
		    String query="UPDATE educationalwebsite.scores SET score=? WHERE gameID= ? AND studentID=?";

		    PreparedStatement ps =con.prepareStatement(query);
		    ps.setInt(1, score);
		    ps.setInt(2, gameID);
		    ps.setInt(3, stID);
		    ps.executeUpdate();
	}
	
	public ArrayList<Achievement> getacheivements(int sId) throws SQLException
	{
		
		ArrayList<Achievement>Array=new ArrayList<>();
		Connection con=DbConnection.getCon();  
	    String query="SELECT score,gameID from educationalwebsite.scores where studentID=?";
	    PreparedStatement ps =con.prepareStatement(query);
	    ps.setInt(1, sId);
	    ResultSet rs=  ps.executeQuery();
	    
	    while(rs.next()){
	    	Achievement ach=new Achievement();
	    	int score=rs.getInt(1);
	    	int gid=rs.getInt(2);
	    	query="SELECT gameName from educationalwebsite.games where gameID=?";
	    	ps =con.prepareStatement(query);
	    	ps.setInt(1,gid);
	    	ResultSet rs2=  ps.executeQuery();
	    	rs2.next();
	    	String gname=rs2.getString(1);
	    	ach.setScore(score);
	    	ach.setGameName(gname);
	    	Array.add(ach);
	    	
	    }
	    return Array;
	}
	
}
