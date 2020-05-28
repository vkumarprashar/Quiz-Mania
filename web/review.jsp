<%-- 
    Document   : contactusdb
    Created on : Aug 31, 2018, 8:00:54 AM
    Author     : Dell
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Connection con;
	PreparedStatement stat;
	int i;
            String email= request.getParameter("email");
		String subject= request.getParameter("writereview");
		String name= request.getParameter("fullname");
		
		
		try{
			
			con=connect.connect.connection();
			stat=con.prepareStatement("INSERT INTO review(name,email,subject) values(?, ?, ?)");
			stat.setString(1, name);
			stat.setString(2, email);
			stat.setString(3, subject);
			
			
			i= stat.executeUpdate();
			if(i>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
        %>
    </body>
</html>
