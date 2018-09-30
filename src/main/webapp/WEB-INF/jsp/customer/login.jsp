<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "../../jsp/customer/common/taglib.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login your account</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<c:import url="../../jsp/customer/common/css.jsp" />
</head>
<body class="animsition">

	<c:import url="../../jsp/customer/common/header.jsp" />

	<!-- content page -->
	<section class="bgwhite p-t-66 p-b-60">
		<div class="container">
			<div class="row">
				<div class="col-md-4 p-b-30">
					<div class="hov-img-zoom">
						<img src="<c:url value='${template}/images/icons/logo.png'/>" alt="IMG-ABOUT">
					</div>
				</div>

				<div class="col-md-6 p-b-30">
					<form class="leave-comment" action="/customer/login-account">
						<h4 class="m-text26 p-b-36 p-t-15">
							Login | TeamJava
						</h4>

						<div class="bo4 of-hidden size15 m-b-20">
							<input class="sizefull s-text7 p-l-22 p-r-22" type="text" name="username" placeholder="Username" required>
						</div>

						<div class="bo4 of-hidden size15 m-b-20">
							<input class="sizefull s-text7 p-l-22 p-r-22" type="password" name="user_password" placeholder="Password" required>
						</div>

						<div class="w-size25">
							<button type="submit" class="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">
								Login
							</button>
						</div>
					</form>

					<br>
					
					<a href="/customer/register">
						<button class="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">
							Register
						</button>
					</a>
				</div>
			</div>
		</div>
	</section>
	
	<c:import url="../../jsp/customer/common/footer.jsp" />

	<!-- Back to top -->
	<div class="btn-back-to-top bg0-hov" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="fa fa-angle-double-up" aria-hidden="true"></i>
		</span>
	</div>

	<!-- Container Selection -->
	<div id="dropDownSelect1"></div>
	<div id="dropDownSelect2"></div>

	<c:import url="../../jsp/customer/common/js.jsp" />
</body>
</html>
