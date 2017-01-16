<%@ page language="java" import="java.util.*,java.text.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>AdminLTE 2 | Starter</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<%@ include file="../common/head.jsp"%>
<style type="text/css">
.content-header .breadcrumb {
	top: 0px;
	left: 0px;
	right: 0px;
	background-color: #fbfbfb;
	padding: 5px;
	height: 28px;
	border-bottom: 1px #e3e8ec solid;
}

#title_dh {
	font-size: 12px;
}
</style>
<script type="text/javascript">
	$(function(){
		getLeftMenu();
		/* var item = {'id':'-1','name':'首页','url':'welcome.jsp','closable':false};
		closableTab.addTab(item); */
	})

    function getLeftMenu(){
    	$.ajax({  
		     url:'<%=basePath%>/bsResource/getLeftMenu',
		     type:'get',  
		     cache:false,  
		     dataType:'json',  
		     success:function(data) {
		    		renderMenu(data);
		     },  
		     error : function() {  
		    	 console.log('getLeftMenu() error...');
		     }  
		 });
      }
	//生成菜单树
	function renderMenu(data) {
		$.each(data, function(index, val) {
			var thli = $('<li class="treeview"><a onclick="LoadAjaxContent(\''+data[index].id+'\',\''+data[index].menuname+'\',\''+data[index].menuurl+'\',\''+data[index].isleafnode+'\')"><i class="fa fa-dashboard"></i><span>'+data[index].menuname+'</span><i class="fa fa-angle-left pull-right"></i></a></li>');
			if(data[index].childList.length  > 0){
				var ej = '<ul class="treeview-menu">  </ul>';	
				var thej  = $(ej).appendTo(thli);
				var chs  = data[index].childList;
				$.each(chs, function(index2, val) {
	  				var sj = $('<li><a onclick="LoadAjaxContent(\''+chs[index2].id+'\',\''+chs[index2].menuname+'\',\''+chs[index2].menuurl+'\',\''+chs[index2].isleafnode+'\')" ><i class="fa fa-circle-o"></i>'+chs[index2].menuname+'</a></li>').appendTo(thej);
				});
			}
			$(thli).appendTo('#leftMenu');
		});
	}

	 function LoadAjaxContent(id,menuname,url,isleafnode){
		 	if(isleafnode==1){//根节点
		 		/* var item = {'id':id,'name':menuname,'url':url,'closable':true};
				closableTab.addTab(item); */
		 		window.location = "<%=basePath%>/"+url;
		 	}   
		 	//$("#contentDiv").html(menuname);
			
	}

</script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="leftMenu" />
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<ol class="breadcrumb">
					<li id="title_dh"></li>
				</ol>
			</section>
			<!-- Main content -->
			<section class="content">
				<tiles:insertAttribute name="rightContent" />
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		<tiles:insertAttribute name="footer" />
		<!-- Add the sidebar's background. This div must be placed immediately after the control sidebar -->
		<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->
</body>
</html>
