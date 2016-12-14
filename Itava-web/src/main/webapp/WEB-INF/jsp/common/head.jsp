<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
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

<!-- REQUIRED JS SCRIPTS -->
<!-- jquery js文件 -->
<script type="text/javascript" src="<%=basePath%>/commonjs/jQuery-2.2.0.min.js"></script>
<!-- bootstrap的js文件、bootstrap table -->
<script src="<%=basePath%>/aframe/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=basePath%>/aframe/adminlte/js/app.min.js"></script>

