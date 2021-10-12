<%-- 
    Document   : cart
    Created on : May 21, 2021, 8:00:39 AM
    Author     : sa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean  id="discountEvent" class="DAO.DiscountProductDAO" ></jsp:useBean>
<!doctype html>
<html lang="en">

    <head>

        <jsp:include page="Component/header.jsp"/>
    <body>
        <section class="breadcrumb_section text-uppercase" style="background-image: url(assets/images/breadcrumb/breadcrumb_bg_01.jpg);">
            <div class="container">
                <h1 class="page_title text-white wow fadeInUp" data-wow-delay=".1s">Shoping Cart</h1>
                <ul class="breadcrumb_nav ul_li wow fadeInUp" data-wow-delay=".2s">
                    <li><a href="home"><i class="fas fa-home"></i> Home</a></li>
                    <li>Shoping Cart</li>
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

        <c:if test="${sessionScope.carts == null}">
            <style>
                @import url(http://fonts.googleapis.com/css?family=Calibri:400,300,700);

                body {
                    background-color: #eee;
                    font-family: 'Calibri', sans-serif !important
                }

                .mt-100 {
                    margin-top: 100px
                }

                .card {
                    margin-bottom: 30px;
                    border: 0;
                    -webkit-transition: all .3s ease;
                    transition: all .3s ease;
                    letter-spacing: .5px;
                    border-radius: 8px;
                    -webkit-box-shadow: 1px 5px 24px 0 rgba(68, 102, 242, .05);
                    box-shadow: 1px 5px 24px 0 rgba(68, 102, 242, .05)
                }

                .card .card-header {
                    background-color: #fff;
                    border-bottom: none;
                    padding: 24px;
                    border-bottom: 1px solid #f6f7fb;
                    border-top-left-radius: 8px;
                    border-top-right-radius: 8px
                }

                .card-header:first-child {
                    border-radius: calc(.25rem - 1px) calc(.25rem - 1px) 0 0
                }

                .card .card-body {
                    padding: 30px;
                    background-color: transparent
                }

                .btn-primary,
                .btn-primary.disabled,
                .btn-primary:disabled {
                    background-color: #4466f2 !important;
                    border-color: #4466f2 !important
                }
            </style>
            <div class="container-fluid mt-100">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header">
                            </div>
                            <div class="card-body cart">
                                <div class="col-sm-12 empty-cart-cls text-center"> <img src="https://i.imgur.com/dCdflKN.png" width="130" height="130" class="img-fluid mb-4 mr-3">
                                    <h3><strong>Your Cart is Empty</strong></h3>
                                    <h4>Add something to make me happy :)</h4> <a href="home" class="btn btn-primary cart-btn-transform m-3" data-abc="true">continue shopping</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:if>
        <c:if test="${sessionScope.carts != null}">           
            <section class="cart_section sec_ptb_120 bg_default_gray">
                <div class="container">
                    <div class="cart_table">
                        <table class="table">
                            <thead class="text-uppercase wow fadeInUp" data-wow-delay=".1s">
                                <tr>
                                    <th>Product</th>
                                    <th>Price</th>
                                    <th>Quantity</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${sessionScope.carts}" var="item">                                                                
                                    <tr class="wow fadeInUp" data-wow-delay=".1s">
                                        <td>
                                            <div class="carttable_product_item">
                                                <div class="item_image">
                                                    <img src="${item.getProduct().getImages()}" alt="image_not_found">
                                                </div>

                                                <a href="control?id=${item.getProduct().getId()}&action=remove" type="button" class="remove_btn"><i class="fal fa-times"></i></a>
                                                <h3 class="item_title">${item.getProduct().getName()}</h3>
                                            </div>
                                        </td>
                                        
                                            <td><span class="price_text1">${item.getProduct().getPrice()} VND</span></td>                                            

                                        <td>
                                            <div class="quantity_input">
                                                <form action="#">
                                                    <a href="control?action=minus&id=${item.getProduct().getId()}" class="minus decrease">-</a>
                                                    <a>${item.getQuantity()}</a>
                                                    <a href="control?action=plus&id=${item.getProduct().getId()}"class="plus increase">+</a>

                                                </form>
                                            </div>
                                        </td>

                                    </tr>
                                </c:forEach> 

                            </tbody>
                        </table>                        
                    </div>
                    <form class="col-lg-4">
                        <div class="mb-3">
                            <div class="pt-4">

                                <h5 class="mb-3">The total amount is:</h5>

                                <ul class="list-group list-group-flush">

                                    <li class="list-group-item d-flex justify-content-between align-items-center border-0 px-0 mb-3">
                                        <div>
                                            <strong>The total amount of</strong>
                                            <strong>
                                                <p class="mb-0">(including VAT)</p>
                                            </strong>
                                        </div>
                                        <span><strong>${sessionScope.total} VND</strong></span>
                                    </li>
                                </ul>                              

                            </div>
                        </div>
                    </form>
                    <div>
                        <a href="checkout.jsp" class="btn btn_secondary text-uppercase">go to checkout</a>
                        <a href="home" class="btn btn_secondary text-uppercase">Continue Shopping</a> 
                    </div>
                </div>
            </section>
        </c:if>

        <jsp:include page="Component/footer.jsp"/>

    </body>
</html>
