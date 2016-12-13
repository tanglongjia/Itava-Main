<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE html>
<html lang="zh-CN">  
  <head>  
    <title>显示用户</title>  
    <%@ include file="./common/head.jsp" %>
  </head>   
  <body>  
    <div class="row">
	  <div class="span4">${user.userName} </div>
	  <div class="span8">${user.age} </div>
	</div>
  </body>  
</html>