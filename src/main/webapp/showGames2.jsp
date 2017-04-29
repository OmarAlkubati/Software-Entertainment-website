<%@ page import="java.util.ArrayList, educational.entertainment.models.Game" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> HHH JSP HEYEYEYYEYEY</h1>
<%  
	// retrieve your list from the request, with casting 
	ArrayList<Game> list = (ArrayList<Game>) request.getAttribute("allgames");
	
	// print the information about every category of the list
	for(Game game : list) { %>
	   <a href="/playgame?gameid=<%=game.getGameId() %>" style="font-size:30px;">
	    <%= game.getGameName() %></a>
	    <br/>
	<% } %>
	
	
</body>
</html>