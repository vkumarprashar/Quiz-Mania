<%-- 
    Document   : header
    Created on : Aug 28, 2018, 9:54:40 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
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
        nav
        {
                font-weight: 900;
                margin-top: -32px;
        }
        .navbar-brand{
                width: 100px;
        }
        .nav-item{
                width: auto;
                text-align: center;
                font-size: 18px;
                 padding-left:10px;
          padding-right:10px;
        }
    </style>
    </head>
    <body>
    <nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
		<button class="navbar-toggler" data-toggle="collapse" data-target="#collapse_target">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<div class="collapse navbar-collapse" id="collapse_target">
		<a class="navbar-brand" href="index.jsp"><i class="fas fa-home"></i></a>
		<span class="navbar-text"></span>	
		<ul class="navbar-nav">
			<li class="nav-item">
				<a class="nav-link" href="index.jsp">HOME</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">WHAT WE ARE?</a>
			</li>
			<li class="nav-item dropdown" >
				<a class="nav-link dropdown-toggle" data-toggle="dropdown" data-target="#dropdown_target" href="#">Quiz Types
					<span class="caret"></span>
				</a>
				<div class="dropdown-menu" aria-labelledby="dropdown_target">
					<a class="dropdown-item" href="technical quiz.jsp">Technical Quiz</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="history quiz.jsp">Historical Quiz</a>
                                        <div class="dropdown-divider"></div>
					<a class="dropdown-item" href="sports quiz.jsp">Sports Quiz</a>
                                        <div class="dropdown-divider"></div>
					<a class="dropdown-item" href="aptitude quiz.jsp">Aptitude Quiz</a>
				</div>
			</li>
			<li class="nav-item">
                            <a class="nav-link" href="contactus.jsp">ANY QUERY?</a>
			</li>
			
		</ul>
		</div>
	</nav>    
    </body>
</html>