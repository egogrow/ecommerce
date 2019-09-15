<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/include/constant.jsp" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="OneTech shop project">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><tiles:getAsString name="title" /></title>
	
	<!-- 공용 -->
	<link rel="stylesheet" type="text/css" href="${PATH+=FRONTPAGE_DIR_CSS}/layout.css?v1"> 
	<!-- 헤더 및 메인 -->
	<link rel="stylesheet" type="text/css" href="${PATH+=FRONTPAGE_DIR_CSS}/main_styles.css?v2"> 
	<!-- 부트스트랩 css -->
	<link rel="stylesheet" type="text/css" href="${PATH+=DIR_BOOTSTRAP4}/bootstrap.min.css">
	<!-- 모바일 css --> 
	<link rel="stylesheet" type="text/css" href="${PATH+=FRONTPAGE_DIR_CSS}/responsive.css"> 
	<!-- 기호 css -->
	<link rel="stylesheet" type="text/css" href="${PATH+=DIR_PLUGINS}/fontawesome-free-5.0.1/css/fontawesome-all.css"> 
	<link rel="stylesheet" type="text/css" href="${PATH+=DIR_PLUGINS}/OwlCarousel2-2.2.1/owl.carousel.css">
	<link rel="stylesheet" type="text/css" href="${PATH+=DIR_PLUGINS}/OwlCarousel2-2.2.1/owl.theme.default.css">
	<link rel="stylesheet" type="text/css" href="${PATH+=DIR_PLUGINS}/OwlCarousel2-2.2.1/animate.css">
	<link rel="stylesheet" type="text/css" href="${PATH+=DIR_PLUGINS}/slick-1.8.0/slick.css">
	
	<!-- jquery -->
	<script src="${PATH+=FRONTPAGE_DIR_JS}/jquery-3.3.1.min.js"></script>
	<!-- 부트스트랩 popper.js --> 
	<script src="${PATH+=DIR_BOOTSTRAP4}/popper.js"></script> 
	<!-- 부트스트랩 -->
	<script src="${PATH+=DIR_BOOTSTRAP4}/bootstrap.min.js"></script>
	<!-- 모바일 메뉴 드롭&다운 --> 
	<script src="${PATH+=DIR_PLUGINS}/greensock/TweenMax.min.js"></script> 
	<!-- 모바일 메뉴 드롭&다운 -->
	<script src="${PATH+=DIR_PLUGINS}/greensock/TimelineMax.min.js"></script>
	<!-- 모바일 메뉴 드롭&다운 custom.js --> 
	<script src="${PATH+=FRONTPAGE_DIR_JS}/custom.js"></script>
	<script src="${PATH+=DIR_PLUGINS}/scrollmagic/ScrollMagic.min.js"></script>
	<script src="${PATH+=DIR_PLUGINS}/greensock/animation.gsap.min.js"></script>
	<script src="${PATH+=DIR_PLUGINS}/greensock/ScrollToPlugin.min.js"></script>
	<script src="${PATH+=DIR_PLUGINS}/OwlCarousel2-2.2.1/owl.carousel.js"></script>
	<script src="${PATH+=DIR_PLUGINS}/slick-1.8.0/slick.js"></script>
	<script src="${PATH+=DIR_PLUGINS}/easing/easing.js"></script>
</head>
<body>
	<!-- Header (사이트 로고, 글로벌 링크(회원가입, 언어셋 등), 소개 등 -->
	<tiles:insertAttribute name="header" />
	<!-- Banner (배너 광고, 위젯) -->
	<tiles:insertAttribute name="banner" />
   	<!-- Content (컨텐츠 내용) -->
   	<tiles:insertAttribute name="body" />
   	<!-- footer (주소나 연락처, 저작권) -->		
	<tiles:insertAttribute name="footer" />
</body>
</html>