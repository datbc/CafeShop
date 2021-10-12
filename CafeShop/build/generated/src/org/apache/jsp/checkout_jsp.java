package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Coffee Shop Pages</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/header.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section class=\"breadcrumb_section text-uppercase\" style=\"background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"page_title text-white wow fadeInUp\" data-wow-delay=\".1s\">CHECK OUT</h1>\n");
      out.write("                <ul class=\"breadcrumb_nav ul_li wow fadeInUp\" data-wow-delay=\".2s\">\n");
      out.write("                    <li><a href=\"home\"><i class=\"fas fa-home\"></i> Home</a></li>\n");
      out.write("                    <li>CHECK OUT</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"breadcrumb_icon_wrap\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"breadcrumb_icon wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("                        <img src=\"assets/images/feature/icon_01.png\" alt=\"icon_not_found\">\n");
      out.write("                        <span class=\"bg_shape\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"cart_section sec_ptb_120 bg_default_gray\">\n");
      out.write("            <div class=\"container container_boxed\">\n");
      out.write("                <div class=\"checkout_form\">\n");
      out.write("                    <h2 class=\"form_title text-uppercase wow fadeInUp\" data-wow-delay=\".1s\">Select payment Method</h2>\n");
      out.write("                    <form action=\"#\">                   \n");
      out.write("                        <h3 class=\"form_title text-uppercase wow fadeInUp\">personal Info !</h3>\n");
      out.write("                        <div class=\"row wow fadeInUp\" data-wow-delay=\".3s\">\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"form_item\">\n");
      out.write("                                    <h4 class=\"form_field_title\">First Name<sup>*</sup></h4>\n");
      out.write("                                    <input type=\"text\" name=\"firstname\" placeholder=\"First Name\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"form_item\">\n");
      out.write("                                    <h4 class=\"form_field_title\">Last Name<sup>*</sup></h4>\n");
      out.write("                                    <input type=\"text\" name=\"lastname\" placeholder=\"Last Name\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"form_item\">\n");
      out.write("                                    <h4 class=\"form_field_title\">Number<sup>*</sup></h4>\n");
      out.write("                                    <input type=\"tel\" name=\"telephone\" placeholder=\"Number\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"form_item\">\n");
      out.write("                                    <h4 class=\"form_field_title\">Own Adress<sup>*</sup></h4>\n");
      out.write("                                    <input type=\"text\" name=\"adress\" placeholder=\"Own Adress\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"form_item\">\n");
      out.write("                                    <h4 class=\"form_field_title\">Mail Address<sup>*</sup></h4>\n");
      out.write("                                    <input type=\"email\" name=\"email\" placeholder=\"Mail Address\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form_item wow fadeInUp\" data-wow-delay=\".4s\">\n");
      out.write("                            <h4 class=\"form_field_title\">Additional Information*<sup>*</sup></h4>\n");
      out.write("                            <textarea name=\"message\" placeholder=\"Note about your order, Special note for delevery !\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"checkout_form_footer wow fadeInUp\" data-wow-delay=\".5s\">\n");
      out.write("                        <span class=\"total_price\"><strong>Total</strong> $255</span>\n");
      out.write("                        <a class=\"btn btn_primary text-uppercase\" href=\"\">Place Order</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
