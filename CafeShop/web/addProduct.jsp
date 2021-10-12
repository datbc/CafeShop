<%-- 
    Document   : addProduct
    Created on : Jun 6, 2021, 2:53:01 PM
    Author     : thanh
--%>

<jsp:useBean id="Category" class="DAO.CategoryDAO"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@600&display=swap" rel="stylesheet">
        <script src="js/abc.js"></script>
        <title>Document</title>
    </head>
    <body>
        <div class="main">            
            <form action="addProduct" method="POST">
                <span class="title">Tạo sản phẩm mới</span>               
                <span class="title2">Tên sản phẩm</span>
                <input name="name" class="txtname" type="text">
                <span class="title3">Danh mục sản phẩm</span>
                <select class="txtnd" name="categoryID" >
                    <c:forEach items="${Category.allCategory}" var="o">
                        <option  value="${o.id}">${o.name}</option>
                    </c:forEach>
                </select>
                <span class="title5">Mô tả</span>
                <input name="description" class="txtndshort" type="text">
                <span class="title6">Giá tiền</span>
                <input name="price" class="txtprice" type="text">
                <span class="title4">Thêm ảnh</span>               
                <input name="images" class="txtimg" type="text"/>
                <span class="title7">Số lượng:</span>               
                <input name="quantity" class="txtsl" type="text"/>
                <span class="title8">Đã bán:</span>               
                <input name="sold" class="txtsold" readonly="" value="0"/>
                <button type="submit" class="btn1">Xác nhận</button>
                <button class="btn2" >Hủy bỏ</button>             
            </form> 


        </div>
    </body>
</html>