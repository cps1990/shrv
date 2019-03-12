<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<!-- jQuery 2.1.4 -->
    <script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
</head>

<body>
<h1>
	Hello world!  
</h1>
<button type="button" id="selectHumanResourceInfoBtn">button</button>
<P>  The time on the server is ${serverTime}. </P>
</body>
<script>
$(document).ready(function () {
	$("#selectHumanResourceInfoBtn").click(function () {
		$.ajax({
			url : "/shrv/getHumanResourceInfo.do",
			type : "post",
			data : { searchType : $("#searchType").val(), searchKeyword : $("#searchKeyword").val() },
			dataType : "json",
			success : function (ary) {
				console.log("test");
			}
		});
	});
	
});
</script>
</html>
