package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/common/head.jsp");
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
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>AdminLTE 2 | Starter</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  ");
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
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("/aframe/datatables/dataTables.bootstrap.css\">\r\n");
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	request.getRequestDispatcher("/WEB-INF/jsp/main_jsp/main.jsp").forward(request,response);
	
      out.write("\r\n");
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
}
