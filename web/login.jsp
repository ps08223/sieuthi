<%-- 
    Document   : index
    Created on : Feb 25, 2019, 7:59:06 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP Page</title>
        <style type="text/css">
		.hdb {
			background: url("img/icon.png") no-repeat 10px center;
			background-size: 25px;
			display: block;
		}
		.hdb a {
			margin-left: 20px;
		}
		.hdb:hover {
			background: url("img/icon-hover.png") no-repeat 10px center;
			background-size: 25px;
			display: block;
		}
                body {
                    text-align: center;
                    padding-top: 15px;
                    font-variant: small-caps;
                    font-size: 17px;
                    text-decoration: underline;
                    color: brown;
                }
                label {
                    display: block;
                    margin-bottom: 5px;
                }
                fieldset {
                    width: 450px;
                    margin: auto;
                    border-radius: 5px;
                }
                .form-control {
                    width: 415px;
                    border-radius: 5px;
                    border: none;
                    border: 1px solid grey;
                }
                .form-group {
                    padding-bottom: 15px;
                }
                .form-button {
                    padding: 8px 30px;
                    border-radius: 5px;
                    border: none;
                    outline: none;
                    box-shadow: 0 0 5px black;
                    font-weight: bold;
                    background-color: white;
                }
                .form-button:hover {
                    background-color: brown;
                    color: white;
                }
	</style>
    </head>
    <body>
        <div class="container">
		<header>
			<img src="img/Banner_2.jpg" class="banner">
			<nav class="top-right">
				<ul>	
					<li><a href="login.jsp" target="page">Đăng nhập</a></li>
					<li><a href="login.jsp" target="page">Đăng ký</a></li>
					<li><a href="login.jsp" target="page">Quên mật khẩu</a></li>
				</ul>
			</nav>
			<div class="company">
				<span style="font-size: 36px; font-variant: small-caps; color: white; text-shadow: 0 0 5px black; border-bottom: 2px dotted black;">FPT Polytechnic</span>
				<br />
				<span style="font-variant: small-caps;">Thực học - Thực nghiệp</span>
			</div>
		</header>
		<nav class="menu">
			<ul>
				<li><a href="danhMuc.jsp" target="page">Trang Chủ</a></li>
				<li><a href="coCau.jsp" target="page">Giới thiệu</a></li>
				<li>
                                    <a href="lienHe.jsp" target="page">Liên hệ</a>
                                    <ul>
                                            <li><a href="soDT.jsp" target="page">Điện thoại</a></li>
                                            <li><a href="email.jsp" target="page">Email</a></li>
                                    </ul>
				</li>
				<li><a href="gopY.jsp" target="page">Góp ý</a></li>
				<li>
                                    <a href="sanPham.jsp" target="page">Sản phẩm</a>
                                    <ul>
                                            <li><a href="doDungHocTap.jsp" target="page">Đồ dùng học tập</a></li>
                                            <li><a href="doDienTu.jsp" target="page">Đồ điện tử</a></li>
                                    </ul>
				</li>
			</ul>
		</nav>
		<article>
		    <form action="ControllerCartBean">
                        <fieldset>  
                            <div class="form-group">
                                <label for="username">Tài Khoản:</label>
                                <input type="text" name="username" class="form-control" style="height: 25px;" />
                            </div>
                            <div class="form-group">
                                <label for="pass">Mật Khẩu:</label>
                                <input type="password" name="pass" class="form-control" style="height: 25px;" />
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Login" class="form-button" name="action">
                            </div>
                        </fieldset>
                    </form>
		</article>
		<aside>
			<div id="mot">
				<div class="gioHang">
                                    <a href="gioHang.jsp" target="page"><img src="img/image.png" height="70px" width="200px" class="gio"></a>
				</div>
			</div>
			<div class="hai">
				<div class="kw">
                                    <form action="ControllerCartBean">    
                                        
                                    </form>
				</div>
			</div>
			<div class="ba">
				<div class="vmenu">
					<ul>
						<li class="hdb"><a href="#"><span style="font-weight: bold; text-decoration: underline;">Tin chính:</span></a></li>
						<li><a href="sanPham.jsp" target="page">Sản phẩm</a></li>
						<li><a href="congTac.jsp" target="page">Thời khóa biểu</a></li>
						<li><a href="coCau.jsp" target="page">Cơ cấu</a></li>
						<li><a href="lienHe.jsp" target="page">Địa chỉ</a></li>
					</ul>
				</div>
			</div>
		</aside>
		<footer>
			FPT Polytechnic C 2018. All rights reserved.
		</footer>
	</div>
    </body>
</html>
