<%-- 
    Document   : show
    Created on : Sep 8, 2016, 9:52:49 PM
    Author     : KietLPT
 <jsp:include page="/admin/_header.jsp"></jsp:include>
        <jsp:include page="/admin/_menu.jsp"></jsp:include>
<jsp:include page="/admin/_footer.jsp"></jsp:include>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show</title>
        <style type="text/css">
		table {
			border-collapse: collapse;
			border: 2px solid black;
                        border-radius: 1em;
		}
		caption {
			font-weight: bold;
			font-size: larger;
			padding-bottom: 10px;
			text-decoration: underline;
		}
                td {
                    padding: 10px;
                }
		th {
			background-color: #CC9999;
			border: 2px solid black;
                        padding: 10px;
		}
		tr:nth-child(2n+1) {
			background-color: beige;
		}
	</style>
    </head>
    <body>      
        <h1 align="center">GIỎ HÀNG CỦA BẠN:</h1>
        <c:set var="shop" value="${sessionScope.SHOP}" />
        <c:if test="${not empty shop}">
            <table border="1" align="center" cellSpacing="10">
                <thead>
                    <tr>
                        <td>No.</td>
                        <td>Code</td>
                        <td>Name</td>
                        <td>Price</td>
                        <td>Quantity</td>
                        <td>Action</td>
                    </tr>
                </thead>
                <tbody>
                <form action="ControllerCartBean">
                    <c:set var="count" value="0" />
                    <c:forEach var="rows" items="${shop}">
                        <c:set var="count" value="${count + 1}" />
                        <tr>
                            <td>${count}</td>
                            <td>${rows.value.sanpham.ID}</td> 
                            <td>${rows.value.sanpham.name}</td> 
                            <td>${rows.value.sanpham.price}</td>
                            <td>${rows.value.quantity}</td>
                            <td><input type="checkbox" name="rmv" 
                                value="${rows.value.sanpham.ID}" /></td>
                            <input type="hidden" name="txtID${count}" value="${rows.value.sanpham.ID}" />
                            <input type="hidden" name="txtSL${count}" value="${rows.value.quantity}" />
                            
                        </tr>
                    </c:forEach>
                    <tr>
                        <c:url var="add" value="ControllerCartBean">
                            <c:param name="action" value="AddMore"/>
                        </c:url>
                        <td colspan="2"><a href="${add}">Add more</a></td>
                        <td><input type="submit" value="Remove" name="action"/></td>
                        <th colspan="3"><input type="submit" value="Đặt Mua" name="action" style="border: none; box-shadow: 0 0 7px black; border-radius: 5px; height: 30px; width: 80px;" /></th>
                    </tr>
                </form>
                </tbody>
            </table>
        </c:if>   
        
    </body>
</html>
