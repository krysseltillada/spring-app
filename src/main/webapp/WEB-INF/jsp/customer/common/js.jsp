<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="template" value="/resources/vendor/template-customer" />

<script type="text/javascript" src="<c:url value="${template}/vendor/jquery/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/vendor/animsition/js/animsition.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/vendor/bootstrap/js/popper.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/vendor/bootstrap/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/vendor/select2/select2.min.js"/>"></script>
<script type="text/javascript">
	$(".selection-1").select2({
		minimumResultsForSearch: 20,
		dropdownParent: $('#dropDownSelect1')
	});
</script>
<script type="text/javascript" src="<c:url value="${template}/vendor/slick/slick.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/js/slick-custom.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/vendor/countdowntime/countdowntime.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/vendor/lightbox2/js/lightbox.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="${template}/vendor/sweetalert/sweetalert.min.js"/>"></script>
<script type="text/javascript">
	$('.block2-btn-addcart').each(function(){
		var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
		$(this).on('click', function(){
			swal(nameProduct, "is added to cart !", "success");
		});
	});

	$('.block2-btn-addwishlist').each(function(){
		var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
		$(this).on('click', function(){
			swal(nameProduct, "is added to wishlist !", "success");
		});
	});
</script>

<script src="<c:url value="${template}/js/main.js"/>"></script>
<script src="<c:url value="/resources/vendor/momentjs/moment-with-locales.min.js" />"></script>
<script src="<c:url value="/resources/vendor/timeago/timeago.min.js" />"></script>
<script src="<c:url value="/resources/vendor/timeago/timeago.locales.min.js" />"></script>


