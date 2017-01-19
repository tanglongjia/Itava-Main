package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userInit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/user/../common/head.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	response.setStatus(200);
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write("\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!-- Font Awesome 图标样式和图片 -->\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("/aframe/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" >\r\n");
      out.write("<!-- Theme style -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/adminlte/css/AdminLTE.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/adminlte/css/skins/skin-blue.min.css\">\r\n");
      out.write("<!-- bootstrap table的样式 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/bootstrap-table/bootstrap-table.css\">\r\n");
      out.write("<!-- DataTables的样式 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("<!-- bootstrap dialog的样式 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/bootstrap-dialog/bootstrap-dialog.min.css\">\r\n");
      out.write("<!-- 表单校验的bootstrap validator -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/formValidation/formValidation.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("<!-- jquery js文件 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/commonjs/jQuery-2.2.0.min.js\"></script>\r\n");
      out.write("<!-- bootstrap的js文件、bootstrap table -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/adminlte/js/app.js\"></script>\r\n");
      out.write("<!-- bootstrap table的js -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/bootstrap-table/bootstrap-table.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/bootstrap-table/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("<!-- DataTable的js文件 -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/datatables/jquery.dataTables.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<!-- 固定菜单的滚动效果-->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/slimScroll/jquery.slimscroll.min.js\"></script> \r\n");
      out.write("<!-- 分页插件 -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/bootstrap-paginator/bootstrap-paginator.min.js\"></script>\r\n");
      out.write("<!-- 标签页插件 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/commonjs/closable-tab-div.js\"></script>\r\n");
      out.write("<!-- 自定义通用js方法 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/commonjs/self_define.js\"></script>\r\n");
      out.write("<!-- 引入echart3的图表js文件 -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/echarts3/echarts.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/echarts3/option_public.js\"></script>\r\n");
      out.write("<!-- bootstrap dialog的js-->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/aframe/bootstrap-dialog/bootstrap-dialog.min.js\"></script>\r\n");
      out.write("<!-- 表单校验的js formValidator.js -->\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("/aframe/formValidation/formValidation.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("/aframe/formValidation/formValidation_extra.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<form class=\"form-horizontal\">\r\n");
      out.write("\t<div class=\"box\">\r\n");
      out.write("\t\t<div class=\"box-header with-border\">\r\n");
      out.write("\t\t\t<h3 class=\"box-title\">用户管理</h3>\r\n");
      out.write("\t\t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-box-tool\"\r\n");
      out.write("\t\t\t\t\tdata-widget=\"collapse\" data-toggle=\"tooltip\" title=\"Collapse\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-minus\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"remove\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"tooltip\" title=\"Remove\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-times\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"box-body\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"用户名\" class=\"col-sm-1 control-label\">用户名：</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"truename\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"用户名\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<label for=\"手机号\" class=\"col-sm-1 control-label\">手机号：</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"telephone\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"手机号\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-info pull-right\" style=\"margin-left: 3px;\" id=\"search\">查询</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-info pull-right\"  id=\"add\">新增</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.box-body -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"box-body\" id=\"userDiv\">\r\n");
      out.write("\t<table id=\"querylist\" class=\"table table-striped\"></table> \r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tsearch();\r\n");
      out.write("\t\t//绑定查询条件事件\r\n");
      out.write("\t\t$(\"#search\").on(\"click\",function(){\r\n");
      out.write("\t\t\tsearch();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#add\").on(\"click\",function(){\r\n");
      out.write("\t\t\tadd();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t//弹出新增页面\r\n");
      out.write("\tvar addUserDialog = null;\r\n");
      out.write("\tfunction add(){\r\n");
      out.write("\t\taddUserDialog = BootstrapDialog.show({\r\n");
      out.write("\t\t\ttitle:'新增用户',\r\n");
      out.write("\t\t\tsize: BootstrapDialog.SIZE_WIDE,\r\n");
      out.write("\t\t\tmessage: $('<div></div>').load('./userAdd')\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction search(){\r\n");
      out.write("\t\t/* $.ajax({\r\n");
      out.write("\t\t\tmimeType: 'text/html; charset=utf-8',\r\n");
      out.write("\t\t\turl: './selectUserPage',\r\n");
      out.write("\t\t\ttype: 'GET',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\ttruename  : $(\"#truename\").val(),\r\n");
      out.write("\t\t\t\ttelephone : $(\"#telephone\").val()\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t$('#userDiv').html(data);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function (jqXHR, textStatus, errorThrown) {\r\n");
      out.write("\t\t\t\talert(errorThrown);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType: \"html\"\r\n");
      out.write("\t\t}); */\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#querylist').bootstrapTable({\r\n");
      out.write("            //请求方法\r\n");
      out.write("           method: 'get',\r\n");
      out.write("            //是否显示行间隔色\r\n");
      out.write("           striped: true,\r\n");
      out.write("           //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）     \r\n");
      out.write("           cache: false,    \r\n");
      out.write("           //是否显示分页（*）  \r\n");
      out.write("           pagination: true,   \r\n");
      out.write("            //是否启用排序  \r\n");
      out.write("           sortable: false,    \r\n");
      out.write("            //排序方式 \r\n");
      out.write("           sortOrder: \"asc\",    \r\n");
      out.write("           //初始化加载第一页，默认第一页\r\n");
      out.write("           //我设置了这一项，但是貌似没起作用，而且我这默认是0,- -\r\n");
      out.write("           //pageNumber:1,   \r\n");
      out.write("           //每页的记录行数（*）   \r\n");
      out.write("           pageSize: 10,  \r\n");
      out.write("           //可供选择的每页的行数（*）    \r\n");
      out.write("           pageList: [5,10, 25, 50, 100],\r\n");
      out.write("           //这个接口需要处理bootstrap table传递的固定参数,并返回特定格式的json数据  \r\n");
      out.write("           url: \"./selectUserPage\",\r\n");
      out.write("           //默认值为 'limit',传给服务端的参数为：limit, offset, search, sort, order Else\r\n");
      out.write("           //queryParamsType:'',   \r\n");
      out.write("           ////查询参数,每次调用是会带上这个参数，可自定义                         \r\n");
      out.write("          queryParams : function(params) {\r\n");
      out.write("               var truename = $('#truename').val();\r\n");
      out.write("               var telephone = $(\"#telephone\").val();\r\n");
      out.write("               return {\r\n");
      out.write("                     pageNumber: params.offset+1,\r\n");
      out.write("                     pageSize: params.limit,\r\n");
      out.write("                     telephone:telephone,\r\n");
      out.write("                     truename:truename\r\n");
      out.write("                   };\r\n");
      out.write("           },\r\n");
      out.write("           //分页方式：client客户端分页，server服务端分页（*）\r\n");
      out.write("           sidePagination: \"server\",\r\n");
      out.write("           //是否显示搜索\r\n");
      out.write("           search: false,  \r\n");
      out.write("           //Enable the strict search.    \r\n");
      out.write("           strictSearch: true,\r\n");
      out.write("           //Indicate which field is an identity field.\r\n");
      out.write("           idField : \"id\",\r\n");
      out.write("           columns: [{\r\n");
      out.write("               field: 'id',\r\n");
      out.write("               title: 'id',\r\n");
      out.write("               align: 'center'\r\n");
      out.write("           }, {\r\n");
      out.write("               field: 'truename',\r\n");
      out.write("               title: '真实姓名',\r\n");
      out.write("               align: 'center'\r\n");
      out.write("           }, {\r\n");
      out.write("               field: 'age',\r\n");
      out.write("               title: '年龄',\r\n");
      out.write("               align: 'center'\r\n");
      out.write("           }, {\r\n");
      out.write("               field: 'telephone',\r\n");
      out.write("               title: '手机号',\r\n");
      out.write("               align: 'center'\r\n");
      out.write("           },{\r\n");
      out.write("               field: 'id',\r\n");
      out.write("               title: '操作',\r\n");
      out.write("               align: 'center',\r\n");
      out.write("               formatter:function(value,row,index){\r\n");
      out.write("                   //通过formatter可以自定义列显示的内容\r\n");
      out.write("                   //value：当前field的值，即id\r\n");
      out.write("                   //row：当前行的数据\r\n");
      out.write("                   var a = '<a href=\"\" >测试</a>';\r\n");
      out.write("                   return a;\r\n");
      out.write("               } \r\n");
      out.write("           }],\r\n");
      out.write("           pagination:true\r\n");
      out.write("       });\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
