<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
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
<!-- iCheck -->
<link rel="stylesheet" href="<%=basePath%>/aframe/iCheck/flat/blue.css">
<!-- Morris chart -->
<link rel="stylesheet" href="<%=basePath%>/aframe/morris/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="<%=basePath%>/aframe/jvectormap/jquery-jvectormap-1.2.2.css">
<!-- Date Picker -->
<link rel="stylesheet" href="<%=basePath%>/aframe/datepicker/datepicker3.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="<%=basePath%>/aframe/daterangepicker/daterangepicker-bs3.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="<%=basePath%>/aframe/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">


<!-- jquery js文件 -->
<script type="text/javascript" src="<%=basePath%>/commonjs/jQuery-2.2.0.min.js"></script>
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

<!-- 需要的 JS SCRIPTS脚本 -->
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="<%=basePath%>/aframe/adminlte/js/pages/dashboard2.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=basePath%>/aframe/adminlte/js/demo.js"></script>
<!-- FastClick -->
<script src="<%=basePath%>/aframe/fastclick/fastclick.js"></script>
<!-- Sparkline -->
<script src="<%=basePath%>/aframe/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="<%=basePath%>/aframe/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="<%=basePath%>/aframe/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- SlimScroll 1.3.0 -->
<script src="<%=basePath%>/aframe/slimScroll/jquery.slimscroll.min.js"></script>
<!-- ChartJS 1.0.1 -->
<script src="<%=basePath%>/aframe/chartjs/Chart.min.js"></script>

