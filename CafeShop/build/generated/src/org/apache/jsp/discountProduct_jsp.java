package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class discountProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style7.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"assets/images/logo/logo_white_1x.png\" alt=\"logo\" width=\"auto\" height=\"auto\">\n");
      out.write("                </div>\n");
      out.write("                <span class=\"name\">CAFENOD</span>\n");
      out.write("\n");
      out.write("                <div class=\"menu1\">\n");
      out.write("                    <span class=\"title1\">Qu???n l??</span>\n");
      out.write("                    <div class=\"item1\">\n");
      out.write("                        <i class=\"far fa-folder\"></i>\n");
      out.write("                        <a class=\"title2\" href=\"adminHome.jsp\">Qu???n l?? t??i kho???n</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item2\">\n");
      out.write("                        <i class=\"far fa-file\"></i>\n");
      out.write("                        <a class=\"title3\" href=\"manageProduct.jsp\">Qu???n l?? s???n ph???m</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item3\">\n");
      out.write("                        <i class=\"far fa-envelope\"></i>\n");
      out.write("                        <a class=\"title4\" href=\"manageCategory.jsp\">Qu???n l?? danh mu??c</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item10\">\n");
      out.write("                        <i class=\"fas fa-tag\"></i>\n");
      out.write("                        <a class=\"title4\" href=\"manageEvent.jsp\">Qu???n l?? Event</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"top\">\n");
      out.write("                    <input class=\"search\" type=\"text\" placeholder=\"T??n kh??ch h??ng, t??n s???n ph???m\">\n");
      out.write("                    <div class=\"item7\">\n");
      out.write("                        <i class=\"fas fa-search\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item8\">\n");
      out.write("                        <img src=\"assets/images/logo/logo_white_1x.png\" alt=\"logo\" width=\"auto\" height=\"auto\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title10\">\n");
      out.write("                        <a class=\"dropbtn\">Admin</a>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            <a href=\"changePass.jsp\">?????i m???t kh???u</a>\n");
      out.write("                            <a href=\"login.jsp\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <span class=\"title11\">Qu???n L?? S???n Ph???m</span>\n");
      out.write("                <div class=\"bottom\">\n");
      out.write("                    <a class=\"tab1\" href=\"manageProduct.jsp\">T???t c???</a>\n");
      out.write("                    <a class=\"tab2\" href=\"addProduct.jsp\">Th??m s???n ph???m m???i</a>\n");
      out.write("                    <a class=\"tab3\" href=\"discountProduct.jsp\">S???n ph???m khuy???n m??i</a>\n");
      out.write("                    <a class=\"tab4\" href=\"addDiscountProduct.jsp\">Th??m s???n ph???m khuy???n m??i m???i</a>\n");
      out.write("                    <div class=\"menu4\">\n");
      out.write("                        <span class=\"row1\">STT</span>\n");
      out.write("                        <span class=\"row2\">T??n Sa??n Ph????m</span>\n");
      out.write("                        <span class=\"row3\">Gia?? Ti????n</span>\n");
      out.write("                        <span class=\"row4\">Hi??nh A??nh</span>\n");
      out.write("                        <span class=\"row5\">M?? Ta??</span>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
