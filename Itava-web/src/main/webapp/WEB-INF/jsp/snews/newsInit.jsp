<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="../common/head.jsp"%>
<form class="form-horizontal">
	<div class="box">
		<div class="box-header with-border">
			<h3 class="box-title">新闻管理</h3>
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
				<label for="新闻标题" class="col-sm-2 control-label">新闻标题：</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="newsTitle"
						placeholder="标题名称">
				</div>
				<label for="栏目名称" class="col-sm-2 control-label">栏目名称：</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="newsCategory"
						placeholder="栏目名称">
				</div>
				<div class="col-sm-2">
					<button type="button" class="btn btn-info pull-right" style="margin-left: 3px;"  id="add">新增</button>
					<button type="button" class="btn btn-info pull-right"  id="search">查询</button>
				</div>
			</div>
		</div>
		<!-- /.box-body -->
	</div>
</form>
<div class="box-body" id="newsDiv">
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
	var addNewsDialog = null;
	function add(){
		addNewsDialog=new PWindow({
			id:'addNewsIFrame',
		    title: "新增新闻",
		    height:500,
	        url:"./newsAdd"
		  });
	}
	
	function search(){
		$('#querylist').bootstrapTable('destroy').bootstrapTable({
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
           url: "./selectNewsPage",
           //默认值为 'limit',传给服务端的参数为：limit, offset, search, sort, order Else
           //queryParamsType:'',   
           ////查询参数,每次调用是会带上这个参数，可自定义      
           queryParamsType:'limit',
           queryParams : function(params) {
               var newsTitle = $('#newsTitle').val();
               var newsCategory = $("#newsCategory").val();
               return {
                     pageNumber: params.pageNumber,
                     pageSize: params.limit,
                     newsTitle:newsTitle,
                     newsCategory:newsCategory
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
               field: 'newstitle',
               title: '新闻标题',
               align: 'center'
           }, {
               field: 'newscategory',
               title: '新闻栏目',
               align: 'center'
           }, {
               field: 'createrName',
               title: '创建人',
               align: 'center'
           }, {
               field: 'created',
               title: '创建时间',
               align: 'center'
           }, {
               field: 'readcount',
               title: '阅读量',
               align: 'center'
           }, {
               field: 'newsurl',
               title: '访问url',
               align: 'center'
           },{
        	   field:'status',
        	   title:'状态',
        	   align:'center',
        	   formatter:function(value,row,index){
        		   var a;
        		   if(value == 1){
        			   a = '有效';
        		   }else{
        			   a = '无效';
        		   }
        		   return a;
        	   }
           },{
               field: 'id',
               title: '操作',
               align: 'center',
               formatter:function(value,row,index){
                   //通过formatter可以自定义列显示的内容
                   //value：当前field的值，即id
                   //row：当前行的数据
                   var a = '<a onclick="updateNews('+value+')" >修改</a>&nbsp;&nbsp;<a onclick="deleteNews('+value+')" >删除</a>';
                   return a;
               } 
           }],
           pagination:true
       });
	}
	
	//删除新闻
	function deleteNews(id){
		$.ajax({
			type:"post",
			url:'<%=basePath%>'+"/snews/newsDel",
			data:{
				id:id
			},
			success:function(msg){
				alertMsg("删除成功！");
				search();
			},
			error:function(msg){
				alertMsg("删除失败！");
			}
		});
	}
	
	//更新新闻
	var updateNewsDialog;
	function updateNews(id){
		updateNewsDialog=new PWindow({
			id:'updateNewsIFrame',
		    title: "修改新闻",
		    height:500,
	        url:"./newsAdd?id="+id
		  });
	}
</script>