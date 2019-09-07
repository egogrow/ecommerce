<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="OneTech shop project">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><tiles:getAsString name="title" /></title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/front-end/layout.css?v1"> <!-- 공용 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/front-end/main_styles.css?v5"> <!-- 헤더 및 메인 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/front-end/bootstrap4/bootstrap.min.css"> <!-- 부트스트랩 css -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/front-end/responsive.css?v3"> <!-- 모바일 css -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/plugins/front-end/fontawesome-free-5.0.1/css/fontawesome-all.css"> <!-- 기호 css -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/plugins/front-end/OwlCarousel2-2.2.1/owl.carousel.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/plugins/front-end/OwlCarousel2-2.2.1/owl.theme.default.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/plugins/front-end/OwlCarousel2-2.2.1/animate.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/plugins/front-end/slick-1.8.0/slick.css">
	
	<script src="${pageContext.request.contextPath}/resources/js/front-end/jquery-3.3.1.min.js"></script> <!-- jquery -->
	<script src="${pageContext.request.contextPath}/resources/css/front-end/bootstrap4/popper.js"></script> <!-- 부트스트랩 -->
	<script src="${pageContext.request.contextPath}/resources/css/front-end/bootstrap4/bootstrap.min.js"></script> <!-- 부트스트랩 -->
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/greensock/TweenMax.min.js"></script> <!-- 모바일 메뉴 드롭&다운 -->
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/greensock/TimelineMax.min.js"></script> <!-- 모바일 메뉴 드롭&다운 -->
	<script src="${pageContext.request.contextPath}/resources/js/front-end/custom.js?v11"></script> <!-- 모바일 메뉴 드롭&다운 -->
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/scrollmagic/ScrollMagic.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/greensock/animation.gsap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/greensock/ScrollToPlugin.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/OwlCarousel2-2.2.1/owl.carousel.js"></script>
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/slick-1.8.0/slick.js"></script>
	<script src="${pageContext.request.contextPath}/resources/plugins/front-end/easing/easing.js"></script>
</head>
<body>
	<div>
		<!-- Header (사이트 로고, 글로벌 링크(회원가입, 언어셋 등), 소개 등 -->
		<tiles:insertAttribute name="header" />
		<!-- Banner (배너 광고, 위젯) -->
		<tiles:insertAttribute name="banner" />
    	<!-- Content (컨텐츠 내용) -->
    	<tiles:insertAttribute name="body" />
    	<!-- footer (주소나 연락처, 저작권) -->		
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>