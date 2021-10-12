package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>Details Product</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/header.jsp", out, false);
      out.write("\n");
      out.write("    <main>    \n");
      out.write("\n");
      out.write("        <!-- breadcrumb_section - start\n");
      out.write("         ================================================== -->\n");
      out.write("        <section class=\"breadcrumb_section text-uppercase\" style=\"background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"page_title text-white wow fadeInUp\" data-wow-delay=\".1s\">Shop Details</h1>\n");
      out.write("                <ul class=\"breadcrumb_nav ul_li wow fadeInUp\" data-wow-delay=\".2s\">\n");
      out.write("                    <li><a href=\"home\"><i class=\"fas fa-home\"></i> Home</a></li>\n");
      out.write("\n");
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
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.images}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
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
      out.write("                            <span style=\"color: green; font-size: 20px \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" In Stock</span>\n");
      out.write("                            <div class=\"details_price\">\n");
      out.write("                                <strong class=\"price_text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" VND</strong>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.quantity <=0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <button type=\"button\" class=\"btn btn-danger\">Hết Hàng</button>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.quantity >0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <form action=\"cart\" method=\"post\">\n");
        out.write("                                    <ul class=\"btns_group ul_li\">\n");
        out.write("                                        <li>\n");
        out.write("                                            <div class=\"quantity_input quantity_boxed\">\n");
        out.write("                                                <h4 class=\"quantity_title text-uppercase\">Quantity</h4>\n");
        out.write("                                                <input name=\"count\" type=\"number\" value=\"1\" min=\"1\" max=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"form-control\" style=\"width: 100px\">\n");
        out.write("                                            </div>                 \n");
        out.write("                                        </li>\n");
        out.write("                            \n");
        out.write("                                        <input type=\"hidden\" name=\"id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${details.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" >\n");
        out.write("                                        <button class=\"btn btn_secondary text-uppercase\" type=\"submit\">Add to cart\n");
        out.write("                                            <i class=\"fas fa-shopping-cart ml-1\"></i>\n");
        out.write("                                        </button>\n");
        out.write("                                    </ul>\n");
        out.write("                                </form>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
