<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="../common/head.jsp"%>
<form class="form-horizontal">
	<div class="box">
		<div class="box-header with-border">
			<h3 class="box-title">用户管理</h3>
			<div class="box-tools pull-right">
				<button type="button" class="btn btn-box-tool"
					data-widget="collapse" data-toggle="tooltip" title="Collapse">
					<i class="fa fa-minus"></i>
				</button>
				<button type="button" class="btn btn-box-tool" data-widget="remove"
					data-toggle="tooltip" title="Remove">
					<i class="fa fa-times"></i>
				</button>
			</div>
		</div>
		<div class="box-body">
			<div class="form-group">
				<label for="用户名" class="col-sm-1 control-label">用户名：</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="truename"
						placeholder="用户名">
				</div>
				<label for="手机号" class="col-sm-1 control-label">手机号：</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="telephone"
						placeholder="手机号">
				</div>
				<div class="col-sm-4">
					<button type="button" class="btn btn-info pull-right" id="search">查询</button>
				</div>
			</div>
		</div>
		<!-- /.box-body -->
	</div>
</form>
<!-- /.box -->
<div class="box">
	<div class="box-body" id="userDiv">
	
	</div>
</div>
<script type="text/javascript">
	$(function(){
		search();
		//绑定查询条件事件
		$("#search").on("click",function(){
			search();
		});
	})
	
	function search(){
		$.ajax({
			mimeType: 'text/html; charset=utf-8',
			url: './bsUser/selectUserPage',
			type: 'GET',
			data : {
				truename  : $("#truename").val(),
				telephone : $("#telephone").val()
			},
			success: function(data) {
				$('#userDiv').html(data);
			},
			error: function (jqXHR, textStatus, errorThrown) {
				alert(errorThrown);
			},
			dataType: "html"
		});
		
	}
</script>