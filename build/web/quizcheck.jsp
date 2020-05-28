<%@page import="bean.database"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESULT</title>
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
                margin-top: 50px;
                
                width: 75%;
                margin-left: 12.5%;
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
            p{
                font-size: 18px;
                
            }
        </style>

</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
<%
String id=request.getParameter("id");
String table=null;
if(id.endsWith("Technology Quiz"))
{
    table="technologyquiz";
}
else if(id.endsWith("History Quiz"))
{
    table="historyquiz";
}
else if(id.endsWith("Sports Quiz"))
{
    table="sportsquiz";
}
else if(id.endsWith("Aptitude Quiz"))
{
    table="aptitudequiz";
}
database db = new database();
int i=1, score=0;
int answer[]=new int[8];
for( i=1;i<7;i++)
{
	answer[i]=Integer.parseInt(request.getParameter(String.valueOf(i)));
	score=db.getScore(table,i, answer[i]);
}
%>
<div class="main">
    
    <div class="title_head">
        <h3 class="title"> Your Score: - <%=score %>/6</h3>
    </div>
    
<%
for(i=1;i<7;i++)
{
%>
<p><b>Question <%= i %>: -<%= db.getQues(table,i) %></b></p>
<p>Your Answer: - <%= db.selected(table,i, answer[i]) %>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Right Answer: - <%= db.getAswer(table,i) %></p>
<%

}
%>
<h4 style="text-align: center;">Thank you! for playing Quiz with us. Try other one too!</h4>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>