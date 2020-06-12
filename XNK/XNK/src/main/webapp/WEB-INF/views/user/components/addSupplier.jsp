<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>

<div class="py-5 text-center">
	<h2>Thêm thoong tin NCC</h2>
</div>
<c:url value="/user/add-supplier" var="url" />
<mvc:form method="post" action="${ url }" modelAttribute="supplier">

	<div class="mb-3">
		<label>Mã nhà cung cấp</label>
		<div class="input-group">
			<mvc:input type="text" cssClass="form-control" path="id"
				placeholder="id" />
			<mvc:errors path="id" cssClass="text-danger" />
		</div>
	</div>

	<div class="mb-3">
		<label>Tên</label>
		<div class="input-group">
			<mvc:input type="text" cssClass="form-control" path="name"
				placeholder="name" />
			<mvc:errors path="name" cssClass="text-danger" />
		</div>
	</div>

	<div class="mb-3">
		<label>Số điện thoại</label>
		<div class="input-group">
			<mvc:input type="text" cssClass="form-control" path="numberphone"
				placeholder="Your number phone" />
			<mvc:errors path="numberphone" cssClass="text-danger" />
		</div>
	</div>
		<button class="btn btn-success" type="submit">Thêm nhà cung cấp</button>

</mvc:form>