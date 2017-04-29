<%@ page import="java.util.ArrayList, educational.entertainment.models.User, educational.entertainment.models.Course" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <% User str= (User)session.getAttribute("user");out.print("Welcome = "+str.getName()); %>
  <% ArrayList<Course> list = (ArrayList<Course>) request.getAttribute("allcourses");%>
	<%if(!list.isEmpty())%><h1> Your Courses </h1>
	<%for(Course course : list) { %>
	   <a href="/showcourse?CourseID=<%=course.getCourseID()%>" style="font-size:30px;"> <%=course.getName()%></a>
	    <br/>
	<% } %>
  <a href="/addcourse" style="font-size:40px;">Add Course</a>
  <a href="/showallcourse" style="font-size:40px;">View All Courses</a>
</body>
</html>