<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../common/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<script type="text/javascript">
	//初始化
	$(function(){ 
        getResource();
	}) ;
      
  function getResource(){
  				$("#cdxc").treegrid({
				title : '系统菜单',
				url : '<%=basePath%>'+'/bsResource/getAllMenu?status=0',
				method:'post',          //请求方式
		        idField:'id',           //定义标识树节点的键名字段
		        treeField:'menuname',       //定义树节点的字段
		        fit:true,               //网格自动撑满
		        fitColumns:true,  
				columns : [[
					{field:'id',title: '菜单编号',align: 'left' ,width:80}, 
					{field:'parentid',title:'所属父级',width:100},
	                {field:'menuname',title: '菜单名称',align: 'left',width:120},
	                {field:'menucode',title: '菜单代码',align: 'left',width:120},
	                {field:'menuUrl',title: '访问路径',align: 'left',width:200},                                                                  
	                {field:'leafNode',title: '是否叶子节点',align: 'center',width:80},                                                                  
	                {field:'status',title: '记录状态',align: 'center',width:80}   
				]],
				   <%-- onBeforeLoad:function(row,param){
				    // 此处就是异步加载地所在
				    if (row){
				   		 $(this).treegrid('options').url = '<%=basePath%>'+'/bsResource/getMenuByPMenuCode?pMenuCode='+row.id+'&status=1';
				    } else {
				    }
				   },
		        onLoadSuccess : function(data) {
		         	parent.$.messager.progress('close');
		         } --%>
			});
  }
 
</script>
</head>
<body>
	<div class="easyui-layout" data-options="fit:true">
		<div id="toolbar1" data-options="region:'north'" title="查询条件"
			style="height: 56px">
			<form id="searchForm" >
				<table style="font-size: 10px;">
					<tr>
						<td><div class="datatt-btn-separator"></div></td>
						<td>菜单名称：&nbsp;&nbsp;</td>
						<td><input name="menuName" id="menuName" style="width: 80px;" />&nbsp;&nbsp;</td>
						<td>上级菜单名称：&nbsp;&nbsp;</td>
						<td><input name="pMenuName" id="pMenuName"
							style="width: 80px;" />&nbsp;&nbsp;</td>
						<td><select name="status" id="status" style="width: 80px;">
								<option value="0">正 常</option>
								<option value="1">停 用</option>
						</select>&nbsp;&nbsp;</td>
						<td>
						<a href="javascript:void(0)" class="easyui-linkbutton" onclick="queryFun()">查询</a> &nbsp;&nbsp;
						<a href="javascript:void(0)" class="easyui-linkbutton" onclick="addMenu()">新建菜单</a>&nbsp;&nbsp;
					    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="delMenu()">停用菜单</a> &nbsp;&nbsp;
					    <a href="javascript:void(0)" id="edit" class="easyui-linkbutton" onclick="editMenu()">修改</a>
					   </td>
					</tr>
				</table>
			</form>
		</div>
		<div region="center" data-options="fit:true">
			<table id="cdxc" data-options="fit:true,border:false"
				style="width: 70%;">
			</table>
		</div>
	</div>
</body>
</html>