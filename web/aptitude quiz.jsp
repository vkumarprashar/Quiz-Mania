<%-- 
    Document   : aptitude quiz.jsp
    Created on : Aug 29, 2018, 10:11:40 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aptitude Quiz</title>
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
             .main{
                margin-top: 50px;
                width: 75%;
                margin-left: 12.5%;
            }
            
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div class="jumbotron">
                <div class="quiz_jumbotron">
                    <h1>Aptitude Quiz Mania</h1>
                    <p>Know your Skills? Build the Skills?</p>
                    <button type="button" data-toggle="modal" class="btn btn-lg btn-info" data-target="#sampleModal">
                        <a href="technicalquizplay.jsp?id=aptitudequiz" style="color: white; font-weight: 500; font-size: 24px;">Play Quiz!</a>
                    </button>
                </div>
	</div>
        <div class="main">
            
                <p>Building the Aptitude is the main prospective of the todays youth. Here you will be able to test your knowledge about your aptitude.</p>
            
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
