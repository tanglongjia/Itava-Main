<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true"%>
<%
	response.setStatus(200);
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
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
<!-- 表单校验的bootstrap validator -->
<link rel="stylesheet" href="<%=basePath %>/aframe/formValidation/formValidation.css">
<!-- easyUI样式 -->
<link rel="stylesheet" href="<%=basePath %>/aframe/jquery-easyui-1.5.1/easyui.css">
<link rel="stylesheet" href="<%=basePath %>/aframe/jquery-easyui-1.5.1/icon.css">

<!-- REQUIRED JS SCRIPTS -->
<!-- jquery js文件 -->
<script type="text/javascript" src="<%=basePath%>/commonjs/jquery-1.9.1.js"></script>
<!-- bootstrap的js文件、bootstrap table -->
<script src="<%=basePath%>/aframe/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=basePath%>/aframe/adminlte/js/app.js"></script>
<!-- bootstrap table的js -->
<script src="<%=basePath%>/aframe/bootstrap-table/bootstrap-table.js"></script>
<script src="<%=basePath%>/aframe/bootstrap-table/bootstrap-table-zh-CN.js"></script>
<!-- DataTable的js文件 -->
<script src="<%=basePath%>/aframe/datatables/jquery.dataTables.js"></script>
<script src="<%=basePath%>/aframe/datatables/dataTables.bootstrap.min.js"></script>
<!-- 固定菜单的滚动效果-->
<script src="<%=basePath%>/aframe/slimScroll/jquery.slimscroll.min.js"></script> 
<!-- 分页插件 -->
<script src="<%=basePath%>/aframe/bootstrap-paginator/bootstrap-paginator.min.js"></script>
<!-- 标签页插件 -->
<script type="text/javascript" src="<%=basePath%>/commonjs/closable-tab-div.js"></script>
<!-- 自定义通用js方法 -->
<script type="text/javascript" src="<%=basePath%>/commonjs/self_define.js"></script>
<!-- 引入echart3的图表js文件 -->
<script src="<%=basePath%>/aframe/echarts3/echarts.min.js"></script>
<script src="<%=basePath%>/aframe/echarts3/option_public.js"></script>
<!-- bootstrap dialog的js-->
<script src="<%=basePath%>/aframe/bootstrap-dialog/bootstrap-dialog.min.js"></script>
<!-- 表单校验的js formValidator.js -->
<script src="<%=basePath %>/aframe/formValidation/formValidation.js"></script>
<script src="<%=basePath %>/aframe/formValidation/formValidation_extra.js"></script>
<!-- easyUI的js -->
<script src="<%=basePath %>/aframe/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
