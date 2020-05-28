
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class contactus
 */
@WebServlet("/contactus")
public class contactus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	PrintWriter out=response.getWriter();
		

		String name=request.getParameter("name");
		String subject=request.getParameter("email");
		String country=request.getParameter("country");
		String body=request.getParameter("subject");
		
		
		String user="vkumarprashar@gmail.com";
		String password="vinay@27@27";
		
		Properties prop=new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "465");
		
		Session session = Session.getDefaultInstance(prop,
			new javax.mail.Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication(){
					return new PasswordAuthentication(user, password);
				}
			}
		);
		
		try{
		MimeMessage msg=new MimeMessage(session);
		
		msg.setFrom(new InternetAddress(user));
		msg.addRecipient(Message.RecipientType.TO,new InternetAddress("vprashar23@gmail.com"));
		msg.setSubject(subject);
		msg.setText("Name:- "+name+"___Country:-  "+country+"____Query:- "+body);
		
		Transport.send(msg);
		
                    RequestDispatcher rd=request.getRequestDispatcher("contactus.jsp");
                    rd.forward(request, response);
		}catch(Exception e)
		{	
			e.printStackTrace();
			out.print("MESSAGE NOT SENT ");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	}

}
