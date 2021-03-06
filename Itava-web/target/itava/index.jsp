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
			if(data[index].children.length  > 0){
				var ej = '<ul class="treeview-menu">  </ul>';	
				var thej  = $(ej).appendTo(thli);
				var chs  = data[index].children;
				$.each(chs, function(index2, val) {
	  				var sj = $('<li><a onclick="LoadAjaxContent(\''+chs[index2].id+'\',\''+chs[index2].menuname+'\',\''+chs[index2].menuurl+'\',\''+chs[index2].isleafnode+'\')" ><i class="fa fa-circle-o"></i>'+chs[index2].menuname+'</a></li>').appendTo(thej);
				});
			}
			$(thli).appendTo('#leftMenu');
		});
	}

	 function LoadAjaxContent(id,menuname,url,isleafnode){
		 	 /* if(isleafnode==1){//根节点
		 		var item = {'id':id,'name':menuname,'url':url,'closable':true};
				closableTab.addTab(item);
		 	} */  
		 	$("#contentDiv").html(menuname);
			
	}

</script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>Itava</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Itava-Main</b></span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- search form (Optional) -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->

      <!-- Sidebar Menu 左侧菜单目录 -->
      <ul class="sidebar-menu" id="leftMenu">
        <!-- Optionally, you can add icons to the links -->
     
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <ol class="breadcrumb" >
        <li id="title_dh">
        
        </li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
		<div class="row" style="margin-left: 3px;" id="contentDiv">
		  <!-- 此处是相关代码 -->
		  <ul class="nav nav-tabs" role="tablist" id="tabUl">
		  </ul>
		  <div class="tab-content" style="width:99%;">
		  </div>
		  <!-- 相关代码结束 -->
		</div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right hidden-xs">
      Just do it
    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2016<a href="#">TonyJ</a>.</strong> All rights reserved.
  </footer>

  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->
</body>
</html>
