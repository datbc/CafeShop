<%-- 
    Document   : adminHome
    Created on : Jun 4, 2021, 3:44:13 PM
    Author     : thanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style4.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@600&display=swap" rel="stylesheet">
        <title>Document</title>
        <style type="text/css">
            table, th, td{
                border:1px solid #ccc;
            }
            table{
                border-collapse:collapse;
                width:100%;
            }
            th,td{
                text-align:center;
                padding:5px;
            }
        </style>
    </head>
    <body>
        <div class="main">
            <div class="left">
                <div class="logo">
                    <img src="assets/images/logo/logo_white_1x.png" alt="logo" width="auto" height="auto">
                </div>
                <span class="name">CAFENOD</span>

                <div class="menu1">
                    <span class="title1">Quản lí</span>
                    <div class="item1">
                        <i class="far fa-folder"></i>
                        <a class="title2" href="adminhome">Quản lý tài khoản</a>
                    </div>
                    <div class="item2">
                        <i class="far fa-file"></i>
                        <a class="title3" href="manageProduct">Quản lý sản phẩm</a>
                    </div>
                    <div class="item3">
                        <i class="far fa-envelope"></i>
                        <a class="title4" href="manageCategory">Quản lý danh mục</a>
                    </div>
                    <div class="item10">
                        <i class="fas fa-tag"></i>
                        <a class="title5" href="manageEvents">Quản lý Event</a>
                    </div>

                </div>
                <div class="top">                   
                    <div class="item8">
                        <img src="assets/images/logo/logo_white_1x.png" alt="logo" width="auto" height="auto">
                    </div>
                    <div class="title10">
                        <a class="dropbtn">Admin</a>
                        <div class="dropdown-content">
                            <a href="changePass.jsp">Đổi mật khẩu</a>
                            <a href="login.jsp">Logout</a>
                        </div>
                    </div>
                </div>
                <span class="title11">Quản Lý Danh Mục</span>
                <div class="bottom">
                    <a class="tab1" href="manageCategory">Tất cả</a>
                    <a class="tab2" href="addCategory.jsp">Thêm danh mục mới </a>
                    <div class="menu4">
                        <table>
                            <thead>
                                <tr>
                                    <th>STT</th>
                                    <th>Tên danh mục</th>
                                </tr>  
                            </thead>
                            <tbody>
                                <c:forEach items="${listCategory}" var="o">
                                    <tr>
                                        <td>${o.id}</td>
                                        <td>${o.name}</td>
                                    </tr>
                                </c:forEach>                               
                            </tbody>


                        </table>

                    </div>
                </div>
            </div>

        </div>
    </body>
</html>