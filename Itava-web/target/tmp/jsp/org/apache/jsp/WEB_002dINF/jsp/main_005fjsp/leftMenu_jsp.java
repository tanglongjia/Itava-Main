package org.apache.jsp.WEB_002dINF.jsp.main_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leftMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("  <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("  <aside class=\"main-sidebar\">\r\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("    <section class=\"sidebar\">\r\n");
      out.write("      <!-- search form (Optional) -->\r\n");
      out.write("      <form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("              <span class=\"input-group-btn\">\r\n");
      out.write("                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("              </span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("      <!-- /.search form -->\r\n");
      out.write("      <!-- Sidebar Menu å·¦ä¾§èåç®å½ -->\r\n");
      out.write("      <ul class=\"sidebar-menu\" id=\"leftMenu\">\r\n");
      out.write("        <!-- Optionally, you can add icons to the links -->\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>");
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
