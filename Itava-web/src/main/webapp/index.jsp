<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Starter</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <%@ include file="WEB-INF/jsp/common/head.jsp"%>
</head>
<body>
	<%
	request.getRequestDispatcher("/WEB-INF/jsp/main_jsp/main.jsp").forward(request,response);
	%>
</body>
</html>
