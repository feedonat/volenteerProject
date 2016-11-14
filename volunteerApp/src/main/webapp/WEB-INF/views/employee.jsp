<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Employees</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<img src="<spring:url value='/resource/images/kemosabes.jpg' />" />
				<h1>An Employee</h1>
				<p>Employee by his first Name!!!</p>
			</div>
			
			<a href="<c:url value="/employees/add" />" class="btn btn-danger btn-mini pull-right">Add a new Employee</a>
						
 			
		</div>
	</section>

	<section class="container">
		<div class="row">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
 						<div class="caption">
							<h3>First Name - ${resource.firstName}</h3>
							<h3>Last Name - ${resource.lastName}</h3>
							<p>Age -         ${resource.age}</p>
							<p>Title -       ${resource.title} </p>
							<p>NUMBER -      ${resource.employeeNumber} </p>
							<p>
								<!--a
									href=" <spring:url value="/products/product?id=${product.productId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a-->
							</p>

						</div>
					</div>
				</div>
		</div>
	</section>
</body>
</html>
