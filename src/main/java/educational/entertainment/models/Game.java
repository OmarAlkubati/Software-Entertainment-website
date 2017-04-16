package educational.entertainment.models;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Game {

	public int gameId;
	public String gameName;
	public int courseId;
	
	
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
	
	public ArrayList<Game> getGames(int cid) throws SQLException
	{
		ArrayList allGames=new ArrayList<Game>();
		//System.out.println("SELECT gameName from games where courseID=?");
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
	    	allGames.add(g);
	    	
	    }
	    return allGames;
	}
}
