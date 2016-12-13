<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE html>
<html lang="zh-CN">  
  <head>  
    <title>显示用户</title>  
    <link href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap-paginator.min.js"></script>
  </head>   
  <body>  
    <div class="row">
	  <div class="span4">${user.userName} </div>
	  <div class="span8">${user.age} </div>
	</div>
  </body>  
</html>