<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="head.jsp"%>
<div class="error-page">
	<h2 class="headline text-yellow">404</h2>
	<div class="error-content">
		<h3>
			<i class="fa fa-warning text-yellow"></i> 哎呦喂! 页面找不到了.
		</h3>
		<p>
			我们找不到你相要的页面，请查看其他页面！
		</p>
		<form class="search-form">
			<div class="input-group">
				<input type="text" name="search" class="form-control"
					placeholder="Search">
			</div>
			<!-- /.input-group -->
		</form>
	</div>
	<!-- /.error-content -->
</div>
<!-- /.error-page -->