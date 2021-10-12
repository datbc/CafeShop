package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class events_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Coffee Shop Pages</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/header.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <section class=\"breadcrumb_section text-uppercase\" style=\"background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"page_title text-white wow fadeInUp\" data-wow-delay=\".1s\">Online Shop</h1>\n");
      out.write("                <ul class=\"breadcrumb_nav ul_li wow fadeInUp\" data-wow-delay=\".2s\">\n");
      out.write("                    <li><a href=\"home\"><i class=\"fas fa-home\"></i> EVENT</a></li>\n");
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
      out.write("        <h1 style=\"text-align: center\">List events of our shop</h1>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<div class=\"clearfix\"></div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems(new String("listEvents"));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <section class=\"shop_section sec_ptb_120 bg_default_gray\">\n");
          out.write("                <div class=\"container\">\n");
          out.write("                    <div class=\"row justify-content-lg-between justify-content-md-center justify-content-sm-center\">\n");
          out.write("                        <div class=\"col-lg-12 col-md-12\">\n");
          out.write("\n");
          out.write("                            <div class=\"blog_standard wow fadeInUp\" data-wow-delay=\".1s\">\n");
          out.write("                                <a class=\"item_image\">\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.images}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"image_not_found\">\n");
          out.write("                                </a>\n");
          out.write("                                <div class=\"item_content\">\n");
          out.write("                                    <ul class=\"post_meta ul_li\">\n");
          out.write("                                        <li>From</li>\n");
          out.write("                                        <li><i class=\"fal fa-calendar-alt\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.startDay}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                        <li>To</li>\n");
          out.write("                                        <li><i class=\"fal fa-calendar-alt\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.endDay}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                    </ul>\n");
          out.write("                                    <h3 class=\"item_title text-uppercase\">\n");
          out.write("                                        <a href=\"#!\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                    </h3>\n");
          out.write("                                    <p>\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.details}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </p>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("\n");
          out.write("            <ul class=\"pagination_nav ul_li_center\">\n");
          out.write("                <!--                    <li><a href=\"#!\"><i class=\"fal fa-angle-double-left\"></i></a></li>-->\n");
          out.write("            </ul>\n");
          out.write("        </div>\n");
          out.write("    </section>\n");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
