<%-- 
    Document   : validateForm
    Created on : Feb 25, 2019, 8:44:26 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>FPT Polytechnic</title>
	<meta charset="utf-8" />
	<style type="text/css">
		fieldset {
			width: 400px;
			margin: auto;
			border-radius: 5px;
		}
		legend {
			font-size: 18px;
			color: brown;
			font-variant: small-caps;
			text-decoration: underline;
		}
		form {
			margin-left: 12%;
		}
		div {
			margin: 15px;
		}
		label {
			display: inline-block;
			width: 110px;
		}
		#ngay, #thang, #nam {
			width: 45px;
		}
		.btnsubmit {
			border: none;
			box-shadow: 0 0 10px blue;
			border-radius: 5px;
			height: 30px;
			width: 80px;
		}
		input {
			border: none;
			border-bottom: 1px solid orangered;
			outline: none;
		}
		input:hover {
			outline: none;
		}
		.btnsubmit:hover {
			cursor: pointer;
			text-decoration: underline;
			box-shadow: 0 0 10px red;
		}
	</style>
	<script type="text/javascript" src="js/validateForm.js"></script>
</head>
<body>
	<fieldset>
		<legend>Thông Tin Đặt Hàng</legend>
		<form action="#"	onsubmit="return validateForm();">	
			<div>
				<label for="ho">Họ:</label>
				<input type="text" name="ho">
			</div>
			<div>	
				<label for="ten">Tên:</label>
				<input type="text" name="ten">
			</div>
			<div>
				<label>Ngày Sinh:</label>
				<label id="ngay" for="ngaySinh">Ngày:</label>
				<input type="number" name="ngaySinh" min="1" max="31" step="1" value="1" onkeydown="return false" style="width: 60px; margin-bottom: 10px;">
				<br />
				<label></label>
				<label id="thang" for="thangSinh">Tháng:</label>
				<input type="number" name="thangSinh" min="1" max="12" step="1" value="1" onkeydown="return false" style="width: 60px; margin-bottom: 10px;">
				<br />
				<label></label>
				<label id="nam" for="namSinh">Năm:</label>
				<input type="number" name="namSinh" min="1900" max="2018" step="1" value="2000" onkeydown="return false" style="width: 60px;">
			</div>
			<div>
				<label>Giới Tính:</label>
				<input type="radio" name="gioiTinh"> Nam
				<input type="radio" name="gioiTinh"> Nữ
			</div>
			<div>
				<label for="diaChi">Địa Chỉ:</label>
				<input type="text" name="diaChi">
			</div>
			<div>
				<label for="soDT">Số Điện Thoại:</label>
				<input type="text" name="soDT">
			</div>
			<div>
				<input id="nut" type="submit" value="Đặt Hàng" class="btnsubmit" style="margin-left: 35%; margin-top: 10px; font-weight: bold; color: brown;">
			</div>
		</form>
	</fieldset>
</body>
</html>
