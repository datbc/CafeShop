<%-- 
    Document   : Checkout
    Created on : May 21, 2021, 8:11:21 AM
    Author     : sa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coffee Shop Pages</title>
    </head>
    <jsp:include page="Component/header.jsp"/>
    <body>
        <section class="breadcrumb_section text-uppercase" style="background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);">
            <div class="container">
                <h1 class="page_title text-white wow fadeInUp" data-wow-delay=".1s">CHECK OUT</h1>
                <ul class="breadcrumb_nav ul_li wow fadeInUp" data-wow-delay=".2s">
                    <li><a href="home"><i class="fas fa-home"></i> Home</a></li>
                    <li>CHECK OUT</li>
                </ul>
            </div>
            <div class="breadcrumb_icon_wrap">
                <div class="container">
                    <div class="breadcrumb_icon wow fadeInUp" data-wow-delay=".1s">
                        <img src="assets/images/feature/icon_01.png" alt="icon_not_found">
                        <span class="bg_shape"></span>
                    </div>
                </div>
            </div>
        </section>
        <section class="cart_section sec_ptb_120 bg_default_gray">
            <div class="container container_boxed">
                <div class="checkout_form">
                    <form action="checkout" method="post">                   
                        <h3 class="form_title text-uppercase wow fadeInUp">personal Info !</h3>
                        <div class="row wow fadeInUp" data-wow-delay=".3s">
                            <div class="col-lg-4">
                                <div class="form_item">
                                    <h4 class="form_field_title">Name<sup>*</sup></h4>
                                    <input readonly="" value="${sessionScope.acc.user}" name="name" placeholder="First Name">
                                </div>
                            </div>


                            <div class="col-lg-4">
                                <div class="form_item">
                                    <h4 class="form_field_title">Phone Number<sup>*</sup></h4>
                                    <input type="tel" name="phoneNumber" placeholder="Number">
                                </div>
                            </div>

                            <div class="col-lg-6">
                                <div class="form_item">
                                    <h4 class="form_field_title">Own Adress<sup>*</sup></h4>
                                    <input type="text" name="address" placeholder="Own Adress">
                                </div>
                            </div>

                            <div class="col-lg-6">
                                <div class="form_item">
                                    <h4 class="form_field_title">Mail Address<sup>*</sup></h4>
                                    <input type="email" name="gmail" placeholder="Mail Address">
                                </div>
                            </div>
                        </div>

                        <div class="form_item wow fadeInUp" data-wow-delay=".4s">
                            <h4 class="form_field_title">Additional Information*<sup>*</sup></h4>
                            <textarea name="information" placeholder="Note about your order, Special note for delevery !"></textarea>
                        </div>

                        <div class="checkout_form_footer wow fadeInUp" data-wow-delay=".5s">
                            <span class="total_price"><strong>Total</strong> ${sessionScope.total} VND</span>
                            <button type="submit"class="btn btn_primary text-uppercase" href="">Place Order</button>
                        </div>
                    </form>
                </div>
            </div>
        </section>

        <jsp:include page="Component/footer.jsp"/>
    </body>

</html>