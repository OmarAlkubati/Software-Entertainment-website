<%@ page import="java.util.ArrayList, educational.entertainment.models.User, educational.entertainment.models.Game" %>
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
      <a class="navbar-brand" href="#">Educational <span>Website</span></a>
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
    <div class="item active">
      <img src="fff2.jpg">
      <div class="carousel-caption">
           <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
           </p>
            <%String type=(String)session.getAttribute("type"); if(type.equals("teacher")){%>
        <a href="/addcourse" class="btn btn-default" data-toggle="modal" style="padding-left:30px;padding-right:30px;">Add Course</a>
            <%} %>
      </div>
    </div>
      
    <div class="item">
     <img src="fff2.jpg">
      <div class="carousel-caption">
          <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
         </p>
       <% type=(String)session.getAttribute("type"); if(type.equals("teacher")){%>
        <a href="/addcourse" class="btn btn-default" data-toggle="modal" style="padding-left:30px;padding-right:30px;">Add Course</a>
            <%} %>
      </div>
    </div>
      
      <div class="item">
       <img src="fff2.jpg">
      <div class="carousel-caption">
            <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
            </p>
             <% type=(String)session.getAttribute("type"); if(type.equals("teacher")){%>
        <a href="/addcourse" class="btn btn-default" data-toggle="modal" style="padding-left:30px;padding-right:30px;">Add Course</a>
            <%} %>
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


<% ArrayList<Game> list = (ArrayList<Game>) request.getAttribute("allgames");%>
<section class="TeacherCourses text-center">
<h3> Games </h3>

 <% for(Game game : list) { %>
    <div class="container">
       <div class="row">
 
        <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12" style="margin-bottom:20px">
           <div class="course">
             <img src="gamelogo.jpg" style=" border: 2px solid #a1a1a1;padding:10px 10px; border-radius: 50px;">
                <h4><%=game.getGameName()%></h4>    
               <p style="height:250px;overflow:scroll;"><%=game.getDescription() %></p>
                <a href="/playgame?gameid=<%=game.getGameId() %>" class="btn btn-default" data-toggle="modal" style="margin-bottom:5px;padding:7px;padding-left:52px;padding-right:52px;background-color:#C13832;font-size:15px;color:#E8E9D7">Start Play</a>
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