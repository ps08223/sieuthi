<%-- 
    Document   : gopY
    Created on : Feb 25, 2019, 8:38:09 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
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
		}
		.form-button:hover {
			background-color: brown;
			color: white;
		}
		.form-control:focus {
			background-color: yellow;
			border: 1px solid yellow;
			box-shadow: 0 0 5px orangered;
		}
		textarea:focus {
			background-color: yellow;
			border: 1px solid yellow;
			box-shadow: 0 0 5px orangered;
		}
	</style>
</head>
<body>
	<fieldset>	
		<div class="form-group">
			<label for="email">Email:</label>
			<input type="text" name="email" class="form-control" style="height: 25px;" />
		</div>
		<div class="form-group">
			<label for="sdt">Số điện thoại:</label>
			<input type="text" name="sdt" class="form-control" style="height: 25px;" />
		</div>
		<div class="form-group">
			<label for="gopY">Góp ý:</label>
			<textarea placeholder="Nhập góp ý của bạn tại đây..." cols="50" rows="5" class="form-control"></textarea>
		</div>
		<div class="form-group">
			<input type="button" value="Gửi" class="form-button">
		</div>
	</fieldset>
</body>
</html>
