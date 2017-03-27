<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	response.setStatus(200);
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!-- jquery js文件 -->
<script type="text/javascript" src="<%=basePath%>/commonjs/jquery-1.9.1.js"></script>
<!-- 使用ligerUI实现 -->
<link href="<%=basePath%>/aframe/ligerUI/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>  
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerDrag.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerForm.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerDateEditor.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerComboBox.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerButton.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerRadio.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerSpinner.js" type="text/javascript"></script>
<script src="<%=basePath%>/aframe/ligerUI/ligerUI/js/plugins/ligerTextBox.js" type="text/javascript"></script>
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="<%=basePath %>/aframe/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome 图标样式和图片 -->
<link href="<%=basePath%>/aframe/font-awesome/css/font-awesome.min.css" rel="stylesheet" >
<!-- Theme style -->
<link rel="stylesheet" href="<%=basePath %>/aframe/adminlte/css/AdminLTE.min.css">
<link rel="stylesheet" href="<%=basePath %>/aframe/adminlte/css/skins/skin-blue.min.css">
<!-- bootstrap table的样式 -->
<link rel="stylesheet" href="<%=basePath %>/aframe/bootstrap-table/bootstrap-table.css">
<!-- DataTables的样式 -->
<link rel="stylesheet" href="<%=basePath %>/aframe/datatables/dataTables.bootstrap.css">
<!-- bootstrap dialog的样式 -->
<link rel="stylesheet" href="<%=basePath %>/aframe/bootstrap-dialog/bootstrap-dialog.min.css">
<!-- bootstrap的js文件、bootstrap table -->
<script src="<%=basePath%>/aframe/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
<title></title>
<script type="text/javascript">
	//初始化
	var manager;
	$(function(){ 
        getResource();
        
	}) ;
  	function getResource(){
  			var menuname = $("#menuname").val();
 	        $.ajax({
 	        	url:'<%=basePath%>'+'/bsResource/getAllMenu?status=0&menuname='+menuname,
 	        	type:'post',
 	        	success:function(msg){
 	        		window['g']= manager = $("#maingrid").ligerGrid({
 	    	            columns: [
 	    		            { display: '菜单名称', name: 'menuname', width: '20%', align: 'left' },
 	    		            { display: '菜单编号', name: 'id', width: '20%', type: 'int', align: 'left' },
 	    		            { display: '是否子节点', name: 'leafNode', width: '20%', align: 'left' },
 	    		           { display: '菜单URL', name: 'menuUrl', width: '20%', align: 'left' },
 	    		           	{ display: '菜单等级', name: 'menulevel', width: '20%', align: 'center',
 	    		              render:function (record, rowindex, value, column) {
   		            			 //this     这里指向grid
   		            	         //record   行数据
   		            	         //rowindex 行索引
   		            	         //value    当前的值，对应record[column.name]
   		            	         //column   列信息
   		            	         return value+"级菜单";  //返回此单元格显示的HTML内容(一般根据value和row的内容进行组织)
 	    		            }},
 	    	            ], 
 	    	            width: '100%', 
 	    	            height: '97%',
 	    	            allowHideColumn: false, 
 	    	            rownumbers: true, 
 	    	            colDraggable: true, 
 	    	            rowDraggable: true,
 	    	            checkbox:true,
 	    	           	usePager: false,   
 	    	            alternatingRow: false, 
 	    	            data: eval('(' + msg + ')'),
 	    	            tree: { columnName: 'menuname' }
 	    	        }); 
 	        	}
 	        });
 	}
 
</script>
</head>
<body>
	<div class="box">
		<div class="box-header with-border">
			<h3 class="box-title">系统管理</h3>
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
				<label for=菜单名称" class="col-sm-2 control-label">菜单名称：</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="menuname"
						placeholder="菜单名称">
				</div>
				<div class="col-sm-6">
					<button type="button" class="btn btn-info pull-right" onclick="add()" style="margin-left: 3px;" id="search">新增</button>
					<button type="button" class="btn btn-info pull-right" onclick="update()" style="margin-left: 3px;" id="update">修改</button>
					<button type="button" class="btn btn-info pull-right" onclick="stop()"  style="margin-left: 3px;" id="stop">停用</button>
					<button type="button" class="btn btn-info pull-right" onclick="getResource()" id="search">查询</button>
				</div>
			</div>
		</div>
		<!-- /.box-body -->
	</div>
	<div id="maingrid">
	
	</div>
</body>
</html>