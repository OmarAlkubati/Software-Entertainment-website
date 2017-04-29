<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
     <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel='stylesheet' href="css/rtl.css">
    <link rel='stylesheet' href="style3.css">
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

    
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" >
<<<<<<< HEAD
      <a class="navbar-brand" href="#">Educational <span>Website</span></a>
=======
      <a id="navlogo" class="navbar-brand" href="#">Educational <span>Website</span></a>
>>>>>>> 7th V
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
  </div><!-- /.container-fluid -->
</nav>
    
    
    <!--LOGIN FORM-->
    <div class="modal fade" id="loginform" role="dialog">
    
    <div class="modal-dialog">
    <div class="modal-content">
        
    <form class="form-horizontal" action="/login">
    <div class="modal-header">
      <h4 class="lead">Login</h4>
    </div>
    <div class="modal-body">
  <div class="form-group">
<<<<<<< HEAD
    <label for="inputEmail3" class="col-lg-2 control-label" >Email</label>
    <div class="col-lg-10">
      <input type="email" id="e" class="form-control"  name="email" placeholder="Email">
=======
    <label for="inputEmail3" class="col-lg-2 control-label">Email</label>
    <div class="col-lg-10">
      <input type="email" class="form-control"  name="email" placeholder="Email">
>>>>>>> 7th V
    </div>
  </div>

 
  <div class="form-group">
    <label for="password" class="col-lg-2 control-label">Password</label>
    <div class="col-lg-10">
<<<<<<< HEAD
      <input type="password" id = "p" class="form-control" name="password" placeholder="password">
=======
      <input type="password" class="form-control" name="password" placeholder="password">
>>>>>>> 7th V
    </div>
  </div>

        </div>
  <div class="modal-footer">
      <a href="#" class="btn btn-default" data-dismiss="modal">Close it</a>
      
<<<<<<< HEAD
      <button id ="l"  type="submit" class="btn btn-primary">Login</button>
=======
      <button type="submit" class="btn btn-primary">Login</button>
>>>>>>> 7th V
    </div>

    
</form>
        
  </div>
 </div>
</div>
    
    
    <!--Sign UP FORM-->
    <div class="modal fade" id="signupform" role="dialog">
    
    <div class="modal-dialog">
    <div class="modal-content">
        
    <form class="form-horizontal" action="/signup">
    <div class="modal-header">
      <h4 class="lead">Sign Up</h4>
    </div>
     <div class="modal-body">
  
  
  <div class="form-group">
    <label for="inputEmail3" class="col-lg-2 control-label">Email</label>
    <div class="col-lg-10">
<<<<<<< HEAD
      <input id ="E" type="email" class="form-control"  name="email" placeholder="Email">
=======
      <input type="email" class="form-control"  name="email" placeholder="Email">
>>>>>>> 7th V
    </div>
  </div>

  <div class="form-group">
    <label class="col-lg-2 control-label">Name</label>   
    <div class="col-lg-10">
<<<<<<< HEAD
      <input id="N" type="text" class="form-control"  name="name" placeholder="Name">
=======
      <input type="text" class="form-control"  name="name" placeholder="Name">
>>>>>>> 7th V
    </div>
  </div>
 
  <div class="form-group">
    <label for="password" class="col-lg-2 control-label">Password</label>
    <div class="col-lg-10">
<<<<<<< HEAD
      <input id= "P" type="password" class="form-control" name="password" placeholder="password">
=======
      <input type="password" class="form-control" name="password" placeholder="password">
>>>>>>> 7th V
    </div>
  </div>
    
  
  <div class="form-group">
    <label class="col-lg-2 control-label">Age</label>
    <div class="col-lg-10">
<<<<<<< HEAD
      <input id= "A" type="number" class="form-control" name="age" placeholder="Age">
=======
      <input type="number" class="form-control" name="age" placeholder="Age">
>>>>>>> 7th V
    </div>
  </div>
    
    
  <div class="form-group">
    <div class="col-sm-offset-3">
<<<<<<< HEAD
     <label id ="t1" class="checkbox-inline "><input type="radio" name="type" value="1">Student</label>
     <label id= "t2" class="checkbox-inline "><input type="radio" name="type" value="2">Teacher</label>
=======
     <label class="checkbox-inline "><input type="radio" name="type" value="1">Student</label>
     <label class="checkbox-inline "><input type="radio" name="type" value="2">Teacher</label>
>>>>>>> 7th V
    </div>
   
  </div>
    

        </div>
  <div class="modal-footer">
      <a href="#" class="btn btn-default" data-dismiss="modal">Close it</a>
      
<<<<<<< HEAD
      <button id ="s" type="submit" class="btn btn-primary">Sign Up</button>
=======
      <button type="submit" class="btn btn-primary">Sign Up</button>
>>>>>>> 7th V
    </div>

    
</form>
        
  </div>
 </div>
</div>
        
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
=======
    <div class="item active" style="margin-top:50px;">
>>>>>>> 7th V
      <img src="fff2.jpg">
      <div class="carousel-caption">
        <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
<<<<<<< HEAD
        <a   id = "2" href="#signupform" class="btn btn-default" data-toggle="modal">Sign Up</a> 
        <a   id ="1" href="#loginform" class="btn btn-default" data-toggle="modal">Login</a> <br><br>
=======
        <a   href="#signupform" class="btn btn-default" data-toggle="modal">Sign Up</a> 
        <a   href="#loginform" class="btn btn-default" data-toggle="modal">Login</a> <br><br>
>>>>>>> 7th V
         
      </div>
    </div>
      
<<<<<<< HEAD
    <div class="item">
=======
    <div class="item" style="margin-top:50px;">
>>>>>>> 7th V
     <img src="fff2.jpg">
      <div class="carousel-caption">
        <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
        <a   href="#signupform" class="btn btn-default" data-toggle="modal">Sign Up</a> 
        <a   href="#loginform" class="btn btn-default" data-toggle="modal">Login</a> <br><br>
         
      </div>
    </div>
      
<<<<<<< HEAD
      <div class="item">
=======
      <div class="item" style="margin-top:50px;">
>>>>>>> 7th V
       <img src="fff2.jpg">
       <div class="carousel-caption">
        <p>This is game-based educational platform. This platform help students to understand basic educational concepts while playing simple games. These concepts are related to subjects like programming ,science and math.
        <a href="#aboutwebsite" style="margin-left:5px;font-size:15px;color:#80bfff">see more...</a> </p>
        <a   href="#signupform" class="btn btn-default" data-toggle="modal">Sign Up</a> 
        <a   href="#loginform" class="btn btn-default" data-toggle="modal">Login</a> <br><br>
         
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
              <p class="firstfeatureheader"><span>Studies suggest gaming is good for children’s brains. (it’s true!)</span></p>
            <p class="firstfeature">Games also provide real-time feedback that allows students to adjust their solution path and understand concepts more holistically, instead of being limited to just “correct” or “incorrect” answers.
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
    
   
    <!-- 16:9 aspect ratio 
<div class="embed-responsive embed-responsive-16by9">
  <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/PNRNwxia0Z4" ></iframe>
</div>
 -->
   
</body>