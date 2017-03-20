package org.apache.jsp.WEB_002dINF.jsp.resource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class resourceInit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/resource/../common/head.jsp");
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
      out.write("<!-- easyUI样式 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/jquery-easyui-1.5.1/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/jquery-easyui-1.5.1/icon.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("<!-- jquery js文件 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/commonjs/jquery-1.9.1.js\"></script>\r\n");
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
      out.write("<!-- easyUI的js -->\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("/aframe/jquery-easyui-1.5.1/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//初始化\r\n");
      out.write("\t$(function(){ \r\n");
      out.write("        getResource();\r\n");
      out.write("\t}) ;\r\n");
      out.write("      \r\n");
      out.write("  function getResource(){\r\n");
      out.write("  \t\t\t\t$(\"#cdxc\").treegrid({\r\n");
      out.write("\t\t\t\ttitle : '系统菜单',\r\n");
      out.write("\t\t\t\turl : '");
      out.print(basePath);
      out.write("'+'/bsResource/getAllMenu?status=0',\r\n");
      out.write("\t\t\t\tmethod:'post',          //请求方式\r\n");
      out.write("\t\t        idField:'id',           //定义标识树节点的键名字段\r\n");
      out.write("\t\t        treeField:'menuname',       //定义树节点的字段\r\n");
      out.write("\t\t        fit:true,               //网格自动撑满\r\n");
      out.write("\t\t        fitColumns:true,  \r\n");
      out.write("\t\t\t\tcolumns : [[\r\n");
      out.write("\t\t\t\t\t{field:'id',title: '菜单编号',align: 'left' ,width:80}, \r\n");
      out.write("\t\t\t\t\t{field:'parentid',title:'所属父级',width:100},\r\n");
      out.write("\t                {field:'menuname',title: '菜单名称',align: 'left',width:120},\r\n");
      out.write("\t                {field:'menucode',title: '菜单代码',align: 'left',width:120},\r\n");
      out.write("\t                {field:'menuUrl',title: '访问路径',align: 'left',width:200},                                                                  \r\n");
      out.write("\t                {field:'leafNode',title: '是否叶子节点',align: 'center',width:80},                                                                  \r\n");
      out.write("\t                {field:'status',title: '记录状态',align: 'center',width:80}   \r\n");
      out.write("\t\t\t\t]],\r\n");
      out.write("\t\t\t\t   ");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("  }\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t<div id=\"toolbar1\" data-options=\"region:'north'\" title=\"查询条件\"\r\n");
      out.write("\t\t\tstyle=\"height: 56px\">\r\n");
      out.write("\t\t\t<form id=\"searchForm\" >\r\n");
      out.write("\t\t\t\t<table style=\"font-size: 10px;\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><div class=\"datatt-btn-separator\"></div></td>\r\n");
      out.write("\t\t\t\t\t\t<td>菜单名称：&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"menuName\" id=\"menuName\" style=\"width: 80px;\" />&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td>上级菜单名称：&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"pMenuName\" id=\"pMenuName\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80px;\" />&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select name=\"status\" id=\"status\" style=\"width: 80px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"0\">正 常</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">停 用</option>\r\n");
      out.write("\t\t\t\t\t\t</select>&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"queryFun()\">查询</a> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"addMenu()\">新建菜单</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"delMenu()\">停用菜单</a> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t    <a href=\"javascript:void(0)\" id=\"edit\" class=\"easyui-linkbutton\" onclick=\"editMenu()\">修改</a>\r\n");
      out.write("\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div region=\"center\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t<table id=\"cdxc\" data-options=\"fit:true,border:false\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 70%;\">\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
