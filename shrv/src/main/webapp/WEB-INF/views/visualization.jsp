<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,600,200italic,600italic&subset=latin,vietnamese' rel='stylesheet' type='text/css'>
	<!-- jQuery 2.1.4 -->
    <script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/jquery/dist/jquery.min.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/d3/d3.min.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/d3-transform/src/d3-transform.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/extarray.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/misc.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/micro-observer.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/microplugin/src/microplugin.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/bubble-chart.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/plugins/central-click/central-click.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/plugins/lines/lines.js"></script>
	<style>
	    .bubbleChart {
	      min-width: 100px;
	      max-width: 700px;
	      height: 700px;
	      margin: 0 auto;
	    }
	    .bubbleChart svg{
	      background: #000000;
	    }
	</style>
</head>

<body>
<h1>Shinsegae Human Resource Visualization</h1>
<div class="bubbleChart"/>
<form id="btnForm" action="">
    <button onclick="javascript:callAndroid()">질문하기</button>
</form>
<p><b>Test</b> Paragraph.</p>
<p></p>
</body>
<script>
$(document).ready(function () {
	 var employee = new Array();
	 var employee2 = new Array();
	 employee.push(${data});
	 console.log(employee);
	 $(employee[0]['data']).each(function(index, contents) {
	  employee2.push({text: contents.emp_name, count: contents.salary});
	 });
	 console.log(employee2);
	 var bubbleChart = new d3.svg.BubbleChart({
	     supportResponsive: true,
	     //container: => use @default
	     size: 600,
	     //viewBoxSize: => use @default
	     innerRadius: 600 / 3.5,
	     //outerRadius: => use @default
	     radiusMin: 50,
	     //radiusMax: use @default
	     //intersectDelta: use @default
	     //intersectInc: use @default
	     //circleColor: use @default
	     data: {
	       items: employee2,
	       eval: function (item) {return item.count;},
	       classed: function (item) {return item.text.split(" ").join("");}
	     },
	     plugins: [
	       {
	         name: "central-click",
	         options: {
	           text: "(See more detail)",
	           style: {
	             "font-size": "12px",
	             "font-style": "italic",
	             "font-family": "Source Sans Pro, sans-serif",
	             //"font-weight": "700",
	             "text-anchor": "middle",
	             "fill": "white"
	           },
	           attr: {dy: "65px"},
	           centralClick: function() {
	             alert("Here is more details!!");
	           }
	         }
	       },
	       {
	         name: "lines",
	         options: {
	           format: [
	             {// Line #0
	               textField: "count",
	               classed: {count: true},
	               style: {
	                 "font-size": "28px",
	                 "font-family": "Source Sans Pro, sans-serif",
	                 "text-anchor": "middle",
	                 fill: "white"
	               },
	               attr: {
	                 dy: "0px",
	                 x: function (d) {return d.cx;},
	                 y: function (d) {return d.cy;}
	               }
	             },
	             {// Line #1
	               textField: "text",
	               classed: {text: true},
	               style: {
	                 "font-size": "14px",
	                 "font-family": "Source Sans Pro, sans-serif",
	                 "text-anchor": "middle",
	                 fill: "white"
	               },
	               attr: {
	                 dy: "20px",
	                 x: function (d) {return d.cx;},
	                 y: function (d) {return d.cy;}
	               }
	             }
	           ],
	           centralFormat: [
	             {// Line #0
	               style: {"font-size": "50px"},
	               attr: {}
	             },
	             {// Line #1
	               style: {"font-size": "30px"},
	               attr: {dy: "40px"}
	             }
	           ]
	         }
	       }]
	   });

	 
}); // .ready()
function callAndroid(){
	 var str = $( "p:first" ).text();
	 $( "p:last" ).html( str );
	 console.log("in callAndroid");
		window.myJSInterface.callGoBackActivity();
}

</script>
</html>
