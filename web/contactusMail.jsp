<%-- 
    Document   : contactusMail
    Created on : Aug 31, 2018, 8:04:20 AM
    Author     : Dell
--%>

<%@page import="bean.database"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <%
       String name=request.getParameter("name");
		String email=request.getParameter("email");
//		String country=request.getParameter("country");
		String subject=request.getParameter("subject");
		
                database db=new database();
                int i=db.mail(name, email, subject);
		if(i>0)
                {
                    RequestDispatcher rd=request.getRequestDispatcher("contactus.jsp");
                    rd.forward(request, response);
                }
                else
                {
                    out.println("MAIL NOT SENT");
                }
       %>
    
</html>
