<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="bg-light border-right" id="sidebar-wrapper">
	<div class="sidebar-heading">Xin chào</div>
	<div class="list-group list-group-flush">
	<a href='<c:url value = "/user/add-supplier"></c:url>' class="list-group-item list-group-item-action bg-light">Thêm thông tin nhà cung cấp</a>
		<a href='<c:url value = "/user/add-good"></c:url>' class="list-group-item list-group-item-action bg-light">Thêm sản phẩm</a> 
		<a href='<c:url value = "/user/good-info"></c:url>' class="list-group-item list-group-item-action bg-light">Thống kê sản phẩm trong kho</a>
		 
		<a href="#" class="list-group-item list-group-item-action bg-light">Báo cáo nhập kho</a> 
		<a href="#" class="list-group-item list-group-item-action bg-light">Báo cáo xuất kho</a>
	</div>
</div>