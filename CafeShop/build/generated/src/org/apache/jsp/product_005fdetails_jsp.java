package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Coffee Shop Pages</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/header.jsp", out, false);
      out.write("\n");
      out.write("    <main>\n");
      out.write("\n");
      out.write("        <!-- cart_sidebar - start\n");
      out.write("        ================================================== -->\n");
      out.write("<!--        <div class=\"sidebar-menu-wrapper\">\n");
      out.write("            <div class=\"cart_sidebar\">\n");
      out.write("                <button type=\"button\" class=\"close_btn\"><i class=\"fal fa-times\"></i></button>\n");
      out.write("                <h2 class=\"heading_title text-uppercase\">Cart Items - <span>4</span></h2>\n");
      out.write("\n");
      out.write("                <div class=\"cart_items_list\">\n");
      out.write("                    <div class=\"cart_item\">\n");
      out.write("                        <div class=\"item_image\">\n");
      out.write("                            <img src=\"assets/images/recent_post/img_03.jpg\" alt=\"image_not_found\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item_content\">\n");
      out.write("                            <h4 class=\"item_title\">\n");
      out.write("                                Rorem ipsum dolor sit amet, sectetur adipisi cingey.\n");
      out.write("                            </h4>\n");
      out.write("                            <span class=\"item_price\">$19.00</span>\n");
      out.write("                            <button type=\"button\" class=\"remove_btn\"><i class=\"fal fa-times\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cart_item\">\n");
      out.write("                        <div class=\"item_image\">\n");
      out.write("                            <img src=\"assets/images/recent_post/img_04.jpg\" alt=\"image_not_found\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item_content\">\n");
      out.write("                            <h4 class=\"item_title\">\n");
      out.write("                                Rorem ipsum dolor sit amet, sectetur adipisi cingey.\n");
      out.write("                            </h4>\n");
      out.write("                            <span class=\"item_price\">$19.00</span>\n");
      out.write("                            <button type=\"button\" class=\"remove_btn\"><i class=\"fal fa-times\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cart_item\">\n");
      out.write("                        <div class=\"item_image\">\n");
      out.write("                            <img src=\"assets/images/recent_post/img_05.jpg\" alt=\"image_not_found\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item_content\">\n");
      out.write("                            <h4 class=\"item_title\">\n");
      out.write("                                Rorem ipsum dolor sit amet, sectetur adipisi cingey.\n");
      out.write("                            </h4>\n");
      out.write("                            <span class=\"item_price\">$19.00</span>\n");
      out.write("                            <button type=\"button\" class=\"remove_btn\"><i class=\"fal fa-times\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cart_item\">\n");
      out.write("                        <div class=\"item_image\">\n");
      out.write("                            <img src=\"assets/images/recent_post/img_06.jpg\" alt=\"image_not_found\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item_content\">\n");
      out.write("                            <h4 class=\"item_title\">\n");
      out.write("                                Rorem ipsum dolor sit amet, sectetur adipisi cingey.\n");
      out.write("                            </h4>\n");
      out.write("                            <span class=\"item_price\">$19.00</span>\n");
      out.write("                            <button type=\"button\" class=\"remove_btn\"><i class=\"fal fa-times\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"total_price text-uppercase\">\n");
      out.write("                    <span>Sub Total:</span>\n");
      out.write("                    <span>$76.00</span>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"btns_group ul_li\">\n");
      out.write("                    <li><a href=\"cart.html\" class=\"btn btn_primary text-uppercase\">View Cart</a></li>\n");
      out.write("                    <li><a href=\"checkout.html\" class=\"btn btn_border border_black text-uppercase\">Checkout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart_sidebar_overlay\"></div>\n");
      out.write("        </div>-->\n");
      out.write("        <!-- cart_sidebar - end\n");
      out.write("        ================================================== -->\n");
      out.write("\n");
      out.write("        <!-- breadcrumb_section - start\n");
      out.write("        ================================================== -->\n");
      out.write("        <section class=\"breadcrumb_section text-uppercase\" style=\"background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"page_title text-white wow fadeInUp\" data-wow-delay=\".1s\">Shop Details</h1>\n");
      out.write("                <ul class=\"breadcrumb_nav ul_li wow fadeInUp\" data-wow-delay=\".2s\">\n");
      out.write("                    <li><a href=\"index_1.html\"><i class=\"fas fa-home\"></i> Home</a></li>\n");
      out.write("                    <li>Shop Details</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"breadcrumb_icon_wrap\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"breadcrumb_icon wow fadeInUp\" data-wow-delay=\".3s\">\n");
      out.write("                        <img src=\"assets/images/feature/icon_01.png\" alt=\"icon_not_found\">\n");
      out.write("                        <span class=\"bg_shape\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- breadcrumb_section - end\n");
      out.write("        ================================================== -->\n");
      out.write("\n");
      out.write("        <!-- details_section - start\n");
      out.write("================================================== -->\n");
      out.write("        <section class=\"details_section shop_details sec_ptb_120 bg_default_gray\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row justify-content-lg-between justify-content-md-center justify-content-sm-center\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-7\">\n");
      out.write("                        <div class=\"details_image_wrap wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("                            <div class=\"details_image_carousel\">\n");
      out.write("                                <div class=\"slider_item\">\n");
      out.write("                                    <img src=\"assets/images/shop/img_01.png\" alt=\"image_not_found\">\n");
      out.write("                                </div>                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-6 col-md-7\">\n");
      out.write("                        <div class=\"details_content wow fadeInUp\" data-wow-delay=\".2s\">\n");
      out.write("                            <div class=\"details_flex_title\">\n");
      out.write("                                <h2 class=\"details_title text-uppercase\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <p>\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                            <div class=\"details_price\">\n");
      out.write("                                <strong class=\"price_text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <ul class=\"btns_group ul_li\">\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"quantity_input quantity_boxed\">\n");
      out.write("                                        <h4 class=\"quantity_title text-uppercase\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                                        <form action=\"#\">\n");
      out.write("                                            <button type=\"button\" class=\"input_number_decrement\">–</button>\n");
      out.write("                                            <input class=\"input_number\" type=\"text\" value=\"2\">\n");
      out.write("                                            <button type=\"button\" class=\"input_number_increment\">+</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a class=\"btn btn_secondary text-uppercase\" href=\"cart.jsp\">Add To Cart</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- details_section - end\n");
      out.write("        ================================================== -->\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/footer.jsp", out, false);
      out.write("\n");
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
