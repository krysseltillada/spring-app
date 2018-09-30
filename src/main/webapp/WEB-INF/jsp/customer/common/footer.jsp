<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="template" value="/resources/vendor/template-customer" />

<!-- Footer -->
<footer class="bg6 p-t-45 p-b-43 p-l-45 p-r-45">
	<div class="t-center p-l-15 p-r-15">
		<a href="#">
			<img class="h-size2" src="<c:url value='${template}/images/icons/paypal.png'/>" alt="IMG-PAYPAL">
		</a>

		<a href="#">
			<img class="h-size2" src="<c:url value='${template}/images/icons/visa.png'/>" alt="IMG-VISA">
		</a>

		<a href="#">
			<img class="h-size2" src="<c:url value='${template}/images/icons/mastercard.png'/>" alt="IMG-MASTERCARD">
		</a>

		<a href="#">
			<img class="h-size2" src="<c:url value='${template}/images/icons/express.png'/>" alt="IMG-EXPRESS">
		</a>

		<a href="#">
			<img class="h-size2" src="<c:url value='${template}/images/icons/discover.png'/>" alt="IMG-DISCOVER">
		</a>

		<div class="t-center s-text8 p-t-20">
			Copyright © 2018. All rights reserved. | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
		</div>
	</div>
</footer>