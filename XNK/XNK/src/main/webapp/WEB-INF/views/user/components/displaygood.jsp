<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="text-center">Danh sach</h2>
<table class="table table-bordered table-hover mt-3">
	<thead>
		<tr>
			<th>STT</th>
			<th>Tên</th>
			<th>Số lượng</th>
			<th>Giá (VNĐ)</th>
			<th>#</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ goods }" var="item" varStatus="status">
			<tr>
				<td>${ status.index + 1 }</td>
				<td>${ item.name }</td>
				<td>${ item.quantity }</td>
				<td>${ item.price }</td>
				<td><a href='<c:url value="/user/edit-good/"/>${ item.id }' class="btn btn-sm btn-info">Edit</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>