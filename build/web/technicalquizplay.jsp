<%-- 
    Document   : technicalquizplay
    Created on : Aug 30, 2018, 11:19:56 AM
    Author     : Dell
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.database"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Answer the QUIZ</title>

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
    String table=request.getParameter("id");
    String id=null;
    if(table.endsWith("technologyquiz"))
    {
        id="Technology Quiz";
    }
    else if(table.endsWith("historyquiz"))
    {
        id="History Quiz";
    }
    else if(table.endsWith("sportsquiz"))
    {
        id="Sports Quiz";
    }
    else if(table.endsWith("aptitudequiz"))
    {
        id="Aptitude Quiz";
    }
    %>
 
    <div class="main">    
        <div class="title_head">
            <h3 class="title">Answer the following Questions !!</h3>
        </div>
    <form action="quizcheck.jsp">
<%
database db = new database();
int i;

for( i=1;i<7;i++)
{%>
<p><b>Question <%= i %>: -<%= db.getQues(table, i) %></b></p>
        <input type="radio" name=<%=i%> value=<%=1%>>  <%=db.getOption1(table,i)%><br>
        <input type="radio" name=<%=i%> value=<%=2%>>  <%=db.getOption2(table,i)%><br>
        <input type="radio" name=<%=i%> value=<%=3%>>  <%=db.getOption3(table,i)%><br>
        <input type="radio" name=<%=i%> value=<%=4%>>  <%=db.getOption4(table,i)%><br><br>
<%
}

%>
<input type="submit" value="Submit <%=id%>" name="id" style="width: 50%; height: 40px; text-align: center; color:white; font-size: 20px; font-weight: 500; word-spacing: 3px; background: #45a049;">

</div>
<jsp:include page="footer.jsp"></jsp:include>

</form>
</body>
</html>
