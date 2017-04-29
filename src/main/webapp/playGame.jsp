<%@ page import="educational.entertainment.models.User" %>
<%@ page import="java.util.ArrayList, educational.entertainment.models.Question,educational.entertainment.models.Choice" %>
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
    
    
    <%! String str2="group"; %>
<%     
 ArrayList<Question> QuesList = 
 (ArrayList<Question>) request.getAttribute("allquestions");
          %>
          
    <div class="container">
    <div class="row">
    <div class="col-md-offset-3 col-md-6">
    
     <form class="gameform" action="/calcScore" method="post" >
     
      <%for(int i=0;i<QuesList.size();i++){ %>
	  <p> <%= QuesList.get(i).getFullQuestion() %> </p>
	  
	     <fieldset id=<%=str2+i%> style="border-width:0px" >
	   <% for(int j=0;j<QuesList.get(i).getChoices().size();j++){%>
              <input type="radio" name=<%=str2+i%> value= <%= j %> />
              <%=QuesList.get(i).getChoices().get(j).getFullChoice() %>
              <br/>
           <% } %>
       </fieldset>
         <br/>  
        <%}%>
     
    <br/>  
  <input type="submit" class="btn btn-default" style="background-color:#C13832;color: #E8E9D7" value="Submit Solution">
   </form>
    
    </div>
    </div>
    </div>
    
    


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