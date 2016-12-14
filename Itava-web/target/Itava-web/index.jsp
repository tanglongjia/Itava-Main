<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>学习Bootstrap框架</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
   <%@ include file="WEB-INF/jsp/common/head.jsp"%>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>Itava</b>系统</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Itava-Main</b>系统</span>
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
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <ul class="dropdown-menu">
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                  <a href="login.html" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>
            </ul>
          </li>
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

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="<%=basePath %>/aframe/adminlte/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>TonyJ</p>
          <i class="fa fa-circle text-success"></i> 管理员
        </div>
      </div>

      <!-- search form (Optional) -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="搜索...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" id="leftMenu" style="font-size: 14px;">
        	
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content" id="ajax-content">


    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right hidden-xs">
		Just do it !
    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2016 <a href="http://tonyj.iteye.com/admin">TonyJ</a>.</strong> All rights reserved.
  </footer>
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<script type="text/javascript">
    var thdata = [];
    function getLeftMenu(){
    	$.ajax({  
		     url:'<%=basePath%>getLeftMenu',// 跳转到 contorller  
		     data:{},  
		     type:'get',  
		     cache:false,  
		     dataType:'json',  
		     success:function(data) {
		     	$("#leftMenu").html("");
				$.each(data, function(index, val) {
					var thli = $('<li class="treeview"><a href="javascript:void(0)"><i class="fa fa-dashboard"></i><span>'+data[index].menuName+'</span><i class="fa fa-angle-left pull-right"></i></a></li>');
					if(data[index].childList.length  > 0){
						var ej = '<ul class="treeview-menu">  </ul>';	
						var thej  = $(ej).appendTo(thli);
						var chs  = data[index].childList;
						$.each(chs, function(index2, val) {
			  				var sj = $('<li><a href="./bsUserIndex" class="ajax-link" ><i class="fa fa-circle-o"></i>'+chs[index2].menuName+'</a></li>').appendTo(thej);
			  				var child_data = {"menuName":chs[index2].menuName,"menuUrl":chs[index2].menuUrl,"menuCode":chs[index2].menuCode};
							thdata.push(child_data);
						});
					}
					$(thli).appendTo('#leftMenu');
				});

				$('#leftMenu').on('click', 'a', function (e) {
					if ($(this).hasClass('ajax-link')) {
						e.preventDefault();
						var url = $(this).attr('href');
						window.location.hash = url;
						//alert(url);
						LoadAjaxContent(url);
					}
				});

				//var ajax_url = location.hash.replace(/^#/, '');
				//LoadAjaxContent(ajax_url);
		      },  
		     error : function() {  
		      }  
		 });
      }
      
      
	 getLeftMenu();


	 function LoadAjaxContent(url){
			$.ajax({
				mimeType: 'text/html; charset=utf-8',
				url: url,
				type: 'GET',
				success: function(data) {
					$('#ajax-content').html(data);
				},
				error: function (jqXHR, textStatus, errorThrown) {
					alert(errorThrown);
				},
				dataType: "html",
				async: false
			});
	}

</script>
</body>
</html>
