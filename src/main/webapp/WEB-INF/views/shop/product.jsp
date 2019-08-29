<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
TEST
<table border="1">
	<c:forEach var="row" items="${map.list}">
		<tr>
			<td>${row.product_no}</td>
			<td>${row.product_name}</td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>${row.product_price}</td>
			<td>${row.product_stock}</td>
			<td>${row.product_explain}</td>
			<td>${row.product_reg_date}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>