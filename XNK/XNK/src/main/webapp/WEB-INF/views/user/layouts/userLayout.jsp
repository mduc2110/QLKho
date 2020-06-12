<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Simple Sidebar - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->

<link rel="stylesheet"
	href='<c:url value="/assets/bootstrap/css/bootstrap.min.css"></c:url>'>
<link rel="stylesheet"
	href='<c:url value="/assets/bootstrap/css/sidebar-format.css"></c:url>'>
<!-- Custom styles for this template -->
<script
	src='<c:url value="assets/bootstrap/js/bootstrap.bundle.min.js"></c:url>'></script>
<script src='<c:url value="assets/jquery/jquery.min.js"></c:url>'></script>
</head>

<body>

	<div class="d-flex" id="wrapper">
		<tiles:insertAttribute name="sidebar" />
		<!-- Page Content -->
		<div id="page-content-wrapper">

			<tiles:insertAttribute name="navbar" />

			<div class="container-fluid">
				<tiles:insertAttribute name="body" />
			</div>
		</div>

	</div>
	<!-- /#wrapper -->

	<!-- Bootstrap core JavaScript -->
	<script src='<c:url value="/assets/jquery/jquery.min.js"/>'></script>
	<script
		src='<c:url value="/assets/bootstrap/js/bootstrap.bundle.min.js" />'></script>
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
				$("#wrapper").toggleClass("toggled");
		});
	</script>

</body>

</html>

