<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/constant.jsp" %> 
    
<%-- <div class="banner">
	<div class="banner_background" style="background-image:url(${PATH+=FRONTPAGE_DIR_IMAGES}/banner_background.jpg)"></div>
	<div class="container fill_height">
		<div class="row fill_height">
			<div class="banner_product_image"><img src="${PATH+=FRONTPAGE_DIR_IMAGES}/banner_product.png" alt=""></div>
			<div class="col-lg-5 offset-lg-4 fill_height">
				<div class="banner_content">
					<h1 class="banner_text">new era of smartphones</h1>
					<div class="banner_price"><span>$530</span>$460</div>
					<div class="banner_product_name">Apple Iphone 6s</div>
					<div class="button banner_button"><a href="#">Shop Now</a></div>
				</div>
			</div>
		</div>
	</div>
</div> --%>
<aside>
	<!-- 배너 (키 비쥬얼) -->
	<div id="slider" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators" style="z-index:1">
			<li data-target="#slider" data-slide-to="0" class="active"></li>
			<li data-target="#slider" data-slide-to="1"></li>
			<li data-target="#slider" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="carousel-item active" style="background-image:url(${PATH+=FRONTPAGE_DIR_IMAGES}/banner_background.jpg)">
				<div class="carousel-caption d-none d-md-block"></div>
			</div>
			<div class="carousel-item" style="background-image: url('https://3.bp.blogspot.com/-_7vaKiNZPXk/XCWoF-0xj7I/AAAAAAAAAMk/Bx7Ne5WLEvINHPDoG1jwY6rGO2d62pprwCKgBGAs/s1600/ux-design.jpeg')">
				<div class="carousel-caption d-none d-md-block"></div>
			</div>
			<div class="carousel-item" style="background-image:url(${PATH+=FRONTPAGE_DIR_IMAGES}/banner_background.jpg)">
				<div class="carousel-caption d-none d-md-block"></div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#slider" role="button" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="carousel-control-next" href="#slider" role="button" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
</aside>