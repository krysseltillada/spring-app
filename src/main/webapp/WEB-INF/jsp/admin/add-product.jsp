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
		
		<style>
            .error {
                color: red;
            }
        </style>
		
        <title>Admin</title>

    </head>
    <body>


        <!-- Left Panel -->

        <aside id="left-panel" class="left-panel">
            <nav class="navbar navbar-expand-sm navbar-default">

                <div class="navbar-header">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main-menu" aria-controls="main-menu" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand" href="./"><img src="<c:url value="${template}/images/logo.png"/>" alt="Logo"></a>
                    <a class="navbar-brand hidden" href="./"><img src="<c:url value="${template}/images/logo2.png"/>" alt="Logo"></a>
                </div>

                <div id="main-menu" class="main-menu collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="/admin/dashboard"> <i class="menu-icon fa fa-dashboard"></i>Dashboard </a>
                        </li>
                        <li class="active">
                            <a href="/admin/add-product"> <i class="menu-icon fa fa-laptop"></i>Add Product </a>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </nav>
        </aside><!-- /#left-panel -->

        <!-- Left Panel -->

        <!-- Right Panel -->

        <div id="right-panel" class="right-panel">

            <!-- Header-->
            <header id="header" class="header">

                <div class="header-menu">

                    <div class="col-sm-7">
                        <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks"></i></a>
                        <div class="header-left">
                            <button class="search-trigger"><i class="fa fa-search"></i></button>
                            <div class="form-inline">
                                <form class="search-form">
                                    <input class="form-control mr-sm-2" type="text" placeholder="Search ..." aria-label="Search">
                                    <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                                </form>
                            </div>

                            <div class="dropdown for-notification">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa fa-bell"></i>
                                    <span class="count bg-danger">5</span>
                                </button>
                                <div class="dropdown-menu" aria-labelledby="notification">
                                    <p class="red">You have 3 Notification</p>
                                    <a class="dropdown-item media bg-flat-color-1" href="#">
                                        <i class="fa fa-check"></i>
                                        <p>Server #1 overloaded.</p>
                                    </a>
                                    <a class="dropdown-item media bg-flat-color-4" href="#">
                                        <i class="fa fa-info"></i>
                                        <p>Server #2 overloaded.</p>
                                    </a>
                                    <a class="dropdown-item media bg-flat-color-5" href="#">
                                        <i class="fa fa-warning"></i>
                                        <p>Server #3 overloaded.</p>
                                    </a>
                                </div>
                            </div>

                            <div class="dropdown for-message">
                                <button class="btn btn-secondary dropdown-toggle" type="button"
                                        id="message"
                                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="ti-email"></i>
                                    <span class="count bg-primary">9</span>
                                </button>
                                <div class="dropdown-menu" aria-labelledby="message">
                                    <p class="red">You have 4 Mails</p>
                                    <a class="dropdown-item media bg-flat-color-1" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="<c:url value="${template}/images/avatar/1.jpg"/>"></span>
                                        <span class="message media-body">
                                            <span class="name float-left">Jonathan Smith</span>
                                            <span class="time float-right">Just now</span>
                                                <p>Hello, this is an example msg</p>
                                        </span>
                                    </a>
                                    <a class="dropdown-item media bg-flat-color-4" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="<c:url value="${template}/images/avatar/2.jpg"/>"></span>
                                        <span class="message media-body">
                                            <span class="name float-left">Jack Sanders</span>
                                            <span class="time float-right">5 minutes ago</span>
                                                <p>Lorem ipsum dolor sit amet, consectetur</p>
                                        </span>
                                    </a>
                                    <a class="dropdown-item media bg-flat-color-5" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="<c:url value="${template}/images/avatar/3.jpg"/>"></span>
                                        <span class="message media-body">
                                            <span class="name float-left">Cheryl Wheeler</span>
                                            <span class="time float-right">10 minutes ago</span>
                                                <p>Hello, this is an example msg</p>
                                        </span>
                                    </a>
                                    <a class="dropdown-item media bg-flat-color-3" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="<c:url value="${template}/images/avatar/4.jpg"/>"></span>
                                        <span class="message media-body">
                                            <span class="name float-left">Rachel Santos</span>
                                            <span class="time float-right">15 minutes ago</span>
                                                <p>Lorem ipsum dolor sit amet, consectetur</p>
                                        </span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-sm-5">
                        <div class="user-area dropdown float-right">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img class="user-avatar rounded-circle" src="<c:url value="${template}/images/admin.jpg"/>" alt="User Avatar">
                            </a>

                            <div class="user-menu dropdown-menu">
                                <form:form method="post" id="logoutForm" action="/admin/logout" class="text-center">
							       <input type="submit" class="btn btn-outline-primary btn-sm" value="Sign Out"/>
							    </form:form>
                            </div>
                        </div>

                        <div class="language-select dropdown" id="language-select">
                            <a class="dropdown-toggle" href="#" data-toggle="dropdown"  id="language" aria-haspopup="true" aria-expanded="true">
                                <i class="flag-icon flag-icon-us"></i>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="language" >
                                <div class="dropdown-item">
                                    <span class="flag-icon flag-icon-fr"></span>
                                </div>
                                <div class="dropdown-item">
                                    <i class="flag-icon flag-icon-es"></i>
                                </div>
                                <div class="dropdown-item">
                                    <i class="flag-icon flag-icon-us"></i>
                                </div>
                                <div class="dropdown-item">
                                    <i class="flag-icon flag-icon-it"></i>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

            </header><!-- /header -->
            <!-- Header-->

            <div class="content mt-3">
				<form:form method="POST" action="/admin/add-product" modelAttribute="product">
                <div class="col-lg-12">
                    <div class="card">
                      <div class="card-header"><strong>Add</strong><small> Product</small></div>
                      <div class="card-body card-block">
                        <div class="form-group"><form:label path="productName" class=" form-control-label" >Product</form:label><form:input path="productName" type="text" id="product" placeholder="Enter your product name" class="form-control" /><form:errors path="productName" cssClass="error" /></div>
                        <div class="form-group"><form:label path="price" for="price" class=" form-control-label">Price</form:label><form:input path="price" type="number" id="price" placeholder="100.00" step="0.001" class="form-control" /><form:errors path="price" cssClass="error" /></div>
                        <div class="form-group"><form:label path="productDescription" class=" form-control-label">Description</form:label><form:input path="productDescription" type="text" id="street" placeholder="Enter product description" class="form-control" /><form:errors path="productDescription" cssClass="error" /></div>
                        
                        <button id="payment-button" type="submit" class="btn btn-lg btn-info btn-block">
                            <span id="payment-button-amount">Post Product</span>                 
                        </button>
                        
                        <br>
                        <br>
                        
                        <c:if test="${not empty success}">
				            <div class="col-sm-12">
				                    <div class="alert  alert-success alert-dismissible fade show" role="alert">
				                        <span class="badge badge-pill badge-success">Success</span> Product successfully posted!
				                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
				                            <span aria-hidden="true">&times;</span>
				                        </button>
				                    </div>
				                </div>
				        </c:if>
                      </div>
                    </div>
                  </div>
				</form:form>

            </div> <!-- .content -->
        </div><!-- /#right-panel -->

        <!-- Right Panel -->

        <c:import url="../../jsp/admin/common/js.jsp" />

        <script>
            ( function ( $ ) {
                "use strict";

                jQuery( '#vmap' ).vectorMap( {
                                                 map: 'world_en',
                                                 backgroundColor: null,
                                                 color: '#ffffff',
                                                 hoverOpacity: 0.7,
                                                 selectedColor: '#1de9b6',
                                                 enableZoom: true,
                                                 showTooltip: true,
                                                 values: sample_data,
                                                 scaleColors: [ '#1de9b6', '#03a9f5' ],
                                                 normalizeFunction: 'polynomial'
                                             } );
            } )( jQuery );
        </script>

    </body>
</html>
