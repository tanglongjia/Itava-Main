<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<form class="form-horizontal">
	<div class="box">
		<div class="box-header with-border">
			<h3 class="box-title">用户管理</h3>
			<div class="box-tools pull-right">
				<button type="button" class="btn btn-box-tool"
					data-widget="collapse" data-toggle="tooltip" title="Collapse">
					<i class="fa fa-minus"></i>
				</button>
				<button type="button" class="btn btn-box-tool" data-widget="remove"
					data-toggle="tooltip" title="Remove">
					<i class="fa fa-times"></i>
				</button>
			</div>
		</div>
		<div class="box-body">
			<div class="form-group">
				<label for="报表名称" class="col-sm-2 control-label">报表名称：</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="truename"
						placeholder="报表名称">
				</div>
				<div class="col-sm-6">
					<button type="button" class="btn btn-info pull-right" id="search">查询</button>
				</div>
			</div>
		</div>
		<!-- /.box-body -->
	</div>
</form>
<!-- /.box -->
	<div class="row" >
		 <div class="col-lg-6" >
		 	<div class="box">
     			<div class="box-header with-border">
	           		<span style="color:#036EB7" class="box_title" >demo1</span>
	           		<div class="box-tools pull-right">
		                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
		                </button>
		                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
		            </div>
	            </div>
		    	<div class="box-body" id="rep1" style="height: 350px;">
		    	</div>
		    </div>
		 </div>
		 <div class="col-lg-6">
		 	<div class="box">
     			<div class="box-header with-border">
	           		<span style="color:#036EB7" class="box_title" >demo2</span>
	           		<div class="box-tools pull-right">
		                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
		                </button>
		                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
		            </div>
	            </div>
		    	<div class="box-body" id="rep2" style="height: 350px;">
		    	</div>
		    </div>
		 </div>
	</div>
	<div class="row" >
		 <div class="col-lg-6">
		 	<div class="box">
     			<div class="box-header with-border">
	           		<span style="color:#036EB7" class="box_title" >demo3</span>
	           		<div class="box-tools pull-right">
		                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
		                </button>
		                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
		            </div>
	            </div>
		    	<div class="box-body" id="rep3" style="height: 350px;">
		    	</div>
		    </div>
		 </div>
		 <div class="col-lg-6">
		 	<div class="box">
     			<div class="box-header with-border">
	           		<span style="color:#036EB7" class="box_title" >demo4</span>
	           		<div class="box-tools pull-right">
		                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
		                </button>
		                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
		            </div>
	            </div>
		    	<div class="box-body" id="rep4" style="height: 350px;">
		    	</div>
		    </div>
		 </div>
	</div>
<script type="text/javascript">
	$(function(){
		rep1();
		rep2();
		rep3();
		rep4();
	});
	
	function rep1(){
		var myChart = echarts.init($('#rep1')[0]); 
		var dataAxis = ['点', '击', '柱', '子', '或', '者', '两', '指', '在', '触', '屏', '上', '滑', '动', '能', '够', '自', '动', '缩', '放'];
		var data = [220, 182, 191, 234, 290, 330, 310, 123, 442, 321, 90, 149, 210, 122, 133, 334, 198, 123, 125, 220];
		var yMax = 500;
		var dataShadow = [];

		for (var i = 0; i < data.length; i++) {
		    dataShadow.push(yMax);
		}

		option = {
		    title: {
		        text: '特性示例：渐变色 阴影 点击缩放',
		        subtext: 'Feature Sample: Gradient Color, Shadow, Click Zoom'
		    }, 
		    color: [
			            '#44CDF5',
			            '#92DA00',
			            '#F9C61B',
			            '#32cd32',
			            '#6495ed'
			     ],
		    xAxis: {
		        data: dataAxis,
		        axisLabel: {
		            inside: true,
		            textStyle: {
		                color: '#fff'
		            }
		        },
		        axisTick: {
		            show: false
		        },
		        axisLine: {
		            show: false
		        },
		        z: 10
		    },
		    yAxis: {
		        axisLine: {
		            show: false
		        },
		        axisTick: {
		            show: false
		        },
		        axisLabel: {
		            textStyle: {
		                color: '#999'
		            }
		        }
		    },
		    dataZoom: [
		        {
		            type: 'inside'
		        }
		    ],
		    series: [
		        { // For shadow
		            type: 'bar',
		            itemStyle: {
		                normal: {color: 'rgba(0,0,0,0.05)'}
		            },
		            barGap:'-100%',
		            barCategoryGap:'40%',
		            data: dataShadow,
		            animation: false
		        },
		        {
		            type: 'bar',
		            itemStyle: {
		                normal: {
		                    color: new echarts.graphic.LinearGradient(
		                        0, 0, 0, 1,
		                        [
		                            {offset: 0, color: '#83bff6'},
		                            {offset: 0.5, color: '#188df0'},
		                            {offset: 1, color: '#188df0'}
		                        ]
		                    )
		                },
		                emphasis: {
		                    color: new echarts.graphic.LinearGradient(
		                        0, 0, 0, 1,
		                        [
		                            {offset: 0, color: '#2378f7'},
		                            {offset: 0.7, color: '#2378f7'},
		                            {offset: 1, color: '#83bff6'}
		                        ]
		                    )
		                }
		            },
		            data: data
		        }
		    ]
		};

		// Enable data zoom when user click bar.
		var zoomSize = 6;
		myChart.on('click', function (params) {
		    console.log(dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)]);
		    myChart.dispatchAction({
		        type: 'dataZoom',
		        startValue: dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)],
		        endValue: dataAxis[Math.min(params.dataIndex + zoomSize / 2, data.length - 1)]
		    });
		});
		
		myChart.setOption(option);  
	}
	
	function rep2(){
		var myChart = echarts.init($('#rep2')[0]); 
		option = {
			    title: {
			        text: '未来一周气温变化',
			        subtext: '纯属虚构'
			    },
			    color: [
			            '#44CDF5',
			            '#92DA00',
			            '#F9C61B',
			            '#32cd32',
			            '#6495ed'
			     ],
			    tooltip: {
			        trigger: 'axis'
			    },
			    legend: {
			        data:['最高气温','最低气温']
			    },
			    toolbox: {
			        show: true,
			        feature: {
			            dataZoom: {
			                yAxisIndex: 'none'
			            },
			            dataView: {readOnly: false},
			            magicType: {type: ['line', 'bar']},
			            restore: {},
			            saveAsImage: {}
			        }
			    },
			    xAxis:  {
			        type: 'category',
			        boundaryGap: false,
			        data: ['周一','周二','周三','周四','周五','周六','周日']
			    },
			    yAxis: {
			        type: 'value',
			        axisLabel: {
			            formatter: '{value} °C'
			        }
			    },
			    series: [
			        {
			            name:'最高气温',
			            type:'line',
			            data:[11, 11, 15, 13, 12, 13, 10],
			            markPoint: {
			                data: [
			                    {type: 'max', name: '最大值'},
			                    {type: 'min', name: '最小值'}
			                ]
			            },
			            markLine: {
			                data: [
			                    {type: 'average', name: '平均值'}
			                ]
			            }
			        },
			        {
			            name:'最低气温',
			            type:'line',
			            data:[1, -2, 2, 5, 3, 2, 0],
			            markPoint: {
			                data: [
			                    {name: '周最低', value: -2, xAxis: 1, yAxis: -1.5}
			                ]
			            },
			            markLine: {
			                data: [
			                    {type: 'average', name: '平均值'},
			                    [{
			                        symbol: 'none',
			                        x: '90%',
			                        yAxis: 'max'
			                    }, {
			                        symbol: 'circle',
			                        label: {
			                            normal: {
			                                position: 'start',
			                                formatter: '最大值'
			                            }
			                        },
			                        type: 'max',
			                        name: '最高点'
			                    }]
			                ]
			            }
			        }
			    ]
			};
		myChart.setOption(option);
	}
	
	function rep3(){
		var myChart = echarts.init($('#rep3')[0]); 

		option = {
		    tooltip: {
		        trigger: 'item',
		        formatter: "{a} <br/>{b}: {c} ({d}%)"
		    },
		    color: [
		            '#44CDF5',
		            '#92DA00',
		            '#F9C61B',
		            '#32cd32',
		            '#6495ed'
		     ],
		    legend: {
		        orient: 'vertical',
		        x: 'left',
		        data:['直达','营销广告','搜索引擎','邮件营销','联盟广告','视频广告','百度','谷歌','必应','其他']
		    },
		    series: [
		        {
		            name:'访问来源',
		            type:'pie',
		            selectedMode: 'single',
		            radius: [0, '30%'],

		            label: {
		                normal: {
		                    position: 'inner'
		                }
		            },
		            labelLine: {
		                normal: {
		                    show: false
		                }
		            },
		            data:[
		                {value:335, name:'直达', selected:true},
		                {value:679, name:'营销广告'},
		                {value:1548, name:'搜索引擎'}
		            ]
		        },
		        {
		            name:'访问来源',
		            type:'pie',
		            radius: ['40%', '55%'],

		            data:[
		                {value:335, name:'直达'},
		                {value:310, name:'邮件营销'},
		                {value:234, name:'联盟广告'},
		                {value:135, name:'视频广告'},
		                {value:1048, name:'百度'},
		                {value:251, name:'谷歌'},
		                {value:147, name:'必应'},
		                {value:102, name:'其他'}
		            ]
		        }
		    ]
		};
		myChart.setOption(option);
	}
	
	function rep4(){
		var myChart = echarts.init($('#rep4')[0]);

		option = {
		    tooltip: {
		        trigger: 'axis'
		    },
		    color: [
		            '#44CDF5',
		            '#92DA00',
		            '#F9C61B',
		            '#32cd32',
		            '#6495ed'
		     ],
		    toolbox: {
		        feature: {
		            dataView: {show: true, readOnly: false},
		            magicType: {show: true, type: ['line', 'bar']},
		            restore: {show: true},
		            saveAsImage: {show: true}
		        }
		    },
		    legend: {
		        data:['蒸发量','降水量','平均温度']
		    },
		    xAxis: [
		        {
		            type: 'category',
		            data: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
		        }
		    ],
		    yAxis: [
		        {
		            type: 'value',
		            name: '水量',
		            min: 0,
		            max: 250,
		            interval: 50,
		            axisLabel: {
		                formatter: '{value} ml'
		            }
		        },
		        {
		            type: 'value',
		            name: '温度',
		            min: 0,
		            max: 25,
		            interval: 5,
		            axisLabel: {
		                formatter: '{value} °C'
		            }
		        }
		    ],
		    series: [
		        {
		            name:'蒸发量',
		            type:'bar',
		            data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
		        },
		        {
		            name:'降水量',
		            type:'bar',
		            data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
		        },
		        {
		            name:'平均温度',
		            type:'line',
		            yAxisIndex: 1,
		            data:[2.0, 2.2, 3.3, 4.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2]
		        }
		    ]
		};
		myChart.setOption(option);
	}
</script>