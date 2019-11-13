<%-- 
    Document   : test
    Created on : Feb 21, 2019, 7:42:28 AM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
	<script type="text/javascript" src="js/index.js"></script>
	<style type="text/css">
		/*body {
			text-align: center;
			font-size: 20px;
			color: brown;
			font-variant: small-caps;
			margin: 15px;
		}*/
		.col-20 {
			width: 21%;
			height: 200px;
			box-shadow: 0 0 10px black;
			border-radius: 15px;
			float: left;
			margin-right: 2%;
			margin-left: 2%;
			margin-top: 10px;
			margin-bottom: 45px;
		}
		.col-40 {
			width: 21%;
			height: 200px;
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
			margin-bottom: 30px;
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
			font-weight: bold;
		}
		.col-40:hover .container {
			font-weight: bold;
		}
		button {
			display: block;
			margin: auto;
			border: none;
			box-shadow: 0 0 7px red;
			border-radius: 5px;
			height: 30px;
			width: 80px;
			font-variant: small-caps;
			font-weight: bold;
			color: brown;
		}
		button:hover {
			box-shadow: 0 0 7px black;
			text-decoration: underline;
			color: red;
			cursor: pointer;
		}
		a {
			text-decoration: none;
		}
	</style>
    </head>
    <body>
        <h1>Products </h1>
        <form action="ControllerCartBean">     
        <%
            Products listSP = new Products();
            List<Product> list = listSP.showProduct("");
            for(Product sp:list){
                /*out.print("<form action=\"ControllerCartBean\">");
                out.print("<tr><td>"+sp.getCode()+"</td><td>"+sp.getName()+ "</td>"+
                        "<td>"+sp.getPrice()+"</td><td><input type=\"submit\" "
                        + "value=\"Add to Cart\" name=\"action\" /></td>"
                        + "<input type=\"hidden\" name=\"txtCode\" value='" + sp.getCode() + "'>"
                        + "<input type=\"hidden\" name=\"txtName\" value='" + sp.getName() + "'>"
                        + "<input type=\"hidden\" name=\"txtPrice\" value='" + sp.getPrice() + 
                        "'></tr>");
                
                out.print("</form>");*/
                
                out.println("<div class=\"col-20\">");
                out.println("<div class=\"container\">");
                out.println("<div class=\"icons\">");
                out.println("<img src=\"img/heart.png\">");
                out.println("<img style=\"clear: both;\" src=\"img/plane.png\">");
                out.println("<img style=\"clear: both;\" src=\"img/purchase.png\">");
                out.println("</div>");
                out.println("<div class=\"name\">");
                out.println("<p>" + sp.name + "</p>");
                out.println("</div>");
                out.println("<img class=\"img\" src=\"" + sp.picURL + "\">");
                out.println("<div class=\"price\">Giá: 5.000vnđ/1 cây</div>");
                out.print("</div>");
                out.println("<a href=\"validateForm.html\" target=\"page\"><button id=\"nut1\" onclick=\"return xacNhanDat(this);\">Đặt hàng</button></a>");
                out.println("</div>");
            }
        %>
        
            <input type="submit" value="View Cart" name="action" />
        </form>
    </body>
</html>
