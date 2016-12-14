<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- Tell the browser to be responsive to screen width -->
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<!-- bootstrap css样式 -->
<link href="<%=basePath%>/aframe/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/aframe/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- bootstrap table css样式 -->
<link href="<%=basePath%>/aframe/bootstrap-table/bootstrap-table.css" rel="stylesheet"/>
<!-- bootstrap 日期选择器 css样式 -->
<link href="<%=basePath%>/aframe/bootstrap-datepicker/datepicker.css" rel="stylesheet"/>
<!-- bootstrap 弹出框 css样式 -->
<link href="<%=basePath%>/aframe/bootstrap-dialog/bootstrap-dialog.min.css" rel="stylesheet"/>
<!-- bootstrap table 可冻结列 css样式 -->
<link href="<%=basePath%>/aframe/bootstrap-table/bootstrap-table-fixed-columns.css" rel="stylesheet"/>
<!-- Font Awesome 图标样式和图片 -->
<link href="<%=basePath%>/aframe/font-awesome/css/font-awesome.min.css" rel="stylesheet" >
<!-- Theme style adminLTE的样式-->
<link href="<%=basePath%>/aframe/adminlte/css/AdminLTE.min.css" rel="stylesheet" >
<!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
<link href="<%=basePath%>/aframe/adminlte/css/skins/_all-skins.min.css" rel="stylesheet" >

<!-- jquery js文件 -->
<script type="text/javascript" src="<%=basePath%>/commonjs/jquery-1.9.1.js"></script>
<!-- bootstrap的js文件、bootstrap table -->
<script src="<%=basePath%>/aframe/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=basePath%>/aframe/bootstrap-table/bootstrap-table.js"></script>
<script src="<%=basePath%>/aframe/bootstrap-table/bootstrap-table-zh-CN.js"></script>
<script src="<%=basePath%>/aframe/bootstrap-table/bootstrap-fixed-column.js"></script>
<!-- AdminLTE App -->
<script src="<%=basePath%>/aframe/adminlte/js/app.min.js"></script>
<!-- DataTables -->
<script src="<%=basePath%>/aframe/datatables/jquery.dataTables.min.js"></script>
<script src="<%=basePath%>/aframe/datatables/dataTables.bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=basePath%>/aframe/adminlte/js/app.min.js"></script>
<!-- bootstrap分页js文件
<script src="<%=basePath%>/commonjs/bootstrap-paginator.min.js"></script> -->
