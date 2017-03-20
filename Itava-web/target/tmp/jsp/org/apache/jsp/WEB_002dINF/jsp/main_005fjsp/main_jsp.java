package org.apache.jsp.WEB_002dINF.jsp.main_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/main_jsp/../common/head.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>AdminLTE 2 | Starter</title>\r\n");
      out.write("<!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\"\r\n");
      out.write("\tname=\"viewport\">\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write(".content-header .breadcrumb {\r\n");
      out.write("\ttop: 0px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("\tright: 0px;\r\n");
      out.write("\tbackground-color: #fbfbfb;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\theight: 28px;\r\n");
      out.write("\tborder-bottom: 1px #e3e8ec solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#title_dh {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tgetLeftMenu();\r\n");
      out.write("\t\t/* var item = {'id':'-1','name':'首页','url':'welcome.jsp','closable':false};\r\n");
      out.write("\t\tclosableTab.addTab(item); */\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("    function getLeftMenu(){\r\n");
      out.write("    \t$.ajax({  \r\n");
      out.write("\t\t     url:'");
      out.print(basePath);
      out.write("/bsResource/getLeftMenu',\r\n");
      out.write("\t\t     type:'get',  \r\n");
      out.write("\t\t     cache:false,  \r\n");
      out.write("\t\t     dataType:'json',  \r\n");
      out.write("\t\t     success:function(data) {\r\n");
      out.write("\t\t    \t\trenderMenu(data);\r\n");
      out.write("\t\t     },  \r\n");
      out.write("\t\t     error : function() {  \r\n");
      out.write("\t\t    \t console.log('getLeftMenu() error...');\r\n");
      out.write("\t\t     }  \r\n");
      out.write("\t\t });\r\n");
      out.write("      }\r\n");
      out.write("\t//生成菜单树\r\n");
      out.write("\tfunction renderMenu(data) {\r\n");
      out.write("\t\t$.each(data, function(index, val) {\r\n");
      out.write("\t\t\tvar thli = $('<li class=\"treeview\"><a onclick=\"LoadAjaxContent(\\''+data[index].id+'\\',\\''+data[index].menuname+'\\',\\''+data[index].menuurl+'\\',\\''+data[index].isleafnode+'\\')\"><i class=\"fa fa-dashboard\"></i><span>'+data[index].menuname+'</span><i class=\"fa fa-angle-left pull-right\"></i></a></li>');\r\n");
      out.write("\t\t\tif(data[index].childList.length  > 0){\r\n");
      out.write("\t\t\t\tvar ej = '<ul class=\"treeview-menu\">  </ul>';\t\r\n");
      out.write("\t\t\t\tvar thej  = $(ej).appendTo(thli);\r\n");
      out.write("\t\t\t\tvar chs  = data[index].childList;\r\n");
      out.write("\t\t\t\t$.each(chs, function(index2, val) {\r\n");
      out.write("\t  \t\t\t\tvar sj = $('<li><a onclick=\"LoadAjaxContent(\\''+chs[index2].id+'\\',\\''+chs[index2].menuname+'\\',\\''+chs[index2].menuurl+'\\',\\''+chs[index2].isleafnode+'\\')\" ><i class=\"fa fa-circle-o\"></i>'+chs[index2].menuname+'</a></li>').appendTo(thej);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(thli).appendTo('#leftMenu');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t function LoadAjaxContent(id,menuname,url,isleafnode){\r\n");
      out.write("\t\t \tif(isleafnode==1){//根节点\r\n");
      out.write("\t\t \t\t/* var item = {'id':id,'name':menuname,'url':url,'closable':true};\r\n");
      out.write("\t\t\t\tclosableTab.addTab(item); */\r\n");
      out.write("\t\t \t\tvar urlStr = \"");
      out.print(basePath);
      out.write("/\"+url;\r\n");
      out.write("\t\t \t\t$('#commonFrame').attr('src',urlStr);\r\n");
      out.write("\t\t \t}   \r\n");
      out.write("\t\t \t//$(\"#contentDiv\").html(menuname);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_insertAttribute_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_insertAttribute_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<div class=\"content-wrapper\">\r\n");
      out.write("\t\t\t<section class=\"content-header\">\r\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t<li id=\"title_dh\"></li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_tiles_insertAttribute_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_insertAttribute_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_tiles_insertAttribute_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_0.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_0.setName("header");
    _jspx_th_tiles_insertAttribute_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_1.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_1.setName("leftMenu");
    _jspx_th_tiles_insertAttribute_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_2.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_2.setName("body");
    _jspx_th_tiles_insertAttribute_2.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_3.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_3.setName("footer");
    _jspx_th_tiles_insertAttribute_3.doTag();
    return false;
  }
}
