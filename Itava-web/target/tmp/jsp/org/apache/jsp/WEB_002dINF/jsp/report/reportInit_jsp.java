package org.apache.jsp.WEB_002dINF.jsp.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportInit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t\t<label for=\"报表名称\" class=\"col-sm-2 control-label\">报表名称：</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"truename\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"报表名称\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-info pull-right\" id=\"search\">查询</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.box-body -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- /.box -->\r\n");
      out.write("\t<div class=\"row\" >\r\n");
      out.write("\t\t <div class=\"col-lg-6\" >\r\n");
      out.write("\t\t \t<div class=\"box\">\r\n");
      out.write("     \t\t\t<div class=\"box-header with-border\">\r\n");
      out.write("\t           \t\t<span style=\"color:#036EB7\" class=\"box_title\" >demo1</span>\r\n");
      out.write("\t           \t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\r\n");
      out.write("\t\t                </button>\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"remove\"><i class=\"fa fa-times\"></i></button>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t\t    \t<div class=\"box-body\" id=\"rep1\" style=\"height: 350px;\">\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t <div class=\"col-lg-6\">\r\n");
      out.write("\t\t \t<div class=\"box\">\r\n");
      out.write("     \t\t\t<div class=\"box-header with-border\">\r\n");
      out.write("\t           \t\t<span style=\"color:#036EB7\" class=\"box_title\" >demo2</span>\r\n");
      out.write("\t           \t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\r\n");
      out.write("\t\t                </button>\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"remove\"><i class=\"fa fa-times\"></i></button>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t\t    \t<div class=\"box-body\" id=\"rep2\" style=\"height: 350px;\">\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row\" >\r\n");
      out.write("\t\t <div class=\"col-lg-6\">\r\n");
      out.write("\t\t \t<div class=\"box\">\r\n");
      out.write("     \t\t\t<div class=\"box-header with-border\">\r\n");
      out.write("\t           \t\t<span style=\"color:#036EB7\" class=\"box_title\" >demo3</span>\r\n");
      out.write("\t           \t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\r\n");
      out.write("\t\t                </button>\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"remove\"><i class=\"fa fa-times\"></i></button>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t\t    \t<div class=\"box-body\" id=\"rep3\" style=\"height: 350px;\">\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t <div class=\"col-lg-6\">\r\n");
      out.write("\t\t \t<div class=\"box\">\r\n");
      out.write("     \t\t\t<div class=\"box-header with-border\">\r\n");
      out.write("\t           \t\t<span style=\"color:#036EB7\" class=\"box_title\" >demo4</span>\r\n");
      out.write("\t           \t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\r\n");
      out.write("\t\t                </button>\r\n");
      out.write("\t\t                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"remove\"><i class=\"fa fa-times\"></i></button>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t\t    \t<div class=\"box-body\" id=\"rep4\" style=\"height: 350px;\">\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\trep1();\r\n");
      out.write("\t\trep2();\r\n");
      out.write("\t\trep3();\r\n");
      out.write("\t\trep4();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction rep1(){\r\n");
      out.write("\t\tvar myChart = echarts.init($('#rep1')[0]); \r\n");
      out.write("\t\tvar dataAxis = ['点', '击', '柱', '子', '或', '者', '两', '指', '在', '触', '屏', '上', '滑', '动', '能', '够', '自', '动', '缩', '放'];\r\n");
      out.write("\t\tvar data = [220, 182, 191, 234, 290, 330, 310, 123, 442, 321, 90, 149, 210, 122, 133, 334, 198, 123, 125, 220];\r\n");
      out.write("\t\tvar yMax = 500;\r\n");
      out.write("\t\tvar dataShadow = [];\r\n");
      out.write("\r\n");
      out.write("\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t    dataShadow.push(yMax);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\toption = {\r\n");
      out.write("\t\t    title: {\r\n");
      out.write("\t\t        text: '特性示例：渐变色 阴影 点击缩放',\r\n");
      out.write("\t\t        subtext: 'Feature Sample: Gradient Color, Shadow, Click Zoom'\r\n");
      out.write("\t\t    }, \r\n");
      out.write("\t\t    color: [\r\n");
      out.write("\t\t\t            '#44CDF5',\r\n");
      out.write("\t\t\t            '#92DA00',\r\n");
      out.write("\t\t\t            '#F9C61B',\r\n");
      out.write("\t\t\t            '#32cd32',\r\n");
      out.write("\t\t\t            '#6495ed'\r\n");
      out.write("\t\t\t     ],\r\n");
      out.write("\t\t    xAxis: {\r\n");
      out.write("\t\t        data: dataAxis,\r\n");
      out.write("\t\t        axisLabel: {\r\n");
      out.write("\t\t            inside: true,\r\n");
      out.write("\t\t            textStyle: {\r\n");
      out.write("\t\t                color: '#fff'\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        axisTick: {\r\n");
      out.write("\t\t            show: false\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        axisLine: {\r\n");
      out.write("\t\t            show: false\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        z: 10\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    yAxis: {\r\n");
      out.write("\t\t        axisLine: {\r\n");
      out.write("\t\t            show: false\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        axisTick: {\r\n");
      out.write("\t\t            show: false\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        axisLabel: {\r\n");
      out.write("\t\t            textStyle: {\r\n");
      out.write("\t\t                color: '#999'\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    dataZoom: [\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            type: 'inside'\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    ],\r\n");
      out.write("\t\t    series: [\r\n");
      out.write("\t\t        { // For shadow\r\n");
      out.write("\t\t            type: 'bar',\r\n");
      out.write("\t\t            itemStyle: {\r\n");
      out.write("\t\t                normal: {color: 'rgba(0,0,0,0.05)'}\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            barGap:'-100%',\r\n");
      out.write("\t\t            barCategoryGap:'40%',\r\n");
      out.write("\t\t            data: dataShadow,\r\n");
      out.write("\t\t            animation: false\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            type: 'bar',\r\n");
      out.write("\t\t            itemStyle: {\r\n");
      out.write("\t\t                normal: {\r\n");
      out.write("\t\t                    color: new echarts.graphic.LinearGradient(\r\n");
      out.write("\t\t                        0, 0, 0, 1,\r\n");
      out.write("\t\t                        [\r\n");
      out.write("\t\t                            {offset: 0, color: '#83bff6'},\r\n");
      out.write("\t\t                            {offset: 0.5, color: '#188df0'},\r\n");
      out.write("\t\t                            {offset: 1, color: '#188df0'}\r\n");
      out.write("\t\t                        ]\r\n");
      out.write("\t\t                    )\r\n");
      out.write("\t\t                },\r\n");
      out.write("\t\t                emphasis: {\r\n");
      out.write("\t\t                    color: new echarts.graphic.LinearGradient(\r\n");
      out.write("\t\t                        0, 0, 0, 1,\r\n");
      out.write("\t\t                        [\r\n");
      out.write("\t\t                            {offset: 0, color: '#2378f7'},\r\n");
      out.write("\t\t                            {offset: 0.7, color: '#2378f7'},\r\n");
      out.write("\t\t                            {offset: 1, color: '#83bff6'}\r\n");
      out.write("\t\t                        ]\r\n");
      out.write("\t\t                    )\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            data: data\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    ]\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t// Enable data zoom when user click bar.\r\n");
      out.write("\t\tvar zoomSize = 6;\r\n");
      out.write("\t\tmyChart.on('click', function (params) {\r\n");
      out.write("\t\t    console.log(dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)]);\r\n");
      out.write("\t\t    myChart.dispatchAction({\r\n");
      out.write("\t\t        type: 'dataZoom',\r\n");
      out.write("\t\t        startValue: dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)],\r\n");
      out.write("\t\t        endValue: dataAxis[Math.min(params.dataIndex + zoomSize / 2, data.length - 1)]\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tmyChart.setOption(option);  \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction rep2(){\r\n");
      out.write("\t\tvar myChart = echarts.init($('#rep2')[0]); \r\n");
      out.write("\t\toption = {\r\n");
      out.write("\t\t\t    title: {\r\n");
      out.write("\t\t\t        text: '未来一周气温变化',\r\n");
      out.write("\t\t\t        subtext: '纯属虚构'\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    color: [\r\n");
      out.write("\t\t\t            '#44CDF5',\r\n");
      out.write("\t\t\t            '#92DA00',\r\n");
      out.write("\t\t\t            '#F9C61B',\r\n");
      out.write("\t\t\t            '#32cd32',\r\n");
      out.write("\t\t\t            '#6495ed'\r\n");
      out.write("\t\t\t     ],\r\n");
      out.write("\t\t\t    tooltip: {\r\n");
      out.write("\t\t\t        trigger: 'axis'\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    legend: {\r\n");
      out.write("\t\t\t        data:['最高气温','最低气温']\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    toolbox: {\r\n");
      out.write("\t\t\t        show: true,\r\n");
      out.write("\t\t\t        feature: {\r\n");
      out.write("\t\t\t            dataZoom: {\r\n");
      out.write("\t\t\t                yAxisIndex: 'none'\r\n");
      out.write("\t\t\t            },\r\n");
      out.write("\t\t\t            dataView: {readOnly: false},\r\n");
      out.write("\t\t\t            magicType: {type: ['line', 'bar']},\r\n");
      out.write("\t\t\t            restore: {},\r\n");
      out.write("\t\t\t            saveAsImage: {}\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    xAxis:  {\r\n");
      out.write("\t\t\t        type: 'category',\r\n");
      out.write("\t\t\t        boundaryGap: false,\r\n");
      out.write("\t\t\t        data: ['周一','周二','周三','周四','周五','周六','周日']\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    yAxis: {\r\n");
      out.write("\t\t\t        type: 'value',\r\n");
      out.write("\t\t\t        axisLabel: {\r\n");
      out.write("\t\t\t            formatter: '{value} °C'\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    series: [\r\n");
      out.write("\t\t\t        {\r\n");
      out.write("\t\t\t            name:'最高气温',\r\n");
      out.write("\t\t\t            type:'line',\r\n");
      out.write("\t\t\t            data:[11, 11, 15, 13, 12, 13, 10],\r\n");
      out.write("\t\t\t            markPoint: {\r\n");
      out.write("\t\t\t                data: [\r\n");
      out.write("\t\t\t                    {type: 'max', name: '最大值'},\r\n");
      out.write("\t\t\t                    {type: 'min', name: '最小值'}\r\n");
      out.write("\t\t\t                ]\r\n");
      out.write("\t\t\t            },\r\n");
      out.write("\t\t\t            markLine: {\r\n");
      out.write("\t\t\t                data: [\r\n");
      out.write("\t\t\t                    {type: 'average', name: '平均值'}\r\n");
      out.write("\t\t\t                ]\r\n");
      out.write("\t\t\t            }\r\n");
      out.write("\t\t\t        },\r\n");
      out.write("\t\t\t        {\r\n");
      out.write("\t\t\t            name:'最低气温',\r\n");
      out.write("\t\t\t            type:'line',\r\n");
      out.write("\t\t\t            data:[1, -2, 2, 5, 3, 2, 0],\r\n");
      out.write("\t\t\t            markPoint: {\r\n");
      out.write("\t\t\t                data: [\r\n");
      out.write("\t\t\t                    {name: '周最低', value: -2, xAxis: 1, yAxis: -1.5}\r\n");
      out.write("\t\t\t                ]\r\n");
      out.write("\t\t\t            },\r\n");
      out.write("\t\t\t            markLine: {\r\n");
      out.write("\t\t\t                data: [\r\n");
      out.write("\t\t\t                    {type: 'average', name: '平均值'},\r\n");
      out.write("\t\t\t                    [{\r\n");
      out.write("\t\t\t                        symbol: 'none',\r\n");
      out.write("\t\t\t                        x: '90%',\r\n");
      out.write("\t\t\t                        yAxis: 'max'\r\n");
      out.write("\t\t\t                    }, {\r\n");
      out.write("\t\t\t                        symbol: 'circle',\r\n");
      out.write("\t\t\t                        label: {\r\n");
      out.write("\t\t\t                            normal: {\r\n");
      out.write("\t\t\t                                position: 'start',\r\n");
      out.write("\t\t\t                                formatter: '最大值'\r\n");
      out.write("\t\t\t                            }\r\n");
      out.write("\t\t\t                        },\r\n");
      out.write("\t\t\t                        type: 'max',\r\n");
      out.write("\t\t\t                        name: '最高点'\r\n");
      out.write("\t\t\t                    }]\r\n");
      out.write("\t\t\t                ]\r\n");
      out.write("\t\t\t            }\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    ]\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\tmyChart.setOption(option);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction rep3(){\r\n");
      out.write("\t\tvar myChart = echarts.init($('#rep3')[0]); \r\n");
      out.write("\r\n");
      out.write("\t\toption = {\r\n");
      out.write("\t\t    tooltip: {\r\n");
      out.write("\t\t        trigger: 'item',\r\n");
      out.write("\t\t        formatter: \"{a} <br/>{b}: {c} ({d}%)\"\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    color: [\r\n");
      out.write("\t\t            '#44CDF5',\r\n");
      out.write("\t\t            '#92DA00',\r\n");
      out.write("\t\t            '#F9C61B',\r\n");
      out.write("\t\t            '#32cd32',\r\n");
      out.write("\t\t            '#6495ed'\r\n");
      out.write("\t\t     ],\r\n");
      out.write("\t\t    legend: {\r\n");
      out.write("\t\t        orient: 'vertical',\r\n");
      out.write("\t\t        x: 'left',\r\n");
      out.write("\t\t        data:['直达','营销广告','搜索引擎','邮件营销','联盟广告','视频广告','百度','谷歌','必应','其他']\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    series: [\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            name:'访问来源',\r\n");
      out.write("\t\t            type:'pie',\r\n");
      out.write("\t\t            selectedMode: 'single',\r\n");
      out.write("\t\t            radius: [0, '30%'],\r\n");
      out.write("\r\n");
      out.write("\t\t            label: {\r\n");
      out.write("\t\t                normal: {\r\n");
      out.write("\t\t                    position: 'inner'\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            labelLine: {\r\n");
      out.write("\t\t                normal: {\r\n");
      out.write("\t\t                    show: false\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            data:[\r\n");
      out.write("\t\t                {value:335, name:'直达', selected:true},\r\n");
      out.write("\t\t                {value:679, name:'营销广告'},\r\n");
      out.write("\t\t                {value:1548, name:'搜索引擎'}\r\n");
      out.write("\t\t            ]\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            name:'访问来源',\r\n");
      out.write("\t\t            type:'pie',\r\n");
      out.write("\t\t            radius: ['40%', '55%'],\r\n");
      out.write("\r\n");
      out.write("\t\t            data:[\r\n");
      out.write("\t\t                {value:335, name:'直达'},\r\n");
      out.write("\t\t                {value:310, name:'邮件营销'},\r\n");
      out.write("\t\t                {value:234, name:'联盟广告'},\r\n");
      out.write("\t\t                {value:135, name:'视频广告'},\r\n");
      out.write("\t\t                {value:1048, name:'百度'},\r\n");
      out.write("\t\t                {value:251, name:'谷歌'},\r\n");
      out.write("\t\t                {value:147, name:'必应'},\r\n");
      out.write("\t\t                {value:102, name:'其他'}\r\n");
      out.write("\t\t            ]\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    ]\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tmyChart.setOption(option);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction rep4(){\r\n");
      out.write("\t\tvar myChart = echarts.init($('#rep4')[0]);\r\n");
      out.write("\r\n");
      out.write("\t\toption = {\r\n");
      out.write("\t\t    tooltip: {\r\n");
      out.write("\t\t        trigger: 'axis'\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    color: [\r\n");
      out.write("\t\t            '#44CDF5',\r\n");
      out.write("\t\t            '#92DA00',\r\n");
      out.write("\t\t            '#F9C61B',\r\n");
      out.write("\t\t            '#32cd32',\r\n");
      out.write("\t\t            '#6495ed'\r\n");
      out.write("\t\t     ],\r\n");
      out.write("\t\t    toolbox: {\r\n");
      out.write("\t\t        feature: {\r\n");
      out.write("\t\t            dataView: {show: true, readOnly: false},\r\n");
      out.write("\t\t            magicType: {show: true, type: ['line', 'bar']},\r\n");
      out.write("\t\t            restore: {show: true},\r\n");
      out.write("\t\t            saveAsImage: {show: true}\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    legend: {\r\n");
      out.write("\t\t        data:['蒸发量','降水量','平均温度']\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    xAxis: [\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            type: 'category',\r\n");
      out.write("\t\t            data: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    ],\r\n");
      out.write("\t\t    yAxis: [\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            type: 'value',\r\n");
      out.write("\t\t            name: '水量',\r\n");
      out.write("\t\t            min: 0,\r\n");
      out.write("\t\t            max: 250,\r\n");
      out.write("\t\t            interval: 50,\r\n");
      out.write("\t\t            axisLabel: {\r\n");
      out.write("\t\t                formatter: '{value} ml'\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            type: 'value',\r\n");
      out.write("\t\t            name: '温度',\r\n");
      out.write("\t\t            min: 0,\r\n");
      out.write("\t\t            max: 25,\r\n");
      out.write("\t\t            interval: 5,\r\n");
      out.write("\t\t            axisLabel: {\r\n");
      out.write("\t\t                formatter: '{value} °C'\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    ],\r\n");
      out.write("\t\t    series: [\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            name:'蒸发量',\r\n");
      out.write("\t\t            type:'bar',\r\n");
      out.write("\t\t            data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            name:'降水量',\r\n");
      out.write("\t\t            type:'bar',\r\n");
      out.write("\t\t            data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            name:'平均温度',\r\n");
      out.write("\t\t            type:'line',\r\n");
      out.write("\t\t            yAxisIndex: 1,\r\n");
      out.write("\t\t            data:[2.0, 2.2, 3.3, 4.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2]\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    ]\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tmyChart.setOption(option);\r\n");
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
