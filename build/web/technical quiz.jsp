<%-- 
    Document   : technical quiz
    Created on : Aug 29, 2018, 9:50:51 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Technology Quiz</title>
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
                    <h1>Technical Quiz Mania</h1>
                    <p>Improving the technical knowledge!!</p>
                    <button type="button" data-toggle="modal" class="btn btn-lg btn-info">
                        <a href="technicalquizplay.jsp?id=technologyquiz" style="color: white; font-weight: 500; font-size: 24px;">Play Quiz!</a>
                    </button>
                </div>
	</div>
        <div class="main">
            
                <p>Technology is the key aspect in the Today's world. It is the thing that could change the world. Here you will solve the quiz that is relates to the latest technology questions. It will help you in increasing your knowledge. You will remain upto date about the technology.</p>
            
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
