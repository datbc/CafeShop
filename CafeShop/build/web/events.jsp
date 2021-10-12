<%-- 
    Document   : events
    Created on : May 29, 2021, 8:33:54 AM
    Author     : sa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coffee Shop Pages</title>
    </head>
    <jsp:include page="Component/header.jsp"/>
    <body>

        <section class="breadcrumb_section text-uppercase" style="background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);">
            <div class="container">
                <h1 class="page_title text-white wow fadeInUp" data-wow-delay=".1s">Events</h1>
                <ul class="breadcrumb_nav ul_li wow fadeInUp" data-wow-delay=".2s">
                    <li><a href="home"><i class="fas fa-home"></i> home</a></li>

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
        <h1 style="text-align: center;color: black;padding-top: 50px">List events of our shop</h1>

        <section class="shop_section sec_ptb_120 bg_default_gray">
            <div class="container">
                <c:forEach items="${listEvents}" var="o">
                    <div class="row justify-content-lg-between justify-content-md-center justify-content-sm-center">
                        <div class="col-lg-12 col-md-12">

                            <div class="blog_standard wow fadeInUp" data-wow-delay=".1s">
                                <a class="item_image">
                                    <img src="${o.images}" alt="image_not_found">
                                </a>
                                <div class="item_content">
                                    <h3 class="item_title text-uppercase">
                                        <a href="discountProduct?eventsID=${o.id}">${o.title}</a>
                                    </h3>
                                    <p>
                                        ${o.details}
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <ul class="pagination_nav ul_li_center">
            <!--                    <li><a href="#!"><i class="fal fa-angle-double-left"></i></a></li>-->
        </ul>
    </div>
</section>

<div class="clearfix"></div>
<jsp:include page="Component/footer.jsp"/>
</body>

</html>
