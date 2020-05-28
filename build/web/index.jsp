<%-- 
    Document   : index
    Created on : Aug 28, 2018, 9:51:43 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
	<!--FONT AWESOME!-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <style>
            
            .quiz{
                background-color: white;
                padding: 50px;
                
            }
            .more{
                margin: 40px;
                border: 1px solid black;
                width: 40px;
                border-radius: 100px;
                height: 20px;
            }
            .box{
                border: 1px solid darkgray;
                width: 25%;
                float: left;
                margin-left: 40px;
                background: #e9ecef;
            }
            .icon{
                text-align: center; 
                font-size: 80px;
            }
            .data {
                font-family: caret;
                padding: 10px;
                text-decoration: none;
                text-align: center;
                font-size: 30px;
                
            }
            .data a{
                color: #32879D;
                font-weight: 600;
            }
            .title{
                font-family:caret; 
                font-size: 35px; 
                font-weight: 600; 
                text-align: center; 
                margin-left:15%; 
                margin-right: 15%; 
                width: 70%; 
                padding-bottom: 15px; 
                color:#e52d27;
                padding: 20px;
            }
        </style>
    
    </head>
    <body>
            
        <div class="jumbotron"  style="text-align: center;">
			<h1 >Quiz Mania</h1>
			<p>Making you Sharp!! Sharper!! Sharpest!! </p>
	</div>
        <jsp:include page="header.jsp"></jsp:include>
        <!--//banner -->
	<!--/icons-->
        <div class="whytoplay">
                <div class="title_head">
                    <h3 class="title">Why to <span>Play with Us?</span></h3>
                </div>
                <div class="inner_info" style="text-align: justify; font-family:caret; font-size:large; margin-left:15%; margin-right: 15%; width: 70%; ">
                  Play with us to test your knowledge and increase your IQ so that you can be the smartest in your friends and family.We Cover a Variety of topics
                  in our quizes from aptitudes to technical.The Topics we cover are very helpful in future.So take a break from life and play
                  with us......!!!!!!
                </div>
        </div>
        <div class="quiz" >
            <div class="title_head">
                <h3 class="title"><span>Different Choices !</span>to build knowledge</h3>
            </div>
    <div style="margin-left:10%; margin-right: 5%; width: 85%;">
        <div class="box">
                <div class="icon">
                    <i class="fa fa-laptop" area-hidden="true"></i>
                </div>
            <div class="data">
                <a href="technical quiz.jsp">Technical Quiz</a>
                </div>
            </div>
            <div class="box">
                <div class="icon" >
                <i class="fa fa-eye" area-hidden="true"></i>
                </div>
                <div class="data">
                    <a href="history quiz.jsp">History Quiz</a>
                </div>
            </div>
            <div class="box">
                <div class="icon">
                <i class="fas fa-volleyball-ball" area-hidden="true"></i>
                </div>
                <div class="data">
                    <a href="sports quiz.jsp">Sports Quiz</a>
                </div>
            </div>
            
        </div>
    </div>    
        <!--REVIEW-->
        <div class="review" style="font-family:caret; text-align: center; ">
            <div class="title_head">
                    <h3 class="title">Help Us in Improving!! Give us a review!</h3>
            </div>
            
            <form action="review.jsp">
            <div class="textfield_type1">
                <label for="name" style="font-size: 18px;">Enter Full Name*&nbsp;</label>
                <input type="text" id="fullname" name="fullname"><br>
                
                <label for="Email" style="font-size: 18px;">Email Required*&nbsp;&nbsp; </label>   
                <input type="text" id="email" name="email">
            </div>
            <div class="textfield_type2">
                <label for="writereview" style="font-size: 18px;">Write a Review:&nbsp;&nbsp;&nbsp; </label>
                <textarea id="writereview" name="writereview" placeholder="Write Something that will help us in improving ourself!"></textarea>
                <br><span style="text-align: center; margin-left: 120px;"><input type="submit" value="SUBMIT"></span>
            </div>
            </form>
        </div>
	
        <div>
        <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>