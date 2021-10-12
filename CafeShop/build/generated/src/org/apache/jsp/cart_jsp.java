package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      DAO.DiscountProductDAO discountEvent = null;
      synchronized (_jspx_page_context) {
        discountEvent = (DAO.DiscountProductDAO) _jspx_page_context.getAttribute("discountEvent", PageContext.PAGE_SCOPE);
        if (discountEvent == null){
          discountEvent = new DAO.DiscountProductDAO();
          _jspx_page_context.setAttribute("discountEvent", discountEvent, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/header.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section class=\"breadcrumb_section text-uppercase\" style=\"background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"page_title text-white wow fadeInUp\" data-wow-delay=\".1s\">Shoping Cart</h1>\n");
      out.write("                <ul class=\"breadcrumb_nav ul_li wow fadeInUp\" data-wow-delay=\".2s\">\n");
      out.write("                    <li><a href=\"home\"><i class=\"fas fa-home\"></i> Home</a></li>\n");
      out.write("                    <li>Shoping Cart</li>\n");
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
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Component/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <style>\n");
        out.write("                @import url(http://fonts.googleapis.com/css?family=Calibri:400,300,700);\n");
        out.write("\n");
        out.write("                body {\n");
        out.write("                    background-color: #eee;\n");
        out.write("                    font-family: 'Calibri', sans-serif !important\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .mt-100 {\n");
        out.write("                    margin-top: 100px\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .card {\n");
        out.write("                    margin-bottom: 30px;\n");
        out.write("                    border: 0;\n");
        out.write("                    -webkit-transition: all .3s ease;\n");
        out.write("                    transition: all .3s ease;\n");
        out.write("                    letter-spacing: .5px;\n");
        out.write("                    border-radius: 8px;\n");
        out.write("                    -webkit-box-shadow: 1px 5px 24px 0 rgba(68, 102, 242, .05);\n");
        out.write("                    box-shadow: 1px 5px 24px 0 rgba(68, 102, 242, .05)\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .card .card-header {\n");
        out.write("                    background-color: #fff;\n");
        out.write("                    border-bottom: none;\n");
        out.write("                    padding: 24px;\n");
        out.write("                    border-bottom: 1px solid #f6f7fb;\n");
        out.write("                    border-top-left-radius: 8px;\n");
        out.write("                    border-top-right-radius: 8px\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .card-header:first-child {\n");
        out.write("                    border-radius: calc(.25rem - 1px) calc(.25rem - 1px) 0 0\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .card .card-body {\n");
        out.write("                    padding: 30px;\n");
        out.write("                    background-color: transparent\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .btn-primary,\n");
        out.write("                .btn-primary.disabled,\n");
        out.write("                .btn-primary:disabled {\n");
        out.write("                    background-color: #4466f2 !important;\n");
        out.write("                    border-color: #4466f2 !important\n");
        out.write("                }\n");
        out.write("            </style>\n");
        out.write("            <div class=\"container-fluid mt-100\">\n");
        out.write("                <div class=\"row\">\n");
        out.write("                    <div class=\"col-md-12\">\n");
        out.write("                        <div class=\"card\">\n");
        out.write("                            <div class=\"card-header\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"card-body cart\">\n");
        out.write("                                <div class=\"col-sm-12 empty-cart-cls text-center\"> <img src=\"https://i.imgur.com/dCdflKN.png\" width=\"130\" height=\"130\" class=\"img-fluid mb-4 mr-3\">\n");
        out.write("                                    <h3><strong>Your Cart is Empty</strong></h3>\n");
        out.write("                                    <h4>Add something to make me happy :)</h4> <a href=\"home\" class=\"btn btn-primary cart-btn-transform m-3\" data-abc=\"true\">continue shopping</a>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("           \n");
        out.write("            <section class=\"cart_section sec_ptb_120 bg_default_gray\">\n");
        out.write("                <div class=\"container\">\n");
        out.write("                    <div class=\"cart_table\">\n");
        out.write("                        <table class=\"table\">\n");
        out.write("                            <thead class=\"text-uppercase wow fadeInUp\" data-wow-delay=\".1s\">\n");
        out.write("                                <tr>\n");
        out.write("                                    <th>Product</th>\n");
        out.write("                                    <th>Price</th>\n");
        out.write("                                    <th>Quantity</th>\n");
        out.write("                                </tr>\n");
        out.write("                            </thead>\n");
        out.write("                            <tbody>\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\n");
        out.write("                            </tbody>\n");
        out.write("                        </table>                        \n");
        out.write("                    </div>\n");
        out.write("                    <form class=\"col-lg-4\">\n");
        out.write("                        <div class=\"mb-3\">\n");
        out.write("                            <div class=\"pt-4\">\n");
        out.write("\n");
        out.write("                                <h5 class=\"mb-3\">The total amount is:</h5>\n");
        out.write("\n");
        out.write("                                <ul class=\"list-group list-group-flush\">\n");
        out.write("\n");
        out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center border-0 px-0 mb-3\">\n");
        out.write("                                        <div>\n");
        out.write("                                            <strong>The total amount of</strong>\n");
        out.write("                                            <strong>\n");
        out.write("                                                <p class=\"mb-0\">(including VAT)</p>\n");
        out.write("                                            </strong>\n");
        out.write("                                        </div>\n");
        out.write("                                        <span><strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" VND</strong></span>\n");
        out.write("                                    </li>\n");
        out.write("                                </ul>                              \n");
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </form>\n");
        out.write("                    <div>\n");
        out.write("                        <a href=\"checkout.jsp\" class=\"btn btn_secondary text-uppercase\">go to checkout</a>\n");
        out.write("                        <a href=\"home\" class=\"btn btn_secondary text-uppercase\">Continue Shopping</a> \n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </section>\n");
        out.write("        ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                                                \n");
          out.write("                                    <tr class=\"wow fadeInUp\" data-wow-delay=\".1s\">\n");
          out.write("                                        <td>\n");
          out.write("                                            <div class=\"carttable_product_item\">\n");
          out.write("                                                <div class=\"item_image\">\n");
          out.write("                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct().getImages()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"image_not_found\">\n");
          out.write("                                                </div>\n");
          out.write("\n");
          out.write("                                                <a href=\"control?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&action=remove\" type=\"button\" class=\"remove_btn\"><i class=\"fal fa-times\"></i></a>\n");
          out.write("                                                <h3 class=\"item_title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                            </div>\n");
          out.write("                                        </td>\n");
          out.write("                                        \n");
          out.write("                                            <td><span class=\"price_text1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct().getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</span></td>                                            \n");
          out.write("\n");
          out.write("                                        <td>\n");
          out.write("                                            <div class=\"quantity_input\">\n");
          out.write("                                                <form action=\"#\">\n");
          out.write("                                                    <a href=\"control?action=minus&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"minus decrease\">-</a>\n");
          out.write("                                                    <a>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                    <a href=\"control?action=plus&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"plus increase\">+</a>\n");
          out.write("\n");
          out.write("                                                </form>\n");
          out.write("                                            </div>\n");
          out.write("                                        </td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
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
