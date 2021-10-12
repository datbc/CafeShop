
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">

        <title>Coffee Shop Pages</title>
        <link rel="shortcut icon" href="assets/images/logo/favourite_icon.png">

        <!-- fraimwork - css include -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">

        <!-- icon font - css include -->
        <link rel="stylesheet" type="text/css" href="assets/css/fontawesome.css">

        <!-- animation - css include -->
        <link rel="stylesheet" type="text/css" href="assets/css/animate.css">

        <!-- carousel - css include -->
        <link rel="stylesheet" type="text/css" href="assets/css/slick.css">
        <link rel="stylesheet" type="text/css" href="assets/css/slick-theme.css">

        <!-- popup - css include -->
        <link rel="stylesheet" type="text/css" href="assets/css/magnific-popup.css">

        <!-- jquery-ui - css include -->
        <link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.css">

        <!-- custom - css include -->
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">

    </head>


    <body>

        <!-- body_wrap - start -->
        <div class="body_wrap">

            <!-- backtotop - start -->
            <div class="backtotop">
                <a href="#" class="scroll">
                    <i class="far fa-arrow-up"></i>
                    <i class="far fa-arrow-up"></i>
                </a>
            </div>
            <!-- backtotop - end -->

            <!-- preloader - start -->

            <!-- preloader - end -->

            <!-- header_section - start
            ================================================== -->
            <header class="header_section">
                <div class="content_wrap">
                    <div class="container maxw_1560">
                        <div class="row align-items-center">

                            <div class="col-lg-2 col-md-6 col-6">
                                <div class="brand_logo">
                                    <a class="brand_link" href="home">
                                        <img src="assets/images/logo/logo_white_1x.png" srcset="assets/images/logo/logo_white_2x.png 2x" alt="logo_not_found">
                                    </a>
                                </div>
                            </div>

                            <div class="col-lg-10 col-md-6 col-6">
                                <nav class="main_menu navbar navbar-expand-lg">
                                    <button class="mobile_menu_btn navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#main_menu_dropdown" aria-controls="main_menu_dropdown" aria-expanded="false" aria-label="Toggle navigation">
                                        <span class="navbar-toggler-icon"><i class="fal fa-bars"></i></span>
                                    </button>
                                    <div class="main_menu_inner collapse navbar-collapse" id="main_menu_dropdown">
                                        <ul class="main_menu_list ul_li">
                                            <li class="active dropdown">
                                                <a class="nav-link" href="#" id="home_submenu" role="button" data-bs-toggle="dropdown" aria-expanded="false">

                                                </a>

                                            <li><a href="home">Home</a></li>


                                            </li>
                                            <li class="dropdown">
                                                <a class="nav-link" href="about.jsp" id="about_submenu" role="button" data-bs-toggle="dropdown" aria-expanded="false">About Us</a>
                                                <!--                                                
                                                -->                                                             
                                            </li>
                                            <li class="dropdown">
                                                <a class="nav-link" href="events" id="portfolio_submenu" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                                    Events
                                                </a>
                                                <!--                                                -->
                                            </li>
                                            
                                            <c:if test="${sessionScope.acc.isAdmin != 1 }">
                                                <a class="nav-link waves-effect">
                                                    <span class="main_menu_list ul_li"> Hello ${sessionScope.acc.user}</span>
                                                </a>
                                            </c:if>
                                                <a href="question.jsp" class="nav-link waves-effect">
                                                    <span class="main_menu_list ul_li"> Q&A</span>
                                                </a>
                                               
                                        </ul>
                                    </div>
                                                              
                                    <form action="search" method="post" class="header_btns_group ul_li_right">                                     
                                        <li>
                                            <input value="${name}" name="search" type="search" placeholder="search...">
                                            <button type="button" class="main_search_btn" data-bs-toggle="collapse" data-bs-target="#main_search_collapse" aria-expanded="false" aria-controls="main_search_collapse">
                                                <i class="fal fa-search"></i>
                                            </button>
                                        </li>
                                        <li>
                                            <a href="cart"><button type="button" class="cart_btn">
                                                    <i class="fal fa-shopping-bag"></i>
                                                    <small class="cart_counter">${sessionScope.carts==null ? 0 : sessionScope.carts.size()}</small>

                                                </button></a>
                                        </li>

                                    </form>


                                    <c:if test="${sessionScope.acc == null}">
                                        <li>
                                            <a class="btn btn_primary text-uppercase" href="login.jsp">${sessionScope.acc!=null ? "Logout": "Login"}</a>
                                        </li>
                                    </c:if>

                                </nav>
                            </div>

                        </div>
                    </div>
                </div>

                <!-- collapse search - start -->
                <div class="main_search_collapse collapse" id="main_search_collapse">
                    <div class="main_search_form card">
                        <div class="container maxw_1560">
                            <form action="#">
                                <div class="form_item">
                                    <input type="search" name="search" placeholder="Search here...">
                                    <button type="submit" class="submit_btn"><i class="fal fa-search"></i></button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- collapse search - end -->
            </header>
    </body>
</html>
