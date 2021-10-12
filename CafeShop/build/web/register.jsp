<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>SignUp</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Custom Theme files -->
        <link href="assets/css/style2.css" rel="stylesheet" type="text/css" media="all" />
        <!-- //Custom Theme files -->
        <!-- web font -->
        <link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
        <!-- //web font -->
    </head>
    <body>
        <!-- main -->
        <div class="main-w3layouts wrapper">
            <h1>SignUp</h1>
            <div class="main-agileinfo">
                <div class="agileits-top">
                    <form action="signup" method="post">                       
                        <input class="text" type="text" name="Username" placeholder="Username" required="">
                        <input class="text" type="password" name="password" placeholder="Password" required="">
                        <input class="text w3lpass" type="password" name="repass" placeholder="Confirm Password" required="">			
                        <input type="submit" value="SIGNUP">

                    </form>
                    <p>Don't have an Account? <a href="login.jsp" > Login Now!</a></p>
                </div>
            </div>

            <ul class="colorlib-bubbles">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
        </div>
        <!-- //main -->
    </body>
</html>