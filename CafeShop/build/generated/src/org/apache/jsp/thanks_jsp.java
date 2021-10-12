package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thanks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title></title>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Lato:300,400|Montserrat:700' rel='stylesheet' type='text/css'>\n");
      out.write("        <style>\n");
      out.write("            @import url(//cdnjs.cloudflare.com/ajax/libs/normalize/3.0.1/normalize.min.css);\n");
      out.write("            @import url(//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css);\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://2-22-4-dot-lead-pages.appspot.com/static/lp918/min/default_thank_you.css\">\n");
      out.write("        <script src=\"https://2-22-4-dot-lead-pages.appspot.com/static/lp918/min/jquery-1.9.1.min.js\"></script>\n");
      out.write("        <script src=\"https://2-22-4-dot-lead-pages.appspot.com/static/lp918/min/html5shiv.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"site-header\" id=\"header\">\n");
      out.write("            <h5 class=\"site-header__title\" data-lead-id=\"site-header-title\">thanks for your order</h5>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <i class=\"fa fa-check main-content__checkmark\" id=\"checkmark\"></i>\n");
      out.write("            <p class=\"main-content__body\" data-lead-id=\"main-content-body\">Thanks a bunch for buy our product. It means a lot to us!</p>               \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <a style=\"font-size: 20px;color: red\" href=\"home\"><button>Back To Shop</button></a>\n");
      out.write("\n");
      out.write("        <footer class=\"site-footer\" id=\"footer\">\n");
      out.write("            <p class=\"site-footer__fineprint\" id=\"fineprint\">Copyright ©2014 | All Rights Reserved</p>\n");
      out.write("        </footer>\n");
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
