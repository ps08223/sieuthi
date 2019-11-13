<%-- 
    Document   : danhMuc
    Created on : Feb 25, 2019, 8:04:33 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="js/danhMuc.js"></script>
	<style type="text/css">
		body {
			position: relative;
		}
		#anh {
			height: 253px;
			max-width: 300px;
			display: block;
			margin: auto;
			margin-top: 65px; 
		}
		#anh:hover {
			transform: scale(1.5);
	        -webkit-transform: scale(1.5);
	        -moz-transform: scale(1.5); 
	        -o-transform: scale(1.5);
	        -ms-transform: scale(1.5);
	    	cursor: pointer;
		}
		#next, #prev {
			position: absolute;
			right: 0;
			bottom: 45%;
			opacity: 0.3;
		}
		#prev {
			left: 0;
		}
		#next:hover, #prev:hover {
			opacity: 1;
			cursor: pointer;
		}
	</style>
</head>
<body onload="loadAnh(); setInterval(chuyenAnh, 2000);">
	<a href="sanPham.jsp" target="page" onclick="return confirm('Bạn có muốn chuyển sang trang sản phẩm không?')";><img src="img/sph1.jpg" id="anh"></a>
	<img src="img/next.png" id="next" onclick="tiepTheo();">
	<img src="img/previous.png" id="prev" onclick="luiLai();">
</body>
</html>
