<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "../../jsp/admin/common/taglib.jsp" %>

<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Sufee Admin - HTML5 Admin Template">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" href="<c:url value="${template}/apple-icon.png"/>">
        <link rel="shortcut icon" href="<c:url value="${template}/favicon.ico"/>">

        <c:import url="../../jsp/admin/common/css.jsp" />

        <title>Admin Login</title>

    </head>
    <body>
    
    	<div class="sufee-login d-flex align-content-center flex-wrap">
	        <div class="container">
	            <div class="login-content">
	                <div class="login-logo">
	                    <h4>Admin</h4>
	                </div>
	                <div class="login-form">
	                    <form:form action="/admin" method="post">
	                        <div class="form-group">
	                            <label>Username</label>
	                            <input type="text" name="username" class="form-control" placeholder="Username">
	                        </div>
	                        <div class="form-group">
	                            <label>Password</label>
	                            <input type="password" name="password" class="form-control" placeholder="Password">
	                        </div>
	                        
	                        <button type="submit" class="btn btn-success btn-flat m-b-30 m-t-30">Sign in</button>
	                       	<br>
	                       	<br>
	                        <c:if test="${param.error != null}">
		                        <div class="col-sm-12">
				                    <div class="alert  alert-warning alert-dismissible fade show" role="alert">
				                        <span class="badge badge-pill badge-warning">Warning</span> Wrong password or username.
				                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
				                            <span aria-hidden="true">&times;</span>
				                        </button>
				                    </div>
				                </div>
	                    	</c:if>
	                    	<c:if test="${param.logout != null}">
		                        <div class="col-sm-12">
				                    <div class="alert  alert-success alert-dismissible fade show" role="alert">
				                        <span class="badge badge-pill badge-success">Success</span> Successfully logged out!
				                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
				                            <span aria-hidden="true">&times;</span>
				                        </button>
				                    </div>
				                </div>
	                    	</c:if>
	                    </form:form>
	                </div>
	            </div>
	        </div>
	    </div>

        <c:import url="../../jsp/admin/common/js.jsp" />

    </body>
</html>
