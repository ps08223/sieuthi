<%-- 
    Document   : gioHang1
    Created on : Feb 26, 2019, 9:09:16 AM
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
			<iframe name="page" src="gioHang.jsp" scrolling="auto" frameborder="0"></iframe>
		</article>
		<aside>
			<div id="mot">
				<div class="gioHang">
                                    <a href="gioHang.jsp" target="page"><img src="img/image.png" height="30px" width="200px" class="gio"></a>
				</div>
			</div>
			<div class="hai">
				<div class="kw">
                                    <form action="ControllerCartBean">    
                                        <input type="submit" class="form-control" value="View Cart" name="action" />
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

