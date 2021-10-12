<%-- 
    Document   : index
    Created on : May 20, 2021, 8:35:40 AM
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
                <h1 class="page_title text-white wow fadeInUp" data-wow-delay=".1s">Online Shop</h1>
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
        <section class="shop_section sec_ptb_120 bg_default_gray">
            <div class="container">

                <ul class="filters-button-group ul_li_center wow fadeInUp" data-wow-delay=".1s"> 
                    <li><button class="button text-uppercase" ><a href="home">All</a></button></li>
                        <c:forEach items="${listCategory}" var="o">
                        <li><button class="button text-uppercase "><a href="category?cid=${o.id}">${o.name}</button></a></li>                       
                        </c:forEach>
                </ul>


                <div class="shop_filter_grid grid wow fadeInUp" data-wow-delay=".3s" >
                    <c:forEach items="${listProduct}" var="o" begin="0" end="5" >
                        <div class="element-item chocolate greantea " >
                            <div class="shop_card">

                                <a class="item_image" >
                                    <img src="${o.images}" alt="Img" height="340px"width="290px">
                                </a>
                                <div class="item_content">
                                    <h3 class="item_title text-uppercase">
                                        <a href="details?id=${o.id}">${o.name}</a>
                                    </h3>
                                    <div class="btns_group">
                                        <span class="item_price bg_default_brown">${o.price} VND</span> 

                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

                <ul class="pagination_nav ul_li_center">
                    <!--                    <li><a href="#!"><i class="fal fa-angle-double-left"></i></a></li>-->
                </ul>
            </div>
        </section>
        <h1 style="text-align: center">Sản Phẩm Bán Chạy Nhất</h1>
        <section class="shop_section sec_ptb_120 bg_default_gray">
            <div class="container">
                <div class="shop_filter_grid grid wow fadeInUp" data-wow-delay=".3s" >
                    <c:forEach items="${listSold}" var="o" begin="0" end="2" >
                        <div class="element-item chocolate greantea " >
                            <div class="shop_card">

                                <a class="item_image" >
                                    <img src="${o.images}" alt="Img" height="340px"width="290px">
                                </a>
                                <div class="item_content">
                                    <h3 class="item_title text-uppercase">
                                        <a href="details?id=${o.id}">${o.name}</a>
                                    </h3>
                                    <div class="btns_group">
                                        <span class="item_price bg_default_brown">${o.price} VND</span>                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <!--                    
                    
                    -->
                </div>
            </div>
        </section>

        <div class="clearfix"></div>
        <jsp:include page="Component/footer.jsp"/>
    </body>

</html>
