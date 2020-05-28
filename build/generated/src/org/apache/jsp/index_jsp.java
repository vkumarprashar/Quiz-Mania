package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-2.1.3.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\t\n");
      out.write("\t<!--FONT AWESOME!-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .quiz{\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 50px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .more{\n");
      out.write("                margin: 40px;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                width: 40px;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                height: 20px;\n");
      out.write("            }\n");
      out.write("            .box{\n");
      out.write("                border: 1px solid darkgray;\n");
      out.write("                width: 25%;\n");
      out.write("                float: left;\n");
      out.write("                margin-left: 40px;\n");
      out.write("                background: #e9ecef;\n");
      out.write("            }\n");
      out.write("            .icon{\n");
      out.write("                text-align: center; \n");
      out.write("                font-size: 80px;\n");
      out.write("            }\n");
      out.write("            .data {\n");
      out.write("                font-family: caret;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 30px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .data a{\n");
      out.write("                color: #32879D;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                font-family:caret; \n");
      out.write("                font-size: 35px; \n");
      out.write("                font-weight: 600; \n");
      out.write("                text-align: center; \n");
      out.write("                margin-left:15%; \n");
      out.write("                margin-right: 15%; \n");
      out.write("                width: 70%; \n");
      out.write("                padding-bottom: 15px; \n");
      out.write("                color:#e52d27;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("        <div class=\"jumbotron\"  style=\"text-align: center;\">\n");
      out.write("\t\t\t<h1 >Quiz Mania</h1>\n");
      out.write("\t\t\t<p>Making you Sharp!! Sharper!! Sharpest!! </p>\n");
      out.write("\t</div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <!--//banner -->\n");
      out.write("\t<!--/icons-->\n");
      out.write("        <div class=\"whytoplay\">\n");
      out.write("                <div class=\"title_head\">\n");
      out.write("                    <h3 class=\"title\">Why to <span>Play with Us?</span></h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inner_info\" style=\"text-align: justify; font-family:caret; font-size:large; margin-left:15%; margin-right: 15%; width: 70%; \">\n");
      out.write("                  Play with us to test your knowledge and increase your IQ so that you can be the smartest in your friends and family.We Cover a Variety of topics\n");
      out.write("                  in our quizes from aptitudes to technical.The Topics we cover are very helpful in future.So take a break from life and play\n");
      out.write("                  with us......!!!!!!\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"quiz\" >\n");
      out.write("            <div class=\"title_head\">\n");
      out.write("                <h3 class=\"title\"><span>Different Choices !</span>to build knowledge</h3>\n");
      out.write("            </div>\n");
      out.write("    <div style=\"margin-left:10%; margin-right: 5%; width: 85%;\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("                <div class=\"icon\">\n");
      out.write("                    <i class=\"fa fa-laptop\" area-hidden=\"true\"></i>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"data\">\n");
      out.write("                <a href=\"technical quiz.jsp\">Technical Quiz</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"icon\" >\n");
      out.write("                <i class=\"fa fa-eye\" area-hidden=\"true\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"data\">\n");
      out.write("                    <a href=\"history quiz.jsp\">History Quiz</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"icon\">\n");
      out.write("                <i class=\"fas fa-volleyball-ball\" area-hidden=\"true\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"data\">\n");
      out.write("                    <a href=\"sports quiz.jsp\">Sports Quiz</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("        <!--REVIEW-->\n");
      out.write("        <div class=\"review\" style=\"font-family:caret; text-align: center; \">\n");
      out.write("            <div class=\"title_head\">\n");
      out.write("                    <h3 class=\"title\">Help Us in Improving!! Give us a review!</h3>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <form action=\"review.jsp\">\n");
      out.write("            <div class=\"textfield_type1\">\n");
      out.write("                <label for=\"name\" style=\"font-size: 18px;\">Enter Full Name*&nbsp;</label>\n");
      out.write("                <input type=\"text\" id=\"fullname\" name=\"fullname\"><br>\n");
      out.write("                \n");
      out.write("                <label for=\"Email\" style=\"font-size: 18px;\">Email Required*&nbsp;&nbsp; </label>   \n");
      out.write("                <input type=\"text\" id=\"email\" name=\"email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textfield_type2\">\n");
      out.write("                <label for=\"writereview\" style=\"font-size: 18px;\">Write a Review:&nbsp;&nbsp;&nbsp; </label>\n");
      out.write("                <textarea id=\"writereview\" name=\"writereview\" placeholder=\"Write Something that will help us in improving ourself!\"></textarea>\n");
      out.write("                <br><span style=\"text-align: center; margin-left: 120px;\"><input type=\"submit\" value=\"SUBMIT\"></span>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\t\n");
      out.write("        <div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
