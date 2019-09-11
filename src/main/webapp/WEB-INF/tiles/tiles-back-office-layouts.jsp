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
	
    <link rel="shortcut icon" type="image/png" href="${PATH+=BACKOFFICE_DIR_IMAGES}//icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="${PATH+=DIR_BOOTSTRAP4}/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/themify-icons.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/metisMenu.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/owl.carousel.min.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/slicknav.min.css">
    <!-- amchart css -->
    <link rel="stylesheet" type="text/css" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
    <!-- others css -->
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/typography.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/default-css.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/styles.css">
    <link rel="stylesheet" type="text/css" href="${PATH+=BACKOFFICE_DIR_CSS}/responsive.css">
    <!-- modernizr css -->
    <script src="${PATH+=BACKOFFICE_DIR_JS}/modernizr-2.8.3.min.js"></script>
</head>
<body>
    <!-- preloader area start -->
    <div id="preloader">
        <div class="loader"></div>
    </div>
    <!-- preloader area end -->
    
    <!-- page container area start -->
    <div class="page-container">
		<!-- Banner (메뉴) -->
		<tiles:insertAttribute name="menu" />
        <!-- main content area start -->
        <div class="main-content">
			<!-- Header (사이트 로고, 글로벌 링크(회원가입, 언어셋 등), 소개 등 -->
			<tiles:insertAttribute name="header" />        		
	    	<!-- Content (컨텐츠 내용) -->
	    	<tiles:insertAttribute name="body" />
	    </div>
	    <!-- main content area end -->
    	<!-- footer (주소나 연락처, 저작권) -->		
		<tiles:insertAttribute name="footer" />
	</div>
	<!-- page container area end -->
	
    <!-- jquery latest version -->
    <script src="${PATH+=BACKOFFICE_DIR_JS}/vendor/jquery-2.2.4.min.js"></script>
    <!-- bootstrap 4 js -->
    <script src="${PATH+=DIR_BOOTSTRAP4}/popper.js"></script>
    <script src="${PATH+=DIR_BOOTSTRAP4}/bootstrap.min.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/owl.carousel.min.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/metisMenu.min.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/jquery.slimscroll.min.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/jquery.slicknav.min.js"></script>

    <!-- start chart js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
    <!-- start highcharts js -->
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <!-- start zingchart js -->
    <script src="https://cdn.zingchart.com/zingchart.min.js"></script>
    <script>
    zingchart.MODULESDIR = "https://cdn.zingchart.com/modules/";
    ZC.LICENSE = ["569d52cefae586f634c54f86dc99e6a9", "ee6b7db5b51705a13dc2339db3edaf6d"];
    </script>
    <!-- all line chart activation -->
    <script src="${PATH+=BACKOFFICE_DIR_JS}/line-chart.js"></script>
    <!-- all pie chart -->
    <script src="${PATH+=BACKOFFICE_DIR_JS}/pie-chart.js"></script>
    <!-- others plugins -->
    <script src="${PATH+=BACKOFFICE_DIR_JS}/plugins.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/scripts.js"></script>	
	
</body>
</html>