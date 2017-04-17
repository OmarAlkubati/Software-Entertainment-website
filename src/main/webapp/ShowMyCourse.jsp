<%@ page import="java.util.ArrayList, educational.entertainment.models.Course" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyCourses</title>
</head>
<body>
	<h1> My Courses </h1>
<%  
	// retrieve your list from the request, with casting 
	ArrayList<Course> list = (ArrayList<Course>) request.getAttribute("allcourses");
	
	// print the information about every category of the list
	for(Course course : list) { %>
	   <a href="/showcourse?CourseID=<%=course.getCourseID()%>" style="font-size:30px;"> <%= course.getName()%></a>
	    <br/>
	<% } %>
	
</body>
</html>