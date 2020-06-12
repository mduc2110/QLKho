<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>

<div class="py-5 text-center">
	<h2>Thêm hàng hóa</h2>
</div>
<c:url value="/user/add-good" var="url" />
<mvc:form method="post" action="${ url }" modelAttribute="good">

	<div class="mb-3">
		<label>Mã</label>
		<div class="input-group">
			<mvc:input type="text" cssClass="form-control" path="id" placeholder="id" />
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
		<label>Số lượng</label>
		<div class="input-group">
			<mvc:input type="text" cssClass="form-control" path="quantity"
				placeholder="quantity" />
			<mvc:errors path="quantity" cssClass="text-danger" />
		</div>
	</div>

	<div class="mb-3">
		<label>Giá</label>
		<div class="input-group">
			<mvc:input type="text" cssClass="form-control" path="price"
				placeholder="price" />
			<mvc:errors path="price" cssClass="text-danger" />
		</div>
	</div>
		<button class="btn btn-success" type="submit">Thêm sản phẩm</button>

</mvc:form>