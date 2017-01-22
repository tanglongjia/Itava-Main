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
					<button type="button" class="btn btn-info pull-right" style="margin-left: 3px;" id="search">查询</button>
					<button type="button" class="btn btn-info pull-right"  id="add">新增</button>
				</div>
			</div>
		</div>
		<!-- /.box-body -->
	</div>
</form>
<div class="box-body" id="userDiv">
	<table id="querylist" class="table table-striped"></table> 
</div>
<script type="text/javascript">
	$(function(){
		search();
		//绑定查询条件事件
		$("#search").on("click",function(){
			search();
		});
		$("#add").on("click",function(){
			add();
		});
	})
	
	//弹出新增页面
	var addUserDialog = null;
	function add(){
		addUserDialog = BootstrapDialog.show({
			title:'新增用户',
			size: BootstrapDialog.SIZE_WIDE,
			message: $('<div></div>').load('./userAdd')
		});
	}
	
	function search(){
		/* $.ajax({
			mimeType: 'text/html; charset=utf-8',
			url: './selectUserPage',
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
		}); */
		
		$('#querylist').bootstrapTable({
            //请求方法
           method: 'get',
            //是否显示行间隔色
           striped: true,
           height:490,
           //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）     
           cache: false,    
           //是否显示分页（*）  
           pagination: true,   
            //是否启用排序  
           sortable: false,    
            //排序方式 
           sortOrder: "asc",    
           //初始化加载第一页，默认第一页
           //我设置了这一项，但是貌似没起作用，而且我这默认是0,- -
           //pageNumber:1,   
           //每页的记录行数（*）   
           pageSize: 10,  
           //可供选择的每页的行数（*）    
           pageList: [5,10, 25, 50, 100],
           //这个接口需要处理bootstrap table传递的固定参数,并返回特定格式的json数据  
           url: "./selectUserPage",
           //默认值为 'limit',传给服务端的参数为：limit, offset, search, sort, order Else
           //queryParamsType:'',   
           ////查询参数,每次调用是会带上这个参数，可自定义      
           queryParamsType:'limit',
          queryParams : function(params) {
               var truename = $('#truename').val();
               var telephone = $("#telephone").val();
               return {
                     pageNumber: params.pageNumber,
                     pageSize: params.limit,
                     telephone:telephone,
                     truename:truename
                   };
           },
           //分页方式：client客户端分页，server服务端分页（*）
           sidePagination: "server",
           //是否显示搜索
           search: false,  
           //Enable the strict search.    
           strictSearch: true,
           //Indicate which field is an identity field.
           idField : "id",
           columns: [{
               field: 'id',
               title: 'id',
               align: 'center'
           }, {
               field: 'truename',
               title: '真实姓名',
               align: 'center'
           }, {
               field: 'age',
               title: '年龄',
               align: 'center'
           }, {
               field: 'telephone',
               title: '手机号',
               align: 'center'
           },{
               field: 'id',
               title: '操作',
               align: 'center',
               formatter:function(value,row,index){
                   //通过formatter可以自定义列显示的内容
                   //value：当前field的值，即id
                   //row：当前行的数据
                   var a = '<a href="" >测试</a>';
                   return a;
               } 
           }],
           pagination:true
       });
	}
</script>