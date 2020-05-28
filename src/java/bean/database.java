package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connect.connect;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class database
{
	Connection con;
	PreparedStatement stat;
	ResultSet set;
	String ques;
	String answer;
	int choice;
	int score, i;
	
	//GETTING QUESTIONS
	public String getQues(String table,int sno)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1,sno);
			set=stat.executeQuery();
			if(set.next())
			{
				ques=set.getString(2);
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ques;
	}
	
	
	//GETTING ANSWERS
	public String getOption1(String table, int sno)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1, sno);
			set=stat.executeQuery();
			if(set.next())
			{
					answer=set.getString(3);		
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
                System.out.println(answer);
		return answer;
	}
	
	public String getOption2(String table, int sno)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1, sno);
			set=stat.executeQuery();
			if(set.next())
			{
					answer=set.getString(4);		
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return answer;
	}
	
	public String getOption3(String table, int sno)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1, sno);
			set=stat.executeQuery();
			if(set.next())
			{
					answer=set.getString(5);		
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return answer;
	}
	
	public String getOption4(String table, int sno)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1, sno);
			set=stat.executeQuery();
			if(set.next())
			{
					answer=set.getString(6);		
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return answer;
	}
	
	public int getScore(String table, int sno,int choice)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1, sno);
			set=stat.executeQuery();
			if(set.next())
			{
					this.choice=set.getInt(8);		
					if(this.choice==choice)
					{
						score++;
					}
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return score;
	}
	
	public String selected(String table, int sno,int choice)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1, sno);
			set=stat.executeQuery();
			if(set.next())
			{
				if(choice==1)
				{
					answer=set.getString(3);
				}
				else if(choice==2)
				{
					answer=set.getString(4);
				}
				else if(choice==3)
				{
					answer=set.getString(5);
				}
				else if(choice==4)
				{
					answer=set.getString(6);
				}
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return answer;
	}
	
	public String getAswer(String table, int sno)
	{
		try{
			con=connect.connection();
			stat=con.prepareStatement("select * from "+ table +" where sno=?");
			stat.setInt(1, sno);
			set=stat.executeQuery();
			if(set.next())
			{
				answer=set.getString(7);
			}
			stat.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return answer;
	}
        
        public int mail(String name,String email,String subject)
        {
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
		msg.setSubject(email);
		msg.setText("Name:- "+name+"____Query:- "+subject);
		
		Transport.send(msg);
		
                    return 1;
		}catch(Exception e)
		{	
			e.printStackTrace();
			
		}
            return 0;
        }
}	

