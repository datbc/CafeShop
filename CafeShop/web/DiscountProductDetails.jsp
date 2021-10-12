<%-- 
    Document   : product_details
    Created on : May 29, 2021, 2:00:01 PM
    Author     : sa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean  id="discountEvent" class="DAO.DiscountProductDAO" ></jsp:useBean>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details Product</title>
    </head>
    <jsp:include page="Component/header.jsp"/>
    <main>    

        <!-- breadcrumb_section - start
         ================================================== -->
        <section class="breadcrumb_section text-uppercase" style="background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);">
            <div class="container">
                <h1 class="page_title text-white wow fadeInUp" data-wow-delay=".1s">Shop Details</h1>
                <ul class="breadcrumb_nav ul_li wow fadeInUp" data-wow-delay=".2s">
                    <li><a href="home"><i class="fas fa-home"></i> Home</a></li>

                </ul>
            </div>
            <div class="breadcrumb_icon_wrap">
                <div class="container">
                    <div class="breadcrumb_icon wow fadeInUp" data-wow-delay=".3s">
                        <img src="assets/images/feature/icon_01.png" alt="icon_not_found">
                        <span class="bg_shape"></span>
                    </div>
                </div>
            </div>
        </section>
        <!-- breadcrumb_section - end
        ================================================== -->

        <!-- details_section - start
================================================== -->
        <section class="details_section shop_details sec_ptb_120 bg_default_gray">
            <div class="container">

                <div class="row justify-content-lg-between justify-content-md-center justify-content-sm-center">
                    <div class="col-lg-6 col-md-7">
                        <div class="details_image_wrap wow fadeInUp" data-wow-delay=".1s">
                            <div class="details_image_carousel">
                                <div class="slider_item">
                                    <img src="${details.images}">
                                </div>                               
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6 col-md-7">
                        <div class="details_content wow fadeInUp" data-wow-delay=".2s">
                            <div class="details_flex_title">
                                <h2 class="details_title text-uppercase">${details.name}</h2>

                            </div>
                            <p>
                                ${details.description}
                            </p>
                            <span style="color: green; font-size: 20px ">${details.quantity} In Stock</span>
                            <div class="details_price">
                                <strong style="text-decoration: line-through;color: red" class="price_text">${details.price} VND</strong>
                                <strong class="price_text">${details.price - (details.price*(discountEvent.getPercentByEventID(details.eventID))/100)} VND</strong>
                            </div>
                            <c:if test="${details.quantity <=0}" >
                                <button type="button" class="btn btn-danger">Hết Hàng</button>
                            </c:if>
                            <c:if test="${details.quantity >0}">
                                <form action="cart" method="post">
                                    <ul class="btns_group ul_li">
                                        <li>
                                            <div class="quantity_input quantity_boxed">
                                                <h4 class="quantity_title text-uppercase">Quantity</h4>
                                                <input name="count" type="number" value="1" min="1" max="${details.quantity}"  class="form-control" style="width: 100px">
                                            </div>                 
                                        </li> 
                                        <input type="hidden" name="id" value="${details.id}" >
                                        <button class="btn btn_secondary text-uppercase" type="submit">Add to cart
                                            <i class="fas fa-shopping-cart ml-1"></i>
                                        </button>
                                    </ul>
                                </form>
                            </c:if>

                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- details_section - end
        ================================================== -->

    </main>


</body>
<jsp:include page="Component/footer.jsp"/>
</html>
