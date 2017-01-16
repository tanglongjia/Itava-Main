package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form class=\"form-horizontal\" id=\"userAddForm\" name=\"userAddForm\">\r\n");
      out.write("\t<div class=\"box-body\">\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"inputTrueName\" class=\"col-sm-2 control-label\">用户名：</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"formTrueName\" name=\"formTrueName\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"inputAge\" class=\"col-sm-2 control-label\">年龄：</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"age\" name=\"age\" placeholder=\"年龄\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"inputTelphone\" class=\"col-sm-2 control-label\">手机号：</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"formTelphone\" name=\"formTelphone\"\r\n");
      out.write("\t\t\t\t\t>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"inputSex\" class=\"col-sm-2 control-label\">性别：</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sex\" id=\"sex1\" value=\"1\" checked>男\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;<input type=\"radio\" name=\"sex\" id=\"sex2\" value=\"0\" checked>女\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"box-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default pull-right\" onclick=\"closeUser()\">关闭</button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-info pull-right\" >提交</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $('#userAddForm').formValidation({\r\n");
      out.write("//      live: 'disabled',\r\n");
      out.write("      message: 'This value is not valid',\r\n");
      out.write("      feedbackIcons: {\r\n");
      out.write("          valid: 'glyphicon glyphicon-ok',\r\n");
      out.write("          invalid: 'glyphicon glyphicon-remove',\r\n");
      out.write("          validating: 'glyphicon glyphicon-refresh'\r\n");
      out.write("      },\r\n");
      out.write("      fields: {\r\n");
      out.write("        \tformTrueName: {\r\n");
      out.write("                message: '用户名验证失败',\r\n");
      out.write("                validators: {\r\n");
      out.write("                    notEmpty: {\r\n");
      out.write("                        message: '用户名不能为空'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            formTelphone: {\r\n");
      out.write("                validators: {\r\n");
      out.write("                    notEmpty: {\r\n");
      out.write("                        message: '手机号不能为空'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }).on('success.form.bv', function(e) {\r\n");
      out.write("        // Prevent form submission\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("        // Get the form instance\r\n");
      out.write("        var $form = $(e.target);\r\n");
      out.write("\r\n");
      out.write("        // Get the BootstrapValidator instance\r\n");
      out.write("        var bv = $form.data('bootstrapValidator');\r\n");
      out.write("\r\n");
      out.write("        // Use Ajax to submit form data\r\n");
      out.write("        $.post($form.attr('action'), $form.serialize(), function(result) {\r\n");
      out.write("            console.log(result);\r\n");
      out.write("        }, 'json');\r\n");
      out.write("    });\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("function closeUser(){\r\n");
      out.write("\taddUserDialog.close();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
