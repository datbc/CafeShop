<%-- 
    Document   : listDiscountProduct
    Created on : Jun 22, 2021, 7:02:29 PM
    Author     : sa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean  id="discountEvent" class="DAO.DiscountProductDAO" ></jsp:useBean>
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
                <ul class="breadcrumb_nav ul_li wow fadeInUp" data-wow-delay=".2s">
                    <li><a href="events"><i class="fas fa-home"></i> Events</a></li>                    
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
                <div class="shop_filter_grid grid wow fadeInUp" data-wow-delay=".3s" >
                    <c:forEach items="${list}" var="o" begin="0" end="5" >                       
                       <div class="element-item chocolate greantea " >
                            <div class="shop_card">

                                
                                <div class="item_content">
                                    <h3 class="item_title text-uppercase">
                                        <a href="detailsDiscountProduct?id=${o.id}">${o.name}</a>
                                    </h3>
                                    <div class="btns_group">
                                        <!--<span style="text-decoration: line-through "class="item_price bg_default_brown">{o.price} Đ</span>-->
                                         <span class="item_price bg_default_brown">${o.quantity} </span>
                                        <!--<span class="item_price bg_default_brown">{o.price - (o.price*(discountEvent.getPercentByEventID(o.eventID))/100)} Đ</span>-->

                                    </div>



                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

                <ul class="pagination_nav ul_li_center">
                    <!-- <li><a href="#!"><i class="fal fa-angle-double-left"></i></a></li>-->
                </ul>
            </div>
        </section>


        <div class="clearfix"></div>
        <jsp:include page="Component/footer.jsp"/>
    </body>
</html>
