<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="/WEB-INF/views/include/constant.jsp" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.core.Authentication" %>
<%
/*  	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	Object principal = auth.getPrincipal();
	
	String name = "";
	if(principal != null) {
		name = auth.getName();
	} */
%>
<header class="header">
	<!-- 최상단 바 -->
	<div class="top_bar">
		<div class="container">
			<div class="row">
				<div class="col d-flex flex-row">
					<div class="top_bar_contact_item"><a href="">입점문의</a></div>
					<div class="top_bar_contact_item"><a href="">고객센터</a></div>				
					<div class="top_bar_content ml-auto">
						<div class="top_bar_user">
							<div class="user_icon"><img src="${PATH+=FRONTPAGE_DIR_IMAGES}/user.svg" alt=""></div>							
							<sec:authorize access="isAnonymous()">
								<div><a href="#">회원가입</a></div>							
								<div><a href='<c:url value="/login"/>'>로그인</a></div>
							</sec:authorize>
							<sec:authorize access="isAuthenticated()">
							    <span class="user_text">${user}</span><span class="user_text_etc">님</span>
								<a href="#" onclick="document.getElementById('logoutForm').submit();">로그아웃</a>
								<form id="logoutForm" action='<c:url value='/logout'/>' method="POST">
								   <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
								</form>
							</sec:authorize>
							
							
						</div>
					</div>
				</div>
			</div>
		</div>		
	</div>
	
	<!-- 헤더 영역 -->
	<div class="header_main">
		<div class="container">
			<div class="row">
	
				<!-- 로고 -->
				<div class="col-lg-3 col-sm-3 col-4 order-1">
					<div class="logo_container">					
						<div class="logoSub"><a href="">&nbsp;&nbsp;부르주아 대표!</a></div>
						<div class="logo"><a href="">모찌마켓</a></div>					
					</div>
				</div>
	
				<!-- 검색 -->
				<div class="col-lg-6 col-12 order-lg-2 order-3 text-lg-left text-right">
					<div class="header_search">
						<div class="header_search_content">
							<div class="header_search_form_container">
								<form action="#" class="header_search_form clearfix">
									<input type="search" required="required" class="header_search_input" placeholder="Search for products...">
	<!-- 								<div class="custom_dropdown">
										<div class="custom_dropdown_list">
											<span class="custom_dropdown_placeholder clc">All Categories</span>
											
											<ul class="custom_list clc">
												<li><a class="clc" href="#">All Categories</a></li>
												<li><a class="clc" href="#">Computers</a></li>
												<li><a class="clc" href="#">Laptops</a></li>
												<li><a class="clc" href="#">Cameras</a></li>
												<li><a class="clc" href="#">Hardware</a></li>
												<li><a class="clc" href="#">Smartphones</a></li>
											</ul>
										</div>
									</div> -->
									<button type="submit" class="header_search_button trans_300" value="Submit"><img src="${PATH+=FRONTPAGE_DIR_IMAGES}/search.png" alt=""></button>
								</form>
							</div>
						</div>
					</div>
				</div>
	
				<!-- 위시리스트 -->
				<div class="col-lg-3 col-8 order-lg-3 order-2 text-lg-left text-right">
					<div class="wishlist_cart d-flex flex-row align-items-center justify-content-end">
						<div class="wishlist d-flex flex-row align-items-center justify-content-end">
							<div class="wishlist_icon"><img src="${PATH+=FRONTPAGE_DIR_IMAGES}/heart.png" alt=""></div>
							<div class="wishlist_content">
								<div class="wishlist_text"><a href="#">Wishlist</a></div>
								<div class="wishlist_count">115</div>
							</div>
						</div>
	
						<!-- 장바구니 -->
						<div class="cart">
							<div class="cart_container d-flex flex-row align-items-center justify-content-end">
								<div class="cart_icon">
									<img src="${PATH+=FRONTPAGE_DIR_IMAGES}/cart.png" alt="">
									<div class="cart_count"><span>10</span></div>
								</div>
								<div class="cart_content">
									<div class="cart_text"><a href="#">Cart</a></div>
									<div class="cart_price">$85</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 네비게이션 -->
	<nav class="main_nav">
		<div class="container">
			<div class="row">
				<div class="col">
					
					<div class="main_nav_content d-flex flex-row">
	
						<!-- 카테고리 메뉴 -->
						<div class="cat_menu_container" style="z-index:16">
							<div class="cat_menu_title d-flex flex-row align-items-center justify-content-start">
								<div class="cat_burger"><span></span><span></span><span></span></div>
								<div class="cat_menu_text">전체 카테고리</div>
							</div>

							<div id="category">
								<ul class="category_ul">
									<c:forEach var="category" items="${categoryList.category}">									
										<li class="category_li category_li_height dot"><a href="#" class="category_text">${category.categoryName}<i class="fas fa-caret-right"></i></a>
											<c:if test="${not empty category.categoryCodeRefCount}">
											<ul class="division_ul">
												<c:forEach var="division" items="${categoryList.division}" varStatus="i">											
													<c:if test="${category.categoryCode eq division.categoryCodeRef}">
													<li class="division_li category_li_height dot"><a href="#" class="category_text">${division.categoryName}<i class="fas fa-caret-right"></i></a>
														<c:if test="${not empty division.categoryCodeRefCount}">
														<ul class="section_ul">
															<c:forEach var="section" items="${categoryList.section}">
																<c:if test="${division.categoryCode eq section.categoryCodeRef}">
																	<li class="section_li category_li_height"><a href="" class="category_text">${section.categoryName}</a></li>
																</c:if>
															</c:forEach>														
														</ul>
														</c:if>
													</li>	
													</c:if>
												</c:forEach>											
											</ul>
											</c:if>
										</li>				
									</c:forEach>
								</ul>
							</div>									
						</div>
	
						<!-- 일반 메뉴 -->
						<div class="main_nav_menu">
							<ul class="standard_dropdown main_nav_dropdown">
								<li><a href="#">로켓배송</a></li>
								<li><a href="#">로켓직구</a></li>
								<li><a href="#">2019 추석</a></li>
								<li><a href="#">골드박스</a></li>
								<li><a href="#">정기배송</a></li>
								<li><a href="#">이벤트/쿠폰</a></li>							
								<li><a href="blog.html">기획전</a></li>
								<li><a href="contact.html">여행/티켓</a></li>
							</ul>
						</div>
	
						<!-- Menu Trigger -->
						<div class="menu_trigger_container ml-auto">
							<div class="menu_trigger d-flex flex-row align-items-center justify-content-end">
								<div class="menu_burger">
									<div class="menu_trigger_text">menu</div>
									<div class="cat_burger menu_burger_inner"><span></span><span></span><span></span></div>
								</div>
							</div>
						</div>
	
					</div>
				</div>
			</div>
		</div>
	</nav>
	
	<!-- 일반 메뉴 모바일 -->
	<div class="page_menu">
		<div class="container">
			<div class="row">
				<div class="col" style="margin-top:-1px;">
					
					<div class="page_menu_content">
						
						<div class="page_menu_search">
							<form action="#">
								<input type="search" required="required" class="page_menu_search_input" placeholder="Search for products...">
							</form>
						</div>
						<ul class="page_menu_nav">
							<li class="page_menu_item has-children">
								<a href="#">Language<i class="fa fa-angle-down"></i></a>
								<ul class="page_menu_selection">
									<li><a href="#">English<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Italian<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Spanish<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Japanese<i class="fa fa-angle-down"></i></a></li>
								</ul>
							</li>
							<li class="page_menu_item has-children">
								<a href="#">Currency<i class="fa fa-angle-down"></i></a>
								<ul class="page_menu_selection">
									<li><a href="#">US Dollar<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">EUR Euro<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">GBP British Pound<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">JPY Japanese Yen<i class="fa fa-angle-down"></i></a></li>
								</ul>
							</li>
							<li class="page_menu_item">
								<a href="#">Home<i class="fa fa-angle-down"></i></a>
							</li>
							<li class="page_menu_item has-children">
								<a href="#">Super Deals<i class="fa fa-angle-down"></i></a>
								<ul class="page_menu_selection">
									<li><a href="#">Super Deals<i class="fa fa-angle-down"></i></a></li>
									<li class="page_menu_item has-children">
										<a href="#">Menu Item<i class="fa fa-angle-down"></i></a>
										<ul class="page_menu_selection">
											<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
											<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
											<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
											<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
										</ul>
									</li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
								</ul>
							</li>
							<li class="page_menu_item has-children">
								<a href="#">Featured Brands<i class="fa fa-angle-down"></i></a>
								<ul class="page_menu_selection">
									<li><a href="#">Featured Brands<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
								</ul>
							</li>
							<li class="page_menu_item has-children">
								<a href="#">Trending Styles<i class="fa fa-angle-down"></i></a>
								<ul class="page_menu_selection">
									<li><a href="#">Trending Styles<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
								</ul>
							</li>
							<li class="page_menu_item"><a href="blog.html">blog<i class="fa fa-angle-down"></i></a></li>
							<li class="page_menu_item"><a href="contact.html">contact<i class="fa fa-angle-down"></i></a></li>
						</ul>
						
						<div class="menu_contact">
							<div class="menu_contact_item"><div class="menu_contact_icon"><img src="${PATH+=FRONTPAGE_DIR_IMAGES}/phone_white.png" alt=""></div>+38 068 005 3570</div>
							<div class="menu_contact_item"><div class="menu_contact_icon"><img src="${PATH+=FRONTPAGE_DIR_IMAGES}/mail_white.png" alt=""></div><a href="mailto:fastsales@gmail.com">fastsales@gmail.com</a></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</header>