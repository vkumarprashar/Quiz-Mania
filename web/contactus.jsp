<%-- 
    Document   : contactus
    Created on : Aug 30, 2018, 10:46:33 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>CONTACT US</title>

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
.main{
	width:75%;
	height:auto;
	margin-top: 3px;
	margin-left: 12.5%;
	background-color: #f2f2f2;
	display: block;
	border: 1px solid #DAE4E5;
}
input[type=text], select, textarea
{
	width: 95%;
	display: block;
	margin-top: 10px;
	margin-left: 20px;
	padding: 7px;
	border: 1px solid black;
	box-sizing: border-box;
}
label{
	margin: 10px;
	font-size:20px;
	font-style: oblique;
	padding: 10px;
}
input[type=submit]{
	margin-top:  10px;
	margin-left: 10%;
        margin-bottom: 10px;
	width: 80%;
	height: 50px; 
	font-size: 25px;
	background-color: #4CAF50;
	color: white;
        letter-spacing: 3px;
        font-weight: 600;
}
input[type=submit]:hover{
	background-color: #45a049;
}
.field{
	height: 510px;
  	border-color: #2F8D94;
  	border-style: groove;
}
</style>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
        <div class="jumbotron">
                <div class="quiz_jumbotron">
                    <h1>Contact Us!!</h1>
                    <p>Having a query? contact us</p>
                </div>
	</div>
        <div class="main">
            
            <form action="contactusMail.jsp" >

    <label for="name">Name: </label>
    <input type="text" id="name" name="name" placeholder="Name...">

    <label for="email">Email: </label>
    <input type="text" id="email" name="email" placeholder="Enter the email...">

<!--    <label for="country">Country: </label>
    <select id="country" name="country" style="margin-left: 20px;">
        <option value="australia"> Australia </option>
    	<option value="berlin"> Berlin </option>
    	<option value="canada"> Canada </option>
    	<option value="denmark"> Denmark </option>
    	<option value="england"> England </option>
    	<option value="england"> Fizi </option>
    	<option value="india"> India </option>
    	<option value="singapore"> Singapore </option>
    	<option value="thialand"> Thialand </option>
    	<option value="vietnam"> Vietnam </option>
    	<option value="zimbawe"> Zimbawe </option>
    </select>-->
    
    <label for="subject">Subject: </label>
    <textarea id="subject" name="subject" style="height:200px; margin-left: 20px;" placeholder="Write a message..." ></textarea>

    <input type="submit" value="SUBMIT">

  </form>
</div>
        
        <jsp:include page="footer.jsp"></jsp:include>
    

</body>
</html>