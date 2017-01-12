<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="head.jsp"%>
<div class="error-page">
	<h2 class="headline text-red">500</h2>
	<div class="error-content">
		<h3>
			<i class="fa fa-warning text-red"></i> 哎呦喂! 出问题了.
		</h3>
		<p>
			我们会尽快修复该问题，请使用其他功能！
		</p>
		<form class="search-form">
			<div class="input-group">
				<input type="text" name="search" class="form-control"
					placeholder="Search">
				<div class="input-group-btn">
				</div>
			</div>
			<!-- /.input-group -->
		</form>
	</div>
</div>