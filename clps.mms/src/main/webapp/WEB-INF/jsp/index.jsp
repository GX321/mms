<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<html>
<head>
	<title>MMS系统管理</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/zTreeStyle/zTreeStyle.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=basePath%>/js/bootstrap.min.js"></script>
	<script src="<%=basePath%>/js/jquery.ztree.all.min.js"></script>


</head>
<body>
		<jsp:include page="sm/top.jsp"></jsp:include>
	<!-- 中间主体 -->
	<div class="container" id="content">
		<div class="row">
			<jsp:include page="sm/menu.jsp"></jsp:include>
			<div class="col-md-10">
				<div class="panel panel-default">
				    <img alt="" src="<%=basePath%>/images/index%20.jpg" width="950px" height="550px">
				</div>

			</div>
		</div>
	</div>
	<div class="container" id="footer">
		<div class="row">
			<div class="col-md-12">
			
			</div>
		</div>
	</div>
</body>
	
</html>