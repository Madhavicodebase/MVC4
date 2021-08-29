<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products List</title>
</head>
<body>
       <h3>Products List</h3> 
		<table border="2" cellpadding="5" cellspacing="5">
		<tr>
			<th>productId</th>   
			<th>productName</th>
			<th>productLevel</th>
			<th>premium</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.product_id}</td>  
				<td>${product.product_name }</td>
				<td>${product.product_level }</td>
				<td>${product.premium }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>