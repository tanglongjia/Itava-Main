//折线图、柱状图
var option = {
	    color: [
	            '#44CDF5',
	            '#92DA00',
	            '#F9C61B',
	            '#32cd32',
	            '#6495ed'
	     ],
	     animationDuration: '1500',
	     animationDurationUpdate: '1500',
	     title: {
	         text: ''
	     },
	     tooltip : {
	         trigger: 'axis'
	     },
	     toolbox: {
	         show: true,
	         feature: {
	             mark: {
	                 show: false
	             },
	             dataZoom: {
	                 show: false
	             },
	             dataView: {
	                 show: false,
	                 readOnly: false
	             },
	             magicType: {
	                 show: true,
	                 type: [
	                     'line',
	                     'bar'
	                 ]
	             },
	             restore: {
	                 show: true
	             },
	             saveAsImage: {
	                 show: false
	             }
	         }
	     },
	     legend: {
	         itemWidth: 14,
	         itemHeight: 14,
	         data:[],
	         textStyle: {
	             color: '#626C70',
	             fontSize: 10
	         }
	     },
	     grid: {
	    	 show: true,
	    	 borderColor: '#e5e5e5',
	         top: 50,
	         left: '8%',
	         right: '5%'
	     },
	     xAxis: {
	         type: 'category',
	         data: [],
	         splitLine: {
	             show: false
	         },
	         axisLabel: {
	             formatter: '{value}',
	             interval: false,
	             textStyle: {
	                 color: '#7d7d7d',
	                 fontSize: 12
	             }
	         },
	         axisLine: {
	             show: true,
	             lineStyle: {
	                 color: '#F9F9F9'
	             }
	         },
	         axisTick: {
	             show: false
	         }
	     },
	     yAxis: [{
	    	 show:false,
	         type: 'value',
	         barMaxWidth: 80,
	         nameTextStyle: {
	             color: '#626C70'
	         },
	         axisLabel: {
	             formatter: '{value}',
	             interval: false,
	             textStyle: {
	                 color: '#626C70',
	                 fontSize: 12
	             }
	         },
	         splitLine: {
	             show: true,
	             lineStyle: {
	                 color: '#ededed',
	                 width: 0.5
	             }
	         },
	         axisLine: {
	             show: true,
	             lineStyle: {
	                 color: '#F9F9F9'
	             }
	         },
	         axisTick: {
	             show: false
	         }
	     	 },
	     	 {
	     		 show:false,
	     		type: 'value',
		         barMaxWidth: 80,
		         nameTextStyle: {
		             color: '#626C70'
		         },
		         axisLabel: {
		             formatter: '{value}%' ,
		             interval: false,
		             textStyle: {
		                 color: '#626C70',
		                 fontSize: 12
		             }
		         },
		         splitLine: {
		             show: true,
		             lineStyle: {
		                 color: '#ededed',
		                 width: 0.5
		             }
		         },
		         axisLine: {
		             show: true,
		             lineStyle: {
		                 color: '#F9F9F9'
		             }
		         },
		         axisTick: {
		             show: false
		         }
		     	 }
	     	 ],
	     series : [
	              
	           
	     ]
	 };

//饼图
var option1 = {
	    title: {
	        x: 'center'
	    },
	    animationDuration: '1500',
	    animationDurationUpdate: '1500',
	    tooltip: {
	        trigger: 'item',
	        formatter: "{a} <br/>{b} : {c} ({d}%)"
	    },
	    legend: {
	        data: [
	        ],
	        x: 'center',
	        y: 'bottom',
	        itemWidth: 14,
	        itemHeight: 14,
	        textStyle: {
	            color: '#626C70',
	            fontSize: 10
	        }
	    },
	    color: [
	        '#44CDF5',
	        '#92DA00',
	        '#F9C61B',
	        '#32cd32',
	        '#6495ed',
	        '#2EC7C9',
	        '#5AB1EF',
	        '#B6A2DE',
	        '#FFB980'
	    ],
	    calculable: true,
	    series: [
	        
	    ]
	};

 