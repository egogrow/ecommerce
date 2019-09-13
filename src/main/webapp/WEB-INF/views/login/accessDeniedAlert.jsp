<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/constant.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="OneTech shop project">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Access Denied</title>
    <script src="${PATH+=FRONTPAGE_DIR_JS}/jquery-3.3.1.min.js"></script>
</head>
<body>
	
	<script type="text/javascript">
	$(document).ready(function(){
		var msgg = '${msg}';
		var url= '${PATH}${url}';
		alert(msgg);
		window.location.href= url;
	});
	</script>
	
</body>
</html>
