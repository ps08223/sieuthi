<%-- 
    Document   : new
    Created on : Feb 25, 2019, 8:40:03 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">
		.col-20 {
			width: 21%;
			height: 175px;
			box-shadow: 0 0 10px black;
			border-radius: 15px;
			float: left;
			margin-right: 2%;
			margin-left: 2%;
			margin-top: 10px;
		}
		.col-40 {
			width: 21%;
			height: 175px;
			box-shadow: 0 0 10px black;
			border-radius: 15px;
			float: left;
			margin-right: 2%;
			margin-left: 27%;
			margin-top: 10px;
		}
		.container {
			font-variant: small-caps;
			color: brown;
			position: relative;
		}
		.name {
			text-align: center;
			margin-top: 6.5px;
			margin-bottom: 8px;
		}
		.img {
			max-width: 70%;
			height: 100px;
			display: block;
			margin: 0 auto;
		}
		.price {
			margin-top: 12.5px;
			text-align: center;
		}
		.icons {
			position: absolute;
			top: 23%;
			right: 2%;
		}
		.icons > img {
			width: 13%;
			float: right;
			margin-bottom: 10px;
		}
		.newIcon {
			position: absolute;
			top: -25px;
			right: -30px;
			width: 40%;
			transform: rotate(30deg);
		}
		.col-20:hover {
			box-shadow: 0 0 15px red;
		}
		.col-40:hover {
			box-shadow: 0 0 15px red;
		}
		.col-20:hover .container {
			text-decoration: underline;
			font-weight: bold;
		}
		.col-40:hover .container {
			text-decoration: underline;
			font-weight: bold;
		}
	</style>
</head>
<body>
	<div class="row2">
		<div class="col-40">
			<div class="container">	
				<div class="icons">
					<img src="img/heart.png">
					<img style="clear: both;" src="img/plane.png">
					<img style="clear: both;" src="img/purchase.png">
				</div>
				<img class="newIcon" src="img/new.png">
				<div class="name">
					Bút Bi
				</div>
				<img class="img" src="img/sp1.jpg">
				<div class="price">Giá: 5.000vnđ/1 cây</div>
			</div>
		</div>
		<div class="col-20">
			<div class="container">	
				<div class="icons">
					<img src="img/heart.png">
					<img style="clear: both;" src="img/plane.png">
					<img style="clear: both;" src="img/purchase.png">
				</div>
				<img class="newIcon" src="img/new.png">
				<div class="name">
					Tập 4 Ô Ly
				</div>
				<img class="img" src="img/sp2.jpg">
				<div class="price">Giá: 8.000vnđ/1 cuốn</div>
			</div>
		</div>
	</div>
</body>
</html>
