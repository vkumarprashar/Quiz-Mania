package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("        \t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-2.1.3.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\t\n");
      out.write("\t<!--FONT AWESOME!-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        nav\n");
      out.write("        {\n");
      out.write("                font-weight: 900;\t\n");
      out.write("        }\n");
      out.write("        .navbar-brand{\n");
      out.write("                width: 100px;\n");
      out.write("        }\n");
      out.write("        .nav-item{\n");
      out.write("                width: auto;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 18px;\n");
      out.write("                 padding-left:10px;\n");
      out.write("          padding-right:10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-light bg-light sticky-top\">\n");
      out.write("\t\t<button class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#collapse_target\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"collapse_target\">\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.html\"><i class=\"fas fa-home\"></i></a>\n");
      out.write("\t\t<span class=\"navbar-text\"></span>\t\n");
      out.write("\t\t<ul class=\"navbar-nav\">\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"index.jsp\">HOME</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\">WHAT WE ARE?</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t<a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" data-target=\"#our_work\" href=\"#\">OUR WORK !\n");
      out.write("\t\t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"our_work\">\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">All PROJECTS</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">PROJECTS on REQUEST</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">OTHER WORKS</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\" >\n");
      out.write("\t\t\t\t<a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" data-target=\"#dropdown_target\" href=\"#\">NEW THINGS\n");
      out.write("\t\t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown_target\">\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"\">BLOG POSTS</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"\">CUSTOMER'S HAPPY STORIES !</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\">ANY QUERY?</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\">WORK WITH US ?</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>    \n");
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
