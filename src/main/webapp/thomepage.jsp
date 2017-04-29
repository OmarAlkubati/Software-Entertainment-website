<%@ page import="java.util.ArrayList, educational.entertainment.models.User, educational.entertainment.models.Course" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
     <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel='stylesheet' href="css/rtl.css">
    <link rel='stylesheet' href="style33.css">
<<<<<<< HEAD
=======
     <link rel='stylesheet' href="style.css">
>>>>>>> 7th V
    <!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
     <script src="js/jquery-3.2.1.min.js"></script> 
    <script src="js/bootstrap.min.js"></script>
    <link href='//fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
    <link href='//fonts.googleapis.com/css?family=Anton' rel='stylesheet'>
    <link href='//fonts.googleapis.com/css?family=Exo 2' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   
    
</head>
<body>

<% User str= (User)session.getAttribute("user"); %>
  
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
<<<<<<< HEAD
      <a class="navbar-brand" href="#">Educational <span>Website</span></a>
=======
      <a id="navlogo" class="navbar-brand" href="#">Educational <span>Website</span></a>
>>>>>>> 7th V
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
       <li><a href="#">Welcome <%=str.getName() %></a></li>
        <li><a href="#">Sign out</a></li>
      </ul>
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
<<<<<<< HEAD
    <div class="item active">
      <img src="fff2.jpg">
      <div class="carousel-caption">
           <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
        <a   href="/showallcourse" class="btn btn-default" data-toggle="modal">View All Courses</a>
        <a href="/addcourse" class="btn btn-default" data-toggle="modal" style="padding-left:30px;padding-right:30px;">Add Course</a>      
      </div>
    </div>
      
    <div class="item">
     <img src="fff2.jpg">
      <div class="carousel-caption">
          <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
       <a   href="/showallcourse" class="btn btn-default" data-toggle="modal">View All Courses</a>
       <a href="/addcourse" class="btn btn-default" data-toggle="modal" style="padding-left:30px;padding-right:30px;">Add Course</a>  
=======
    <div class="item active" style="margin-top:50px;">
      <img src="fff2.jpg">
      <div class="carousel-caption" style="right:10%;bottom:25%;">
           <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
        <a   href="/showallcourse" class="btn btn-default" data-toggle="modal">View Courses</a>
        <a href="/addcourse" class="btn btn-default" data-toggle="modal" >Add Course</a>      
      </div>
    </div>
      
    <div class="item" style="margin-top:50px;">
     <img src="fff2.jpg">
      <div class="carousel-caption" style="right:10%;bottom:25%;">
          <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
         
       <a   href="/showallcourse" class="btn btn-default" data-toggle="modal">View Courses</a>
       <a href="/addcourse" class="btn btn-default" data-toggle="modal">Add Course</a>  
>>>>>>> 7th V
          
      </div>
    </div>
      
<<<<<<< HEAD
      <div class="item">
       <img src="fff2.jpg">
      <div class="carousel-caption">
            <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
         <a href="/showallcourse" class="btn btn-default" data-toggle="modal">View All Courses</a>  
         <a href="/addcourse" class="btn btn-default" data-toggle="modal" style="padding-left:30px;padding-right:30px;">Add Course</a>
=======
      <div class="item" style="margin-top:50px;">
       <img src="fff2.jpg">
      <div class="carousel-caption" style="right:10%;bottom:25%;">
            <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
         <a href="/showallcourse" class="btn btn-default" data-toggle="modal">View Courses</a>  
         <a href="/addcourse" class="btn btn-default" data-toggle="modal" >Add Course</a>
>>>>>>> 7th V
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    
    
   <section class="about text-center" id="aboutwebsite">
       <div class="container">
    <div col class="col-lg-offset-1 col-lg-10">
       <p class="header"><span>A</span>bout <span>T</span>he <span>W</span>ebsite</p>
       <p class="description"> <q>This is game-based educational platform. This platform help students to understand
         basic educational concepts while playing simple games.
         These concepts are related to subjects like programming ,science
         and math.</q>
       </p>
     </div>
        
        <div class="clearfix visible-lg-block"></div>
           
      <div class="feature">
          
          <div class="row">
          <div class="col-lg-5">
            <p class="firstfeatureheader"><span>Practice & learn the fun way</span></p>
            <p class="firstfeature">Practice pure code Learn new concepts by solving fun challenges in 25+ languages
                addressing all the hot programming topics.
            </p>
              <p class="firstfeatureheader"><span>Studies suggest gaming is good for childrens brains. (its true!)</span></p>
            <p class="firstfeature">Games also provide real-time feedback that allows students to adjust their 
            solution path and understand concepts more holistically, instead of being limited to just <q>correct</q> or <q>incorrect</q> answers.
            </p>
         </div>
          <div class="col-lg-6 col-lg-offset-1" >
              <div class="embed-responsive embed-responsive-4by3" >
              <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/PNRNwxia0Z4" ></iframe>
              </div>
          </div>
              </div>
       </div>
       </div>
    </section>

<<<<<<< HEAD
<% ArrayList<Course> list = (ArrayList<Course>) request.getAttribute("allcourses");  int i=0;%>
<section class="TeacherCourses text-center">
<%if(!list.isEmpty())%><h3> Your Courses </h3>

 <% for(Course course : list) { i++; %>
=======
<% ArrayList<Course> list = (ArrayList<Course>) request.getAttribute("allcourses");%>
<section class="TeacherCourses text-center">
<%if(!list.isEmpty())%><h3> Your Courses </h3>

 <% for(Course course : list) { %>
>>>>>>> 7th V
    <div class="container">
       <div class="row">
 
        <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12">
           <div class="course">
            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                <h4><%=course.getName()%></h4>    
               <p style="height:250px;overflow:scroll;"><%=course.getDescription() %></p>
                <a href="/addgame?courseid=<%=course.getCourseID()%>" class="btn btn-default" data-toggle="modal" style="margin-bottom:5px;padding:7px;padding-left:70px;padding-right:70px;background-color:#4D4E53;font-size:15px;color:#E8E9D7">Add Game</a> 
<<<<<<< HEAD
                <a id="<%= i %>" href="/showgames?courseid=<%=course.getCourseID()%>"  class="btn btn-default" data-toggle="modal" style="margin-bottom:5px;padding:7px;padding-left:52px;padding-right:52px;background-color:#C13832;font-size:15px;color:#E8E9D7">View All Games</a>
=======
                <a href="/showgames?courseid=<%=course.getCourseID()%>" class="btn btn-default" data-toggle="modal" style="margin-bottom:5px;padding:7px;padding-left:52px;padding-right:52px;background-color:#C13832;font-size:15px;color:#E8E9D7">View All Games</a>
>>>>>>> 7th V
           </div>
           
        </div>
        
         <%} %>
         
         

         
        </div> 
    </div>
    
    </section> 



    <section class="footer text-center">
    <div class="container">
        <div class="row">
         <div class="col-lg-offset-2 col-lg-7 icons">
            <i class="fa fa-facebook-official" aria-hidden="true"></i>
            <i class="fa fa-twitter" aria-hidden="true"></i>
            <i class="fa fa-instagram" aria-hidden="true"></i>
            <i class="fa fa-linkedin" aria-hidden="true"></i>
            <i class="fa fa-youtube" aria-hidden="true"></i>
        </div>
        <div class="col-lg-offset-2 col-lg-7 ">
            <i class="fa fa-phone fa-fw w3-xxlarge w3-margin-right"></i><label class="number"> 01204996961</label>
            <i class="fa fa-map-marker fa-fw w3-xxlarge w3-margin-right"></i><label class="address"> Egypt-Giza</label>
            <i class="fa fa-envelope fa-fw w3-xxlarge w3-margin-right"></i><label class="email"> omer@gmail.com</label>
        </div>
         <div class="col-lg-offset-2 col-lg-7 "> 
            <a>Home|</a>  <a href="#aboutwebsite">About</a>
        </div>
            
        </div>
    </div>
       
    </section>
    
</body>
</html>