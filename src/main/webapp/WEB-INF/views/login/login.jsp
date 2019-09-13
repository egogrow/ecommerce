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
	<title>Login Page</title>
	
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
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <!-- preloader area start -->
    <div id="preloader">
        <div class="loader"></div>
    </div>
    <!-- preloader area end -->
    <!-- login area start -->
    <div class="login-area">
        <div class="container">
            <div class="login-box ptb--100">
                <form action="${PATH}/login" method="post">
                    <div class="login-form-head">
                        <h4>Sign In</h4>
                        <p>Hello there, Sign in and start managing your Admin Template</p>
                    </div>
                    <div class="login-form-body">
                        <div class="form-gp">
                            <label for="exampleInputId">Id or Email address</label>
                            <input type="text" name="loginId" id="exampleInputEmail1">
                            <i class="ti-email"></i>
                        </div>
                        <div class="form-gp">
                            <label for="exampleInputPassword1">Password</label>
                            <input type="password" name="loginPwd" id="exampleInputPassword1">
                            <i class="ti-lock"></i>
                        </div>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"  />
                        
						<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
	                            <p class="text-muted text-center mb-2">${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</p>
	                            <c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session"/>
						</c:if>
                        
                        <div class="row mb-4 rmber-area">
                            <div class="col-6">
                                <div class="custom-control custom-checkbox mr-sm-2">
                                    <input type="checkbox" class="custom-control-input" id="customControlAutosizing">
                                    <label class="custom-control-label" for="customControlAutosizing">Remember Me</label>
                                </div>
                            </div>
                            <div class="col-6 text-right">
                                <a href="#">Forgot Password?</a>
                            </div>
                        </div>
                        <div class="submit-btn-area">
                            <button id="form_submit" type="submit">Submit <i class="ti-arrow-right"></i></button>
                            <div class="login-other row mt-4">
                                <div class="col-6">
                                    <a class="fb-login" href="#">Log in with <i class="fa fa-facebook"></i></a>
                                </div>
                                <div class="col-6">
                                    <a class="google-login" href="#">Log in with <i class="fa fa-google"></i></a>
                                </div>
                            </div>
                        </div>
                        <div class="form-footer text-center mt-5">
                            <p class="text-muted">Don't have an account? <a href="register.html">Sign up</a></p>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- login area end -->
<!-- commerce/resources/js/back-office/vendor/jquery-2.2.4.min.js -->
    <!-- jquery latest version -->
    <script src="${PATH+=BACKOFFICE_DIR_JS}/vendor/jquery-2.2.4.min.js"></script>
    <!-- bootstrap 4 js -->
<!--     <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script> -->
    <script src="${PATH+=DIR_BOOTSTRAP4}/popper.js"></script>
    <script src="${PATH+=DIR_BOOTSTRAP4}/bootstrap.min.js"></script>    
    <script src="${PATH+=BACKOFFICE_DIR_JS}/owl.carousel.min.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/metisMenu.min.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/jquery.slimscroll.min.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/jquery.slicknav.min.js"></script>
    
    <!-- others plugins -->
    <script src="${PATH+=BACKOFFICE_DIR_JS}/plugins.js"></script>
    <script src="${PATH+=BACKOFFICE_DIR_JS}/scripts.js"></script>
</body>

</html>    