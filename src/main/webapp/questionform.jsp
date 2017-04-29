<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/addquestions">
<% int size=(int)request.getAttribute("size");
    for(int i=0; i<size ; i++){%>
     <input type="text" name="question" placeholder="Question"/> <input type="number" name="answer" placeholder="Corresct Answer" style="width:30px"/><br/><br/> 
     <input type="text" name="choice" placeholder="Choice1"/>  <br/>
     <input type="text" name="choice" placeholder="Choice2"/>  <br/> 
     <input type="text" name="choice" placeholder="Choice3"/>  <br/>
     <input type="text" name="choice" placeholder="Choice4"/>  <br/><br/><br/>
     
    <%} %>
    <input type="submit" value="Submit"/>
    </form>
    
</body>
</html>