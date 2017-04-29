<%@ page import="java.util.ArrayList, educational.entertainment.models.Question,educational.entertainment.models.Choice" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>LoginForm</title>
</head>
<body >
    <h1>Play OOOoo</h1>
<%! String str="group"; %>
<%     
 ArrayList<Question> QuesList = 
 (ArrayList<Question>) request.getAttribute("allquestions");
          %>
      
	    <form action="/calcScore" method="post">
		
		<%for(int i=0;i<QuesList.size();i++){ %>
			<p>  Question #<%=i+1%> :</p>
			<p> <%= QuesList.get(i).getFullQuestion() %> </p>
			
	        <fieldset id=<%=str+i%>  >
	        
	        <% for(int j=0;j<QuesList.get(i).getChoices().size();j++){%>
				<input type="radio" name=<%=str+i%> value= <%= j %> />
				
				<%=QuesList.get(i).getChoices().get(j).getFullChoice() %>
			<% } %>
			
   			</fieldset>
   			
		<% }
		%>
			
	        <br/><input type="submit" value="submit">
	        </form>       		

</body>
</html>