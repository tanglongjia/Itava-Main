package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
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
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-info pull-right\" id=\"search\">查询</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.box-body -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- /.box -->\r\n");
      out.write("<div class=\"box\">\r\n");
      out.write("\t<div class=\"box-body\" id=\"userDiv\">\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tsearch();\r\n");
      out.write("\t\t//绑定查询条件事件\r\n");
      out.write("\t\t$(\"#search\").on(\"click\",function(){\r\n");
      out.write("\t\t\tsearch();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\tfunction search(){\r\n");
      out.write("\t\t$.ajax({\r\n");
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
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
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
