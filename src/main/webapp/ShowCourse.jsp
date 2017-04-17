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
	Course course = (Course) request.getAttribute("course");
%>
<h3><%=course.getName()%></h3><br/>
<h3><%=course.getAge()%></h3><br/>	
<h3><%=course.getDescription()%></h3><br/>
</body>
</html>