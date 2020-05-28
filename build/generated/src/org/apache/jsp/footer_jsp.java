package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-2.1.3.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\t\n");
      out.write("\t<!--FONT AWESOME!-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"page-footer font-small unique-color-dark pt-4\">\n");
      out.write("\n");
      out.write("            <!-- Footer Elements -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("              <!-- Call to action -->\n");
      out.write("              <ul class=\"list-unstyled list-inline text-center py-2\">\n");
      out.write("                <li class=\"list-inline-item\">\n");
      out.write("                  <h5 class=\"mb-1\">Register for free</h5>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"list-inline-item\">\n");
      out.write("                  <a href=\"#!\" class=\"btn btn-outline-white btn-rounded\">Sign up!</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("              <!-- Call to action -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer Elements -->\n");
      out.write("\n");
      out.write("            <!-- Copyright -->\n");
      out.write("            <div class=\"footer-copyright text-center py-3\">© 2018 Copyright:\n");
      out.write("              <a href=\"https://mdbootstrap.com/bootstrap-tutorial/\"> MDBootstrap.com</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Copyright -->\n");
      out.write("\n");
      out.write("          </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
