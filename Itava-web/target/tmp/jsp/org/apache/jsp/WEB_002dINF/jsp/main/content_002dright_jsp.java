package org.apache.jsp.WEB_002dINF.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_002dright_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String context = request.getContextPath();
	request.setAttribute("context", context);
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>右侧页面-用于展示框架右侧的内容</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 用于展示所有右侧区域的内容 -->\r\n");
      out.write("\t<iframe name=\"commonFrame\" id=\"commonFrame\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/one\"   frameborder=\"0\" width=\"100%\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" onLoad=\"setIframeHeight()\" ></iframe>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\"> \r\n");
      out.write("\t\tfunction getHeight(doc) {\r\n");
      out.write("\t\t    doc = doc || document;\r\n");
      out.write("\t\t    var body = doc.body, html = doc.documentElement;\r\n");
      out.write("\t\t    var height = Math.max( body.scrollHeight, body.offsetHeight, \r\n");
      out.write("\t\t        html.clientHeight, html.scrollHeight, html.offsetHeight );\r\n");
      out.write("\t\t    return height;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction setIframeHeight() {\r\n");
      out.write("\t\t    var ifrm = document.getElementById('commonFrame');\r\n");
      out.write("\t\t    var doc = ifrm.contentDocument? ifrm.contentDocument: \r\n");
      out.write("\t\t        ifrm.contentWindow.document;\r\n");
      out.write("\t\t    ifrm.style.visibility = 'hidden';\r\n");
      out.write("\t\t    ifrm.style.height = \"10px\"; // reset to minimal height ...\r\n");
      out.write("\t\t    ifrm.style.height = getHeight( doc ) + 60 + \"px\";\r\n");
      out.write("\t\t    ifrm.style.visibility = 'visible';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t window.onresize = function () { \r\n");
      out.write("\t\t\t setIframeHeight();\t \r\n");
      out.write("     \t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script> \t\r\n");
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
