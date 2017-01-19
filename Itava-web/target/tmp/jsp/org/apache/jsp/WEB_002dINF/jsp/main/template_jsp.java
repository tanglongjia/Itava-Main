package org.apache.jsp.WEB_002dINF.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String context = request.getContextPath();
	request.setAttribute("context", context);
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- HTML头 开始 -->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<!-- 左侧导航栏 开始-->\r\n");
      out.write("\t\t<div  style=\"float:left;width: 100px;height:600px;border-style:solid;border-width:2pt;\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_insertAttribute_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 左侧导航栏 结束-->\r\n");
      out.write("\t\t<div id=\"page-wrapper\" >\r\n");
      out.write("\t\t\t<!-- 页面头 开始 -->\r\n");
      out.write("\t\t\t<div  style=\"margin-left:120px;width: 80%;height:100px;border-style:solid;border-width:2pt;\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_insertAttribute_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 页面头 结束 -->\r\n");
      out.write("\t\t\t<!--  IFRAME布局 开始 -->\r\n");
      out.write("\t\t\t<div style=\"margin-left:120px;margin-top:120px;width: 80%;height:100px;border-style:solid;border-width:2pt;\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_insertAttribute_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--  IFRAME布局 结束 -->\r\n");
      out.write("\t\t\t<!-- 页面尾 开始 -->\r\n");
      out.write("\t\t\t<div style=\"margin-left:120px;margin-top:200px;width: 80%;height:50px;border-style:solid;border-width:2pt;\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_insertAttribute_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 页面尾 结束 -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_t_insertAttribute_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_t_insertAttribute_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_t_insertAttribute_0.setJspContext(_jspx_page_context);
    _jspx_th_t_insertAttribute_0.setName("menu");
    _jspx_th_t_insertAttribute_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_insertAttribute_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_t_insertAttribute_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_t_insertAttribute_1.setJspContext(_jspx_page_context);
    _jspx_th_t_insertAttribute_1.setName("header");
    _jspx_th_t_insertAttribute_1.doTag();
    return false;
  }

  private boolean _jspx_meth_t_insertAttribute_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_t_insertAttribute_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_t_insertAttribute_2.setJspContext(_jspx_page_context);
    _jspx_th_t_insertAttribute_2.setName("body");
    _jspx_th_t_insertAttribute_2.doTag();
    return false;
  }

  private boolean _jspx_meth_t_insertAttribute_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_t_insertAttribute_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_t_insertAttribute_3.setJspContext(_jspx_page_context);
    _jspx_th_t_insertAttribute_3.setName("footer");
    _jspx_th_t_insertAttribute_3.doTag();
    return false;
  }
}
