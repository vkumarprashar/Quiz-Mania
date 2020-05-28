package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>CONTACT US</title>\n");
      out.write("\n");
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
      out.write("<style>\n");
      out.write(".container{\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:auto;\n");
      out.write("\tmargin-top: 3px;\n");
      out.write("\tmargin-left: 7px;\n");
      out.write("\tbackground-color: #f2f2f2;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tborder: 1px solid #DAE4E5;\n");
      out.write("}\n");
      out.write("input[type=text], select, textarea\n");
      out.write("{\n");
      out.write("\twidth: 95%;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("\tpadding: 7px;\n");
      out.write("\tborder: 1px solid black;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("label{\n");
      out.write("\tmargin: 10px;\n");
      out.write("\tfont-size:20px;\n");
      out.write("\tfont-style: oblique;\n");
      out.write("\tpadding: 10px;\n");
      out.write("}\n");
      out.write("input[type=submit]{\n");
      out.write("\tmargin-top:  10px;\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 40px; \n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tbackground-color: #4CAF50;\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write("input[type=submit]:hover{\n");
      out.write("\tbackground-color: #45a049;\n");
      out.write("}\n");
      out.write(".field{\n");
      out.write("\theight: 510px;\n");
      out.write("  \tborder-color: #2F8D94;\n");
      out.write("  \tborder-style: groove;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<fieldset class=\"field\">\n");
      out.write("<legend>Contact Us</legend>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form action=\"contact\" >\n");
      out.write("\n");
      out.write("    <label for=\"name\">Name: </label>\n");
      out.write("    <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Name...\">\n");
      out.write("\n");
      out.write("    <label for=\"email\">Email: </label>\n");
      out.write("    <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Enter the email...\">\n");
      out.write("\n");
      out.write("    <label for=\"country\">Country: </label>\n");
      out.write("    <select id=\"country\" name=\"country\">\n");
      out.write("        <option value=\"australia\"> Australia </option>\n");
      out.write("    \t<option value=\"berlin\"> Berlin </option>\n");
      out.write("    \t<option value=\"canada\"> Canada </option>\n");
      out.write("    \t<option value=\"denmark\"> Denmark </option>\n");
      out.write("    \t<option value=\"england\"> England </option>\n");
      out.write("    \t<option value=\"england\"> Fizi </option>\n");
      out.write("    \t<option value=\"india\"> India </option>\n");
      out.write("    \t<option value=\"singapore\"> Singapore </option>\n");
      out.write("    \t<option value=\"thialand\"> Thialand </option>\n");
      out.write("    \t<option value=\"vietnam\"> Vietnam </option>\n");
      out.write("    \t<option value=\"zimbawe\"> Zimbawe </option>\n");
      out.write("    </select>\n");
      out.write("    \n");
      out.write("    <label for=\"subject\">Subject: </label>\n");
      out.write("    <textarea id=\"subject\" name=\"subject\" style=\"height:200px\" placeholder=\"Write a message...\"></textarea>\n");
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"SUBMIT\">\n");
      out.write("\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
